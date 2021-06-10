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
                    System.out.println(obj.dequeue() + " ");
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

        public void enqueue(int a) {

        }

        public int dequeue() {
            return -1;
        }
    }
}
