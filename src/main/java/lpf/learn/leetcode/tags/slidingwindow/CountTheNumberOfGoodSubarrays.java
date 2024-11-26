package lpf.learn.leetcode.tags.slidingwindow;


import java.util.HashMap;
import java.util.Map;

/** 2537 统计好子数组的数目
 <p>给你一个整数数组 <code>nums</code>&nbsp;和一个整数 <code>k</code>&nbsp;，请你返回 <code>nums</code>&nbsp;中 <strong>好</strong>&nbsp;子数组的数目。</p>
 <p>一个子数组 <code>arr</code>&nbsp;如果有 <strong>至少</strong>&nbsp;<code>k</code>&nbsp;对下标 <code>(i, j)</code>&nbsp;满足 <code>i &lt; j</code>&nbsp;且 <code>arr[i] == arr[j]</code>&nbsp;，那么称它是一个 <strong>好</strong>&nbsp;子数组。</p>
 <p><strong>子数组</strong>&nbsp;是原数组中一段连续 <strong>非空</strong>&nbsp;的元素序列。</p>

 <p><strong>示例 1：</strong></p>
 <pre><b>输入：</b>nums = [1,1,1,1,1], k = 10
 <b>输出：</b>1
 <b>解释：</b>唯一的好子数组是这个数组本身。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><b>输入：</b>nums = [3,1,4,3,2,2,4], k = 2
 <b>输出：</b>4
 <b>解释：</b>总共有 4 个不同的好子数组：
 - [3,1,4,3,2,2] 有 2 对。
 - [3,1,4,3,2,2,4] 有 3 对。
 - [1,4,3,2,2,4] 有 2 对。
 - [4,3,2,2,4] 有 2 对。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i], k &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class CountTheNumberOfGoodSubarrays {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> cnt = new HashMap<>();
        long res = 0, pair = 0;

        for (int l = 0, r = 0; r < nums.length; r++) {
            pair += (cnt.merge(nums[r], 1, Integer::sum) - 1);

            while (pair >= k) {
                pair -= cnt.merge(nums[l++], -1, Integer::sum);
            }

            res += l;
        }
        return res;
    }
}
