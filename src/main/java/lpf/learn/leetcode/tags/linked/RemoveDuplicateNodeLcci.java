package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.entity.ListNode;

import java.util.HashSet;
import java.util.Set;

/** [面试题 02.01]移除重复节点
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 *
 * 示例1:
 * 输入：[1, 2, 3, 3, 2, 1]
 * 输出：[1, 2, 3]
 *
 * 示例2:
 * 输入：[1, 1, 1, 1, 2]
 * 输出：[1, 2]
 *
 * 提示：
 * 链表长度在[0, 20000]范围内。
 * 链表元素在[0, 20000]范围内。
 *
 * 进阶：
 * 如果不得使用临时缓冲区，该怎么解决？
 */
public class RemoveDuplicateNodeLcci {
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        dummy.next = head;

        Set<Integer> set = new HashSet<>();
        while (node.next != null) {
            if (set.contains(node.next.val)) {
                node.next = node.next.next;
            } else {
                node = node.next;
                set.add(node.val);
            }
        }
        return dummy.next;
    }


    public ListNode removeDuplicateNodes2(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        dummy.next = head;
        //链表元素在[0, 20000]范围内, 而验证 node.val 是否已经有存在过了，只需要一个比特位即可
        int[] bits = new int[20000 / 32 + 1];
        while (node.next != null) {
            // cur.val / 32  为计算 val 属于在数组中第几个 int 值， cur.val % 32 则计算 val 属于 int 值中的第几个比特位，
            if ((bits[node.next.val / 32] & (1 << (node.next.val % 32))) != 0) {
                node.next = node.next.next;
            } else {
                node = node.next;
                bits[node.val / 32] |= 1 << (node.val % 32);
            }
        }
        return dummy.next;
    }
}
