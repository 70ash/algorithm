package 动态规划;

/**
 * Author 70ash
 * Date 2024/5/14 下午2:09
 * Type: easy
 * Description: https://leetcode.cn/problems/climbing-stairs/description/
 */
public class ClimbStairs {
    public static void main(String[] args) {
        int i = climbStairs(3);
        System.out.println(i);
    }
    int count = 0;
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int p = 1;
        int q = 2;
        for (int i = 3; i <= n; i++) {

        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
