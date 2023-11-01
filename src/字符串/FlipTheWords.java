package 字符串;

/**
 * 反转字符串中的单词(中等)
 * https://leetcode.cn/problems/reverse-words-in-a-string/description/
 */
public class FlipTheWords {
    public static void main(String[] args) {
        String s = "a good   example";
        reverseWords(s);
    }
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' ') {
                count++;
                while (chars[i+1] == ' '){
                    i++;
                }
            }
        }
        String[] strings = new String[count+1];
        String str = "";
        int index = 1;
        count = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' ' || i == chars.length-1) {
                strings[count++] = str;
                str = "";
                while (i+1 < chars.length && chars[i+1] == ' '){
                    i++;
                }
            }else {
                str += chars[i];
            }
        }
        int len = strings.length;
        String temp;
        for (int i = 0; i < len/2; i++) {
            temp = strings[i];
            strings[i] = strings[len-1 - i];
            strings[len-1-i] = temp;
        }
        str = "";
        count = 1;
        for (String s1 : strings) {
            if(count++ == len) {
                str += s1;
            }else {
                str += s1 + " ";
            }
        }
        System.out.println(str);
        return str;
    }
}
