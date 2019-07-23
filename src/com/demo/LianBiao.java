package com.demo;
//反转一个单链表。
//示例:
//输入: 1->2->3->4->5->NULL
// 输出: 5->4->3->2->1->NULL
// 进阶:
//  你可以迭代或递归地反转链表。
public class LianBiao {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        head = reverseList(head);
        while (head != null){
            System.out.print(head.val);
            head = head.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode pre = head;
        ListNode p = head.next;
        pre.next = null;
        ListNode nxt;
        while(p!=null) {
            nxt = p.next;
            p.next = pre;
            pre = p;
            p = nxt;
        }
        return pre;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }

}