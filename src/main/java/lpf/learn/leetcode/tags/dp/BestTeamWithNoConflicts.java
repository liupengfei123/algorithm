package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;
import java.util.Comparator;

/** 1626 无矛盾的最佳球队
 <p>假设你是球队的经理。对于即将到来的锦标赛，你想组合一支总体得分最高的球队。球队的得分是球队中所有球员的分数 <strong>总和</strong> 。</p>
 <p>然而，球队中的矛盾会限制球员的发挥，所以必须选出一支 <strong>没有矛盾</strong> 的球队。如果一名年龄较小球员的分数 <strong>严格大于</strong> 一名年龄较大的球员，则存在矛盾。同龄球员之间不会发生矛盾。</p>
 <p>给你两个列表 <code>scores</code> 和 <code>ages</code>，其中每组 <code>scores[i]</code> 和 <code>ages[i]</code> 表示第 <code>i</code> 名球员的分数和年龄。请你返回 <strong>所有可能的无矛盾球队中得分最高那支的分数</strong> 。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>scores = [1,3,5,10,15], ages = [1,2,3,4,5]
 <strong>输出：</strong>34
 <strong>解释：</strong>你可以选中所有球员。</pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>scores = [4,5,6,5], ages = [2,1,2,1]
 <strong>输出：</strong>16
 <strong>解释：</strong>最佳的选择是后 3 名球员。注意，你可以选中多个同龄球员。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>scores = [1,2,3,5], ages = [8,9,10,1]
 <strong>输出：</strong>6
 <strong>解释：</strong>最佳的选择是前 3 名球员。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= scores.length, ages.length &lt;= 1000</code></li>
 <li><code>scores.length == ages.length</code></li>
 <li><code>1 &lt;= scores[i] &lt;= 10<sup>6</sup></code></li>
 <li><code>1 &lt;= ages[i] &lt;= 1000</code></li>
 </ul>
 */
public class BestTeamWithNoConflicts {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        int[][] peoples = new int[n][2];
        for (int i = 0; i < n; i++) {
            peoples[i][0] = scores[i];
            peoples[i][1] = ages[i];
        }
        Arrays.sort(peoples, Comparator.comparing((int[] a) -> a[1]).thenComparing((int[] a)  -> a[0]));

        int[] dp = new int[n];
        int res = dp[0] = peoples[0][0];

        for (int i = 1; i < n; i++) {
            dp[i] = peoples[i][0];
            for (int j = 0; j < i; j++) {
                if (peoples[j][0]>peoples[i][0] && peoples[j][1]<peoples[i][1]) continue;
                dp[i] = Math.max(dp[i], peoples[i][0] + dp[j]);
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
