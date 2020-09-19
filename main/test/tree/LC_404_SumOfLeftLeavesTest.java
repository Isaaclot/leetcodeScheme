package tree;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian@vvic.com
 * @version 1.0
 * @since 2020/9/19
 */
public class LC_404_SumOfLeftLeavesTest {
    @Test
    public void test_given_tree_then_left_leaves_sum() {
        LC_404_SumOfLeftLeaves sumOfLeftLeaves = new LC_404_SumOfLeftLeaves();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertThat(sumOfLeftLeaves.sumOfLeftLeaves(root), is(24));
    }

    @Test
    public void test_given_tree_1234_then_left_leaves_sum() {
        LC_404_SumOfLeftLeaves sumOfLeftLeaves = new LC_404_SumOfLeftLeaves();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        assertThat(sumOfLeftLeaves.sumOfLeftLeaves(root), is(4));
    }
}
