package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author alis
 * @date 2019/11/10 8:21 PM
 * @description
 */
public class LC_104_BinaryTreeMaxDepth {
    /**
     * dfs
     */
    public int maxDepthQueue(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return depth;
    }

    public int maxDepthTreeDFS(TreeNode root) {
        if (null == root) return 0;
        int left_depth = maxDepthTreeDFS(root.left);
        int right_depth = maxDepthTreeDFS(root.right);
        // 递归 + 1
        return Math.max(left_depth, right_depth) + 1;
    }
}
