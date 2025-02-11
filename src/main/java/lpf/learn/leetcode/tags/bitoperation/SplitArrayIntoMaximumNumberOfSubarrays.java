package lpf.learn.leetcode.tags.bitoperation;


/** 2871 将数组分割成最多数目的子数组
 <p>给你一个只包含 <strong>非负</strong>&nbsp;整数的数组&nbsp;<code>nums</code>&nbsp;。</p>
 <p>我们定义满足 <code>l &lt;= r</code>&nbsp;的子数组&nbsp;<code>nums[l..r]</code>&nbsp;的分数为&nbsp;<code>nums[l] AND nums[l + 1] AND ... AND nums[r]</code>&nbsp;，其中&nbsp;<strong>AND</strong>&nbsp;是按位与运算。</p>
 <p>请你将数组分割成一个或者更多子数组，满足：</p>
 <ul>
 <li><strong>每个</strong> 元素都&nbsp;<strong>只</strong>&nbsp;属于一个子数组。</li>
 <li>子数组分数之和尽可能<strong>&nbsp;小</strong>&nbsp;。</li>
 </ul>
 <p>请你在满足以上要求的条件下，返回<strong>&nbsp;最多</strong>&nbsp;可以得到多少个子数组。</p>
 <p>一个 <strong>子数组</strong>&nbsp;是一个数组中一段连续的元素。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <b>输入：</b>nums = [1,0,2,0,1,2]
 <b>输出：</b>3
 <strong>解释：</strong>我们可以将数组分割成以下子数组：
 - [1,0] 。子数组分数为 1 AND 0 = 0 。
 - [2,0] 。子数组分数为 2 AND 0 = 0 。
 - [1,2] 。子数组分数为 1 AND 2 = 0 。
 分数之和为 0 + 0 + 0 = 0 ，是我们可以得到的最小分数之和。
 在分数之和为 0 的前提下，最多可以将数组分割成 3 个子数组。所以返回 3 。
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <b>输入：</b>nums = [5,7,1,3]
 <b>输出：</b>1
 <b>解释：</b>我们可以将数组分割成一个子数组：[5,7,1,3] ，分数为 1 ，这是可以得到的最小总分数。
 在总分数为 1 的前提下，最多可以将数组分割成 1 个子数组。所以返回 1 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>0 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
 </ul>
 */
public class SplitArrayIntoMaximumNumberOfSubarrays {
    public int maxSubarrays(int[] nums) {
        int res = 0, val = -1;
        for (int num : nums) {
            val &= num;
            if (val == 0) {
                res++;
                val = -1;
            }
        }
        return Math.max(res, 1);
    }
}
