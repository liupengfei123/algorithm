package lpf.learn.leetcode.learn.linked_list;

import lpf.learn.leetcode.entity.ListNode;

/** 移除链表元素
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevNode = dummy;
        while (prevNode.next != null) {
            ListNode node = prevNode.next;
            if (node.val == val) {
                prevNode.next = node.next;
                node.next = null;
            } else {
                prevNode = node;
            }
        }
        return dummy.next;
    }

}
