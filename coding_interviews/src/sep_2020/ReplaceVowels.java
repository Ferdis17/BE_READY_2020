package sep_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceVowels {

    public static String replaceVowels( String str) {

        StringBuilder sb = new StringBuilder(str);

        Character[] ch = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        List<Character> chars = new ArrayList<>(Arrays.asList(ch));

        for (int i = 0; i < sb.length(); i++) {

            if (chars.contains(sb.charAt(i))) {

                sb.replace(i, i + 1, "");
                i--;

            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(replaceVowels("Muriyesu"));

    }

}
