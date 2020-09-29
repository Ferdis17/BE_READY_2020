package sep_2020;

import java.util.*;

public class CountingDuplicate {

    public static int countDuplicate(List<Integer> numbers) {
        // Write your code here
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : numbers){
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        Set<Integer> set = new HashSet<>();
        set.addAll(numbers);
        for(Integer i : set) {
            if(map.get(i) > 1) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDuplicate(new ArrayList<>(Arrays.asList(8,1,3,1,4,5,6,3,2))));
    }

}

