package sep_2020;

public class MankeyClimbingPole {

    public static void main(String[] args) {
        System.out.println(getDaysToReachTheTop(4,3,10));
        System.out.println(getDaysToReachTheTop(6,2,10));
    }

    public static int getDaysToReachTheTop(int x, int y, int n){
        /**
         * x meters climbed
         * y meters slipped
         * n height of the pole
         */
        return (n-x)/(x-y) + 1;
    }

}
