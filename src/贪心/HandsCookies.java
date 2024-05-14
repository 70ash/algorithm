package 贪心;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author 70ash
 * Date 2024/5/13 下午7:57
 * Type: easy
 * Description: https://leetcode.cn/problems/assign-cookies/description/
 */
public class HandsCookies {
    public static void main(String[] args) {
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        int contentChildren = findContentChildren(g, s);
        System.out.println(contentChildren);
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        // List<int[]> list = Arrays.asList(Arrays.stream(g).toArray());
        Arrays.sort(s);
        int count = 0;
        // List<int[]> s1 = List.of(s);
        int j = 0;
        for (int i = 0; i < g.length; i++) {
            while (j < s.length) {
                if (g[i] <= s[j]) {
                    count++;
                    j++;
                    break;
                }
                j++;
            }
        }
        return count;
    }
}
