package summer_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels {
     public static String reverseVowels (String str) {

         List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'A', 'e','E','i','I','o','O','u','U'));

         int i = 0;
         int j = str.length()-1;

         char[] chars = str.toCharArray();

         while (i < j) {
             if (!vowels.contains(chars[i])) {
                 i++;
                 continue;
             }
             if(!vowels.contains(chars[j])) {
                 j--;
                 continue;
             }
             //swap
             char t = chars[i];
             chars[i] = chars[j];
             chars[j] = t;

             i++;
             j--;
         }

         return String.copyValueOf(chars);
     }

    public static void main(String[] args) {
        String str = "Mriyeso";
        System.out.println(reverseVowels(str));
    }
}
