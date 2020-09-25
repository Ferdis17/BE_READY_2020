package sep_2020;

public class ReturnKthToLast {

    static class Node{
        int value;
        Node next;
        Node(int value){
           this.value = value;
        }
        }

    // use recursion

    int printKthToLast(Node head, int k) {

        if (head == null) {
            return 0;
        }
        int index = printKthToLast(head.next, k) + 1;
        if(index == k) {
            System.out.println(k + "th to last is " + head.value);
        }
    return index;
    }

    public static void displayElements(Node head){
        while ( head != null) {
            System.out.println(head.value + " ");
            head = head.next;
        }
    }
    void printNthFromLast(Node head, int n)
    {
        int len = 0;
        Node temp = head;

        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // check if value of n is not more than length of
        // the linked list
        if (len < n)
            return;

        temp = head;

        // 2) get the (len-n+1)th node from the beginning
        for (int i = 1; i < len - n + 1; i++)
            temp = temp.next;

        System.out.println(n +"th element from the last is " +temp.value);
    }

    public static void main(String[] args) {
        ReturnKthToLast ob = new ReturnKthToLast();
        Node start = new Node(12);
        start.next = new Node(13);
        start.next.next = new Node(11);
        start.next.next.next = new Node(23);
        start.next.next.next.next = new Node(14);
        start.next.next.next.next.next = new Node(15);
        start.next.next.next.next.next.next = new Node(10);

        System.out.println("Linked list before : ");
        displayElements(start);

        ob.printKthToLast(start, 5);

        ob.printNthFromLast(start, 2);

    }
}
