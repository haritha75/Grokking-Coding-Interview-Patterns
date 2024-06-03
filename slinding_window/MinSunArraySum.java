import java.util.*;

class MinimumSubArraySum{
   public static int minSubArrayLen(int target, int[] nums) {
      
      // Replace this placeholder return statement with your code
        int end=0;
        int sum=0;
        int result=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            while(sum>=target){
                result=Math.min(result,i+1-end);
                sum=sum-nums[end];
                end++;
            }  
        }
         if(result!=Integer.MAX_VALUE){
                return result;
            }
        return 0;
   }
}