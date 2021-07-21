package July2021.Queue;

import java.util.Scanner;

public class ImplementQueueUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Enter the size of queue: ");
            int q = sc.nextInt();
            Solution obj = new Solution(q);
            System.out.println("Enter 1 to enQueue, 2 to deQueue");
            int condition = sc.nextInt();
            if (condition == 1) {
                // enQueue
                System.out.println("Enter number to enQueue: ");
                int element = sc.nextInt();
                obj.enQueue(element);
            } else {
                // deQueue
                obj.deQueue();
            }
        }
    }

    private static class Solution {
        int front, rear, capacity;
        int[] queue;

        public Solution(int c) {
            front = rear = 0;
            capacity = c;
            queue = new int[capacity];
        }

        public void enQueue(int element) {
            if (capacity == rear) {
                System.out.println("Queue is Full - Overflow condition");
                return;
            } else {
                queue[rear] = element;
                rear++;
            }
        }

        public void deQueue() {

        }
    }
}
