package sep_2020;

public class RepeatedString {

    /**
     * don't do this plz
     */

    public static void main(String[] args) {

        System.out.println(repeatedString("aba", 10));
    }
    public static long repeatedString(String s, int n) {
        if(null == s || s.length() < 1){
            return 0;
        }
        if (n == 0) {
            return 0;
        }
        int count = 0;
        String newS = null;
        if(n < s.length()){
            newS = s.substring(n);
        }
        if (n > s.length()){
            if(n % s.length() == 0){
                newS = s.repeat(n/s.length());
            } else {
                int mod = n % s.length();
                newS = s.repeat((n-mod)/s.length()) + s.substring(mod);
            }
        }
        for(int i = 0; i < newS.length(); i++){
            if(newS.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }
}
