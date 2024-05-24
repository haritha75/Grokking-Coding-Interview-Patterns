import java.util.*;

public class PalindromeList{
    public static boolean palindrome(LinkedListNode head) {

      // Replace this placeholder return statement with your code
      if (head == null || head.next == null)
            return true;

        LinkedListNode slow = head;
        LinkedListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        LinkedListNode secondHalf = reverse(slow.next);
        LinkedListNode firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;

    }
        private static LinkedListNode reverse(LinkedListNode head) {
        LinkedListNode prev = null;
        LinkedListNode current = head;
        LinkedListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}