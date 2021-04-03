package April2021.LinkedList;

import java.util.Scanner;

public class IdenticalLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            Node head1 = null, head2 = null;
            Node tail1 = null, tail2 = null;

            // Input first LL
            int n1 = sc.nextInt();
            int d1 = sc.nextInt();
            head1 = new Node(d1);
            tail1 = head1;

            while (n1-- > 1) {
                tail1.next = new Node(sc.nextInt());
                tail1 = tail1.next;
            }

            // Input second LL
            int n2 = sc.nextInt();
            int d2 = sc.nextInt();
            head2 = new Node(n2);
            tail2 = head2;

            while (n2-- > 1) {
                Node n = new Node(sc.nextInt());
                tail2.next = n;
                tail2 = tail2.next;
            }

            Solution solutionObj = new Solution();
            if (solutionObj.isIdentical(head1, head2)) {
                System.out.println("Identical");
            } else {
                System.out.println("Not Identical");
            }
        }
    }

    public static void show(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


    private static class Solution {
        public boolean isIdentical(Node head1, Node head2) {
            // checking is any of the list is not empty
            while (head1 != null && head2 != null) {
                if (head1.data != head2.data) {
                    return false;
                }
                /*
                * if we reach here, then head1 and head2 are not null
                * and their data is same, so move to next nodes in both lists
                * */
                head1 = head1.next;
                head2 = head2.next;
            }
            /*
            * if linked lists are identical, then 'head1' and 'head2'
            * must be null at this point
            * */
            return (head1 == null && head2 == null);
        }
    }

    public boolean isIdenticalRecursive(Node head1, Node head2) {
        // if both list are empty
        if (head1 == null && head2 == null) {
            return true;
        }

        // if both lists are not empty, then data of
        // current nodes much watch, and same should
        // be recursively true for rest of the nodes.
        if (head1 != null && head2 != null) {
            return (head1.data == head2.data) && isIdenticalRecursive(head1.next, head2.next);
        }

        // if we reach here, then one of the lists
        // is empty and other is not
        return false;
    }
}

class Node {
    int data;
    Node next;
    public Node(int d) {
        this.data = d;
        this.next = null;
    }
}
