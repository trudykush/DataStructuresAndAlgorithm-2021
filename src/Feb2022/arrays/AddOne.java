package Feb2022.arrays;

import java.util.Arrays;
import java.util.Vector;

public class AddOne {
    public static void main(String[] args) {
        Vector<Integer> digits = new Vector<>(Arrays.asList(1, 7, 8, 9));
        addOne(digits);
        for (int digit : digits) {
            System.out.println(digit + " ");
        }
    }

    private static void addOne(Vector<Integer> digits) {
        int index = digits.size() - 1;

        while (index >= 0 && digits.get(index) == 9) {
            digits.set(index, 0);
            index--;
        }

    }
}
