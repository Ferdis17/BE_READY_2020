package linkedList;

public class DeleteMiddleNode {

    static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    static boolean deleteMiddleNode(Node n){

        if(n == null || n.next == null) {
            return false;
        }
        Node next = n.next;
        n.value = next.value;
        n.next = next.next;
        return true;
    }
    public static void displayElements(Node head){
        while ( head != null) {
            System.out.println(head.value + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {

        Node start = new Node(12);
        start.next = new Node(13);
        start.next.next = new Node(11);
        start.next.next.next = new Node(23);
        start.next.next.next.next = new Node(42);
        start.next.next.next.next.next = new Node(15);
        start.next.next.next.next.next.next = new Node(10);

        System.out.println(deleteMiddleNode(start.next.next.next.next.next.next));

        displayElements(start);


    }

}
