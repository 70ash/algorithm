package 字符串;

/**
 * 替换空格(简单)
 * https://leetcode.cn/problems/ti-huan-kong-ge-lcof/description/
 */
public class TiHuanKongGe {
    public static void main(String[] args) {
        String s = "a.aef.qerf.bb";
        pathEncryption(s);

    }
    public static String pathEncryption(String path) {
        char[] chars = path.toCharArray();
        int count = 0;
        for (char c : chars) {
            if(c == '.') chars[count] = ' ';
            count++;
        }
        String str = "";
        for (char c :chars) {
            str+=c;
        }
        return str;
    }
}
