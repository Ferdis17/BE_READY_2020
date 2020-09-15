package sep_2020;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        if (steps == 0 || path == null) {
            return 0;
        }
        int valleys = 0;
        int level = 0;
        for (char c : path.toCharArray()) {
            if (c == 'U') {
                level++;
                if (level == 0) {
                    valleys++;
                }
            } else {
                level--;
            }
        }
        return valleys;
    }
    public static void main(String[] args) {
        System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
    }
}

