package March2021.linkedList;

import java.util.Scanner;

public class DLL_InsertionAtGivenPos {

    private static class DLL {
        // fun to insert a new node at a given position in doubly linked list
        public void addNode(Node head, int pos, int data) {
            Node temp = head;
            // using a pointer to traverse the linked list till given position.
            while (pos != 0) {
                temp = temp.next;
                pos--;
            }
            // creating and storing the new node with data in a pointer
            Node n = new Node(data);

            // if the node next to node at given position is null,
            // we make the next as new_node and new_node's prev link as
            // this current node.
            if (temp.next == null) {
                n.next = null;
                temp.next = n;
                n.prev = temp;
            } else {
                // storing next node to current node in link
                // part(next) of new node.
                n.next = temp.next;
                // storing new node in link part(next) of current node
                temp.next = n;
                // storing the new node in previous link(prev) of the node
                // which was next to current node initially
                temp.next.prev = n;
                // store the current node in previous link part(prev)
                // of new node
                n.prev = temp;
            }
        }
    }

    static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    Node newNode(Node head, int data) {
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

    void printList(Node node) {
        Node temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp.prev != null) {
            temp = temp.prev;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL_InsertionAtGivenPos dll = new DLL_InsertionAtGivenPos();
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            Node temp;
            Node head = null;
            Node root = null;
            System.out.println("Please enter the size of DLL");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                head = dll.newNode(head, x);
                if (root == null) {
                    root = head;
                }
            }
            head = root;
            System.out.println("Enter the position where " +
                    "new element is to be inserted: ");
            int pos = sc.nextInt();
            System.out.println("Enter the element: ");
            int data = sc.nextInt();

            DLL helperDLL = new DLL();
            helperDLL.addNode(head, pos, data);

            dll.printList(head);
            while (head.next != null) {
                temp = head;
                head = head.next;
            }
        }
    }

}
