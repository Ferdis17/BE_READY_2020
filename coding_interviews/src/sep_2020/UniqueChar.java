package sep_2020;

import java.util.HashMap;
import java.util.Map;

/**
 * This is not the optimal solution
 */
public class UniqueChar {
    public static boolean isUnique(String str){
        Map<Character, Integer> map = new HashMap<>();
        char [] ch = str.toCharArray();

        for(int i = 0; i < ch.length; i++){
            if(!map.containsKey(ch[i])){
                map.put(ch[i],i);
            }
            if(map.keySet().size() == str.length()){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("Mriyesu"));
    }
}
