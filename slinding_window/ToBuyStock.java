import java.util.*;

public class ToBuyStock{
   public static int maxProfit(int[] prices) {
      
      // Replace this placeholder return statement with your code
        int max=0;
        if(prices.length==1)
           return 0;

        int left=0;   

        for(int right=1;right<prices.length;right++) {
            if(prices[right] > prices[left]) {
                int curr= prices[right]-prices[left];
                max=Math.max(max,curr);
            }
            else {
                left = right;
            }
        }
        return max;
   }
}