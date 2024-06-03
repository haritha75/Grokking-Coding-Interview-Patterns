import java.util.*;

public class LongestSubstring{
    public static int findLongestSubstring(String str) {

        // Replace this placeholder return statement with your code
         if (str == null || str.length() == 0) {
            return 0;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;  
        int start = 0;     

        for (int end = 0; end < str.length(); end++) {
            char currentChar = str.charAt(end);

            if (map.containsKey(currentChar) && map.get(currentChar) >= start) {
                start = map.get(currentChar) + 1;  
            }

            map.put(currentChar, end);

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}