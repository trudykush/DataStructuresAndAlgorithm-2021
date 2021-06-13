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

        // checking the size with capacity
        boolean isFull () {
            return size == capacity;
        }

        // checking whether queue is empty
        boolean isEmpty () {
            return size == 0;
        }

        // to get the front element, if empty return minimum integer
        int getFront() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            return arr[front];
        }

        // to get the rear element, else return minimum
        int getRear() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            return arr[rear];
        }

        // to add element to the rear of the queue
        public void enqueue(int item) {
            if (isFull()) {
                return;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = item;
            size = size + 1;
            System.out.println(item + "enqueued to queue");
        }

        public int dequeue() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            int item = arr[front];
            front = (front + 1) % capacity;
            size = size - 1;
            return item;
        }
    }
}
