package sep_2020.forEb;

public class CountSubString {

    static int countFreq(String subString, String str) {
        int M = subString.length();
        int N = str.length();
        int count = 0;



        /* A loop to slide subString[] one by one */
        for (int i = 0; i <= N - M; i++) {

            /* For current index i, check for pattern match */
          int j;
            for (j = 0; j < M; j++) {
                if (str.charAt(i + j) != subString.charAt(j)) {
                    break;
                }
            }

            // if subString[0...M-1] = str[i, i+1, ...i+M-1]
            if (j == M) {
                count++;
            }
        }
        return count;
    }

    /* Driver program to test above function */
    static public void main(String[] args) {
        String txt = "San jose down town";
        String pat = "own";
        System.out.println(countFreq(pat, txt));
    }
}

