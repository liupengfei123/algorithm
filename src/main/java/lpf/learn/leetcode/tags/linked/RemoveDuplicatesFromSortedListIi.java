package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.entity.ListNode;

/** [82]删除排序链表中的重复元素 II
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 *
 * 示例 1:
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 *
 *
 * 示例 2:
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 */
public class RemoveDuplicatesFromSortedListIi {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode node = dummy;

        while (node.next != null) {
            ListNode temp = node.next;
            int lastValue = temp.val;
            boolean duplicate = false;
            while (temp.next != null && lastValue == temp.next.val) {
                temp.next = temp.next.next;
                duplicate = true;
            }

            if (duplicate) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return dummy.next;
    }


    public ListNode deleteDuplicates2(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode temp = dummy;

        int lastValue = dummy.val;
        while (temp.next != null && temp.next.next != null) {
            if (temp.next.val == temp.next.next.val) {
                lastValue = temp.next.val;
                temp.next = temp.next.next.next;
            } else if (lastValue == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        if (temp.next != null) {
           if (lastValue == temp.next.val) {
                temp.next = null;
            }
        }
        return dummy.next;
    }


}
