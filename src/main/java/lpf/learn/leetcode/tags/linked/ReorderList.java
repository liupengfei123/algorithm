package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.entity.ListNode;

import java.util.ArrayList;
import java.util.List;

/** [143]重排链表
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例 1:
 * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 *
 * 示例 2:
 * 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
 */
public class ReorderList {



    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        List<ListNode> list = new ArrayList<>();

        while (head != null) {
            list.add(head);
            head = head.next;
        }

        int left = 0, right = list.size() - 1;

        while (left < right) {
            ListNode node1 = list.get(left++);
            ListNode node2 = list.get(right--);
            node1.next = node2;
            node2.next = list.get(left);
        }
        list.get(left).next = null;
    }
}
