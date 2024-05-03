package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author 70ash
 * Date 2024/5/3 下午8:21
 * Type: medium
 * Description: https://leetcode.cn/problems/binary-tree-right-side-view/description/
 * 思路：利用层序遍历的思路，遍历到每一层的最后一个节点时加入到链表之中
 */
public class RightView {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(7);
        treeNode.right = treeNode1;
        treeNode.left = treeNode2;
        treeNode1.left = treeNode3;
        List<Integer> lists = rightSideView(treeNode);
        System.out.println(lists);
    }
    public static List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode poll = queue.poll();
                if (poll.left != null)queue.offer(poll.left);
                if (poll.right != null)queue.offer(poll.right);
                if (size == 1) {
                    list.add(poll.val);
                }
                size--;
            }
        }
        return list;
    }
}
