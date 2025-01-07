package lpf.learn.leetcode.tags.stack;

import lpf.learn.leetcode.entity.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

/** 1019 链表中的下一个更大节点
 <p>给定一个长度为&nbsp;<code>n</code>&nbsp;的链表&nbsp;<code>head</code></p>
 <p>对于列表中的每个节点，查找下一个 <strong>更大节点</strong> 的值。也就是说，对于每个节点，找到它旁边的第一个节点的值，这个节点的值 <strong>严格大于</strong> 它的值。</p>
 <p>返回一个整数数组 <code>answer</code> ，其中 <code>answer[i]</code> 是第 <code>i</code> 个节点( <strong>从1开始</strong> )的下一个更大的节点的值。如果第 <code>i</code> 个节点没有下一个更大的节点，设置&nbsp;<code>answer[i] = 0</code>&nbsp;。</p>

 <p><strong>示例 1：</strong></p>
 <p><img src="https://assets.leetcode.com/uploads/2021/08/05/linkedlistnext1.jpg" /></p>
 <pre>
 <strong>输入：</strong>head = [2,1,5]
 <strong>输出：</strong>[5,5,0]
 </pre>

 <p><strong>示例 2：</strong></p>
 <p><img src="https://assets.leetcode.com/uploads/2021/08/05/linkedlistnext2.jpg" /></p>
 <pre>
 <strong>输入：</strong>head = [2,7,4,3,5]
 <strong>输出：</strong>[7,0,5,5,0]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li>链表中节点数为&nbsp;<code>n</code></li>
 <li><code>1 &lt;= n &lt;= 10<sup>4</sup></code></li>
 <li><code>1 &lt;= Node.val &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class NextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(ListNode head) {
        int n = 0;
        for (ListNode node = head; node != null; node = node.next) n++;

        int[] res = new int[n];
        Deque<int[]> stack = new ArrayDeque<>();
        ListNode node = head;
        for (int i = 0; i < n; i++, node = node.next) {
            while (!stack.isEmpty() && stack.peek()[0] < node.val) {
                res[stack.pop()[1]] = node.val;
            }
            stack.push(new int[]{node.val, i});
        }
        return res;
    }
}
