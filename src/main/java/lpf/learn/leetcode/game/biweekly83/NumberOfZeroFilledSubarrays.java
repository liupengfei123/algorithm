package lpf.learn.leetcode.game.biweekly83;


/** [6129] 全 0 子数组的数目
 * <p>给你一个整数数组&nbsp;<code>nums</code>&nbsp;，返回全部为&nbsp;<code>0</code>&nbsp;的&nbsp;<strong>子数组</strong>&nbsp;数目。</p>
 * <p><strong>子数组</strong>&nbsp;是一个数组中一段连续非空元素组成的序列。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre><b>输入：</b>nums = [1,3,0,0,2,0,0,4]
 * <b>输出：</b>6
 * <b>解释：</b>
 * 子数组 [0] 出现了 4 次。
 * 子数组 [0,0] 出现了 2 次。
 * 不存在长度大于 2 的全 0 子数组，所以我们返回 6 。</pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre><b>输入：</b>nums = [0,0,0,2,0,0]
 * <b>输出：</b>9
 * <strong>解释：
 * </strong>子数组 [0] 出现了 5 次。
 * 子数组 [0,0] 出现了 3 次。
 * 子数组 [0,0,0] 出现了 1 次。
 * 不存在长度大于 3 的全 0 子数组，所以我们返回 9 。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 * <pre><b>输入：</b>nums = [2,10,2019]
 * <b>输出：</b>0
 * <b>解释：</b>没有全 0 子数组，所以我们返回 0 。
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 * 	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 * </ul>
 */
public class NumberOfZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                result += zeroCount * (zeroCount + 1) / 2;
                zeroCount = 0;
            }
        }
        result += zeroCount * (zeroCount + 1) / 2;
        return result;
    }
}
