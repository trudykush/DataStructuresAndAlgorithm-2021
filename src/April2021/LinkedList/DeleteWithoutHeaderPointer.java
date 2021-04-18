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

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static void deleteHeadNode(Node head) {
        Node temp = head.next;
        head.data = temp.data;
        head.next = temp.next;
        System.gc();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for (int i = 0; i < n; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
        }

        printList(head);

        deleteHeadNode(head);

        printList(head);
    }
}
