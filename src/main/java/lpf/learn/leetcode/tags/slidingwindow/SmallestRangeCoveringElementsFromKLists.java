package lpf.learn.leetcode.tags.slidingwindow;


import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/** 632 最小区间
 <p>你有&nbsp;<code>k</code>&nbsp;个 <strong>非递减排列</strong> 的整数列表。找到一个 <strong>最小 </strong>区间，使得&nbsp;<code>k</code>&nbsp;个列表中的每个列表至少有一个数包含在其中。</p>
 <p>我们定义如果&nbsp;<code>b-a &lt; d-c</code>&nbsp;或者在&nbsp;<code>b-a == d-c</code>&nbsp;时&nbsp;<code>a &lt; c</code>，则区间 <code>[a,b]</code> 比 <code>[c,d]</code> 小。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]
 <strong>输出：</strong>[20,24]
 <strong>解释：</strong>
 列表 1：[4, 10, 15, 24, 26]，24 在区间 [20,24] 中。
 列表 2：[0, 9, 12, 20]，20 在区间 [20,24] 中。
 列表 3：[5, 18, 22, 30]，22 在区间 [20,24] 中。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [[1,2,3],[1,2,3],[1,2,3]]
 <strong>输出：</strong>[1,1]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>nums.length == k</code></li>
 <li><code>1 &lt;= k &lt;= 3500</code></li>
 <li><code>1 &lt;= nums[i].length &lt;= 50</code></li>
 <li><code>-10<sup>5</sup> &lt;= nums[i][j] &lt;= 10<sup>5</sup></code></li>
 <li><code>nums[i]</code> 按非递减顺序排列</li>
 </ul>
 */
public class SmallestRangeCoveringElementsFromKLists {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparing(a -> a[0]));

        int k = nums.size();
        int[] index = new int[k];

        int l = Integer.MAX_VALUE, r = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            int v = nums.get(i).get(0);
            l = Math.min(l, v);
            r = Math.max(r, v);
            queue.add(new int[]{v, i});
        }
        int nl = l, nr = r;
        while (true) {
            int[] poll = queue.poll();
            int i = poll[1];
            l = poll[0];

            if (r - l < nr - nl) {
                nr = r;
                nl = l;
            }

            if (++index[i] >= nums.get(i).size()) break;

            int v = nums.get(i).get(index[i]);
            queue.add(new int[]{v, i});
            r = Math.max(r, v);
        }
        return new int[]{nl, nr};
    }
}
