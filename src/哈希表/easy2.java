package 哈希表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * @Author 70ash
 * @Date 2024/3/3 12:19
 * @Description: 两个数组的交集
 * https://leetcode.cn/problems/intersection-of-two-arrays/description/
 */
public class easy2 {
    public static void main(String[] args) {
        int[] nums2 = {1,2,2,1,3,5,7};
        int[] nums1 = {2,2,1};
        int[] ints = intersection(nums1, nums2);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        HashSet set = new HashSet<Integer>();
        HashSet<Integer> reset = new HashSet();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                reset.add(i);
            }
        }
        return reset.stream().mapToInt(x -> x).toArray();
    }
}
