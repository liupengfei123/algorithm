package lpf.learn.leetcode.tags.slidingwindow;


/** 1493 删掉一个元素以后全为 1 的最长子数组
 <p>给你一个二进制数组&nbsp;<code>nums</code>&nbsp;，你需要从中删掉一个元素。</p>
 <p>请你在删掉元素的结果数组中，返回最长的且只包含 1 的非空子数组的长度。</p>
 <p>如果不存在这样的子数组，请返回 0 。</p>

 <p><strong>提示 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,1,0,1]
 <strong>输出：</strong>3
 <strong>解释：</strong>删掉位置 2 的数后，[1,1,1] 包含 3 个 1 。</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [0,1,1,1,0,1,1,0,1]
 <strong>输出：</strong>5
 <strong>解释：</strong>删掉位置 4 的数字后，[0,1,1,1,1,1,0,1] 的最长全 1 子数组为 [1,1,1,1,1] 。</pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,1,1]
 <strong>输出：</strong>2
 <strong>解释：</strong>你必须要删除一个元素。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>nums[i]</code>&nbsp;要么是&nbsp;<code>0</code>&nbsp;要么是&nbsp;<code>1</code> 。</li>
 </ul>
 */
public class LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int n = nums.length, res = 0, cnt = 0;

        for (int l = 0, r = 0; r < n; r++) {
            cnt += 1 - nums[r];

            while (cnt > 1) cnt -= 1 - nums[l++];

            res = Math.max(res, r - l + 1);
        }
        return res - 1;
    }
}
