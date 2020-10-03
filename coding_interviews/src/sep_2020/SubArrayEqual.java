package sep_2020;

import java.util.HashMap;
import java.util.Map;

// as anagram approach
public class SubArrayEqual {

    static boolean areTheyEqual(int[] array_a, int[] array_b) {

        if (array_a.length != array_b.length) return false;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : array_a) freq.put(num, freq.getOrDefault(num, 0) + 1);
        for (int num : array_b) {
            if (!freq.containsKey(num) || freq.get(num) == 0) return false;
            freq.put(num, freq.get(num) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4};
        int[] B = { 1, 4, 3, 2 };
        System.out.println(areTheyEqual(A, B));
    }

}
