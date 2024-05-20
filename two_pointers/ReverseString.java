import java.util.*;

public class Solution {
    public static String reverseWords(String sentence) {

        // Replace this placeholder return statement with your code
        String[] words = sentence.trim().split("\\s+");

        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", words);
    }
      
    
}
