package sep_2020;

public class PalendromeCheck {

    public static  boolean isPalendromeString (String str){

        if (str == null){
            return false;
        }
        for(int i = 0; i < str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalendromeStringBuilder(String str){
        if (str == null){
            return false;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString().equals(str);
    }

    public static void main(String[] args) {
        System.out.println(isPalendromeString("Muriyesu"));
        System.out.println( isPalendromeStringBuilder("MOM"));
    }
}
