package lpf.learn.leetcode.game.weekly355;

/** [2789] 合并后数组中的最大元素
 <p>给你一个下标从 <strong>0</strong> 开始、由正整数组成的数组 <code>nums</code> 。</p>
 <p>你可以在数组上执行下述操作 <strong>任意</strong> 次：</p>
 <ul>
 <li>选中一个同时满足&nbsp;<code>0 &lt;= i &lt; nums.length - 1</code> 和 <code>nums[i] &lt;= nums[i + 1]</code> 的整数 <code>i</code> 。将元素 <code>nums[i + 1]</code> 替换为 <code>nums[i] + nums[i + 1]</code> ，并从数组中删除元素 <code>nums[i]</code> 。</li>
 </ul>
 <p>返回你可以从最终数组中获得的 <strong>最大</strong> 元素的值。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>nums = [2,3,7,9,3]
 <strong>输出：</strong>21
 <strong>解释：</strong>我们可以在数组上执行下述操作：
 - 选中 i = 0 ，得到数组 nums = [<strong><em>5</em></strong>,7,9,3] 。
 - 选中 i = 1 ，得到数组 nums = [5,<em><strong>16</strong></em>,3] 。
 - 选中 i = 0 ，得到数组 nums = [<em><strong>21</strong></em>,3] 。
 最终数组中的最大元素是 21 。可以证明我们无法获得更大的元素。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>nums = [5,3,3]
 <strong>输出：</strong>11
 <strong>解释：</strong>我们可以在数组上执行下述操作：
 - 选中 i = 1 ，得到数组 nums = [5,<em><strong>6</strong></em>] 。
 - 选中 i = 0 ，得到数组 nums = [<em><strong>11</strong></em>] 。
 最终数组中只有一个元素，即 11 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
 </ul>
 */
public class LargestElementInAnArrayAfterMergeOperations {
    public long maxArrayValue(int[] nums) {
        long res = nums[nums.length - 1], sum = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] <= sum) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }

            res = Math.max(res, sum);
        }
        return res;
    }
}
