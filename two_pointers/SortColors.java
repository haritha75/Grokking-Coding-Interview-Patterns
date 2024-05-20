import java.util.*;

public class Solution {
    public static int[] sortColors (int[] colors) {

        // Write your code here
        int start =0,current=0,end=colors.length-1;
        for(int i=0;i<colors.length;i++) {
            if(colors[current]==0){
                int val = colors[current];
                colors[current] = colors[start];
                colors[start] = val;
                start++;
                current++;
            }else if(colors[current]==1) {
                current++;
            }else{
                 int temp = colors[current];
                colors[current] = colors[end];
                colors[end] = temp;
                end--;
            }



        }

        return colors;
    }
}