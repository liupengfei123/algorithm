package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.entity.ListNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * [23]合并K个升序链表
 * 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 * <p>
 * 示例 1：
 * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
 * 输出：[1,1,2,3,4,4,5,6]
 * 解释：链表数组如下：
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * 将它们合并到一个有序链表中得到。
 * 1->1->2->3->4->4->5->6
 * <p>
 * 示例 2：
 * 输入：lists = []
 * 输出：[]
 * <p>
 * 示例 3：
 * 输入：lists = [[]]
 * 输出：[]
 * <p>
 * 提示：
 * k == lists.length
 * 0 <= k <= 10^4
 * 0 <= lists[i].length <= 500
 * -10^4 <= lists[i][j] <= 10^4
 * lists[i] 按 升序 排列
 * lists[i].length 的总和不超过 10^4
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> list = new LinkedList<>();
        Collections.addAll(list, lists);

        while (list.size() > 1) {
            list.add(mergeListNode(list.remove(0), list.remove(0)));
        }
        return list.size() == 0 ? null : list.get(0);
    }


    private ListNode mergeListNode(ListNode node1, ListNode node2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (node1 != null && node2 != null) {
            if (node1.val > node2.val) {
                temp.next = node2;
                node2 = node2.next;
            } else {
                temp.next = node1;
                node1 = node1.next;
            }
            temp = temp.next;
        }
        if (node1 != null) {
            temp.next =  node1;
        }
        if (node2 != null) {
            temp.next =  node2;
        }
        return dummy.next;
    }


}
