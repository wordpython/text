package com.wordpython.nowcoder;

import common.ListNode;
import org.junit.Test;

public class AG反转链表 {
    //双指针
    public ListNode ReverseList(ListNode head) {
        ListNode q=null;
        while (head!=null){
            ListNode t=head.next;
            head.next=q;
            q=head;
            head=t;
        }
        return q;
    }

    //这种解法是错误的，会死循环
    public ListNode ReverseList1(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode q=null;
        while (head!=null){
            q=head.next;
            q.next=head;//这里导致指向死循环
            System.out.println("换前head："+head.val);//1
            System.out.println("换前head.next："+head.next.val);//2
            System.out.println("换前head.next.next："+head.next.next.val);//1
            head=head.next;
            System.out.println(head.next.val);
        }
        return q;
    }

    @Test
    public void test(){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        System.out.println(ReverseList1(head).val);
    }
}
