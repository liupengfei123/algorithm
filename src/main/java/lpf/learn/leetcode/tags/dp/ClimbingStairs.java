package lpf.learn.leetcode.tags.dp;


/** 70 爬楼梯
 <p>假设你正在爬楼梯。需要 <code>n</code>&nbsp;阶你才能到达楼顶。</p>
 <p>每次你可以爬 <code>1</code> 或 <code>2</code> 个台阶。你有多少种不同的方法可以爬到楼顶呢？</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>n = 2
 <strong>输出：</strong>2
 <strong>解释：</strong>有两种方法可以爬到楼顶。
 1. 1 阶 + 1 阶
 2. 2 阶</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>n = 3
 <strong>输出：</strong>3
 <strong>解释：</strong>有三种方法可以爬到楼顶。
 1. 1 阶 + 1 阶 + 1 阶
 2. 1 阶 + 2 阶
 3. 2 阶 + 1 阶
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n &lt;= 45</code></li>
 </ul>
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
