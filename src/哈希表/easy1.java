package 哈希表;

import java.util.Hashtable;

/**
 * @Author 70ash
 * @Date 2024/2/26 23:27
 * @Description: 有效的字母异位词
 * https://leetcode.cn/problems/valid-anagram/description/
 */
public class easy1 {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] table = new int[25];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            // table[t.charAt(i) - 'a']--;
            if (--table[t.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }
}
