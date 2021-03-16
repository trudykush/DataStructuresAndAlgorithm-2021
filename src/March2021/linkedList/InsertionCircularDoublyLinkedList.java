package March2021.linkedList;

import java.util.Scanner;

public class InsertionCircularDoublyLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    Node newNode (Node head, int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return head;
        }
        head.next = n;
        n.prev = head;
        head = n;
        return head;
    }

    public static void main(String[] args) {
        InsertionCircularDoublyLinkedList dLL =
                new InsertionCircularDoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            Node temp;
            Node head = null;
            Node root = null;
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                head = dLL.newNode(head, x);
                if (root == null) {
                    root = head;
                }
            }
            head = root;
            int pos = sc.nextInt();
            int data = sc.nextInt();
            SolutionDLL solution = new SolutionDLL();
            solution.addNode(head, pos, data);
        }
    }

    private static class SolutionDLL {
        public void addNode(Node head, int pos, int data) {

        }
    }
}
