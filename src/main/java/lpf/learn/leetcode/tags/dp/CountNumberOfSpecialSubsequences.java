package lpf.learn.leetcode.tags.dp;

/** 1955 统计特殊子序列的数目
 * <p><strong>特殊序列</strong> 是由&nbsp;<strong>正整数</strong>&nbsp;个 <code>0</code>&nbsp;，紧接着&nbsp;<strong>正整数</strong>&nbsp;个 <code>1</code>&nbsp;，最后 <strong>正整数</strong>&nbsp;个 <code>2</code>&nbsp;组成的序列。</p>
 * <ul>
 * 	<li>比方说，<code>[0,1,2]</code> 和&nbsp;<code>[0,0,1,1,1,2]</code>&nbsp;是特殊序列。</li>
 * 	<li>相反，<code>[2,1,0]</code>&nbsp;，<code>[1]</code>&nbsp;和&nbsp;<code>[0,1,2,0]</code>&nbsp;就不是特殊序列。</li>
 * </ul>
 * <p>给你一个数组&nbsp;<code>nums</code>&nbsp;（<strong>仅</strong>&nbsp;包含整数&nbsp;<code>0</code>，<code>1</code>&nbsp;和&nbsp;<code>2</code>），请你返回 <b>不同特殊子序列的数目</b>&nbsp;。由于答案可能很大，请你将它对&nbsp;<code>10<sup>9</sup> + 7</code> <strong>取余</strong> 后返回。</p>
 * <p>一个数组的 <strong>子序列</strong>&nbsp;是从原数组中删除零个或者若干个元素后，剩下元素不改变顺序得到的序列。如果两个子序列的 <strong>下标集合</strong>&nbsp;不同，那么这两个子序列是 <strong>不同的</strong>&nbsp;。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <b>输入：</b>nums = [0,1,2,2]
 * <b>输出：</b>3
 * <b>解释：</b>特殊子序列为 [<strong>0</strong>,<strong>1</strong>,<strong>2</strong>,2]，[<strong>0</strong>,<strong>1</strong>,2,<strong>2</strong>] 和 [<strong>0</strong>,<strong>1</strong>,<strong>2</strong>,<strong>2</strong>] 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre>
 * <b>输入：</b>nums = [2,2,0,0]
 * <b>输出：</b>0
 * <b>解释：</b>数组 [2,2,0,0] 中没有特殊子序列。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 * <pre>
 * <b>输入：</b>nums = [0,1,2,0,1,2]
 * <b>输出：</b>7
 * <b>解释：</b>特殊子序列包括：
 * - [<strong>0</strong>,<strong>1</strong>,<strong>2</strong>,0,1,2]
 * - [<strong>0</strong>,<strong>1</strong>,2,0,1,<strong>2</strong>]
 * - [<strong>0</strong>,<strong>1</strong>,<strong>2</strong>,0,1,<strong>2</strong>]
 * - [<strong>0</strong>,<strong>1</strong>,2,0,<strong>1</strong>,<strong>2</strong>]
 * - [<strong>0</strong>,1,2,<strong>0</strong>,<strong>1</strong>,<strong>2</strong>]
 * - [<strong>0</strong>,1,2,0,<strong>1</strong>,<strong>2</strong>]
 * - [0,1,2,<strong>0</strong>,<strong>1</strong>,<strong>2</strong>]
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 * 	<li><code>0 &lt;= nums[i] &lt;= 2</code></li>
 * </ul>
 */
public class CountNumberOfSpecialSubsequences {
    public int countSpecialSubsequences(int[] nums) {
        int mod = 1000_000_007;
        int[] dp = new int[4];
        dp[0] = 1;

        // dp[i][0] 表示 前 i 个数字有 几个 0 的 特殊序列
        // dp[i][1] 表示 前 i 个数字有 几个 1 的 特殊序列
        // dp[i][2] 表示 前 i 个数字有 几个 2 的 特殊序列 dp[i][2] = dp[i - 1][2](前几个不加上 第 i 位的个数)
        //                                                      + dp[i - 1][2](前几个加上 第 i 位的个数)
        //                                                      + dp[i - 1][1](前几个 1 加上 第 i 位的个数 新增的)
        for (int num : nums) {
            int index = num + 1;
            dp[index] = (dp[index] + dp[index]) % mod;
            dp[index] = (dp[index] + dp[index - 1]) % mod;
        }

        return dp[3];
    }
}
