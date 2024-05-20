import java.util.*;

public class Main{
    public static boolean isPalindrome(String s) {
       
        // Replace this placeholder return statement with your code
        int start =0,end=s.length()-1;
        for(int i=0;i<s.length()/2;i++) {
            if(s.charAt(start)!=s.charAt(end))
              return false;
            else {
                start++;
                end--;
            }

        }
        return true;
    }
}