import java.util.*;

public class MinimumWindowSubsequence{
    public static String minWindow(String s, String t) {
        
        // Replace this placeholder return statement with your code
        int sizeStr1 = s.length();
        int sizeStr2 = t.length();
        float length = Float.POSITIVE_INFINITY;
        int indexS1 = 0;
        int indexS2 = 0;
        int start = 0,
        end = 0;
        String minSubsequence = "";
        while (indexS1 < sizeStr1) {
          if (s.charAt(indexS1) == t.charAt(indexS2)) {
            indexS2 += 1;
            if (indexS2 == sizeStr2) {
              start = indexS1;
              end = indexS1;
              indexS2 -= 1;
              while (indexS2 >= 0) {
                if (s.charAt(start) == t.charAt(indexS2)) {
                  indexS2 -= 1;
                }
                start -= 1;
              }
              start += 1;
              if ((end - start + 1) < length) {
                length = end - start + 1;
                minSubsequence = s.substring(start, end + 1);
              }
              indexS1 = start;
              indexS2 = 0;
            }
          }
          indexS1 += 1;
        }
        return minSubsequence;
    }
}


// import java.util.*;

// public class Main{
//     public static String minWindow(String s, String t) {

//         // Replace this placeholder return statement with your code
//        if (s == null || t == null || s.length() < t.length()) {
//             return "";
//         }
        
//         // Create a map to count all characters in t
//         Map<Character, Integer> targetMap = new HashMap<>();
//         for (char c : t.toCharArray()) {
//             targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
//         }

//         // Create a map to count all characters in the current window in s
//         Map<Character, Integer> windowMap = new HashMap<>();
//         int left = 0, right = 0;
//         int minLeft = 0, minLen = Integer.MAX_VALUE;
//         int required = targetMap.size();
//         int formed = 0;

//         while (right < s.length()) {
//             char c = s.charAt(right);
//             windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

//             if (targetMap.containsKey(c) && windowMap.get(c).intValue() == targetMap.get(c).intValue()) {
//                 formed++;
//             }

//             while (left <= right && formed == required) {
//                 c = s.charAt(left);

//                 if (right - left + 1 < minLen) {
//                     minLeft = left;
//                     minLen = right - left + 1;
//                 }

//                 windowMap.put(c, windowMap.get(c) - 1);
//                 if (targetMap.containsKey(c) && windowMap.get(c).intValue() < targetMap.get(c).intValue()) {
//                     formed--;
//                 }

//                 left++;
//             }

//             right++;
//         }

//         return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
//     }
// }