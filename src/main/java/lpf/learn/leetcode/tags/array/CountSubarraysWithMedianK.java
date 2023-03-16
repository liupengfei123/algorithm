package lpf.learn.leetcode.tags.array;

import java.util.HashMap;
import java.util.Map;

/** 2488 统计中位数为 K 的子数组
 <p>给你一个长度为 <code>n</code> 的数组 <code>nums</code> ，该数组由从 <code>1</code> 到 <code>n</code> 的 <strong>不同</strong> 整数组成。另给你一个正整数 <code>k</code> 。</p>
 <p>统计并返回 <code>nums</code> 中的 <strong>中位数</strong> 等于 <code>k</code> 的非空子数组的数目。</p>
 <p><strong>注意：</strong></p>
 <ul>
 <li>数组的中位数是按 <strong>递增</strong> 顺序排列后位于 <strong>中间</strong> 的那个元素，如果数组长度为偶数，则中位数是位于中间靠 <strong>左</strong> 的那个元素。
 <ul>
 <li>例如，<code>[2,3,1,4]</code> 的中位数是 <code>2</code> ，<code>[8,4,3,5,1]</code> 的中位数是 <code>4</code> 。</li>
 </ul>
 </li>
 <li>子数组是数组中的一个连续部分。</li>
 </ul>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [3,2,1,4,5], k = 4
 <strong>输出：</strong>3
 <strong>解释：</strong>中位数等于 4 的子数组有：[4]、[4,5] 和 [1,4,5] 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [2,3,1], k = 3
 <strong>输出：</strong>1
 <strong>解释：</strong>[3] 是唯一一个中位数等于 3 的子数组。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == nums.length</code></li>
 <li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i], k &lt;= n</code></li>
 <li><code>nums</code> 中的整数互不相同</li>
 </ul>
 */

public class CountSubarraysWithMedianK {
    public int countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int ki = -1;
        for (int i = 0; i < n; i++)
            if (nums[i] == k) {
                ki = i;
                break;
            }

        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        int sum = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.compare(nums[i], k);

            if (i < ki) {
                counts.merge(sum, 1, Integer::sum);
            } else {
                int prev0 = counts.getOrDefault(sum, 0);
                int prev1 = counts.getOrDefault(sum - 1, 0);
                result += prev0 + prev1;
            }
        }
        return result;
    }
}
