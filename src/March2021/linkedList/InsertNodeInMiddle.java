package March2021.linkedList;

import java.util.Scanner;

public class InsertNodeInMiddle {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            Node head = null;
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
            }
            display();

            insertAtMid(n/2);

            display();
        }
    }

    // function to insert node at the middle of
    // the linked list
    private static void insertAtMid(int x) {
        // if list is empty
        if (head == null) {
            head = new Node(x);
        } else {
            // get a new node
            Node newNode = new Node(x);

            // assign values to the slow
            // and fast pointers
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                // move slow pointer to next node
                slow = slow.next;

                // move fast pointer two nodes at a time
                fast = fast.next.next;
            }

            // insert the 'newNode' and adjust
            // the required links
            newNode.next = slow.next;
            slow.next = newNode;
        }
    }
}
