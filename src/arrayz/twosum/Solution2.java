package arrayz.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {
        int nums[] = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(twoSum(nums,7)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int i1 = target - nums[i];// 4 - 3 = 1
            if(map.containsKey(i1)){
                return new int[]{map.get(i1), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}

