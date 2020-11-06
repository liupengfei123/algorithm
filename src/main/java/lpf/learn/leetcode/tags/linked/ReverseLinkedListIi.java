package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.entity.ListNode;

/** [92]反转链表 II
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 *
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 *
 * 示例:
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 */
public class ReverseLinkedListIi {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }

        ListNode dummy = new ListNode(-1, head);
        ListNode temp = dummy;
        ListNode newTail = null, newHead = null, oldHead = null;
        int i = -1;
        while (temp != null) {
            ListNode next = temp.next;
            if (++i == m - 1) {
                oldHead = temp;
            } else if (i == m) {
                newTail = temp;
                newHead = temp;
                newTail.next = null;
            } else if (i > m && i <= n) {
                temp.next = newHead;
                newHead = temp;
                if (i == n) {
                    temp = next;
                    newTail.next = temp;
                    oldHead.next = newHead;
                }
            }
            temp = next;
        }
        return dummy.next;
    }
}
