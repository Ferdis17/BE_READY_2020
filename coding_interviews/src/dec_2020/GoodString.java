package dec_2020;

public class GoodString {

    public static void main(String[] args) {

        System.out.println(getGoodString("caaabbb"));
    }

    private static String getGoodString(String str) {

       StringBuilder s = new StringBuilder();

       if(str != null && str.length() > 0) {
           s.append(str.charAt(0));

           for( int i = 1; i < str.length(); i++) {

               if(s.charAt(s.length()-1) != str.charAt(i)) {
                   s.append(str.charAt(i));
               }
           }
       }
        return s.toString();
    }
}
