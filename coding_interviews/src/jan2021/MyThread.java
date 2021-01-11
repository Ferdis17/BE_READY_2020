package jan2021;

public class MyThread extends Thread {
//    public static void main(String[] args) {
////        new MyThread("oops");
//    }


    public static void main(String args[]) {
        int[] a = addOne(new int[]{1,2,3});
        for(int ar : a) {
            System.out.println(ar);
        }


    }

    public static final int[] addOne(int[] digits) {
        int carry = 1;
        int[] result = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            int val = digits[i] + carry;
            result[i] = val % 10;
            carry = val / 10;
        }
        if (carry == 1) {
            result = new int[digits.length + 1];
            result[0] = 1;
        }

        return result;
    }




    @Override
    public void start() {
        System.out.println("in start " + getName());
    }

    public void run() {
        System.out.println("in run " + getName());
    }
}