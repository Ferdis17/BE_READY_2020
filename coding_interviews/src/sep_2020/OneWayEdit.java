package sep_2020;

public class OneWayEdit {
    public static void main(String[] args) {
        System.out.println(isOneWayEdit("Apple", "Aple"));
    }

    public static boolean isOneWayEdit(String first, String second) {
        if(first.length() == second.length()){
            return oneEditReplace(first, second);
        } else if (first.length()+1 == second.length()){
            return oneEditInsert(first, second);
        } else if (first.length()-1 == second.length()) {
            return oneEditInsert(first, second);
        }
        return false;
    }

    private static boolean oneEditReplace(String s1, String s2) {
        boolean diffFound = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)){
                if(diffFound) {
                    return false;
                }
                diffFound = true;
            }
        }
        return true;
    }
    private static boolean oneEditInsert(String s, String t) {
        int index1 = 0;
        int index2 = 0;
        while(index2 < t.length() && index1 < s.length()) {
            if (s.charAt(index1) != t.charAt(index2)) {
                if(index1 != index2) {
                    return false;
                }
                index1 ++;
            }else {
                index1 ++;
                index2 ++;
            }
        }
        return true;
    }
}
