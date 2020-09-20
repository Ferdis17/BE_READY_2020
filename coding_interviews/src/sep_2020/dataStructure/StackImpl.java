package sep_2020.dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackImpl {

    public static void main(String[] args) {

        Stack stack1 = new Stack();
        Stack<String> stack2 = new Stack<>();
        List<String> strings =new ArrayList<>(Arrays.asList("Ferdinand", "Isabelle", "Rachel", "Mukunzi", "Daniel"));

        stack1.push("Muriyesu");
        stack1.push(1);
        stack1.push("Ferdinand");

        for(String name : strings) {
            stack2.push(name);
        }

        System.out.println("Initial stack2 : "+ stack2);
        System.out.println("Initial stack1 : "+ stack1);
        System.out.println("search 1 in stack1: " + stack1.search(3));
        System.out.println("after pop operation on stack2: "+ stack2.pop());
        System.out.println("after pop: " +stack2);
    }
}
