package tree;

import java.util.Stack;

/**
 * 二叉树
 *
 * @author alis
 */
public class BinaryTree {

    private int val;

    private BinaryTree left, right;

    public BinaryTree(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public static void init(BinaryTree root) {
        root.setLeft(new BinaryTree(5));
        root.setRight(new BinaryTree(15));
    }

    public static void preOrder(BinaryTree root) {
        if (null == root) return;
        System.out.println(root.getVal());
        preOrder(root.getLeft());
        preOrder(root.getRight());

    }

    /**
     * 前序遍历： 根 左 右
     * 在遍历中，取出栈顶(根据规则，将最先取出来的放在栈顶), 先将后出的右结点入栈，再入栈左结点
     * 循环中，取出根结点(出栈)，将该结点的右结点入栈，左结点入栈，打印当前结点
     * 以此类推
     */
    public static void preOrderStack(BinaryTree root) {
        Stack<BinaryTree> stack = new Stack<>();
        stack.add(root);// 根结点先入栈
        while (!stack.isEmpty()) {
            BinaryTree node = stack.pop();// 循环中将栈顶取出(根结点)，出栈
            if (node.getRight() != null) {
                stack.push(node.right); // 先进后出，右结点先进栈
            }
            if (node.getLeft() != null) {
                stack.push(node.left);  // 后进先出，左结点先出栈
            }
            System.out.println(node.val);   // 当前循环取出的栈打印出来
        }

    }


    /**
     * 中序遍历：左 根 右
     */
    public static void inOrderStack(BinaryTree root) {
        Stack<BinaryTree> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            while (stack.peek().getLeft() != null) {
                stack.push(stack.peek().left);
            }
            while (!stack.isEmpty()) {
                BinaryTree node = stack.pop();
                System.out.println(node.val);
                if (node.getRight() != null) {
                    stack.push(node.right);
                    break;
                }
            }
        }
    }

    public static void inOrder(BinaryTree root) {
        if (null == root) return;
        preOrder(root.getLeft());
        System.out.println(root.getVal());
        preOrder(root.getRight());
    }

    public static void postOrderStack(BinaryTree root) {
        Stack<BinaryTree> stack = new Stack<>();
        stack.add(root);
        BinaryTree lastNode = null;
        while (!stack.isEmpty()) {
            while (stack.peek().left != null) {
                stack.push(stack.peek().left);
            }
            while (!stack.isEmpty()) {
                if (lastNode == stack.peek().right || stack.peek().right == null) {
                    BinaryTree node = stack.pop();
                    System.out.println(node.val);
                    lastNode = node;
                } else if (stack.peek().right != null) {
                    stack.push(stack.peek().right);
                    break;
                }

            }
        }
    }

    public static void postOrder(BinaryTree root) {
        if (null == root) return;
        preOrder(root.getLeft());
        preOrder(root.getRight());
        System.out.println(root.getVal());
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(10);
        init(root);
        System.out.println("+++++++++++++前序+++++++++++++");
        preOrder(root);
        System.out.println("+++++++++++++中序+++++++++++++");
        inOrder(root);
        System.out.println("+++++++++++++后序+++++++++++++");
        postOrder(root);
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++栈迭代前序遍历++++++++++++");
        preOrderStack(root);
        System.out.println("++++++++++++++栈迭代中序遍历++++++++++++");
        inOrderStack(root);
        System.out.println("++++++++++++++栈迭代后序遍历++++++++++++");
        postOrderStack(root);

    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }
}
