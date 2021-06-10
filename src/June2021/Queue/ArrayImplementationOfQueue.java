package June2021.Queue;

import java.util.Scanner;

public class ArrayImplementationOfQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            MyQueue obj = new MyQueue();
            int q = sc.nextInt();
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
        public void enqueue(int a) {

        }

        public int dequeue() {
            return -1;
        }
    }
}
