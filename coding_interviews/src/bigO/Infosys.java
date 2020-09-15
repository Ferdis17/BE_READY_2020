package bigO;

import java.util.Arrays;

/**
 * Sort any given string in any given arbitrary order.
 * - eg. Order = ‘sitgo’.  Input String = ‘thisisalongstring’.output will be ‘sssiiittggohalnrn’
 */

public class Infosys {

    public static String sortThisString(String str, String order){
        String sortedString = null;

        if(null == str || str.isBlank()){
            return null;
        }
        char [] ch =  str.toCharArray();
        char [] ordering = order.toCharArray();
        char countArray[] = new char[26];
        for (int i = 0; i < ch.length; i++){
            countArray[ch[i]-'a']++;
        }

        int k = 0;
        for (int i = 0; i < ordering.length; i++){
            for(int j = 0; j < countArray[ordering[i] - 'a']; j++){
                ch[k++] = ordering[i];
            }
        }
        sortedString = new String(ch);


        return sortedString;

    }

    public static void main(String[] args) {
        System.out.println(sortThisString("thisisalongstring","sitgo"));
    }

}
