package lpf.learn.leetcode.tags.sort;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/** 1851 包含每个查询的最小区间
 <p>给你一个二维整数数组 <code>intervals</code> ，其中 <code>intervals[i] = [left<sub>i</sub>, right<sub>i</sub>]</code> 表示第 <code>i</code> 个区间开始于 <code>left<sub>i</sub></code> 、结束于 <code>right<sub>i</sub></code>（包含两侧取值，<strong>闭区间</strong>）。区间的 <strong>长度</strong> 定义为区间中包含的整数数目，更正式地表达是 <code>right<sub>i</sub> - left<sub>i</sub> + 1</code> 。</p>
 <p>再给你一个整数数组 <code>queries</code> 。第 <code>j</code> 个查询的答案是满足&nbsp;<code>left<sub>i</sub> &lt;= queries[j] &lt;= right<sub>i</sub></code> 的 <strong>长度最小区间 <code>i</code> 的长度</strong> 。如果不存在这样的区间，那么答案是 <code>-1</code> 。</p>
 <p>以数组形式返回对应查询的所有答案。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>intervals = [[1,4],[2,4],[3,6],[4,4]], queries = [2,3,4,5]
 <strong>输出：</strong>[3,3,1,4]
 <strong>解释：</strong>查询处理如下：
 - Query = 2 ：区间 [2,4] 是包含 2 的最小区间，答案为 4 - 2 + 1 = 3 。
 - Query = 3 ：区间 [2,4] 是包含 3 的最小区间，答案为 4 - 2 + 1 = 3 。
 - Query = 4 ：区间 [4,4] 是包含 4 的最小区间，答案为 4 - 4 + 1 = 1 。
 - Query = 5 ：区间 [3,6] 是包含 5 的最小区间，答案为 6 - 3 + 1 = 4 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>intervals = [[2,3],[2,5],[1,8],[20,25]], queries = [2,19,5,22]
 <strong>输出：</strong>[2,-1,4,6]
 <strong>解释：</strong>查询处理如下：
 - Query = 2 ：区间 [2,3] 是包含 2 的最小区间，答案为 3 - 2 + 1 = 2 。
 - Query = 19：不存在包含 19 的区间，答案为 -1 。
 - Query = 5 ：区间 [2,5] 是包含 5 的最小区间，答案为 5 - 2 + 1 = 4 。
 - Query = 22：区间 [20,25] 是包含 22 的最小区间，答案为 25 - 20 + 1 = 6 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= intervals.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= queries.length &lt;= 10<sup>5</sup></code></li>
 <li><code>intervals[i].length == 2</code></li>
 <li><code>1 &lt;= left<sub>i</sub> &lt;= right<sub>i</sub> &lt;= 10<sup>7</sup></code></li>
 <li><code>1 &lt;= queries[j] &lt;= 10<sup>7</sup></code></li>
 </ul>
 */
public class MinimumIntervalToIncludeEachQuery {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int n = queries.length;

        Integer[] qi = new Integer[n];
        Arrays.setAll(qi, i -> i);
        Arrays.sort(qi, Comparator.comparing(i -> queries[i]));

        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));

        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparing(a -> a[1] - a[0]));

        int[] ans = new int[n];
        for (int j = 0, i = 0; j < n; j++) {
            while (i < intervals.length && intervals[i][0] <= queries[qi[j]]) queue.offer(intervals[i++]);

            while (!queue.isEmpty() && queue.peek()[1] < queries[qi[j]]) queue.poll();

            ans[qi[j]] = queue.isEmpty() ? -1 : queue.peek()[1] - queue.peek()[0] + 1;
        }
        return ans;
    }
}
