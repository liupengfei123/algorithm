package lpf.learn.leetcode.learn.linked_list;

import lpf.learn.leetcode.learn.entity.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class DetectCycleTest {

    @Test
    public void test1() {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;

        DetectCycle temp = new DetectCycle();
        Assert.assertEquals(listNode2, temp.detectCycle(listNode1));
    }

    @Test
    public void test2() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode1;

        DetectCycle temp = new DetectCycle();
        Assert.assertEquals(listNode1, temp.detectCycle(listNode1));
    }

    @Test
    public void test3() {
        ListNode listNode1 = new ListNode(1);
        DetectCycle temp = new DetectCycle();
        Assert.assertNull(temp.detectCycle(listNode1));

    }


}
