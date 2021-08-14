package July2021.Trees;

public class PreOrder {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
    }
}


class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void printPreOrder(Node node) {

        if (node == null) {
            return;
        }

        System.out.println(node.key + " ");

        printPreOrder(node.left);

        printPreOrder(node.right);
    }

    void printPreOrder() {
        printPreOrder(root);
    }

    void printPostOrder() {
        printPostOrder(root);
    }

    private void printPostOrder(Node root) {
        if (root == null) {
            return;
        }

        printPreOrder(root.left);
        printPreOrder(root.right);
        System.out.println(root.key + " ");
    }

    void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(Node root) {

    }
}