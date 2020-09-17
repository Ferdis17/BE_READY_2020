package sep_2020;

public class HasUniqueChar {

    public static boolean isUniqueChars(String str){
        if (str.length() > 128)
            return false;
        boolean [] chars = new boolean[128]; //this will have chars[i] = false by default

        for (int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if(chars[val]){
                return false;
            }
            chars[val]=true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueChars("Muriyesu"));
    }
}
