package sep_2020;

public class RunLength {
    public static String printRLE(String str) {

        StringBuilder result = new StringBuilder();

        int n = str.length();
        for (int i = 0; i < n; i++) {

            // Count occurrences of current character
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

          result.append(str.charAt(i)).append(count);

            // Print character and its count
//            System.out.print(str.charAt(i));
//            System.out.print(count);
        }

        return result.toString();
    }

    public static void main(String[] args)
    {
        String str = "wwwwaaadexxxxxxywww";
        System.out.println(printRLE(str));
    }
}