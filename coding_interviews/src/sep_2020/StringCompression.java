package sep_2020;

public class StringCompression {

    public static String compress(String string) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;

        for (int i = 0; i < string.length(); i++) {
            countConsecutive++;
            if(i + 1 >= string.length() || string.charAt(i) != string.charAt(i - 1)) {
                compressed.append(string.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < string.length() ? compressed.toString() : string;
    }
}
