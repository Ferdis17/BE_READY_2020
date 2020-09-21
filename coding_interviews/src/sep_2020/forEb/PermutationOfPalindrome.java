package sep_2020.forEb;

public class PermutationOfPalindrome {
    public static void main(String[] args) {

        System.out.println( isPermutationOfPalindrome("Tackts kccksa"));

    }
    public static boolean isPermutationOfPalindrome(String str) {

        int countOdd = 0;

        int[] frequencyTable = new int[Character.getNumericValue('z')
                - Character.getNumericValue('a') + 1];

        for(char c : str.toCharArray()) {
            int n =  getCharNumber(c);
            if(n != -1) {
                frequencyTable[n]++;
                if(frequencyTable[n] % 2 == 1) {
                    countOdd ++;
                } else {
                    countOdd --;
                }
            }
        }

        return countOdd <= 1;

    }

    private static int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z){
            return val-a;
        }
        return -1;
    }
}
