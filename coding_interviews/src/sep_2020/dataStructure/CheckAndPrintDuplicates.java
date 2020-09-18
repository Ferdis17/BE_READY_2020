package sep_2020.dataStructure;

import java.util.*;

public class CheckAndPrintDuplicates {

    private static int [] printDuplicates(int[] arr){
       List<Integer> result = new ArrayList<>();
       Set<Integer> integers =  new HashSet<>();
        for(int a : arr){
            if(!integers.add(a)){
                result.add(a);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(printDuplicates(new int[]{1, 3, 2, 1, 4, 5, 4, 3})));
    }
}
