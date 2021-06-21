package June2021.Queue;

import java.util.Scanner;

public class ReverseQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number Of Cases: ");
        int numberOfCases = sc.nextInt();

        while (numberOfCases -- > 0) {
            System.out.println("Size of Queue");
            int q = sc.nextInt();

            MyQueueByLL queue = new MyQueueByLL();
            while (q-- > 0) {
                int queueElement = sc.nextInt();
                queue.enQueue(queueElement);
            }
        }
    }

    private static class MyQueueByLL {
        public void enQueue(int queueElement) {

        }
    }
}
