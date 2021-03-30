package March2021.linkedList;

public class DLL_InsertionAtGivenPos {

    class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    class DLinkedList {
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
    }

}
