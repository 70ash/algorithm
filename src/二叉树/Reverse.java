package 二叉树;

import java.sql.Array;

/**
 * Author 70ash
 * Date 2024/5/4 上午11:38
 * Type: easy
 * Description: https://leetcode.cn/problems/invert-binary-tree/
 * 思路： 利用先序遍历或后序遍历的思路
 */
public class Reverse {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        treeNode.left = null;
        treeNode.right = treeNode1;
        TreeNode treeNode2 = invertTree(treeNode);
    }
    public static TreeNode invertTree(TreeNode root) {
        TreeNode temp = null;
        if(root != null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            if(root.left != null){
                invertTree(root.left);
            }
            if(root.right != null){
                invertTree(root.right);
            }
        }
        return root;
    }
}
