package sep_2020;

// here we don't know rotation point
public class StringRotation {

    //there is a helper method like isSubString()
    private static boolean isSubString(String s, String t){
        return s.contains(t);
    }
    // this is to check if one String is a rotation of another
    public static boolean isRotation(String s1, String s2) {

        if ((s1.length() == s2.length()) && s1.length() > 0) {
            String t = s1 + s1;
            return isSubString(t, s2);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
    }
}
