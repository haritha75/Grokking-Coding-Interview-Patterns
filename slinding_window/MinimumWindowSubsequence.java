import java.util.*;

public class Main{
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