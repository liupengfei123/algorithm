package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.entity.ListNode;


/** [83]删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 * 输入: 1->1->2
 * 输出: 1->2
 *
 * 示例 2:
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode temp = head;
        ListNode node;
        int lastVal = head.val;

        while (temp.next != null) {
            node = temp.next;
            if (lastVal == node.val) {
                temp.next = node.next;
                node.next = null;
            } else {
                temp = temp.next;
            }
            lastVal = node.val;
        }
        return head;
    }
}
