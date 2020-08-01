package lpf.learn.leetcode.learn.linked_list;

import lpf.learn.leetcode.entity.ListNode;

/** 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * @author liupf
 * @date 2020-07-11 9:48
 */
public class MergeTwoLists {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode node = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        while (l1 != null) {
            node.next = l1;
            l1 = l1.next;
            node = node.next;
        }
        while (l2 != null) {
            node.next = l2;
            l2 = l2.next;
            node = node.next;
        }

        return dummy.next;
    }
}
