package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.entity.ListNode;

/**
 * [剑指 Offer 06]从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * <p>
 * 限制：
 * 0 <= 链表长度 <= 10000
 */
public class CongWeiDaoTouDaYinLianBiaoLcof {
    public int[] reversePrint(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int[] res = new int[length];
        temp = head;
        while (temp != null) {
            res[--length] = temp.val;
            temp = temp.next;
        }
        return res;
    }
}
