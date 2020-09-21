package sep_2020;

public class OneWayEditOtherWay {

    public static boolean oneEditWay(String s1, String s2) {

        if (Math.abs (s1.length() - s2.length() )> 1){
            return false;
        }

        String s = s1.length() < s2.length() ? s1 : s2;
        String t = s1.length() < s2.length() ? s2 : s1;

        int i = 0;
        int j = 0;

        boolean foundDiff = false;
        while (j < t.length() && i < s.length()) {
            if(s.charAt(i) != t.charAt(j)) {
                if (foundDiff){
                    return false;
                } else {
                    foundDiff = true;
                }
                if (s.length() == t.length()) {
                    i++;
                }
            } else {
                i++;
            }
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(oneEditWay("Apple", "Aple"));
    }
}
