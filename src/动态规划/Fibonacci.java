package 动态规划;

/**
 * Author 70ash
 * Date 2024/5/14 下午2:05
 * Type: easy
 * Description: https://leetcode.cn/problems/fibonacci-number/description/
 */
public class Fibonacci {
    public static void main(String[] args) {
        int fib = fib(4);
        System.out.println(fib);
    }
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n -2);
    }
}
