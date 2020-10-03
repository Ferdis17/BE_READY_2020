package sep_2020.forEb;

public class BubleSorting {

    public static void bubleSortArray(int[] arr){

        int temp;
        // ascending order
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j ++){
                if(arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        bubleSortArray(new int[]{3,1,2,8,9,10,4,7,0});
    }
}
