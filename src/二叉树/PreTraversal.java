package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * Author 70ash
 * Date 2024/5/3 下午5:21
 * Type: easy
 * Description: https://leetcode.cn/problems/binary-tree-preorder-traversal/
 */
public class PreTraversal {
    public static void main(String[] args) {
    }
    List<Integer> integers = new ArrayList<>();

    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            if (root == null) return integers;
            integers.add(root.val);
            if (root.left != null) {
                preorderTraversal(root.left);
            }
            if (root.right != null) {
                preorderTraversal(root.right);
            }
            return integers;
        }
    }
}
