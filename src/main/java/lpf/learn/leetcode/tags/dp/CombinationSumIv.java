package lpf.learn.leetcode.tags.dp;


/** 377 组合总和 Ⅳ
 <p>给你一个由 <strong>不同</strong> 整数组成的数组 <code>nums</code> ，和一个目标整数 <code>target</code> 。请你从 <code>nums</code> 中找出并返回总和为 <code>target</code> 的元素组合的个数。</p>
 <p>题目数据保证答案符合 32 位整数范围。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,2,3], target = 4
 <strong>输出：</strong>7
 <strong>解释：</strong>
 所有可能的组合为：
 (1, 1, 1, 1)
 (1, 1, 2)
 (1, 2, 1)
 (1, 3)
 (2, 1, 1)
 (2, 2)
 (3, 1)
 请注意，顺序不同的序列被视作不同的组合。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [9], target = 3
 <strong>输出：</strong>0
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 200</code></li>
 <li><code>1 &lt;= nums[i] &lt;= 1000</code></li>
 <li><code>nums</code> 中的所有元素 <strong>互不相同</strong></li>
 <li><code>1 &lt;= target &lt;= 1000</code></li>
 </ul>

 <p><strong>进阶：</strong>如果给定的数组中含有负数会发生什么？问题会产生何种变化？如果允许负数出现，需要向题目中添加哪些限制条件？</p>
 */
public class CombinationSumIv {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) dp[i] += dp[i - num];
            }
        }
        return dp[target];
    }

}
