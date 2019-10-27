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
 * @date 2019/10/27 9:04 AM
 * @description
 */
public class LC_429_NTreeLevelOrderTest {

    private LC_429_NTreeLevelOrder nTreeLevelOrder = new LC_429_NTreeLevelOrder();

    @Test
    public void leverOrderRecurTest() {
        NTreeNode node3 = new NTreeNode(3, Arrays.asList(new NTreeNode(5, Collections.emptyList()), new NTreeNode(6, Collections.emptyList())));
        NTreeNode node2 = new NTreeNode(2, Collections.emptyList());
        NTreeNode node4 = new NTreeNode(4, Collections.emptyList());
        NTreeNode root = new NTreeNode(1, Arrays.asList(node3, node2, node4));
        List<List<Integer>> levelResult = nTreeLevelOrder.levelOrderRecur(root);
        List<List<Integer>> levelExcept = new ArrayList<>();
        levelExcept.add(Collections.singletonList(1));
        levelExcept.add(Arrays.asList(3, 2, 4));
        levelExcept.add(Arrays.asList(5, 6));
        assertThat(levelResult, is(levelExcept));

    }

    @Test
    public void leverOrderQueueTest() {
        NTreeNode node3 = new NTreeNode(3, Arrays.asList(new NTreeNode(5, Collections.emptyList()), new NTreeNode(6, Collections.emptyList())));
        NTreeNode node2 = new NTreeNode(2, Collections.emptyList());
        NTreeNode node4 = new NTreeNode(4, Collections.emptyList());
        NTreeNode root = new NTreeNode(1, Arrays.asList(node3, node2, node4));
        List<List<Integer>> levelResult = nTreeLevelOrder.levelOrderQueue(root);
        List<List<Integer>> levelExcept = new ArrayList<>();
        levelExcept.add(Collections.singletonList(1));
        levelExcept.add(Arrays.asList(3, 2, 4));
        levelExcept.add(Arrays.asList(5, 6));
        assertThat(levelResult, is(levelExcept));

    }
}
