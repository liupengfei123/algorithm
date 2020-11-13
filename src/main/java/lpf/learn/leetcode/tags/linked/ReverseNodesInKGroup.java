package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.entity.ListNode;

/** [25]K 个一组翻转链表
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * k 是一个正整数，它的值小于或等于链表的长度。
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。

 * 示例：
 * 给你这个链表：1->2->3->4->5
 * 当 k = 2 时，应当返回: 2->1->4->3->5
 * 当 k = 3 时，应当返回: 3->2->1->4->5

 * 说明：
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(-1, head);
        ListNode temp = dummy;
        int lenght = 0;
        while (temp.next != null) {
            lenght++;
            temp = temp.next;
        }

        temp = dummy;
        ListNode nextNode, node;
        for (int i = 0, count = lenght / k; i < count; i++) {
            nextNode = temp.next;
            node = reverse(temp, nextNode, k - 1);
            nextNode.next = node;
            temp = nextNode;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head, ListNode node, int k) {
        if (k <= 0) {
            head.next = node;
            return node.next;
        }
        ListNode h = reverse(head, node.next, k - 1);
        node.next.next = node;
        node.next = null;
        return h;
    }

}
