package lpf.learn.leetcode.tags.stack;


import java.util.ArrayDeque;
import java.util.Deque;

/** 2104 子数组范围和
 <p>给你一个整数数组 <code>nums</code> 。<code>nums</code> 中，子数组的 <strong>范围</strong> 是子数组中最大元素和最小元素的差值。</p>
 <p>返回 <code>nums</code> 中 <strong>所有</strong> 子数组范围的 <strong>和</strong> <em>。</em></p>
 <p>子数组是数组中一个连续 <strong>非空</strong> 的元素序列。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,2,3]
 <strong>输出：</strong>4
 <strong>解释：</strong>nums 的 6 个子数组如下所示：
 [1]，范围 = 最大 - 最小 = 1 - 1 = 0
 [2]，范围 = 2 - 2 = 0
 [3]，范围 = 3 - 3 = 0
 [1,2]，范围 = 2 - 1 = 1
 [2,3]，范围 = 3 - 2 = 1
 [1,2,3]，范围 = 3 - 1 = 2
 所有范围的和是 0 + 0 + 0 + 1 + 1 + 2 = 4</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,3,3]
 <strong>输出：</strong>4
 <strong>解释：</strong>nums 的 6 个子数组如下所示：
 [1]，范围 = 最大 - 最小 = 1 - 1 = 0
 [3]，范围 = 3 - 3 = 0
 [3]，范围 = 3 - 3 = 0
 [1,3]，范围 = 3 - 1 = 2
 [3,3]，范围 = 3 - 3 = 0
 [1,3,3]，范围 = 3 - 1 = 2
 所有范围的和是 0 + 0 + 0 + 2 + 0 + 2 = 4
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [4,-2,-3,4,1]
 <strong>输出：</strong>59
 <strong>解释：</strong>nums 中所有子数组范围的和是 59
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 1000</code></li>
 <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 </ul>
 <p><strong>进阶：</strong>你可以设计一种时间复杂度为 <code>O(n)</code> 的解决方案吗？</p>
 */
public class SumOfSubarrayRanges {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long res = 0;

        Deque<int[]> max = new ArrayDeque<>();
        Deque<int[]> min = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int zx = i, zm = i;
            while (!max.isEmpty() && max.peek()[0] <= nums[i]) {
                int[] pop = max.pop();
                zx = pop[1];
                res += (long) (pop[2] - pop[1] + 1) * (i - pop[2]) * pop[0];
            }
            while (!min.isEmpty() && min.peek()[0] >= nums[i]) {
                int[] pop = min.pop();
                zm = pop[1];
                res -= (long) (pop[2] - pop[1] + 1) * (i - pop[2]) * pop[0];
            }

            max.push(new int[]{nums[i], zx, i});
            min.push(new int[]{nums[i], zm, i});
        }

        while (!max.isEmpty()) {
            int[] pop = max.pop();
            res += (long) (pop[2] - pop[1] + 1) * (n - pop[2]) * pop[0];
        }
        while (!min.isEmpty()) {
            int[] pop = min.pop();
            res -= (long) (pop[2] - pop[1] + 1) * (n - pop[2]) * pop[0];
        }
        return res;
    }
}
