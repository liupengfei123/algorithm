package lpf.learn.leetcode.tags.bitoperation;

/** 3097 或值至少为 K 的最短子数组 II
 <p>给你一个 <strong>非负</strong>&nbsp;整数数组&nbsp;<code>nums</code>&nbsp;和一个整数&nbsp;<code>k</code>&nbsp;。</p>
 <p>如果一个数组中所有元素的按位或运算 <code>OR</code>&nbsp;的值 <strong>至少</strong>&nbsp;为 <code>k</code>&nbsp;，那么我们称这个数组是 <strong>特别的</strong>&nbsp;。</p>
 <p>请你返回&nbsp;<code>nums</code>&nbsp;中&nbsp;<strong>最短特别非空</strong>&nbsp;<span data-keyword="subarray-nonempty">子数组</span>的长度，如果特别子数组不存在，那么返回 <code>-1</code>&nbsp;。</p>

 <p><strong class="example">示例 1：</strong></p>
 <div class="example-block">
 <p><span class="example-io"><b>输入：</b>nums = [1,2,3], k = 2</span></p>
 </div>
 <p><span class="example-io"><b>输出：</b>1</span></p>
 <p><strong>解释：</strong></p>
 <p>子数组&nbsp;<code>[3]</code>&nbsp;的按位&nbsp;<code>OR</code> 值为&nbsp;<code>3</code>&nbsp;，所以我们返回 <code>1</code>&nbsp;。</p>

 <p><strong class="example">示例 2：</strong></p>
 <div class="example-block">
 <p><span class="example-io"><b>输入：</b>nums = [2,1,8], k = 10</span></p>
 </div>
 <p><span class="example-io"><b>输出：</b>3</span></p>
 <p><strong>解释：</strong></p>
 <p>子数组&nbsp;<code>[2,1,8]</code> 的按位&nbsp;<code>OR</code>&nbsp;值为 <code>11</code>&nbsp;，所以我们返回 <code>3</code>&nbsp;。</p>

 <p><strong class="example">示例 3：</strong></p>
 <div class="example-block">
 <p><span class="example-io"><b>输入：</b>nums = [1,2], k = 0</span></p>
 </div>
 <p><span class="example-io"><b>输出：</b>1</span></p>
 <p><b>解释：</b></p>
 <p>子数组&nbsp;<code>[1]</code>&nbsp;的按位&nbsp;<code>OR</code>&nbsp;值为&nbsp;<code>1</code>&nbsp;，所以我们返回&nbsp;<code>1</code>&nbsp;。</p>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 2 * 10<sup>5</sup></code></li>
 <li><code>0 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 <li><code>0 &lt;= k &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class ShortestSubarrayWithOrAtLeastKIi {
    public int minimumSubarrayLength(int[] nums, int k) {
        // todo
        int allOr = 0;
        for (int num : nums) {
            if (num >= k) return 1;
            allOr |= num;
        }
        if (allOr < k) return -1;

        int n = nums.length, res = n + 1;
        int[] bitCnt = new int[32];
        for (int l = 0, r = 0; r < n; r++) {
            int val = comAndGet(bitCnt, nums[r], 1);

            while (l <= r && val >= k) {
                res = Math.min(res, r - l + 1);
                val = comAndGet(bitCnt, nums[l++], -1);
            }
        }
        return res;
    }

    private int comAndGet(int[] bitCnt, int num, int flag) {
        for (int i = 0; i < bitCnt.length & num > 0; i++, num >>= 1) {
            if ((num & 1) > 0) bitCnt[i] += flag;
        }

        int res = 0;
        for (int i = 0; i < bitCnt.length; i++) {
            if (bitCnt[i] > 0) res |= 1 << i;
        }
        return res;
    }


}
