import java.util.*;

public class detectCycle{
    public static boolean detectCycle(LinkedListNode head) {
    
    // Replace this placeholder return statement with your code
     if (head == null) {
            return false;
        }

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
  }
}