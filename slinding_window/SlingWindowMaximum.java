import java.util.*;

class SlidingWindowMaximum {
	public static int[] findMaxSlidingWindow(int[] nums, int w) {

		// Replace this placeholder return statement with your code
		 if (nums == null || w <= 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n - w + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() < i - w + 1) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= w - 1) {
                result[i - w + 1] = nums[deque.peekFirst()];
            }
        }

        return result;

		
	}
}