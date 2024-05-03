package 二叉树;

import java.util.*;

/**
 * Author 70ash
 * Date 2024/5/3 下午8:17
 * Type: medium
 * Description: https://leetcode.cn/problems/binary-tree-level-order-traversal-ii/description/
 */
public class SeqTraversal2 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(7);
        treeNode.right = treeNode1;
        treeNode.left = treeNode2;
        treeNode1.left = treeNode3;
        List<List<Integer>> lists = levelOrder(treeNode);
        System.out.println(lists);
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> treeNodes = new LinkedList<>();
        if (root == null) return lists;
        ArrayList<Integer> list;
        treeNodes.offer(root);
        while (!treeNodes.isEmpty()) { // 如果队列不为空的时候
            list = new ArrayList<>();
            int len = treeNodes.size();
            while (len > 0) {
                TreeNode poll = treeNodes.poll();
                list.add(poll.val);
                if (poll.left != null) treeNodes.offer(poll.left);
                if (poll.right != null) treeNodes.offer(poll.right);
                len--;
            }
            lists.add(list);
        }
        Collections.reverse(lists);
        return lists;
    }
}
