package tree;


import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/9/19
 */
public class LC_404_SumOfLeftLeaves {

    /**
     * 计算二叉树所有左子节点和
     * 左子节点定义：一个节点能够作为做左子节点，这个节点是某个节点的左子节点，并且它是一个叶子节点
     * 层次遍历 BFS
     *
     * @param root 二叉树
     * @return {@link int}
     * @since 2020/9/19 10:49 PM
     */
    public int sumOfLeftLeaves(TreeNode root) {
        int ans = 0;
        if (null == root) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                if (isLeafNode(node.left)) {
                    ans += node.left.val;
                } else {
                    queue.offer(node.left);
                }
            }
            if (node.right != null) {
                if (!isLeafNode(node.right)) {
                    queue.offer(node.right);
                }
            }
        }
        return ans;


    }

    private boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
