import java.util.*;

public class FindRepeatedSequences{

   public static Set<String> findRepeatedSequences(String s, int k) {
      
    // Replace this placeholder return statement with your code

           if (k == 0 || s.length() < k) {
            return new HashSet<String>();
        }
        
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        
        for (int i = 0; i <= s.length() - k; i++) {
            String currentSubstr = s.substring(i, i + k);
            if (seen.contains(currentSubstr)) {
                repeated.add(currentSubstr);
            } else {
                seen.add(currentSubstr);
            }
        }
        
        return repeated;
    
    
   }
}