package tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/10/27 1:30 AM
 * @description
 */
public class LC_590_NTreePostOrderTraversalTest {
    private LC_590_NTreePostOrderTraversal nTreePostOrderTraversal = new LC_590_NTreePostOrderTraversal();

    @Test
    public void postOrderTest() {
        NTreeNode node2 = new NTreeNode(2, Collections.emptyList());
        NTreeNode node4 = new NTreeNode(4, Collections.emptyList());
        NTreeNode node3 = new NTreeNode(3, Arrays.asList(new NTreeNode(5, Collections.emptyList()), new NTreeNode(6, Collections.emptyList())));
        NTreeNode root = new NTreeNode(1, Arrays.asList(node3, node2, node4));
        List<Integer> res = nTreePostOrderTraversal.postOrderRecur(root);
        List<Integer> excepted = Arrays.asList(5, 6, 3, 2, 4, 1);
        assertThat(res, is(excepted));
    }

    @Test
    public void postOrderStackTest() {
        NTreeNode node2 = new NTreeNode(2, Collections.emptyList());
        NTreeNode node4 = new NTreeNode(4, Collections.emptyList());
        NTreeNode node3 = new NTreeNode(3, Arrays.asList(new NTreeNode(5, Collections.emptyList()), new NTreeNode(6, Collections.emptyList())));
        NTreeNode root = new NTreeNode(1, Arrays.asList(node3, node2, node4));
        List<Integer> res = nTreePostOrderTraversal.postOrderStack(root);
        List<Integer> excepted = Arrays.asList(5, 6, 3, 2, 4, 1);
        assertThat(res, is(excepted));
    }

    @Test
    public void postOrderStackErrorCaseTest() {
        NTreeNode node3 = new NTreeNode(3, Arrays.asList(new NTreeNode(6, Collections.emptyList())));
        NTreeNode node10 = new NTreeNode(10, Arrays.asList(new NTreeNode(5, Collections.emptyList()), new NTreeNode(0, Collections.emptyList())));
        NTreeNode root = new NTreeNode(1, Arrays.asList(node10, node3));
        List<Integer> res = nTreePostOrderTraversal.postOrderStack(root);
        List<Integer> excepted = Arrays.asList(5, 0, 10, 6, 3, 1);
        assertThat(res, is(excepted));
    }
}
