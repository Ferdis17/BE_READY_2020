package sep_2020.dataStructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeImpl {

    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(35);
        dq.add(53);
        dq.addFirst(25);
        dq.addLast(60);
        System.out.println(dq);

        Deque<String> dqString = new LinkedList<>();
        dqString.addLast("Muriyesu");
        dqString.addLast("Isabelle");
        dqString.add("Ferdis");

        for(Iterator it = dqString.descendingIterator();
        it.hasNext(); ){
            System.out.print(it.next() + " ");

        }
    }
}
