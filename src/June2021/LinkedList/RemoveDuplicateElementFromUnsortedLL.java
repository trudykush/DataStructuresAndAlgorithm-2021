package June2021.LinkedList;

import java.util.Scanner;

public class RemoveDuplicateElementFromUnsortedLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            Node head = null;
            Solution obj = new Solution();
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                head = obj.insertAtEnd(head, value);
            }
        }
    }

    private static class Node {
        int data;
        Node next;

        Node (int x) {
            this.data = x;
            next = null;
        }
    }

    private static class Solution {

        public Node insertAtBeginning(Node head, int value) {

            return null;
        }

        public Node insertAtEnd(Node head, int value) {
            return null;
        }
    }
}
