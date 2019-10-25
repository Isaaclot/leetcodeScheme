package tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author alis
 * @date 2019/10/26 12:24 AM
 * @description
 */
public class LC_94_InOrderTraversalTest {
    private LC_94_InOrderTraversal inOrderTraversal = new LC_94_InOrderTraversal();

    @Test
    public void inOrderTraversalStackTest() {
        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(3);
        root.right = root2;
        List<Integer> nums = inOrderTraversal.inOrderTraversal(root);
        int[] result = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            result[i] = nums.get(i);
        }
        Assert.assertArrayEquals(result, new int[]{1, 3, 2});
    }

    @Test
    public void inOrderTraversalReverseTest() {
        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(3);
        root.right = root2;
        List<Integer> nums = inOrderTraversal.inOrderTraversalReverse(root);
        int[] result = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            result[i] = nums.get(i);
        }
        Assert.assertArrayEquals(result, new int[]{1, 3, 2});
    }

}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
