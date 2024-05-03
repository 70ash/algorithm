package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author 70ash
 * Date 2024/5/3 下午7:39
 * Type: medium
 * Description: https://leetcode.cn/problems/binary-tree-level-order-traversal/description/
 * 思路： 利用队列先进先出的特点，每一层作为一个队列。每次遍历时，遍历队列size大小的次数，遍历每个节点时，出队加入到一个临时链表里，并入这个节点的下一个节点，完成一次遍历后将临时链表放入存链表的链表里，并new一个临时链表。
 */
public class SeqTraversal {
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
            return lists;
        }
}
