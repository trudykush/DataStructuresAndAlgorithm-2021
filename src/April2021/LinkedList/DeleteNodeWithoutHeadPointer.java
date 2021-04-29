package April2021.LinkedList;

import java.util.Scanner;

public class DeleteNodeWithoutHeadPointer {
    static Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
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
            display(head);
            Node nodeToBeDeleted = new Node(sc.nextInt());
            head = deleteNode(head, nodeToBeDeleted);

            display(head);
        }
    }

    private static Node deleteNode(Node head, Node nodeToBeDeleted) {
        if (nodeToBeDeleted == null) {
            return null;
        } else {
            if (nodeToBeDeleted.next == null) {
                System.out.println("Last Node can't be freed");
                return null;
            }

            nodeToBeDeleted.data = nodeToBeDeleted.next.data;
            nodeToBeDeleted.next = nodeToBeDeleted.next.next;
            return head;
        }
    }
}
