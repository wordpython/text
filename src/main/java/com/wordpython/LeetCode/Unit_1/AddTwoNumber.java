package com.wordpython.LeetCode.Unit_1;

import common.ListNode;
import org.junit.Test;


/**
 * @Author wordpython
 * @Date 2019/11/18
 **/
/*
 *<h2>2.两数相加</h2>
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，
 * 它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * */
public class AddTwoNumber {
    //官方题解
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int carry = 0;//标记是否进位
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {//l1和l2已经读取完，但还有进位
            curr.next = new ListNode(carry);
        }
        return result.next;
    }


    public ListNode addTwoNumbers_1(ListNode l1, ListNode l2) {
        /*
         * 注意：result=result.next;这里的result为null,接着还用result.val就会报空指针异常
         * */
        ListNode tt = new ListNode(0);
        ListNode result = tt;
        int i = 0;//标记是否要进位
        int data = 0;//标记当前就是的值
        while (l1 != null) {
            if (l2 != null) {
                if (l1.val + l2.val + i < 10) {
                    data = l1.val + l2.val + i;
                    i = 0;
                } else if (10 - l1.val - l2.val - i < 0) {
                    data = l1.val + l2.val + i - 10;
                    i = 1;
                } else {
                    data = 10 - l1.val - l2.val - i;
                    i = 1;
                }
                l2 = l2.next;
            } else if (l1.val + i < 10) {//l2已经读取完，但l1还没读取完
                data = l1.val + i;
                i = 0;
            } else {
                data = 10 - l1.val - i;
                i = 1;
            }
            l1 = l1.next;
            result.next = new ListNode(data);
            result = result.next;
        }
        while (l2 != null) {//l1已经读取完，但l2还没读取完
            if (l2.val + i < 10) {
                data = l2.val + i;
                i = 0;
            } else {
                data = 10 - l2.val - i;
                i = 1;
            }
            l2 = l2.next;
            result.next = new ListNode(data);
            result = result.next;
        }
        if (i == 1) {
            result.next = new ListNode(1);
            result = result.next;
        }
        return tt.next;
    }


    @Test
    public void test() {
//        ListNode l1=new ListNode(2);
//        l1.next=new ListNode(4);
//        l1.next.next=new ListNode(3);
//
//        ListNode l2=new ListNode(5);
//        l2.next=new ListNode(6);
//        l2.next.next=new ListNode(4);

        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(9);
        addTwoNumbers(l1, l2);

    }
}
