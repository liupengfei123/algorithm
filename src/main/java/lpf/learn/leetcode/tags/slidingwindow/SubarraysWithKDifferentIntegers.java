package lpf.learn.leetcode.tags.slidingwindow;


import java.util.HashMap;
import java.util.Map;

/** 992 K 个不同整数的子数组
 <p>给定一个正整数数组 <code>nums</code>和一个整数 <code>k</code>，返回 <code>nums</code> 中 「<strong>好子数组」</strong><em>&nbsp;</em>的数目。</p>
 <p>如果 <code>nums</code>&nbsp;的某个子数组中不同整数的个数恰好为 <code>k</code>，则称 <code>nums</code>&nbsp;的这个连续、不一定不同的子数组为 <strong>「</strong><strong>好子数组 」</strong>。</p>
 <ul>
 <li>例如，<code>[1,2,3,1,2]</code> 中有&nbsp;<code>3</code>&nbsp;个不同的整数：<code>1</code>，<code>2</code>，以及&nbsp;<code>3</code>。</li>
 </ul>

 <p><strong>子数组</strong> 是数组的 <strong>连续</strong> 部分。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,2,1,2,3], k = 2
 <strong>输出：</strong>7
 <strong>解释：</strong>恰好由 2 个不同整数组成的子数组：[1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2].
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,2,1,3,4], k = 3
 <strong>输出：</strong>3
 <strong>解释：</strong>恰好由 3 个不同整数组成的子数组：[1,2,1,3], [2,1,3], [1,3,4].
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 2 * 10<sup>4</sup></code></li>
 <li><code>1 &lt;= nums[i], k &lt;= nums.length</code></li>
 </ul>
 */
public class SubarraysWithKDifferentIntegers {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return solve(nums, k) - solve(nums, k + 1);
    }

    private int solve(int[] nums, int k) {
        int n = nums.length, res = 0, cnt = 0;
        int[] arr = new int[n + 1];

        for (int l = 0, r = 0; r < n; r++) {
            if (arr[nums[r]]++ == 0) cnt++;

            while (cnt >= k) {
                if (--arr[nums[l++]] == 0) cnt--;
            }
            res += l;
        }
        return res;
    }

    private int solve2(int[] nums, int k) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int n = nums.length, res = 0;

        for (int l = 0, r = 0; r < n; r++) {
            cnt.merge(nums[r], 1, Integer::sum);

            while (cnt.size() >= k) {
                cnt.merge(nums[l++], -1, (a, b) -> (a += b) == 0 ? null : a);
            }
            res += l;
        }
        return res;
    }
}
