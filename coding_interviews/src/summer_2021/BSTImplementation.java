package summer_2021;

public class BSTImplementation {

    class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public void add(int value) {
        root = addNode(root, value);
    }

    private  Node addNode(Node current, int value) {
        if(current == null) {
            return new Node(value);
        }

        if(value < current.value) {
            current.left = addNode(current.left, value);
        } else if (value > current.value) {
            current.right = addNode(current.right, value);
        } else {
            return current;
        }

        return current;
    }
}
