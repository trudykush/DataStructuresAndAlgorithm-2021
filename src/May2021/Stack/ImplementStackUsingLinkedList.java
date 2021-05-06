package May2021.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImplementStackUsingLinkedList {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t > 0) {
            MyStackLinkedList obj = new MyStackLinkedList();
            int Q = Integer.parseInt(read.readLine());
            int k = 0;
            String[] str = read.readLine().trim().split(" ");
            while (Q > 0) {
                int queryType = 0;
                queryType = Integer.parseInt(read.readLine());
                if (queryType == 1) {
                    int a = Integer.parseInt(str[k++]);
//                    obj.push(a);
                } else if (queryType == 2) {
//                    System.out.println(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println(" ");
            t--;
        }
    }

    private static class MyStackLinkedList {
    }
}
