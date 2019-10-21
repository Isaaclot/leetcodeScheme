package linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * @author alis
 * @date 2019/10/20 7:19 AM
 * @description
 */
public class LC_141_LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        Set<String> hasVisitNodes = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (hasVisitNodes.contains(current.toString())) {
                return true;
            }
            hasVisitNodes.add(current.toString());
            current = current.next;
        }


        return false;
    }

    public boolean hasCycleFastSlowPoint(ListNode head) {
        if (null == head) return false;
        ListNode fast = head;
        ListNode slow = head.next;
        while (fast != slow) {
            if (null == head || head.next == null) {
                return false;
            }
            fast = fast.next.next; // 走两步，两个next
            slow = slow.next;
        }
        return true;
    }
}
