package 二叉树;

/**
 * Author 70ash
 * Date 2024/5/3 下午5:22
 * Description:
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public TreeNode getRight() {
        return this.right;
    }
}
