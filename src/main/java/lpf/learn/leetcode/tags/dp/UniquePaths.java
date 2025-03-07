package lpf.learn.leetcode.tags.dp;

/** 62 不同路径
 <p>一个机器人位于一个 <code>m x n</code><em>&nbsp;</em>网格的左上角 （起始点在下图中标记为 “Start” ）。</p>
 <p>机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。</p>
 <p>问总共有多少条不同的路径？</p>

 <p><strong>示例 1：</strong></p>
 <img src="https://pic.leetcode.cn/1697422740-adxmsI-image.png" style="width: 400px; height: 183px;" />
 <pre>
 <strong>输入：</strong>m = 3, n = 7
 <strong>输出：</strong>28</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>m = 3, n = 2
 <strong>输出：</strong>3
 <strong>解释：</strong>
 从左上角开始，总共有 3 条路径可以到达右下角。
 1. 向右 -&gt; 向下 -&gt; 向下
 2. 向下 -&gt; 向下 -&gt; 向右
 3. 向下 -&gt; 向右 -&gt; 向下
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>m = 7, n = 3
 <strong>输出：</strong>28
 </pre>

 <p><strong>示例 4：</strong></p>
 <pre>
 <strong>输入：</strong>m = 3, n = 3
 <strong>输出：</strong>6</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= m, n &lt;= 100</code></li>
 <li>题目数据保证答案小于等于 <code>2 * 10<sup>9</sup></code></li>
 </ul>
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n + 1];
        dp[n - 1] = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                dp[j] = dp[j] + dp[j + 1];
            }
        }
        return dp[0];
    }

}
