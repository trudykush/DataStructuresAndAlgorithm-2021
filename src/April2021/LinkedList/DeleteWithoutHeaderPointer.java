package April2021.LinkedList;

import java.util.Scanner;

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

    void deleteHeadNode(Node head) {
        Node temp = head.next;
        head.data = temp.data;
        head.next = temp.next;
        System.gc();
    }

}
