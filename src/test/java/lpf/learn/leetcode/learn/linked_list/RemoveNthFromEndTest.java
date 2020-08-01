package lpf.learn.leetcode.learn.linked_list;

import lpf.learn.leetcode.entity.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveNthFromEndTest {

    @Test
    public void test1() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        RemoveNthFromEnd temp = new RemoveNthFromEnd();
        temp.removeNthFromEnd(listNode1, 1);
    }

    @Test
    public void test2() {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);

        RemoveNthFromEnd temp = new RemoveNthFromEnd();
        temp.removeNthFromEnd(listNode1, 2);
    }

    @Test
    public void test3() {
        ListNode listNode1 = new ListNode(0);
        ListNode temp1 = new ListNode(9);
        ListNode temp2 = new ListNode(1);
        listNode1.next = temp1;
        temp1.next = temp2;

        ListNode listNode2 = new ListNode(3);
        listNode2.next = new ListNode(5);

        GetIntersectionNode temp = new GetIntersectionNode();
        Assert.assertNull(temp.getIntersectionNode(listNode1, listNode2));

    }


}
