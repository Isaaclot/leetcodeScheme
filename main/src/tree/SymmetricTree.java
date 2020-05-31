package tree;

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
}
