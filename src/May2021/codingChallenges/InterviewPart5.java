package May2021.codingChallenges;

import java.util.Stack;

public class InterviewPart5 {
    public static void main(String[] args) {

    }

    // fun is called  -> knows()

    static int findCeleb(int n) {

        int[] inwards = new int[n];
        int[] outwards = new int[n];

        for (int i = 0; i < n; i++) {   // outwards
            for (int j = 0; j < n; j++) {   //inwards
                //int x = knows(i, j);

                /*outwards[i] += x;
                inwards[j] += x;*/
            }
        }

        for (int i = 0; i < n; i++) {
            if (inwards[i] == n-1 && outwards[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    static int findCelec(int n) {
        Stack<Integer> st = new Stack<>();
        int c;

        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            /*if (knows(a, b)) {
                st.push(b);
            } else {
                st.push(a);
            }*/
        }

        if (st.isEmpty()) {
            return -1;
        }

        c = st.pop();

        /*for (int i = 0; i < n; i++) {
            if (i != c && (knows(c,i) || !knows(i,c))) {
                return -1;
            }
        }*/
        return c;
    }
}
