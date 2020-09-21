package sep_2020;

import java.util.Arrays;

public class CheckPermutation {

    public static void main(String[] args) {
        System.out.println(checkPermutation("god", "dog"));
        System.out.println(permutation("god", "dog"));
    }
    public static  boolean checkPermutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }
    private static String sort(String str){
        char [] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // using ASCII assumption
    public static boolean  permutation(String s, String t){
        if(s.length() != t.length()) {
            return false;
        }
        int [] letters = new int[128];

        for(int i = 0; i < s.length(); i++){
            letters[s.charAt(i)]++;
        }

        for(int i = 0; i < t.length(); i++) {
            letters[t.charAt(i)]--;
            if(letters[t.charAt(i)] < 0){
                return false;
            }
        }
        return true;
    }
}
