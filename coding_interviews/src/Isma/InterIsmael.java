package Isma;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InterIsmael {

    public static void main(String[] args) {

        int size = 0;
        for (int i = 0; i < size; i++) {
            ++size;
        }
        System.out.println("size is equal to: " + size);
        for (int i = 0; i <= size; i++) {
            size -=2;
        }
        System.out.println("size is equal to: " + size);

        Integer[] intArray = {10,20,30,40,50,60,70,80,90};
        System.out.println("Original Array printed in reverse order:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");


        System.out.println(" nice array " + isNice(new int[]{12, 2, 10}));
        System.out.println(isNice(new int[]{1,5,2}));
        System.out.println(isVeryNice(new int[]{12, 2, 10}));
        System.out.println(isVeryNice(new int[]{1,5,2}));
        System.out.println(Arrays.toString(numTarget(new int[]{2,7,11,15}, 9)));
        System.out.println(hasMultipleMaximum(new int []{-6, 2, 5, -6, 5, 6}));
        System.out.println(hasMultipleMaximum(new int []{-6, 2, 5, 6, -6, 5, 6}));
    }

    public static int isNice(int[] c) {

        int sum;

        for (int i = 0; i < c.length; i++) {
                sum = 0;
                for (int j = 0; j < c.length; j++) {

                    if(j != i) {
                        sum += c[j];
                    }
                }
                if (c[i] > sum){
                    return 0;
                }
        }
        return 1;
    }

    public static int isVeryNice(int[] c) {

        int sum = 0;

        for (int i = 0;i < c.length; i++) {
            sum += c[i];
        }

        for (int i = 0;i < c.length; i++) {
            if(c[i] > sum-c[i]) {
                return 0;
            }
        }
        return 1;
    }

    public static int[] numTarget(int[] nums, int target) {

        Map<Integer, Integer> mapInt = new HashMap<>();

        int[] res = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (mapInt.containsKey(target - nums[i])) {
                res[0] = mapInt.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            mapInt.put(nums[i], i);
        }
        return res;
    }

    public static boolean hasMultipleMaximum(int [] a) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i] ) {
                max = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] == max){
                count ++;
                if (count > 1 ) {
                    return true;
                }

            }
        }
        return false;
    }
}
