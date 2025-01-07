package lpf.learn.leetcode.tags.stack;


import java.util.ArrayDeque;
import java.util.Deque;

/** 962 最大宽度坡
 <p>给定一个整数数组&nbsp;<code>A</code>，<em>坡</em>是元组&nbsp;<code>(i, j)</code>，其中&nbsp;&nbsp;<code>i &lt; j</code>&nbsp;且&nbsp;<code>A[i] &lt;= A[j]</code>。这样的坡的宽度为&nbsp;<code>j - i</code>。</p>
 <p>找出&nbsp;<code>A</code>&nbsp;中的坡的最大宽度，如果不存在，返回 0 。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>[6,0,8,2,1,5]
 <strong>输出：</strong>4
 <strong>解释：</strong>
 最大宽度的坡为 (i, j) = (1, 5): A[1] = 0 且 A[5] = 5.
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>[9,8,1,0,1,9,4,0,4,1]
 <strong>输出：</strong>7
 <strong>解释：</strong>
 最大宽度的坡为 (i, j) = (2, 9): A[2] = 1 且 A[9] = 1.
 </pre>

 <p><strong>提示：</strong></p>
 <ol>
 <li><code>2 &lt;= A.length &lt;= 50000</code></li>
 <li><code>0 &lt;= A[i] &lt;= 50000</code></li>
 </ol>
 */
public class MaximumWidthRamp {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) stack.push(i);
        }

        int res = 0;
        for (int i = n - 1; i >= res; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                res = Math.max(res, i - stack.pop());
            }
        }
        return res;
    }
}
