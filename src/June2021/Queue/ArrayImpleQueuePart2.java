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

        public MyQueue(int q) {

        }

        public void enqueue(int a) {

        }

        public void dequeue() {

        }
    }
}
