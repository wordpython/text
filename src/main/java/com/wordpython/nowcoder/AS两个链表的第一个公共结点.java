package com.wordpython.nowcoder;

import common.ListNode;

/**
 * 题目描述
 * 输入两个链表，找出它们的第一个公共结点。
 * （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 * 2->8-\
 * ->9->5
 * 4-/
 * 第一个公共节点是9
 */
public class AS两个链表的第一个公共结点 {
    /**
     * 双指针法。
     * 创建两个指针p1和p2,分别指向两个链表的头结点，然后依次往后遍历。
     * 如果某个指针到达末尾，则将该指针指向另一个链表的头结点；如果两个指针
     * 所指的节点相同，则循环结束，返回当前指针指向的节点。比如两个链表分别
     * 为：1->3->4->5->6和2->7->8->9->5->6。短链表的指针p1会先到达尾部，
     * 然后重新指向长链表头部，当长链表的指针p2到达尾部时，重新指向短链表头部，
     * 此时p1在长链表中已经多走了k步(k为两个链表的长度差值)，p1和p2位于同一起
     * 跑线，往后遍历找到相同节点即可。其实该方法主要就是用链表循环的方式替代了
     * 长链表指针先走k步这一步骤。
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2) {
            p1 = p1 == null ? pHead2 : p1.next;
            p2 = p2 == null ? pHead1 : p2.next;
        }
        return p1;
    }
}
