package sep_2020;

public class NewYearChaos {

    static void minimumBribes(int[] q) {

        int temp = 0, count = 0, check =0;
        int[] bribe = new int[1000000];
        boolean isSorted = false;
        while(isSorted != true){
            isSorted = true;
            for(int i=q.length-1; i>0 ; --i){
                if(q[i] < q[i-1]){
                    temp = q[i-1];
                    q[i-1] = q[i];
                    q[i] = temp;
                    bribe[q[i]]++;
                    count++;
                    if(bribe[q[i]] > 2) {
                        System.out.println("Too chaotic");
                        check++;
                        break;
                    }
                    isSorted = false;
                }
            }
        }
        if(check == 0)
            System.out.println(count);
    }
}
