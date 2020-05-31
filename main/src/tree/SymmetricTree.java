package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/5/31
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode treeRoot) {
        return isSymmetric(treeRoot, treeRoot);
    }

    private boolean isSymmetric(TreeNode leftTree, TreeNode rightTree) {
        // terminal
        if (leftTree == null && rightTree == null) {
            return true;
        }
        if (leftTree == null || rightTree == null) {
            return false;
        }
        // current process
        if (leftTree.val != rightTree.val) {
            return false;
        }

        // drill down
        return isSymmetric(leftTree.left, rightTree.right) && isSymmetric(leftTree.right, rightTree.left);

    }

    public boolean isSymmetric_loop(TreeNode treeRoot) {
        if (treeRoot == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeRoot);
        queue.add(treeRoot);
        while (!queue.isEmpty()) {
            TreeNode poll1 = queue.poll();
            TreeNode poll2 = queue.poll();
            if (poll1 != null && poll2 != null && poll1.val == poll2.val) {
                queue.add(poll1.left);
                queue.add(poll2.right);
                queue.add(poll1.right);
                queue.add(poll2.left);
            } else if (poll1 == null && poll2 == null) {

            } else {
                return false;
            }
        }
        return treeRoot != null;
    }
}
