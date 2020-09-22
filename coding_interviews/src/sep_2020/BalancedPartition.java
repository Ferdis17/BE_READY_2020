package sep_2020;

public class BalancedPartition {

    private static boolean isSubSetSum(int[] arr, int n, int sum){
        if(sum == 0)
            return true;
        if (n == 0)
            return false;
        if (arr[n-1] > sum)
            return isSubSetSum(arr, n-1, sum);
        return isSubSetSum(arr, n-1, sum) || isSubSetSum(arr, n-1, sum-arr[n-1]);
    }

    private static boolean findPartition(int[] arr, int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        if(sum % 2 != 0){
            return false;
        }
        return isSubSetSum(arr, n, sum/2);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 9, 12};
        int n = arr.length;
        if (findPartition(arr, n))
            System.out.println("Can be divided into two subsets of equal sum");
        else System.out.println("Cannot be divided in two subset of equal sum");
    }

}