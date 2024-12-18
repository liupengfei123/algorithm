package lpf.learn.leetcode.tags.slidingwindow;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/** 2799 统计完全子数组的数目
 <p>给你一个由 <strong>正</strong> 整数组成的数组 <code>nums</code> 。</p>
 <p>如果数组中的某个子数组满足下述条件，则称之为 <strong>完全子数组</strong> ：</p>
 <ul>
 <li>子数组中 <strong>不同</strong> 元素的数目等于整个数组不同元素的数目。</li>
 </ul>
 <p>返回数组中 <strong>完全子数组</strong> 的数目。</p>
 <p><strong>子数组</strong> 是数组中的一个连续非空序列。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>nums = [1,3,1,2,2]
 <strong>输出：</strong>4
 <strong>解释：</strong>完全子数组有：[1,3,1,2]、[1,3,1,2,2]、[3,1,2] 和 [3,1,2,2] 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>nums = [5,5,5,5]
 <strong>输出：</strong>10
 <strong>解释：</strong>数组仅由整数 5 组成，所以任意子数组都满足完全子数组的条件。子数组的总数为 10 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 1000</code></li>
 <li><code>1 &lt;= nums[i] &lt;= 2000</code></li>
 </ul>
 */
public class CountCompleteSubarraysInAnArray {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        Map<Integer, Integer> cnt = new HashMap<>();
        int n = nums.length, t = set.size(), res = 0;

        for (int l = 0, r = 0; r < n; r++) {
            cnt.merge(nums[r], 1, Integer::sum);

            while (cnt.size() == t) {
                cnt.merge(nums[l++], -1, (a, b) -> (a += b) == 0 ? null : a);
            }

            res += l;
        }
        return res;
    }
}
