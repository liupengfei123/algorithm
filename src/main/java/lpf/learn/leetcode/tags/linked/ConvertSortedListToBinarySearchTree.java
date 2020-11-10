package lpf.learn.leetcode.tags.linked;

import lpf.learn.leetcode.entity.ListNode;
import lpf.learn.leetcode.entity.TreeNode;

/** [109]有序链表转换二叉搜索树
 * 给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 * 给定的有序链表： [-10, -3, 0, 5, 9],
 * 一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：
 *      0
 *     / \
 *   -3   9
 *   /   /
 * -10  5
 */
public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        ListNode slow = new ListNode(-1, head), fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode root = slow.next;
        ListNode tmp = root.next;
        slow.next = null;
        root.next = null;

        TreeNode left = sortedListToBST(head);
        TreeNode right = sortedListToBST(tmp);
        return new TreeNode(root.val, left, right);
    }

}
