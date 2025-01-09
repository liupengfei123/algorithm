package lpf.learn.leetcode.tags.stack;


import java.util.ArrayDeque;
import java.util.Deque;

/** 84 柱状图中最大的矩形
 <p>给定 <em>n</em> 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。</p>
 <p>求在该柱状图中，能够勾勒出来的矩形的最大面积。</p>

 <p><strong>示例 1:</strong></p>
 <p><img src="https://assets.leetcode.com/uploads/2021/01/04/histogram.jpg" /></p>
 <pre>
 <strong>输入：</strong>heights = [2,1,5,6,2,3]
 <strong>输出：</strong>10
 <strong>解释：</strong>最大的矩形为图中红色区域，面积为 10
 </pre>

 <p><strong>示例 2：</strong></p>
 <p><img src="https://assets.leetcode.com/uploads/2021/01/04/histogram-1.jpg" /></p>
 <pre>
 <strong>输入：</strong> heights = [2,4]
 <b>输出：</b> 4</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= heights.length &lt;=10<sup>5</sup></code></li>
 <li><code>0 &lt;= heights[i] &lt;= 10<sup>4</sup></code></li>
 </ul>
 */
public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length, res = 0;
        Deque<int[]> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int j = i;
            while (!stack.isEmpty() && stack.peek()[0] > heights[i]) {
                int[] a = stack.pop();
                j = a[1];
                res = Math.max(res, a[0] * (i - a[1]));
            }
            res = Math.max(res, heights[i]);
            stack.push(new int[]{heights[i], j});
        }
        while (!stack.isEmpty()) {
            int[] a = stack.pop();
            res = Math.max(res, a[0] * (n - a[1]));
        }
        return res;
    }
}
