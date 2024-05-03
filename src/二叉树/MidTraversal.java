package 二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * Author 70ash
 * Date 2024/5/3 下午5:44
 * Type: easy
 * Description: 中序遍历
 */
public class MidTraversal {
    List<Integer> integers = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return integers;
        if (root.left != null) {
            inorderTraversal(root.left);
        }
        integers.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right);
        }
        return integers;
    }
}
