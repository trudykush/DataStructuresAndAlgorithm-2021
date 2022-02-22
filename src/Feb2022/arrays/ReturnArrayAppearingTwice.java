package Feb2022.arrays;

import java.util.*;

public class ReturnArrayAppearingTwice {
    public static void main(String[] args) {
        Integer[] arr = {8, 3, 2, 7, 3, 5, 8};

        Vector<Integer> result = appearsTwice(arr);
        System.out.println(Arrays.toString(new Vector[]{result}));
    }

    private static Vector<Integer> appearsTwice(Integer[] arr) {

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
    }
}
