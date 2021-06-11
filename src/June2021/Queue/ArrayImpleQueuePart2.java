package June2021.Queue;

import java.util.Scanner;

public class ArrayImpleQueuePart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int q = sc.nextInt();
            MyQueue obj = new MyQueue(q);
            while (q-- > 0) {
                int queueType = sc.nextInt();
                if (queueType == 1) {
                    int a = sc.nextInt();
                    obj.enqueue(a);
                } else if (queueType == 2) {
                    obj.dequeue();
                }
            }
            System.out.println();
        }
    }

    private static class MyQueue {

        int front, rear, size;
        int capacity;
        int arr[];

        public MyQueue(int q) {
            capacity = q;
            front = this.size = 0;
            rear = capacity - 1;
            arr = new int[capacity];
        }

        boolean isFull (MyQueue queue) {
            return queue.size == queue.capacity;
        }

        boolean isEmpty (MyQueue queue) {
            return queue.size == 0;
        }

        public void enqueue(int a) {

        }

        public void dequeue() {

        }
    }
}
