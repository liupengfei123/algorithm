package lpf.learn.leetcode.tags.stack;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/** [2866]美丽塔 II
 <p>给你一个长度为 <code>n</code>&nbsp;下标从 <strong>0</strong>&nbsp;开始的整数数组&nbsp;<code>maxHeights</code>&nbsp;。</p>
 <p>你的任务是在坐标轴上建 <code>n</code>&nbsp;座塔。第&nbsp;<code>i</code>&nbsp;座塔的下标为 <code>i</code>&nbsp;，高度为&nbsp;<code>heights[i]</code>&nbsp;。</p>
 <p>如果以下条件满足，我们称这些塔是 <strong>美丽</strong>&nbsp;的：</p>
 <ol>
 <li><code>1 &lt;= heights[i] &lt;= maxHeights[i]</code></li>
 <li><code>heights</code>&nbsp;是一个 <strong>山脉</strong> 数组。</li>
 </ol>
 <p>如果存在下标 <code>i</code>&nbsp;满足以下条件，那么我们称数组&nbsp;<code>heights</code>&nbsp;是一个 <strong>山脉</strong> 数组：</p>
 <ul>
 <li>对于所有&nbsp;<code>0 &lt; j &lt;= i</code>&nbsp;，都有&nbsp;<code>heights[j - 1] &lt;= heights[j]</code></li>
 <li>对于所有&nbsp;<code>i &lt;= k &lt; n - 1</code>&nbsp;，都有&nbsp;<code>heights[k + 1] &lt;= heights[k]</code></li>
 </ul>

 <p>请你返回满足 <b>美丽塔</b>&nbsp;要求的方案中，<strong>高度和的最大值</strong>&nbsp;。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <b>输入：</b>maxHeights = [5,3,4,1,1]
 <b>输出：</b>13
 <b>解释：</b>和最大的美丽塔方案为 heights = [5,3,3,1,1] ，这是一个美丽塔方案，因为：
 - 1 &lt;= heights[i] &lt;= maxHeights[i]
 - heights 是个山脉数组，峰值在 i = 0 处。
 13 是所有美丽塔方案中的最大高度和。</pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <b>输入：</b>maxHeights = [6,5,3,9,2,7]
 <b>输出：</b>22
 <strong>解释：</strong> 和最大的美丽塔方案为 heights = [3,3,3,9,2,2] ，这是一个美丽塔方案，因为：
 - 1 &lt;= heights[i] &lt;= maxHeights[i]
 - heights 是个山脉数组，峰值在 i = 3 处。
 22 是所有美丽塔方案中的最大高度和。</pre>

 <p><strong class="example">示例 3：</strong></p>
 <pre>
 <b>输入：</b>maxHeights = [3,2,5,5,2,3]
 <b>输出：</b>18
 <strong>解释：</strong>和最大的美丽塔方案为 heights = [2,2,5,5,2,2] ，这是一个美丽塔方案，因为：
 - 1 &lt;= heights[i] &lt;= maxHeights[i]
 - heights 是个山脉数组，最大值在 i = 2 处。
 注意，在这个方案中，i = 3 也是一个峰值。
 18 是所有美丽塔方案中的最大高度和。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n == maxHeights&nbsp;&lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= maxHeights[i] &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class BeautifulTowersIi {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int n = maxHeights.size();
        long res = 0;

        long[] prefix = new long[n], suffix = new long[n];
        Deque<Integer> stack1 = new ArrayDeque<>(), stack2 = new ArrayDeque<>();;

        for (int i = 0; i < n; i++) {
            while (!stack1.isEmpty() && maxHeights.get(stack1.peek()) > maxHeights.get(i))
                stack1.pop();

            if (stack1.isEmpty()) {
                prefix[i] = (long) (i + 1) * maxHeights.get(i);
            } else {
                prefix[i] = prefix[stack1.peek()] + (long) (i - stack1.peek()) * maxHeights.get(i);
            }
            stack1.push(i);
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!stack2.isEmpty() && maxHeights.get(stack2.peek()) > maxHeights.get(i))
                stack2.pop();

            if (stack2.isEmpty()) {
                suffix[i] = (long) (n - i) * maxHeights.get(i);
            } else {
                suffix[i] = suffix[stack2.peek()] + (long) (stack2.peek() - i) * maxHeights.get(i);
            }
            stack2.push(i);

            res = Math.max(res, suffix[i] + prefix[i] - maxHeights.get(i));
        }
        return res;
    }
}
