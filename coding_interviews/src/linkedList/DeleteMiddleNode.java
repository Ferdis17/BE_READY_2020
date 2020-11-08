package linkedList;

import java.util.LinkedList;
import java.util.List;

public class DeleteMiddleNode {

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
    }

}
