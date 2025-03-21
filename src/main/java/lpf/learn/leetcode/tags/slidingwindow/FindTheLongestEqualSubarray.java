package lpf.learn.leetcode.tags.slidingwindow;

import java.util.List;

/** 2831 找出最长等值子数组
 <p>给你一个下标从 <strong>0</strong> 开始的整数数组 <code>nums</code> 和一个整数 <code>k</code> 。</p>
 <p>如果子数组中所有元素都相等，则认为子数组是一个 <strong>等值子数组</strong> 。注意，空数组是 <strong>等值子数组</strong> 。</p>
 <p>从 <code>nums</code> 中删除最多 <code>k</code> 个元素后，返回可能的最长等值子数组的长度。</p>
 <p><strong>子数组</strong> 是数组中一个连续且可能为空的元素序列。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,3,2,3,1,3], k = 3
 <strong>输出：</strong>3
 <strong>解释：</strong>最优的方案是删除下标 2 和下标 4 的元素。
 删除后，nums 等于 [1, 3, 3, 3] 。
 最长等值子数组从 i = 1 开始到 j = 3 结束，长度等于 3 。
 可以证明无法创建更长的等值子数组。
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,1,2,2,1,1], k = 2
 <strong>输出：</strong>4
 <strong>解释：</strong>最优的方案是删除下标 2 和下标 3 的元素。
 删除后，nums 等于 [1, 1, 1, 1] 。
 数组自身就是等值子数组，长度等于 4 。
 可以证明无法创建更长的等值子数组。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= nums.length</code></li>
 <li><code>0 &lt;= k &lt;= nums.length</code></li>
 </ul>
 */
public class FindTheLongestEqualSubarray {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int n = nums.size(), res = 0;
        int[] cnt = new int[n + 1];

        for (int r = 0, l = 0; r < n; r++) {
            Integer val = nums.get(r);
            cnt[val]++;

            for (int len = r - l + 1; cnt[nums.get(l)] + k < len; l++, len = r - l + 1) {
                --cnt[nums.get(l)];
            }

            res = Math.max(res, cnt[val]);
        }

        return res;
    }
}
