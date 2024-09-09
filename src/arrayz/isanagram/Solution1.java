package arrayz.isanagram;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(isAnagram("helloi", "lolleh"));
    }
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charCount = new int[26]; // Assuming lowercase English letters

        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            charCount[c - 'a']--;
            if (charCount[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

}
