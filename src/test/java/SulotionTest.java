import java.util.List;
import org.junit.Test;

public class SulotionTest {
    @Test
    public void TestListNode(){
       MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));

        System.out.println(middleOfLinkedList.middleNode(head));
    }
}
