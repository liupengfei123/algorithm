package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;

/** 1335 工作计划的最低难度
 <p>你需要制定一份&nbsp;<code>d</code>&nbsp;天的工作计划表。工作之间存在依赖，要想执行第&nbsp;<code>i</code>&nbsp;项工作，你必须完成全部&nbsp;<code>j</code>&nbsp;项工作（&nbsp;<code>0 &lt;= j &lt; i</code>）。</p>
 <p>你每天 <strong>至少</strong>&nbsp;需要完成一项任务。工作计划的总难度是这&nbsp;<code>d</code>&nbsp;天每一天的难度之和，而一天的工作难度是当天应该完成工作的最大难度。</p>
 <p>给你一个整数数组&nbsp;<code>jobDifficulty</code>&nbsp;和一个整数&nbsp;<code>d</code>，分别代表工作难度和需要计划的天数。第&nbsp;<code>i</code>&nbsp;项工作的难度是&nbsp;<code>jobDifficulty[i]</code>。</p>
 <p>返回整个工作计划的 <strong>最小难度</strong> 。如果无法制定工作计划，则返回&nbsp;<strong>-1&nbsp;</strong>。</p>

 <p><strong>示例 1：</strong></p>
 <p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/26/untitled.png" style="height: 304px; width: 365px;"></p>
 <pre><strong>输入：</strong>jobDifficulty = [6,5,4,3,2,1], d = 2
 <strong>输出：</strong>7
 <strong>解释：</strong>第一天，您可以完成前 5 项工作，总难度 = 6.
 第二天，您可以完成最后一项工作，总难度 = 1.
 计划表的难度 = 6 + 1 = 7
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>jobDifficulty = [9,9,9], d = 4
 <strong>输出：</strong>-1
 <strong>解释：</strong>就算你每天完成一项工作，仍然有一天是空闲的，你无法制定一份能够满足既定工作时间的计划表。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>jobDifficulty = [1,1,1], d = 3
 <strong>输出：</strong>3
 <strong>解释：</strong>工作计划为每天一项工作，总难度为 3 。
 </pre>

 <p><strong>示例 4：</strong></p>
 <pre><strong>输入：</strong>jobDifficulty = [7,1,7,1,7,1], d = 3
 <strong>输出：</strong>15
 </pre>

 <p><strong>示例 5：</strong></p>
 <pre><strong>输入：</strong>jobDifficulty = [11,111,22,222,33,333,44,444], d = 6
 <strong>输出：</strong>843
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= jobDifficulty.length &lt;= 300</code></li>
 <li><code>0 &lt;=&nbsp;jobDifficulty[i] &lt;= 1000</code></li>
 <li><code>1 &lt;= d &lt;= 10</code></li>
 </ul>
 */
public class MinimumDifficultyOfAJobSchedule {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if (n < d) return -1;

        int[][] dp = new int[n + 1][d + 1];

        for (int i = 0; i <= n; i++) Arrays.fill(dp[i], Integer.MAX_VALUE >>> 1);
        Arrays.fill(dp[0], 0);
        dp[1][1] = jobDifficulty[0];

        for (int i = 2; i <= n; i++) {
            for (int j = Math.min(i + 1, d); j > 0; j--) {
                int max = 0;
                dp[i][j] = dp[i - 1][j - 1] + jobDifficulty[i - 1];

                for (int k = i; k > j - 1; k--) {
                    max = Math.max(max, jobDifficulty[k - 1]);

                    dp[i][j] = Math.min(dp[i][j], dp[k - 1][j - 1] + max);
                }
            }
        }

        return dp[n][d];
    }
}
