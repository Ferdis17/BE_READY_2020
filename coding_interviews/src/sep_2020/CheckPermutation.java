package sep_2020;

import java.util.Arrays;

public class CheckPermutation {

    public static void main(String[] args) {
        System.out.println(checkPermutation("god", "dog"));
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
}
