package sep_2020;

public class InfinityString {
    public static void main(String[] args) {

        System.out.println(repeatedString("a", 1000000000000L));
    }
    static long repeatedString(String s, long n) {

        long count = 0;
        long factor = (n/s.length());
        long rem = (n%s.length());

        for(char c : s.toCharArray())
            if(c == 'a')
                count++;
        count =  factor*count;
        for(int i=0;i<rem;i++)
            if(s.charAt(i)=='a')
                count++;
        return count;
    }

}
