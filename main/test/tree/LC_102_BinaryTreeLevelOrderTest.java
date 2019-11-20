package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/11/1 12:09 AM
 * @description
 */
public class LC_102_BinaryTreeLevelOrderTest {

    private LC_102_BinaryTreeLevelOrder binaryTreeLevelOrder = new LC_102_BinaryTreeLevelOrder();

    @Test
    public void testLevelOrderRecur() {
        TreeNode root3 = new TreeNode(3);
        TreeNode right20 = new TreeNode(20);
        right20.left = new TreeNode(15);
        right20.right = new TreeNode(7);
        root3.left = new TreeNode(9);
        root3.right = right20;
        List<List<Integer>> result = binaryTreeLevelOrder.levelOrderBFS(root3);
        List<List<Integer>> except = new ArrayList<>();
        except.add(Collections.singletonList(3));
        except.add(Arrays.asList(9, 20));
        except.add(Arrays.asList(15, 7));
        assertThat(result, is(except));

    }

    @Test
    public void testLevelOrderLoop() {
        TreeNode root3 = new TreeNode(3);
        TreeNode right20 = new TreeNode(20);
        right20.left = new TreeNode(15);
        right20.right = new TreeNode(7);
        root3.left = new TreeNode(9);
        root3.right = right20;
        List<List<Integer>> result = binaryTreeLevelOrder.levelOrderLoop(root3);
        List<List<Integer>> except = new ArrayList<>();
        except.add(Collections.singletonList(3));
        except.add(Arrays.asList(9, 20));
        except.add(Arrays.asList(15, 7));
        assertThat(result, is(except));

    }

    @Test
    public void testLevelOrderQueue() {
        TreeNode root3 = new TreeNode(3);
        TreeNode right20 = new TreeNode(20);
        right20.left = new TreeNode(15);
        right20.right = new TreeNode(7);
        root3.left = new TreeNode(9);
        root3.right = right20;
        List<List<Integer>> result = binaryTreeLevelOrder.levelOrderQueue(root3);
        List<List<Integer>> except = new ArrayList<>();
        except.add(Collections.singletonList(3));
        except.add(Arrays.asList(9, 20));
        except.add(Arrays.asList(15, 7));
        assertThat(result, is(except));

    }

    @Test
    public void testLevelOrderRecur2() {
        TreeNode root3 = new TreeNode(3);
        TreeNode right20 = new TreeNode(20);
        right20.left = new TreeNode(15);
        right20.right = new TreeNode(7);
        root3.left = new TreeNode(9);
        root3.right = right20;
        List<List<Integer>> result = binaryTreeLevelOrder.levelOrderRecur2(root3);
        List<List<Integer>> except = new ArrayList<>();
        except.add(Collections.singletonList(3));
        except.add(Arrays.asList(9, 20));
        except.add(Arrays.asList(15, 7));
        assertThat(result, is(except));

    }
}
