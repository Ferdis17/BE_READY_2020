package summer_2021;

public class BST {

    static class Node {
        int data;
        Node left, right;
        Node (int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static boolean ifNodeExist(Node node, int key) {

        if(node == null) {
            return false;
        }
        if(node.data == key) {
            return true;
        }

        boolean res1 = ifNodeExist(node.left, key);

        if(res1){
            return true;
        }

        boolean res2 = ifNodeExist(node.right, key);
        return res2;
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.left.left = new Node(3);
        root.left.left.left = new Node(7);
        root.left.right = new Node(4);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right = new Node(2);
        root.right.left = new Node(5);
        root.right.right = new Node(6);

        System.out.println(ifNodeExist(root, 10));
    }
}
