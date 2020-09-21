package sep_2020;

import java.util.Arrays;

/**
 * manimulating a string replacing some chars/ this the solution given in crackingTheCodingInterviews
 */
public class URLify {

    public static void replaceSpaces(char[] str, int trueLength) {
        int numberOfSpaces = countOfChar(str, 0, trueLength, ' ');
        int newIndex = trueLength - 1 + numberOfSpaces * 2;

        if(newIndex + 1 < str.length){
            str[newIndex + 1] = '\0';
        }
        for(int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex -= 1){
            if(str[oldIndex] == ' ') {
                str[newIndex] = '0';
                str[newIndex - 1] = '2';
                str[newIndex - 2] = '%';
                newIndex -= 3;
            } else {
                str[newIndex] = str[oldIndex];
                newIndex -= 1;
            }
        }
    }
    private static int countOfChar(char[] str, int start, int end, int target) {
        int count = 0;
        for(int i = start; i < end; i++) {

            if(str[i] == target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "I love to eat mexican food";
        char [] chars = str.toCharArray();
        replaceSpaces(chars, chars.length);
        System.out.println(Arrays.toString(chars));
    }
}
