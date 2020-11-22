package linkedList;

public class StaticThings {

    private static int count;

    static  {
        System.out.println("In block 1");
        count = 10;
    }

    private int [] data;

   static  {
        System.out.println("In Block 2");

    }

    public static void main(String[] args) {
//       System.out.println(count);
////        System.out.println("Before 1st call to new");
        StaticThings st = new StaticThings();
//        System.out.println("Before 2nd call to new");
        StaticThings st2 = new StaticThings();

    }
}
