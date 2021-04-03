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

            while (head1 != null && head2 != null) {
                if (head1.data != head2.data) {
                    return false;
                }
                head1 = head1.next;
                head2 = head2.next;
            }
            return (head1 == null && head2 == null);
        }
    }

    public boolean isIdenticalRecursive(Node head1, Node head2) {
        if (head1 == null && head2 == null) {
            return true;
        }

        if (head1 != null && head2 != null) {
            return (head1.data == head2.data) && isIdenticalRecursive(head1.next, head2.next);
        }

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
