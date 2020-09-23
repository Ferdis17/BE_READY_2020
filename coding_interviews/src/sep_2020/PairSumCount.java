package sep_2020;

import java.util.HashMap;
import java.util.Map;

public class PairSumCount {

    public static int pairSumCount(int [] arr, int sum){

        // O(n square solution)

        int pairCount = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j ++){
                if (arr[i] + arr[j] == sum) {
                    pairCount +=1;
                }

            }
        }
        return pairCount;
    }

    public static int pairSumCountMap(int [] arr, int sum){
        int pairCount = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : arr){

            if(!map.containsKey(i)){
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        for(int i : arr){
            if(map.get(sum - i) != null){
                pairCount += map.get(sum - i);
            }
            if(sum-i == i){
                pairCount--;
            }
        }
        return pairCount/2;
    }
    public static void main(String[] args) {
        System.out.println(pairSumCountMap(new int[]{1, 5, 7, -1, 5}, 6));
        System.out.println(pairSumCount(new int[]{1, 5, 7, -1, 5}, 6));
    }
}
