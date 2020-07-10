package lpf.learn.leetcode.learn.linked_list;

import lpf.learn.leetcode.learn.entity.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class GetIntersectionNodeTest {

    @Test
    public void test1() {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        GetIntersectionNode temp = new GetIntersectionNode();
        Assert.assertEquals(listNode2, temp.getIntersectionNode(listNode1, listNode2));
    }

    @Test
    public void test2() {
        ListNode listNode1 = new ListNode(0);
        ListNode temp1 = new ListNode(9);
        ListNode temp2 = new ListNode(1);
        listNode1.next = temp1;
        temp1.next = temp2;

        ListNode listNode2 = new ListNode(3);

        ListNode listNode3 = new ListNode(2);
        listNode3.next = new ListNode(4);

        temp2.next = listNode3;
        listNode2.next = listNode3;

        GetIntersectionNode temp = new GetIntersectionNode();
        Assert.assertEquals(listNode3, temp.getIntersectionNode(listNode1, listNode2));
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
