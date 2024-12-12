package lpf.learn.leetcode.tags.twopoint;


/** 2444 统计定界子数组的数目
 <p>给你一个整数数组 <code>nums</code> 和两个整数 <code>minK</code> 以及 <code>maxK</code> 。</p>
 <p><code>nums</code> 的定界子数组是满足下述条件的一个子数组：</p>
 <ul>
 <li>子数组中的 <strong>最小值</strong> 等于 <code>minK</code> 。</li>
 <li>子数组中的 <strong>最大值</strong> 等于 <code>maxK</code> 。</li>
 </ul>

 <p>返回定界子数组的数目。</p>
 <p>子数组是数组中的一个连续部分。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>nums = [1,3,5,2,7,5], minK = 1, maxK = 5
 <strong>输出：</strong>2
 <strong>解释：</strong>定界子数组是 [1,3,5] 和 [1,3,5,2] 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>nums = [1,1,1,1], minK = 1, maxK = 1
 <strong>输出：</strong>10
 <strong>解释：</strong>nums 的每个子数组都是一个定界子数组。共有 10 个子数组。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>2 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i], minK, maxK &lt;= 10<sup>6</sup></code></li>
 </ul>
 */
public class CountSubarraysWithFixedBounds {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length, lastN = -1, lastI = -1, lastX = -1;
        long res = 0;

        for (int r = 0; r < n; r++) {
            int num = nums[r];
            if (num < minK || num > maxK) {
                lastN = r;
                lastI = lastX = -1;
            }
            if (num == minK) lastI = r;
            if (num == maxK) lastX = r;

            if (lastI != -1 && lastX != -1) {
                res += Math.min(lastI, lastX) - lastN;
            }
        }
        return res;
    }
}
