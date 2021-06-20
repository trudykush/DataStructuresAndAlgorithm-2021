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

            MyLinkedListQueue queue = new MyLinkedListQueue();
            while (q-- > 0) {
                System.out.println("Enter 1 for Enqueue or 2 for Dequeue");
                int queueType = sc.nextInt();
                if (queueType == 1) {
                    int a = sc.nextInt();
                    queue.enqueue(a);
                } else {
                    queue.dequeue();
                }
            }
        }
    }

    private static class MyLinkedListQueue {
        QNode front, rear;

        public MyLinkedListQueue() {
            this.front = this.rear = null;
        }

        public void enqueue(int key) {

            QNode temp = new QNode(key);
            if (this.rear == null) {
                this.front = this.rear = temp;
                return;
            }

            this.rear.next = temp;
            this.rear = temp;
        }

        public void dequeue() {
            if (this.front == null) {
                return;
            }

            QNode temp = this.front;
            this.front = this.front.next;

            if (this.front == null) {
                this.rear = null;
            }
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
