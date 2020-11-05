package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.entity.ListNode;

/** [61]旋转链表
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 *
 * 示例 2:
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        //不适合 k 是链表长度很多倍的
        for (int i = 0; i < k; i++) {
            if (fast.next != null) {
                fast = fast.next;
            } else {
                fast = head;
            }
        }

        if (fast == head) {
            return head;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;
        return newHead;
    }



    public ListNode rotateRight2(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode oldTail = head;
        int size;
        for(size = 1; oldTail.next != null; size++) {
            oldTail = oldTail.next;
        }
        oldTail.next = head;

        // 新的尾节点 : n - k % n - 1 和 新的头节点: n - k % n
        ListNode newTail = head;
        for (int i = 0; i < size - k % size - 1; i++) {
            newTail = newTail.next;
        }
        ListNode new_head = newTail.next;

        newTail.next = null;
        return new_head;
    }
}
