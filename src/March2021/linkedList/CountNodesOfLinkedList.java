package March2021.linkedList;

import java.util.Scanner;

public class CountNodesOfLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution ob = new Solution();
            System.out.println(ob.getCountIteration(head));
            System.out.println(ob.getCountRecursion(head));
        }
    }

    private static class Solution {
        public int getCountIteration(Node head) {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        public int getCountRecursion(Node head) {
            return getCountRec(head);
        }

        private int getCountRec(Node head) {
            if (head == null) {
                return 0;
            }
            return 1 + getCountRecursion(head.next);
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}
