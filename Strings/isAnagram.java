package Strings;

import java.util.Arrays;

public class isAnagram {

    public static void main(String[] args) {
        
        String s1 ="manoj";
        String s2 ="janom";

      char c1[] =  s1.toCharArray();
      char c2[] =  s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);


        boolean anagram = (Arrays.equals(c1, c2));

        System.out.print(anagram);
    }
    
}
