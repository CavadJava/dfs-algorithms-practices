package arrayz.k_elements;

import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        int nums[] = {5,3,1,1,1,3,5,73,1};
        System.out.println(Arrays.toString(topKFrequent(nums, 3)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], (map.getOrDefault(nums[i],0))+1);
        }
        System.out.println(map);
        return map.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
