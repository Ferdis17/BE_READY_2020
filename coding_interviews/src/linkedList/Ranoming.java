package linkedList;

import java.util.Random;

public class Ranoming {

    public static void main(String[] args) {

        String str = "avabaoOOOOAAAIIInasnABe26373";
        String newstr = str.replaceAll("[aeouiAEUOI]", "");
        System.out.println(newstr);
        int n = str.length();
        String str2 = "aeouiAEUOI";
        int nn = str2.length();
        for(int i=0; i<n; i++){

            if(!str.contains(Character.toString(str2.charAt(i)))){

            }

        }
//        Random r = new Random();
//        for (int i = 0; i < 3; i++) {
//
//            System.out.print(r.ints(1, 5, 11).findFirst().getAsInt());
//        }
    }
}
