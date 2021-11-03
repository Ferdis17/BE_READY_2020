package summer_2021;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {

    public static int[] sumOfTwo(int[] arr, int target) {

        Map<Integer, Integer> intMap = new HashMap<>();
int diff = 0;
        for (int i = 0; i < arr.length; i++) {
            diff = target-arr[i];
            if(!intMap.containsKey(diff)) {
                intMap.put(diff, arr[i]);
            }

        }

        return new int[] {diff, intMap.get(diff)};
    }

    public static void main(String[] args) {

        int[] b = {1,2,3};

        System.out.println(Arrays.toString(sumOfTwo(b, 5)));
    }
}
