package 哈希表;

/**
 * @author zlp
 * @date 2023/10/20 18:27
 * 字母异位词
 * https://leetcode.cn/problems/valid-anagram/description/
 */
public class AllogramWords {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        boolean anagram = isAnagram(s1, s2);
        System.out.println(anagram);
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];
        // 创建26个字母的哈希表.
        // s负责在对应位置加加
        // t负责在对应位置减减
        // 最后遍历哈希表,如果某个位置不等于0,就返回false
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(arr[i] != 0) return false;
        }
        return true;
    }
}