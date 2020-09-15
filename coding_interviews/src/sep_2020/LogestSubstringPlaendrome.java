package sep_2020;

public class LogestSubstringPlaendrome {


    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            if (s.charAt(0) != s.charAt(s.length() - 1)) {
                return false;
            } else {
                return isPalindrome(s.substring(1, s.length() - 1));
            }
        }
    }

    public static String getLongestPalindrome(String s) {
        String temp, longest = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                temp = s.substring(i, j);
                if (isPalindrome(temp) && temp.length() > longest.length()) {
                    longest = temp;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {

        System.out.println(getLongestPalindrome("MUMOM"));
    }
}

