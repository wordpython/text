package com.wordpython.nowcoder;

import common.ListNode;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * 要求 你能给出空间复杂度 O(1) 的解法么？
 */
public class AC判断链表中是否有环 {

    //设置一个快指针，一个 慢指针，快指针总会追上慢指针的特征
    //时间复杂度O(N)，空间复杂度O(1)
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        while(p!=null && p.next!=null){
            p = p.next.next;
            q = q.next;
            if(p==q){
                return true;
            }
        }
        return false;
    }
    //哈希表
    //时间复杂度O(N)，空间复杂度O(N)
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    @Test
    public void test(){
        ListNode listNode = new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=listNode;
        System.out.println(hasCycle(listNode));

    }
}
