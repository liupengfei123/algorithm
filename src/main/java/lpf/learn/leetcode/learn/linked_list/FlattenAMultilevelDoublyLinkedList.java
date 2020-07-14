package lpf.learn.leetcode.learn.linked_list;

import lpf.learn.leetcode.learn.entity.ListNode2;

/** 430. 扁平化多级双向链表
 * 多级双向链表中，除了指向下一个节点和前一个节点指针之外，它还有一个子链表指针，可能指向单独的双向链表。这些子列表也可能会有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
 *
 * 给你位于列表第一级的头节点，请你扁平化列表，使所有结点出现在单级双链表中。
 */
public class FlattenAMultilevelDoublyLinkedList {

    public ListNode2 flatten(ListNode2 head) {
        if (head != null) {
            flatten2(head);
        }
        return head;
    }


    private ListNode2 flatten2(ListNode2 head) {
        ListNode2 node = head;
        while (node.next != null || node.child != null) {
            ListNode2 nodeNext = node.next;
            if (node.child != null) {
                ListNode2 newEndNode = flatten2(node.child);

                node.next = node.child;
                node.next.prev = node;
                node.child = null;

                if (nodeNext != null) {
                    newEndNode.next = nodeNext;
                    newEndNode.next.prev = newEndNode;
                    node = nodeNext;
                }
            } else {
                node = nodeNext;
            }
        }
        return node;
    }
}
