package arrayz.groupanagram;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        String[] strs = {"tes","eat", "tea", "tan","ant","apple"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (String s: strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if(!map.containsKey(key)){
                ArrayList<String> objects = new ArrayList<>();
                objects.add(s);
                map.put(key, objects);
            }
            else {
                map.get(key).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}
