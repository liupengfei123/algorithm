package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.entity.ListNode;

/** [445]两数相加 II
 * 给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 *
 * 进阶：
 * 如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。
 *
 * 示例：
 * 输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 8 -> 0 -> 7
 */
public class AddTwoNumbersIi {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int length1 = 0, length2 = 0;
        ListNode temp = l1;
        while (temp != null) {
            length1++;
            temp = temp.next;
        }
        temp = l2;
        while (temp != null) {
            length2++;
            temp = temp.next;
        }
        if (length1 < length2) {
            ListNode node = l1;
            l1 = l2;
            l2 = node;
        }

        ListNode dummy = new ListNode(0);
        temp = dummy;
        int diff = Math.abs(length1 - length2);
        while (diff-- > 0) {
            temp.next = new ListNode(l1.val);
            temp = temp.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            temp.next = new ListNode(l1.val + l2.val);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        int value = dealNumber(dummy.next);
        if (value > 0) {
            dummy.val = value;
            return dummy;
        }
        return dummy.next;
    }

    private int dealNumber(ListNode node) {
        if (node == null) {
            return 0;
        }
        int value = dealNumber(node.next) + node.val;
        node.val = value % 10;
        return value / 10;
    }
}
