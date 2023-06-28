package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** 1681 最小不兼容性
 <p>给你一个整数数组 <code>nums</code>​​​ 和一个整数 <code>k</code> 。你需要将这个数组划分到 <code>k</code> 个相同大小的子集中，使得同一个子集里面没有两个相同的元素。</p>
 <p>一个子集的 <strong>不兼容性</strong> 是该子集里面最大值和最小值的差。</p>
 <p>请你返回将数组分成 <code>k</code> 个子集后，各子集 <strong>不兼容性 </strong>的<strong> 和</strong> 的 <strong>最小值</strong> ，如果无法分成分成 <code>k</code> 个子集，返回 <code>-1</code> 。</p>
 <p>子集的定义是数组中一些数字的集合，对数字顺序没有要求。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>nums = [1,2,1,4], k = 2
 <b>输出：</b>4
 <b>解释：</b>最优的分配是 [1,2] 和 [1,4] 。
 不兼容性和为 (2-1) + (4-1) = 4 。
 注意到 [1,1] 和 [2,4] 可以得到更小的和，但是第一个集合有 2 个相同的元素，所以不可行。</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>nums = [6,3,8,1,3,1,2,2], k = 4
 <b>输出：</b>6
 <b>解释：</b>最优的子集分配为 [1,2]，[2,3]，[6,8] 和 [1,3] 。
 不兼容性和为 (2-1) + (3-2) + (8-6) + (3-1) = 6 。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <b>输入：</b>nums = [5,3,3,6,3,3], k = 3
 <b>输出：</b>-1
 <b>解释：</b>没办法将这些数字分配到 3 个子集且满足每个子集里没有相同数字。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 <= k <= nums.length <= 16</code></li>
 <li><code>nums.length</code> 能被 <code>k</code> 整除。</li>
 <li><code>1 <= nums[i] <= nums.length</code></li>
 </ul>
 */
public class MinimumIncompatibility {
    public int minimumIncompatibility(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, group = n / k, fullMark = (1 << n) - 1;

        Map<Integer, Integer> values = new HashMap<>();
        for (int mark = 1; mark <= fullMark; mark++) {
            if (Integer.bitCount(mark) != group) continue;
            int incompatibility = getIncompatibility(mark, nums);
            if (incompatibility != -1) values.put(mark, incompatibility);
        }

        int[] dp = new int[1 << n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int mark = 0; mark <= fullMark; mark++) {
            if (dp[mark] == Integer.MAX_VALUE) continue;

            Map<Integer, Integer> seen = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if ((mark & 1 << i) == 0) seen.put(nums[i], i);
            }
            if (seen.size() < group) continue;

            // 相比于 直接使用 ~mark & fullMark 情况，使用去重的索引可以大幅度的减少状态搜索，而且使用同一个数值的不同索引对结果没有影响
            // 并且 values 也求出了所有索引情况的 结果
            int sub = 0;
            for (Integer i : seen.values()) sub |= (1 << i);

            int nxt = sub;
            while (nxt > 0) {
                Integer value = values.get(nxt);
                if (value != null) dp[mark | nxt] = Math.min(dp[mark | nxt], dp[mark] + value);

                nxt = (nxt - 1) & sub;
            }
        }
        return dp[fullMark] == Integer.MAX_VALUE ? -1 : dp[fullMark];
    }

    private int getIncompatibility(int mark, int[] nums) {
        int min = 20, max = 0, last = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((mark & 1 << i) != 0) {
                if (nums[i] == last) return -1;

                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);
                last = nums[i];
            }
        }
        return max - min;
    }
}
