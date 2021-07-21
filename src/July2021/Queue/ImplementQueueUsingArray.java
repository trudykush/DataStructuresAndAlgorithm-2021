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
            int[] queueArray = new int[q];
            System.out.println("Enter 1 to enQueue, 2 to deQueue");
            int condition = sc.nextInt();
            if (condition == 1) {
                // enQueue
            } else {
                // deQueue
            }
        }
    }
}
