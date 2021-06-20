package June2021.Queue;

import java.util.Scanner;

public class LinkedListImpleQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Enter the size of queue: ");
            int q = sc.nextInt();

            MyLinkedListQueue queue = new MyLinkedListQueue(q);
        }
    }

    private static class MyLinkedListQueue {

        public MyLinkedListQueue(int q) {
        }
    }

    private static class QNode {
        int key;
        QNode next;

        public QNode(int key) {
            this.key = key;
            this.next = null;
        }
    }
}
