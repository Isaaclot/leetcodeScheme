package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author alis
 * @date 2019/11/1 12:17 AM
 * @description
 */
public class LC_102_BinaryTreeLevelOrder {

    List<List<Integer>> result = new ArrayList<>();


    /**
     * BFS
     * 时间复杂度：O(n)
     */
    public List<List<Integer>> levelOrderBFS(TreeNode root) {
        helper(root, 0);
        return result;
    }

    private void helper(TreeNode root, int level) {
        // init level 0
        if (level == result.size())
            result.add(new ArrayList<>());
        // process current
        result.get(level).add(root.val);
        // drill down
        if (null != root.left)
            helper(root.left, level + 1); // 同一个level层的数据都会同样处理，并只处理一遍
        if (null != root.right)
            helper(root.right, level + 1);
    }

    public List<List<Integer>> levelOrderLoop(TreeNode root) {
        if (null == root) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> current = new ArrayList<>();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                current.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(current);
        }
        return result;
    }
}
