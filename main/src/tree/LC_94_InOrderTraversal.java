package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author alis
 * @date 2019/10/26 12:32 AM
 * @description
 */
public class LC_94_InOrderTraversal {

    /**
     * 利用栈迭代式中序遍历二叉树：左 根 右
     * 利用栈先进后出的特性
     * 先把根目录下的左结点，入栈，直至到最左结点(第一个输出的结点)
     * 判断出栈输出条件：栈顶
     * 如果已出栈结点存在右子结点，则右子结点入栈，并结束本次内循环，
     * 将本右子结点的所有左子结点入栈，重复以上步骤进行迭代循环
     */
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        if (null == root) return nums;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            while (stack.peek().left != null) {
                stack.push(stack.peek().left);
            }
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                nums.add(node.val);
                if (node.right != null) {
                    stack.push(node.right);
                    break;
                }
            }
        }
        return nums;
    }

    /**
     * 递归遍历二叉树，中序遍历：左 根 🈶右
     */
    public List<Integer> inOrderTraversalReverse(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        if (nums == root) return nums;
        if (root.left != null) {
            nums.addAll(inOrderTraversalReverse(root.left));
        }
        nums.add(root.val);
        if (root.right != null) {
            nums.addAll(inOrderTraversalReverse(root.right));
        }
        return nums;
    }

    /**
     * 给定一个二叉树，要去以中序遍历的顺序输出 ： 左 -> 根 -> 右
     */
    public List<Integer> inOrderTraversalReverse2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        if (root.left != null) {
            result.addAll(inOrderTraversalReverse2(root.left));
        }
        result.add(root.val);
        if (root.right != null) {
            result.addAll(inOrderTraversalReverse2(root.right));
        }
        return result;
    }


    /**
     * 迭代法进行中序遍历，利用栈，后进先出
     * 左-根-右
     */
    public List<Integer> inOrderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            while (stack.peek().left != null) { // 从根节点找出所有左子阶段，并入栈
                stack.add(stack.peek().left);
            }
            while (!stack.isEmpty()) { // 所有左子节点入栈之后，开始进行 出栈操作
                TreeNode node = stack.pop();
                result.add(node.val);
                if (node.right != null) {
                    // 如果出栈过程中，发现有节点存在右节点，则在输出当前根节点之后 ，
                    // 再将当前根节点的右节点入栈，进入下一轮的所有左节点入栈，输出的过程
                    // 如果右节点只有一个，并且出栈输出完成，则继续处理之前按照顺序入栈的左子节点
                    stack.add(node.right);
                    break;
                }
            }
        }

        return result;
    }
}
