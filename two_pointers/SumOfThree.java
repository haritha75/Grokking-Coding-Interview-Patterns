import java.util.*;

public class SumOfThree{
   public static boolean findSumOfThree(int[] nums, int target) {
      
      // Replace this placeholder return statement with your code
        Arrays.sort(nums); 
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++; // We need a larger sum
                } else {
                    right--; // We need a smaller sum
                }
            }
        }
        
      return false;
   }
}