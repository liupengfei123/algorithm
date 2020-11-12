package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.entity.ListNode;

import java.util.HashMap;
import java.util.Map;

/** [1171]从链表中删去总和值为零的连续节点
 * 给你一个链表的头节点 head，请你编写代码，反复删去链表中由 总和 值为 0 的连续节点组成的序列，直到不存在这样的序列为止。
 * 删除完毕后，请你返回最终结果链表的头节点。
 * 你可以返回任何满足题目要求的答案。
 *
 * 示例 1：
 * 输入：head = [1,2,-3,3,1]
 * 输出：[3,1]
 * 提示：答案 [1,2,1] 也是正确的。
 *
 * 示例 2：
 * 输入：head = [1,2,3,-3,4]
 * 输出：[1,2,4]
 *
 * 示例 3：
 * 输入：head = [1,2,3,-3,-2]
 * 输出：[1]
 *
 *  提示：
 * 给你的链表中可能有 1 到 1000 个节点。
 * 对于链表中的每个节点，节点的值：-1000 <= node.val <= 1000.
 */
public class RemoveZeroSumConsecutiveNodesFromLinkedList {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        for (ListNode node = dummy; node.next != null; node = node.next) {
            sum += node.val;
            // 只保留前缀和 最后位置的节点
            map.put(sum, node);
        }
        sum = 0;
        for (ListNode node = dummy; node.next != null; node = node.next) {
            sum += node.val;
            // 两个前缀和相同说明，两个节点中间节点的值之和为 0
            node.next = map.get(sum).next;
        }
        return dummy.next;
    }
}
