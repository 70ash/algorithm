package 字符串;

/**
 * https://leetcode.cn/problems/reverse-string/
 * 反转字符串(简单)
 */
public class ReverseStr {
    public static void main(String[] args) {
        char[] chars = new char[5];
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'c';
        chars[3] = 'd';
        // chars[4] = 'e';
        reverseString(chars);
    }
    public static void reverseString(char[] s) {
        int len = s.length;
        char temp;
        for (int i = 0; i < len/2; i++) {
            temp = s[i];
            s[i] = s[len-1 - i];
            s[len-1-i] = temp;
        }
    }
}
