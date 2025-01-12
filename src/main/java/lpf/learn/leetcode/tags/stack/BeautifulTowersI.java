package lpf.learn.leetcode.tags.stack;


import java.util.ArrayDeque;
import java.util.Deque;

/** [2865]美丽塔 I
 <p>给定一个包含&nbsp;<code>n</code>&nbsp;个整数的数组&nbsp;<code>heights</code>&nbsp;表示&nbsp;<code>n</code>&nbsp;座连续的塔中砖块的数量。你的任务是移除一些砖块来形成一个 <strong>山脉状</strong> 的塔排列。在这种布置中，塔高度先是非递减，有一个或多个连续塔达到最大峰值，然后非递增排列。</p>
 <p>返回满足山脉状塔排列的方案中，<strong>高度和的最大值</strong>&nbsp;。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <b>输入：</b>maxHeights = [5,3,4,1,1]
 <b>输出：</b>13
 <b>解释：</b>我们移除一些砖块来形成 heights = [5,3,3,1,1]，峰值位于下标 0。
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <b>输入：</b>maxHeights = [6,5,3,9,2,7]
 <b>输出：</b>22
 <strong>解释：</strong>我们移除一些砖块来形成 heights = [3,3,3,9,2,2]，峰值位于下标 3。</pre>

 <p><strong class="example">示例 3：</strong></p>
 <pre>
 <b>输入：</b>maxHeights = [3,2,5,5,2,3]
 <b>输出：</b>18
 <strong>解释：</strong>我们移除一些砖块来形成 heights = [2,2,5,5,2,2]，峰值位于下标 2 或 3。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n == heights.length &lt;= 10<sup>3</sup></code></li>
 <li><code>1 &lt;= heights[i] &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class BeautifulTowersI {
    public long maximumSumOfHeights(int[] heights) {
        int n = heights.length;
        long res = 0;

        long[] prefix = new long[n], suffix = new long[n];
        Deque<Integer> stack1 = new ArrayDeque<>(), stack2 = new ArrayDeque<>();;

        for (int i = 0; i < n; i++) {
            while (!stack1.isEmpty() && heights[stack1.peek()] > heights[i])
                stack1.pop();

            if (stack1.isEmpty()) {
                prefix[i] = (long) (i + 1) * heights[i];
            } else {
                prefix[i] = prefix[stack1.peek()] + (long) (i - stack1.peek()) * heights[i];
            }
            stack1.push(i);
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!stack2.isEmpty() && heights[stack2.peek()] > heights[i])
                stack2.pop();

            if (stack2.isEmpty()) {
                suffix[i] = (long) (n - i) * heights[i];
            } else {
                suffix[i] = suffix[stack2.peek()] + (long) (stack2.peek() - i) * heights[i];
            }
            stack2.push(i);

            res = Math.max(res, suffix[i] + prefix[i] - heights[i]);
        }
        return res;
    }
}
