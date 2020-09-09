package sep_2020;

import java.util.HashSet;
import java.util.Set;

public class PermutationFinder {
    public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<>();
        if (str == null){
            return null;
        } else if (str.length() == 0){
            perm.add("");
            return perm;
        }
        char firstChar = str.charAt(0);
        String remaining = str.substring(1);
        Set<String> words = permutationFinder(remaining);
        for(String newStr : words) {
            for (int i = 0; i<=newStr.length(); i++) {
                perm.add(charInsert(newStr, firstChar, i));
            }
        }
        return perm;
    }

    private static String charInsert(String newStr, char firstChar, int i) {
        String initial = newStr.substring(0,i);
        String end = newStr.substring(i);
        return initial + firstChar + end;
    }

    public static void main(String[] args) {

        System.out.println("Permutation for " + permutationFinder("MURIYESU"));
        System.out.println("Permutation for " + permutationFinder("MUR"));
    }
}
