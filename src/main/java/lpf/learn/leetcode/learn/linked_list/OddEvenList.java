package lpf.learn.leetcode.learn.linked_list;

import lpf.learn.leetcode.learn.entity.ListNode;

public class OddEvenList {

    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);

        ListNode lastNode1 = dummy1, lastNode2 = dummy2, node = head;
        int count = 1;
        while (node != null) {
            if (count++ % 2 == 1) {
                //奇数
                lastNode1.next = node;
                lastNode1 = lastNode1.next;
            } else {
                //偶数
                lastNode2.next = node;
                lastNode2 = lastNode2.next;
            }
            node = node.next;
        }
        lastNode1.next = dummy2.next;
        lastNode2.next = null;
        return dummy1.next;
    }
}
