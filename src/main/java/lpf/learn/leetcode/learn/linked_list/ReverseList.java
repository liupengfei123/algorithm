package lpf.learn.leetcode.learn.linked_list;


import lpf.learn.leetcode.entity.ListNode;

/** 反转链表
 * 反转一个单链表。
 *
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head;
        ListNode node = head.next;
        head.next = null;

        while (node != null) {
            ListNode temp = node.next;
            node.next = newHead;
            newHead = node;
            node = temp;
        }
        return newHead;
    }


    /**
     * 假设列表的其余部分已经被反转，现在我该如何反转它前面的部分？
     * 假设列表为：
     * n1 →...→ nk−1​ → nk → nk+1 →...→nm →∅
     * 若从节点 nk+1 到 nm 已经被反转，而我们正处于 nk。
     * n1 →...→ nk−1​ → nk → nk+1 ←...← nm
     * 我们希望 nk+1 的下一个节点指向 nk。
     * 所以，nk.next.next = nk。
     * 要小心的是 n1的下一个必须指向 Ø 。如果你忽略了这一点，你的链表中可能会产生循环。如果使用大小为 2 的链表测试代码，则可能会捕获此错误。
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }


}
