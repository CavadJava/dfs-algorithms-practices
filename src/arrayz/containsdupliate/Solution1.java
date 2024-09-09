package arrayz.containsdupliate;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        int nums[]  = {1,2,3,0,0};
        System.out.println(hasDuplicate(nums));
    }
    public static boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int num : nums) {
            if (map.get(num) > 1) {
                return Boolean.TRUE;
            }
        }
        return false;
    }
}
