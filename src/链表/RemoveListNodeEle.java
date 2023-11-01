package 链表;
// 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
// https://leetcode.cn/problems/remove-linked-list-elements/
 class ListNode1 {
     int val;
     ListNode next;
     ListNode1() {}
     ListNode1(int val) { this.val = val; }
     ListNode1(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class RemoveListNodeEle {
     public ListNode removeElements(ListNode head, int val) {
          // 处理头节点
          while (head != null && head.val == val) {
               head = head.next;
          }
          if(head == null) return null;
          // 头节点不为null且值不为val
          ListNode cur1 = head.next; // 指向当前节点
          ListNode pre = head;
          while (cur1 != null) {
               // 当前节点要删除
               if(cur1.val == val) {
                    pre.next = cur1.next;
               }else {// 当前节点不用删除
                    pre = cur1;
               }
               cur1 = cur1.next;
          }
          return head;
     }
}