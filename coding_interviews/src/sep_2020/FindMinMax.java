package sep_2020;

public class FindMinMax {

    private static int max(int[] arr) {

        int max = arr[0];

        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
     private static int min(int [] arr){
        int min = arr[0];
         for (int value : arr) {
             if (value < min) {
                 min = value;
             }
         }
        return min;
     }

    public static void main(String[] args) {
        System.out.println(max(new int[]{1,2,3,72,4}));
        System.out.println(min(new int[]{0,1,2,3,72,4}));
    }
}
