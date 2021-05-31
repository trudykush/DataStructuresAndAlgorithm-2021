package May2021.linkedList;

import java.util.Scanner;

public class ReverseALinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            Node head = null;
            Solution obj = new Solution();
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                head = obj.insertAtBeginning(head, value);
            }
            printList(head);
        }
    }

    private static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    private static class Solution {
        public Node insertAtBeginning(Node node, int value) {
            Node temp = new Node(value);
            if (node == null) {
                return temp;
            }
            temp.next = node;
            return temp;
        }
    }

    private static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }
}
