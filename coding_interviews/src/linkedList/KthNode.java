package linkedList;

public class KthNode {

    public static Node nthToLast(Node head, int n) {
        Node p1 = head;
        Node p2 = head;

        //move p1 n nodes into the list

        for (int i = 0; i < n; i++) {
            if (p1 == null) {
                return null;
            }
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
       return p2;
    }

    public static void main(String[] args) {
        Node start = new Node(12);
        start.next = new Node(13);
        start.next.next = new Node(11);
        start.next.next.next = new Node(23);
        start.next.next.next.next = new Node(42);
        start.next.next.next.next.next = new Node(15);
        start.next.next.next.next.next.next = new Node(10);

        System.out.println(nthToLast(start, 5) == null ? null : nthToLast(start, 5).value);


    }

    static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
}
