package lpf.learn.leetcode.tags.stack;


import java.util.ArrayDeque;
import java.util.Deque;

/** 1793 好子数组的最大分数
 <p>给你一个整数数组&nbsp;<code>nums</code>&nbsp;<strong>（下标从 0 开始）</strong>和一个整数&nbsp;<code>k</code>&nbsp;。</p>
 <p>一个子数组 <code>(i, j)</code>&nbsp;的 <strong>分数</strong>&nbsp;定义为&nbsp;<code>min(nums[i], nums[i+1], ..., nums[j]) * (j - i + 1)</code>&nbsp;。一个&nbsp;<strong>好</strong>&nbsp;子数组的两个端点下标需要满足&nbsp;<code>i &lt;= k &lt;= j</code>&nbsp;。</p>
 <p>请你返回 <strong>好</strong>&nbsp;子数组的最大可能 <strong>分数</strong>&nbsp;。</p>

 <p><strong>示例 1：</strong></p>
 <pre><b>输入：</b>nums = [1,4,3,7,4,5], k = 3
 <b>输出：</b>15
 <b>解释：</b>最优子数组的左右端点下标是 (1, 5) ，分数为 min(4,3,7,4,5) * (5-1+1) = 3 * 5 = 15 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><b>输入：</b>nums = [5,5,4,5,4,1,1,1], k = 0
 <b>输出：</b>20
 <b>解释：</b>最优子数组的左右端点下标是 (0, 4) ，分数为 min(5,5,4,5,4) * (4-0+1) = 4 * 5 = 20 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 2 * 10<sup>4</sup></code></li>
 <li><code>0 &lt;= k &lt; nums.length</code></li>
 </ul>
 */
public class MaximumScoreOfAGoodSubarray {
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> sl = new ArrayDeque<>(), sr = new ArrayDeque<>();

        for (int i = k; i >= 0; i--) {
            if (sl.isEmpty() || nums[sl.peek()] > nums[i]) sl.push(i);
        }
        for (int i = k; i < n; i++) {
            if (sr.isEmpty() || nums[sr.peek()] > nums[i]) sr.push(i);
        }

        int res = n * Math.min(nums[sl.peek()], nums[sr.peek()]);
        int l = 0, r = n - 1;
        while (sl.size() > 1 || sr.size() > 1) {
            if (nums[sl.peek()] < nums[sr.peek()]) {
                l = sl.poll() + 1;
            } else {
                r = sr.poll() - 1;
            }
            res = Math.max(res, (r - l + 1) * Math.min(nums[sl.peek()], nums[sr.peek()]));
        }
        return res;
    }
}
