package sep_2020;

public class JumpingCloud {
    public static void main(String[] args) {
        System.out.println(findMinimumJumps(new int[]{1, 0, 0, 0, 1, 0, 0}));

    }
    public static int findMinimumJumps(int [] arr){

        int jumps = 0;

        for (int i = 0; i < arr.length; i++){
            jumps++;
            if(i < arr.length - 2 && arr[i+2] == 0){
                i++;
            }
        }
        return jumps;
    }
}
