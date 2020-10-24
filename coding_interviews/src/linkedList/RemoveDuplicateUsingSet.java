package linkedList;

import sep_2020.dataStructure.LRUWithLinkedListAndHashMap;

import java.util.*;

/**
 * this is will have O(n) running time
 */
public class RemoveDuplicateUsingSet {
    // using extra data structure
    public static void deleteDuplicates (Node head) {
        Set<Integer> set = new HashSet<>();

        Node current = head;
        Node prev = null;
        while (current != null){
            int currentVal = current.value;
            // we can also check if se contains the value
            if (!set.add(currentVal)) {
                prev.next = current.next;
            } else {
                set.add(currentVal);
                prev = current;
            }
            current = current.next;
        }
    }
    public static void displayElements(Node head){
        while ( head != null) {
            System.out.println(head.value + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node start = new Node(12);
        start.next = new Node(12);
        start.next.next = new Node(11);
        start.next.next.next = new Node(23);
        start.next.next.next.next = new Node(12);
        start.next.next.next.next.next = new Node(11);
        start.next.next.next.next.next.next = new Node(10);

        System.out.println("Linked list before removing duplicates : ");
        displayElements(start);

        deleteDuplicates(start);

        System.out.println("Linked list after removing duplicates : ");
        displayElements(start);
    }
        static class Node{
            int value;
            Node next;
            public Node(int value){
                this.value = value;
        }
    }
}
