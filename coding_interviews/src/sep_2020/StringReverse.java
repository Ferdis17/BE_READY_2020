package sep_2020;

public class StringReverse {
// not sure if it's efficient
    public static String reverse(String str) {

        byte [] bytes = new byte[str.length()];
        byte [] strBytes = str.getBytes();

        for(int i = 0; i < strBytes.length; i++){
            bytes[i] = strBytes[strBytes.length -i -1];
        }
        return new String(bytes);
    }

    public static void main(String[] args) {
        System.out.println(reverse("Muriyesu Ferdinand"));
    }
}
