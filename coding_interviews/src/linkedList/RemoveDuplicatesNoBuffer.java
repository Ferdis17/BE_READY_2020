package linkedList;
//This O(n^2) time and O(1) space
public class RemoveDuplicatesNoBuffer {

    public static void deleteDups(Node node) {
        Node current = node;
        while (current != null) {
            Node present = current;
            while (present.next != null) {
                if (present.next.value == current.value) {
                    present.next = present.next.next;
                } else {
                    present = present.next;
                }
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

        deleteDups(start);

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
