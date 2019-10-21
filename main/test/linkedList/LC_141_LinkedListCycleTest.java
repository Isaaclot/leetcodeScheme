package linkedList;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * @author alis
 * @date 2019/10/20 7:13 AM
 * @description
 */
public class LC_141_LinkedListCycleTest {

    private LC_141_LinkedListCycle linkedListCycle = new LC_141_LinkedListCycle();

    private static ListNode head = null;
    private static ListNode current = null;

    public static void init() {
        for (Integer node : Arrays.asList(3, 2, 0, -4)) {
            if (null == head) {
                head = new ListNode(node);
                current = head;
            } else {
                current.next = new ListNode(node);
                current = current.next;
            }
        }

    }



    @Test
    public void hasCycleTest() {
        assertTrue(linkedListCycle.hasCycle(head));
    }

    @Test
    public void hasCycleFastSlowPointTest(){
        assertTrue(linkedListCycle.hasCycleFastSlowPoint(head));
    }

}
