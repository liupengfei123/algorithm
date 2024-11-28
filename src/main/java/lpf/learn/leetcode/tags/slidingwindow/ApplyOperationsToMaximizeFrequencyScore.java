package lpf.learn.leetcode.tags.slidingwindow;


import java.util.Arrays;

/** 2968 执行操作使频率分数最大
 <p>给你一个下标从 <strong>0</strong>&nbsp;开始的整数数组&nbsp;<code>nums</code>&nbsp;和一个整数&nbsp;<code>k</code>&nbsp;。</p>
 <p>你可以对数组执行 <strong>至多</strong>&nbsp;<code>k</code>&nbsp;次操作：</p>
 <ul>
 <li>从数组中选择一个下标 <code>i</code>&nbsp;，将&nbsp;<code>nums[i]</code> <strong>增加</strong>&nbsp;或者&nbsp;<strong>减少</strong>&nbsp;<code>1</code>&nbsp;。</li>
 </ul>
 <p>最终数组的频率分数定义为数组中众数的 <strong>频率</strong>&nbsp;。</p>
 <p>请你返回你可以得到的 <strong>最大</strong>&nbsp;频率分数。</p>
 <p>众数指的是数组中出现次数最多的数。一个元素的频率指的是数组中这个元素的出现次数。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <b>输入：</b>nums = [1,2,6,4], k = 3
 <b>输出：</b>3
 <b>解释：</b>我们可以对数组执行以下操作：
 - 选择 i = 0 ，将 nums[0] 增加 1 。得到数组 [2,2,6,4] 。
 - 选择 i = 3 ，将 nums[3] 减少 1 ，得到数组 [2,2,6,3] 。
 - 选择 i = 3 ，将 nums[3] 减少 1 ，得到数组 [2,2,6,2] 。
 元素 2 是最终数组中的众数，出现了 3 次，所以频率分数为 3 。
 3 是所有可行方案里的最大频率分数。
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <b>输入：</b>nums = [1,4,4,2,4], k = 0
 <b>输出：</b>3
 <b>解释：</b>我们无法执行任何操作，所以得到的频率分数是原数组中众数的频率 3 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 <li><code>0 &lt;= k &lt;= 10<sup>14</sup></code></li>
 </ul>
 */
public class ApplyOperationsToMaximizeFrequencyScore {
    public int maxFrequencyScore(int[] nums, long k) {
        Arrays.sort(nums);
        int n = nums.length, res = 0;
        long[] preSum = new long[n + 1];
        for (int i = 0; i < n; i++) preSum[i + 1] = preSum[i] + nums[i];

        for (int l = 0, r = 0; r < n; r++) {
            while (l < r && check(nums, k, preSum, l, r)) {
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    private boolean check(int[] nums, long k, long[] preSum, int l, int r) {
        int mid = (r + l) / 2;

        long diff = (long)nums[mid] * (mid - l + 1L) - preSum[mid + 1] + preSum[l];
        diff += preSum[r + 1] - preSum[mid + 1] - (long)nums[mid] * (r - mid);

        return diff > k;
    }
}
