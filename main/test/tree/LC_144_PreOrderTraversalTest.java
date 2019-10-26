package tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/10/27 12:53 AM
 * @description
 */
public class LC_144_PreOrderTraversalTest {

    private LC_144_PreOrderTraversal preOrderTraversal = new LC_144_PreOrderTraversal();

    @Test
    public void preOrderTraversalTest() {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node2.left = node3;
        root.right = node2;
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> res = preOrderTraversal.preOrderTraversalRecur(root);
        assertThat(res, is(expected));
    }

    @Test
    public void preOrderTraversalStackTest() {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node2.left = node3;
        root.right = node2;
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> res = preOrderTraversal.preOrderTraversalStack(root);
        assertThat(res, is(expected));
    }


}
