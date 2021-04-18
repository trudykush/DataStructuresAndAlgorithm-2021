package April2021.LinkedList;

public class DeleteWithoutHeaderPointer {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
