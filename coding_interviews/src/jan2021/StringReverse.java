package jan2021;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Ngarambe";

        StringBuilder stb = new StringBuilder(str);

        stb.reverse();

        String reversed = stb.toString();

        System.out.println("reversed String = " + reversed );

        String even = "";
        String odd = "";

        for (int i = 0; i < reversed.length(); i++){

            if(i % 2 == 0) {
                even += reversed.charAt(i);
            } else {
                odd += reversed.charAt(i);
            }

        }

        System.out.println(" even =" + even);
        System.out.println( " odd = " + odd);

    }
}
