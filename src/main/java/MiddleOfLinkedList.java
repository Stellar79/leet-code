import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.NodeList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        } else {
            List<ListNode> nodes = new ArrayList<>();
            while (head != null) {
                nodes.add(head);
                head = head.next;
            }
            int size = nodes.size();
            int middleSize = size / 2;
            if (size % 2 != 0) {
                return nodes.get(middleSize+1);

            } else {
                return nodes.get((2*middleSize+1)/2);
            }

        }
    }
}



