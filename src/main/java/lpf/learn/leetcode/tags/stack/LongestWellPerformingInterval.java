package lpf.learn.leetcode.tags.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/** 1124 表现良好的最长时间段
 <p>给你一份工作时间表&nbsp;<code>hours</code>，上面记录着某一位员工每天的工作小时数。</p>
 <p>我们认为当员工一天中的工作小时数大于&nbsp;<code>8</code> 小时的时候，那么这一天就是「<strong>劳累的一天</strong>」。</p>
 <p>所谓「表现良好的时间段」，意味在这段时间内，「劳累的天数」是严格<strong> 大于</strong>「不劳累的天数」。</p>
 <p>请你返回「表现良好时间段」的最大长度。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>hours = [9,9,6,0,6,6,9]
 <strong>输出：</strong>3
 <strong>解释：</strong>最长的表现良好时间段是 [9,9,6]。</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>hours = [6,6,6]
 <strong>输出：</strong>0
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= hours.length &lt;= 10<sup>4</sup></code></li>
 <li><code>0 &lt;= hours[i] &lt;= 16</code></li>
 </ul>
 */
public class LongestWellPerformingInterval {
    public int longestWPI(int[] hours) {
        int n = hours.length;
        int[] pre = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1] + (hours[i - 1] > 8 ? 1 : -1);
        }

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i <= n; i++) {
            if (stack.isEmpty() || pre[stack.peek()] > pre[i]) stack.push(i);
        }

        int res = 0;
        for (int i = n; i > res; i--) {
            while (!stack.isEmpty() && pre[stack.peek()] < pre[i]) {
                res = Math.max(res, i - stack.pop());
            }
        }
        return res;
    }
}
