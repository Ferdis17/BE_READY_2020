package sep_2020;

/**
 * Reverse to Make Equal
 * Given two arrays A and B of length N, determine if there is a way to make A equal to B by reversing any subarrays from array B any number of times.
 *
 * crazy solution
 */
public class MakeEqualReverse {

    static boolean areTheyEqual(int[] array_a, int[] array_b) {
        // Write your code here
        int start = 0;
        int end = array_a.length;

        for (int i = 0; i < array_a.length; i++) {
            if (array_a[i] != array_b[i]) {
                start = i;
                break;
            }
        }

        for (int i =array_a.length-1; i>= 0; i--) {
            if (array_a[i] != array_b[i]) {
                end = i;
                break;
            }
        }
        int [] subArray = new int[end-start+1];

            for(int j = start; j < end+1; ) {
            for(int i = 0; i < subArray.length; i++){
                subArray[i] = array_b[j];
                j++;
            }
        }
       int [] reversed =  new int[subArray.length];
            int n =  reversed.length;
            for (int i = 0; i < subArray.length; i++) {
                reversed[n-1] = subArray[i];
                n --;
            }
        for (int i = start; i < end+1; i++ ) {
            array_b[i] = reversed[i-1];
        }

        for (int i = 0; i < array_a.length; i++) {
            if (array_a[i] != array_b[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

            int[] A = { 1, 2, 3, 4};
            int[] B = { 1, 4, 3, 2 };
        System.out.println(areTheyEqual(A, B));

    }

}

