package lpf.learn.leetcode.learn.linked_list;

import lpf.learn.leetcode.entity.ListNode;

import java.util.LinkedList;

/** 单链表的序列化与反序列化
 * 序列化为 "[1,2,3,4,5]"
 */
public class SerializeAndDeserializeBinaryLinked {

    public String serialize(ListNode node) {
        LinkedList<String> result = new LinkedList<>();
        while (node.next != null) {
            result.add(Integer.toString(node.val));
        }
        return String.join(",", result);
    }


    public ListNode deserialize(String data) {
        int index = 0;
        String[] array = data.split(",");
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (index < array.length) {
            temp.next = new ListNode(Integer.parseInt(array[index++]));
            temp = temp.next;
        }
        return dummy.next;
    }
}
