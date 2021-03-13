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
