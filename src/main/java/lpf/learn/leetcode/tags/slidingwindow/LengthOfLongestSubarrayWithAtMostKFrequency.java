package lpf.learn.leetcode.tags.slidingwindow;


import java.util.HashMap;
import java.util.Map;

/** 2958 最多 K 个重复元素的最长子数组
 <p>给你一个整数数组&nbsp;<code>nums</code>&nbsp;和一个整数&nbsp;<code>k</code>&nbsp;。</p>
 <p>一个元素 <code>x</code>&nbsp;在数组中的 <strong>频率</strong>&nbsp;指的是它在数组中的出现次数。</p>
 <p>如果一个数组中所有元素的频率都 <strong>小于等于&nbsp;</strong><code>k</code>&nbsp;，那么我们称这个数组是 <strong>好</strong>&nbsp;数组。</p>
 <p>请你返回 <code>nums</code>&nbsp;中 <strong>最长好</strong>&nbsp;子数组的长度。</p>
 <p><strong>子数组</strong> 指的是一个数组中一段连续非空的元素序列。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <b>输入：</b>nums = [1,2,3,1,2,3,1,2], k = 2
 <b>输出：</b>6
 <strong>解释：</strong>最长好子数组是 [1,2,3,1,2,3] ，值 1 ，2 和 3 在子数组中的频率都没有超过 k = 2 。[2,3,1,2,3,1] 和 [3,1,2,3,1,2] 也是好子数组。
 最长好子数组的长度为 6 。
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,2,1,2,1,2,1,2], k = 1
 <b>输出：</b>2
 <b>解释：</b>最长好子数组是 [1,2] ，值 1 和 2 在子数组中的频率都没有超过 k = 1 。[2,1] 也是好子数组。
 最长好子数组的长度为 2 。
 </pre>

 <p><strong class="example">示例 3：</strong></p>
 <pre>
 <b>输入：</b>nums = [5,5,5,5,5,5,5], k = 4
 <b>输出：</b>4
 <b>解释：</b>最长好子数组是 [5,5,5,5] ，值 5 在子数组中的频率没有超过 k = 4 。
 最长好子数组的长度为 4 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 <li><code>1 &lt;= k &lt;= nums.length</code></li>
 </ul>
 */
public class LengthOfLongestSubarrayWithAtMostKFrequency {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int n = nums.length, res = 0;

        for (int l = 0, r = 0; r < n; r++) {
            cnt.merge(nums[r], 1, Integer::sum);

            while (cnt.get(nums[r]) > k) cnt.merge(nums[l++], -1, Integer::sum);

            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
