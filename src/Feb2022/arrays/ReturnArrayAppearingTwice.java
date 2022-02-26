package Feb2022.arrays;

import java.util.*;

public class ReturnArrayAppearingTwice {
    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 7, 3, 5, 8};

        int[] result = appearsTwice(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] appearsTwice(int[] arr) {

        int res = arr[0];
        for (int j : arr) {
            res = res ^ j;
        }
        return new int[0];
    }

    /*private static Vector<Integer> appearsTwice(Integer[] arr) {

        Set<Integer> integerSet = new HashSet<>();
        Vector<Integer> vectorArr = new Vector<>(Arrays.asList(arr));
        Collections.fill(vectorArr, 0);
        int count = 0;
        for (int j : arr) {
            if (integerSet.contains(j)) {
                vectorArr.set(count, j);
                count++;
            } else {
                integerSet.add(j);
            }
        }
        return vectorArr;
    }*/
}
