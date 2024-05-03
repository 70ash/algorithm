package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * Author 70ash
 * Date 2024/5/3 下午5:41
 * Type: easy
 * Description: https://leetcode.cn/problems/binary-tree-postorder-traversal/
 */
public class PostTraversal {

    class Solution {
        List<Integer> integers = new ArrayList<>();

        public List<Integer> postorderTraversal(TreeNode root) {
            if (root == null) return integers;
            if (root.left != null) {
                postorderTraversal(root.left);
            }
            if (root.right != null) {
                postorderTraversal(root.right);
            }
            integers.add(root.val);
            return integers;
        }
    }
}
