package tree;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/11/10 8:16 PM
 * @description
 */
public class LC_104BinaryTreeMaxDepthTest {

    private LC_104_BinaryTreeMaxDepth binaryTreeMaxDepth = new LC_104_BinaryTreeMaxDepth();

    @Test
    public void maxDepthQueue() {
        TreeNode root = new TreeNode(3);
        TreeNode right20 = new TreeNode(20);
        root.left = new TreeNode(9);
        right20.left = new TreeNode(15);
        right20.right = new TreeNode(7);
        root.right = right20;
        assertThat(binaryTreeMaxDepth.maxDepthQueue(root), is(3));
    }

    @Test
    public void maxDepthTreeDFS() {
        TreeNode root = new TreeNode(3);
        TreeNode right20 = new TreeNode(20);
        root.left = new TreeNode(9);
        right20.left = new TreeNode(15);
        right20.right = new TreeNode(7);
        root.right = right20;
        assertThat(binaryTreeMaxDepth.maxDepthTreeDFS(root), is(3));
    }
}
