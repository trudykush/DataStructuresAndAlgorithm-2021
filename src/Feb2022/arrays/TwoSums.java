package Feb2022.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = twoSums(nums, target);

    private int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                int secondNum = target - nums[i];
                if (map.containsKey(secondNum)) {
                    return new int[] {map.get(secondNum), i};
                }
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
