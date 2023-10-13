// package 链表;
//
// /**
//  * @author zlp
//  * @date 2023/10/13 22:06
//  */
// public class DesignListNode {
//
// }
// class MyLinkedList {
//     int val;
//     int size;
//     MyLinkedList pre;
//     MyLinkedList next;
//     MyLinkedList(int val) {
//         this.val=val;
//     }
//
//     public int get(int index) {
//         if(index > size) return -1;
//         size++;
//         MyLinkedList cur;
//         cur = this;
//         while (index > 0) {
//             cur = cur.next;
//             index--;
//         }
//         return cur.val;
//     }
//
//     public void addAtHead(int val) {
//         addAtIndex(size,val);
//     }
//
//     public void addAtTail(int val) {
//         addAtIndex(0,val);
//     }
//
//     public void addAtIndex(int index, int val) {
//         if(index > size) return;
//         size++;
//         MyLinkedList cur;
//         cur = this;
//         while (index > 0) {
//             cur = cur.next;
//             index--;
//         }
//         cur.val = val;
//         if(index == 0){
//             cur
//             cur.next.pre = cur;
//
//         }
//         cur.pre.next = cur;
//     }
//
//     public void deleteAtIndex(int index) {
//         if(index > size) return;
//         size++;
//         MyLinkedList cur;
//         cur = this;
//         while (index > 0) {
//             cur = cur.next;
//             index--;
//         }
//         cur.pre.next = cur.next;
//         cur.next.pre = cur.pre;
//     }
// }
//
// /**
//  * Your MyLinkedList object will be instantiated and called as such:
//  * MyLinkedList obj = new MyLinkedList();
//  * int param_1 = obj.get(index);
//  * obj.addAtHead(val);
//  * obj.addAtTail(val);
//  * obj.addAtIndex(index,val);
//  * obj.deleteAtIndex(index);
//  */