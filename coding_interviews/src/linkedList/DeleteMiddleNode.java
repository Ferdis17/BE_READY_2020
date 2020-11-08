package linkedList;

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
    public static void main(String[] args) {
        DeleteMiddleNode add = new DeleteMiddleNode();
        add.push(12);
        add.push(13);
        add.push(11);
        add.push(23);
        add.push(42);
        add.push(15);
        add.push(10);

        System.out.println("before deleting a node");
        displayElements(add.head);

        System.out.println("after deleting a node");
        System.out.println(deleteMiddleNode(add.head.next.next));

        displayElements(add.head);


    }

}
