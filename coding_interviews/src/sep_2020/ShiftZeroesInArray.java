package sep_2020;

import java.util.Arrays;

public class ShiftZeroesInArray {

    public static int [] shiftZeroes(int[] arr){

        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length){
            arr[count] = 0;
            count++;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shiftZeroes(new int[]{1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9})));
    }
}
