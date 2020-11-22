package linkedList;

import java.util.LinkedList;
import java.util.List;

public class DeleteMiddleNode {



    void show(){
        System.out.println(data);
    }
    int data;

    Node head;
    static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    static Node deleteMiddleNode(Node n){

        if(n == null || n.next == null) {
            return null;
        }
        Node next = n.next;
        n.value = next.value;
        n.next = next.next;
        return next;
    }

    public void push(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }
    public static void displayElements(Node head){
        while ( head != null) {
            System.out.println(head.value + " ");
            head = head.next;
        }
    }

    public static Node partitionALinkedList(Node n, int k) {
        Node head = n;
        Node tail = n;

        while (n != null) {
            Node next = n.next;
            if (n.value < k) {
                n.next = head;
                head = n;
            } else {
                tail.next = n;
                tail = n;
            }
            n = next;
        }
        tail.next = null;
        return head;
    }
    public static void main(String[] args) {
        DeleteMiddleNode add = new DeleteMiddleNode();

        add.push(12);
        add.push(13);
        add.push(11);
        add.push(23);
        add.push(42);
        add.push(15);
        add.push(10);

        Node start = new Node(12);
        start.next = new Node(13);
        start.next.next = new Node(11);
        start.next.next.next = new Node(23);
        start.next.next.next.next = new Node(42);
        start.next.next.next.next.next = new Node(15);
        start.next.next.next.next.next.next = new Node(10);

        System.out.println();
        System.out.println(partitionALinkedList(start, 23));
        displayElements(start);

        System.out.println();

        System.out.println("before deleting a node");
        displayElements(add.head);

        System.out.println("after deleting a node");
        System.out.println(deleteMiddleNode(add.head.next.next));
        displayElements(add.head);

        int a =9, b =2;
        float f = a/b;

        System.out.println(f);
       f =  f/2;
        System.out.println(f);
        f = a+b/f;
        System.out.println(f);

        Runnable r = () -> System.out.println("H");
        new Thread(r).start();

        int x = 0;
        add.show();

        Integer t = 3;
        Integer y = null;

        try {
            System.out.println(Integer.compareUnsigned(x,3) == 0 || Integer.compareUnsigned(y, 0) == 0);
        } catch ( Exception ex) {
            System.out.println(ex.getClass().toString());
        } try {
            System.out.println(y.compareTo(null) == 0 || true );
        } catch ( Exception ex) {
            System.out.println(ex.getClass().toString());
        }

    }

}
