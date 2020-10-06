package sep_2020;

import java.util.Arrays;
// two Strings
public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        char [] aArray = a.toCharArray();
        char [] bArray = b.toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        String aa = new String(aArray);
        String bb = new String(bArray);
        return aa.equalsIgnoreCase(bb);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "margana"));
    }
}
