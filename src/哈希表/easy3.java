package 哈希表;

import java.util.HashSet;

/**
 * @Author 70ash
 * @Date 2024/3/3 13:00
 * @Description: 快乐数
 * https://leetcode.cn/problems/happy-number/description/
 */
public class easy3 {
    public static void main(String[] args) {
        int n = 19;
        boolean happy = isHappy(n);
        System.out.println(happy);
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            if(!set.add(n)) return false;
            if (n == 1) return true;
            n = getNextNumber(n);
        }
    }
    public static int getNextNumber(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n /= 10;
        }
        return res;
    }
}
