package sep_2020;

import java.util.Arrays;

public class MethodReference {

    public static void main(String[] args) {

        String [] arrayStr = {"Steve", "Rick", "aditya", "Nega", "Emma"};

        Arrays.sort(arrayStr, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(arrayStr));
    }
}
