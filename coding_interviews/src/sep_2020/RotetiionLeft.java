package sep_2020;

import java.util.Arrays;

public class RotetiionLeft {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotLeft(new int[]{1, 2, 3, 4, 5}, 1)));
    }

    static int[] rotLeft(int[] a, int d) {
        int[] arr = new int[a.length];
        int N = a.length;
        for (int i = 0 ; i < N;  i++){
            arr[i] = a[(i+d)%N];
        }
        return arr ;
    }
}
