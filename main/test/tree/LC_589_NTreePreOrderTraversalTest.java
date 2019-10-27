package tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author alis
 * @date 2019/10/27 8:40 AM
 * @description
 */
public class LC_589_NTreePreOrderTraversalTest {

    private LC_589_NTreePreOrderTraversal nTreePreOrderTraversal = new LC_589_NTreePreOrderTraversal();

    @Test
    public void nTreePostOrderTraversalRecurTest() {
        NTreeNode node3 = new NTreeNode(3, Arrays.asList(new NTreeNode(5, Collections.emptyList()), new NTreeNode(6, Collections.emptyList())));
        NTreeNode node2 = new NTreeNode(2, Collections.emptyList());
        NTreeNode node4 = new NTreeNode(4, Collections.emptyList());
        NTreeNode root = new NTreeNode(1, Arrays.asList(node3, node2, node4));
        List<Integer> result = nTreePreOrderTraversal.preOrderTraversalRecur(root);
        List<Integer> except = Arrays.asList(1, 3, 5, 6, 2, 4);
        assertThat(result, is(except));
    }

    @Test
    public void nTreePostOrderTraversalStackTest() {
        NTreeNode node3 = new NTreeNode(3, Arrays.asList(new NTreeNode(5, Collections.emptyList()), new NTreeNode(6, Collections.emptyList())));
        NTreeNode node2 = new NTreeNode(2, Collections.emptyList());
        NTreeNode node4 = new NTreeNode(4, Collections.emptyList());
        NTreeNode root = new NTreeNode(1, Arrays.asList(node3, node2, node4));
        List<Integer> result = nTreePreOrderTraversal.preOrderTraversalStack(root);
        List<Integer> except = Arrays.asList(1, 3, 5, 6, 2, 4);
        assertThat(result, is(except));
    }


}
