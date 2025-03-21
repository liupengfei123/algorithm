package lpf.learn.leetcode.tags.slidingwindow;


/** 1004 最大连续1的个数 III
 <p>给定一个二进制数组&nbsp;<code>nums</code>&nbsp;和一个整数 <code>k</code>，如果可以翻转最多 <code>k</code> 个 <code>0</code> ，则返回 <em>数组中连续 <code>1</code> 的最大个数</em> 。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,1,1,0,0,0,1,1,1,1,0], K = 2
 <strong>输出：</strong>6
 <strong>解释：</strong>[1,1,1,0,0,<strong>1</strong>,1,1,1,1,<strong>1</strong>]
 粗体数字从 0 翻转到 1，最长的子数组长度为 6。</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
 <strong>输出：</strong>10
 <strong>解释：</strong>[0,0,1,1,<strong>1</strong>,<strong>1</strong>,1,1,1,<strong>1</strong>,1,1,0,0,0,1,1,1,1]
 粗体数字从 0 翻转到 1，最长的子数组长度为 10。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>nums[i]</code>&nbsp;不是&nbsp;<code>0</code>&nbsp;就是&nbsp;<code>1</code></li>
 <li><code>0 &lt;= k &lt;= nums.length</code></li>
 </ul>
 */
public class MaxConsecutiveOnesIii {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length, res = 0, zero = 0;

        for (int l = 0, r = 0; r < n; r++) {
            if (nums[r] == 0) zero++;

            while (zero > k) {
                if (nums[l++] == 0) zero--;
            }

            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
