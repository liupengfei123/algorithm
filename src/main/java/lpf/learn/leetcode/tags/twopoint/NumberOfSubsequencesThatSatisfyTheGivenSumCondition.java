package lpf.learn.leetcode.tags.twopoint;


import java.util.Arrays;

/** [1498]满足条件的子序列数目
 <p>给你一个整数数组 <code>nums</code> 和一个整数 <code>target</code> 。</p>
 <p>请你统计并返回 <code>nums</code> 中能满足其最小元素与最大元素的 <strong>和</strong> 小于或等于 <code>target</code> 的 <strong>非空</strong> 子序列的数目。</p>
 <p>由于答案可能很大，请将结果对
 <meta charset="UTF-8" />&nbsp;<code>10<sup>9</sup>&nbsp;+ 7</code>&nbsp;取余后返回。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [3,5,6,7], target = 9
 <strong>输出：</strong>4
 <strong>解释：</strong>有 4 个子序列满足该条件。
 [3] -&gt; 最小元素 + 最大元素 &lt;= target (3 + 3 &lt;= 9)
 [3,5] -&gt; (3 + 5 &lt;= 9)
 [3,5,6] -&gt; (3 + 6 &lt;= 9)
 [3,6] -&gt; (3 + 6 &lt;= 9)
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [3,3,6,8], target = 10
 <strong>输出：</strong>6
 <strong>解释：</strong>有 6 个子序列满足该条件。（nums 中可以有重复数字）
 [3] , [3] , [3,3], [3,6] , [3,6] , [3,3,6]</pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [2,3,3,4,6,7], target = 12
 <strong>输出：</strong>61
 <strong>解释：</strong>共有 63 个非空子序列，其中 2 个不满足条件（[6,7], [7]）
 有效序列总数为（63 - 2 = 61）
 </pre>

 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
 <li><code>1 &lt;= target &lt;= 10<sup>6</sup></code></li>
 </ul>
 */
public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length, mod = 1000000007;
        long res = 0;

        for (int l = 0, r = n - 1; l <= r; l++) {
            while (l <= r && nums[l] + nums[r] > target) {
                r--;
            }
            if (l > r) continue;

            res = (res + power(2, r - l, mod)) % mod;
        }
        return (int) res;
    }
    // 快速幂算法
    private static long power(long base, int exponent, int mod) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {  // 如果指数是奇数
                result = (result * base) % mod;
            }
            base = (base * base) % mod;  // 每次将底数平方
            exponent /= 2;  // 将指数减半
        }
        return result % mod;
    }
}
