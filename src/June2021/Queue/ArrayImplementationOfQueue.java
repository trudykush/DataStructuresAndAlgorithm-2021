package June2021.Queue;

import java.util.Queue;
import java.util.Scanner;

public class ArrayImplementationOfQueue {
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
        private static int front, rear, capacity;
        private static int queue[];

        MyQueue (int c) {
            front = rear = 0;
            capacity = c;
            queue = new int[capacity];
        }

        public void enqueue(int data) {
            if (capacity == rear) {
                System.out.println("Queue is full");
                return;
            } else {
                queue[rear] = data;
                rear++;
            }
        }

        public void dequeue() {
            if (front == rear) {
                System.out.println("Queue is empty");
            } else {
                for (int i = 0; i < rear - 1; i++) {
                    queue[i] = queue[i+1];
                }
                if (rear < capacity) {
                    queue[rear] = 0;
                }
                rear--;
            }
        }


    }
}
