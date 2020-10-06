package sep_2020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
    }
//brute force
    public static int[] twoSum(int [] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for (int j  = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no two sum numbers");
    }
    // using hashmap
    public static int[] twoSumMap(int [] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement) && map.get(complement) != i) {
                    return new int[] { i, map.get(complement)};
                }
            }
            throw new IllegalArgumentException("No two sum solution");
    }
}
