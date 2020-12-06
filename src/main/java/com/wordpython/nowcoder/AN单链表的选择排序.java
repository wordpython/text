package com.wordpython.nowcoder;

import common.ListNode;
import org.junit.Test;

/**
 * 题目描述
 * 给定一个无序单链表，实现单链表的选择排序(按升序排序)。
 */
/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
public class AN单链表的选择排序 {
    /**
     *
     * @param head ListNode类 the head node
     * @return ListNode类
     *
     * 交换值就可以了，交换值很简单
     */
    public ListNode sortInList (ListNode head) {
        ListNode t=head;
        while (head!=null){
            int i=head.val;
            ListNode p=head;
            ListNode q=head;
            while (p.next!=null){
                if(p.next.val<i){
                    i=p.next.val;
                    q=p.next;
                }
                p=p.next;
            }
            q.val=head.val;
            head.val=i;
            head=head.next;
        }
        return t;
    }
    @Test
    public void test(){
        ListNode listNode = new ListNode(1);
        ListNode head=listNode;
        int i=1;
        int[] a={1,3,2,4,5};
        while(i<5){
            head.next=new ListNode(a[i]);
            head=head.next;
            i++;
        }
        sortInList(listNode);
    }
}
