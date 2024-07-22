package example_programs;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIndices {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
//        return new int[]{-1};
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 6, 4};
        int target = 7;

        int[] indices = twoSum(nums, target);
        System.out.println("[" + indices[0] + ", " + indices[1] + "]"); // Output: [2, 3]
    }
}