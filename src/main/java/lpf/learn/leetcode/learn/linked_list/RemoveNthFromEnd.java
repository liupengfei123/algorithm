package lpf.learn.leetcode.learn.linked_list;

import lpf.learn.leetcode.learn.entity.ListNode;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 * 你能尝试使用一趟扫描实现吗？
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        //用于存储后N+1位的结点
        ListNode[] nodes = new ListNode[n + 1];
        int total = 0;
        ListNode node = head;
        while (node != null) {
            nodes[total++ % nodes.length] = node;
            node = node.next;
        }

        ListNode newHead = head;
        int value = total - n;
        ListNode removeNode = nodes[value % nodes.length];
        if (value == 0) {
            newHead = removeNode.next;
        } else {
            nodes[(value- 1) % nodes.length].next = removeNode.next;
        }
        removeNode.next = null;
        return newHead;
    }


    /**
     * 快慢指针
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        // 快指针先走 n 步
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        // 当快指针都到尾时，慢指针则在倒数 n+1 位置
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
