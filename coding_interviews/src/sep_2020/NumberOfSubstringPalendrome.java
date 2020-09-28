package sep_2020;

public class NumberOfSubstringPalendrome {

    public static boolean isPalindrome(String s, int start, int end){

        if(start==end)
            return true;
        for(int i = 0; i < (end-start)/2; i++) {
            if(s.charAt(i+start) != s.charAt(end-i))
                return false;
        }


        return true;


    }

    public static int countNumPalindromes(String s) {
        int count=0;
        for(int i=0; i < s.length(); i++) {
            for(int j=s.length()-1; j >= i;j--) {
                if(s.charAt(i) == s.charAt(j)) {
                    if(isPalindrome(s, i, j))
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumPalindromes("mokkori"));
    }
}
