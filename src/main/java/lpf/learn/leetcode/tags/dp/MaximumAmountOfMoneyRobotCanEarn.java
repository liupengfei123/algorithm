package lpf.learn.leetcode.tags.dp;


import java.util.Arrays;

/** 3418 机器人可以获得的最大金币数
 <p>给你一个 <code>m x n</code> 的网格。一个机器人从网格的左上角 <code>(0, 0)</code> 出发，目标是到达网格的右下角 <code>(m - 1, n - 1)</code>。在任意时刻，机器人只能向右或向下移动。</p>
 <p>网格中的每个单元格包含一个值 <code>coins[i][j]</code>：</p>
 <ul>
 <li>如果 <code>coins[i][j] &gt;= 0</code>，机器人可以获得该单元格的金币。</li>
 <li>如果 <code>coins[i][j] &lt; 0</code>，机器人会遇到一个强盗，强盗会抢走该单元格数值的&nbsp;<strong>绝对值</strong> 的金币。</li>
 </ul>
 <p>机器人有一项特殊能力，可以在行程中&nbsp;<strong>最多感化&nbsp;</strong>2个单元格的强盗，从而防止这些单元格的金币被抢走。</p>
 <p><strong>注意：</strong>机器人的总金币数可以是负数。</p>
 <p>返回机器人在路径上可以获得的&nbsp;<strong>最大金币数&nbsp;</strong>。</p>

 <p><strong class="example">示例 1：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong> <span class="example-io">coins = [[0,1,-1],[1,-2,3],[2,-3,4]]</span></p>
 </div>
 <p><strong>输出：</strong> <span class="example-io">8</span></p>
 <p><strong>解释：</strong></p>
 <p>一个获得最多金币的最优路径如下：</p>
 <ol>
 <li>从 <code>(0, 0)</code> 出发，初始金币为 <code>0</code>（总金币 = <code>0</code>）。</li>
 <li>移动到 <code>(0, 1)</code>，获得 <code>1</code> 枚金币（总金币 = <code>0 + 1 = 1</code>）。</li>
 <li>移动到 <code>(1, 1)</code>，遇到强盗抢走 <code>2</code> 枚金币。机器人在此处使用一次感化能力，避免被抢（总金币 = <code>1</code>）。</li>
 <li>移动到 <code>(1, 2)</code>，获得 <code>3</code> 枚金币（总金币 = <code>1 + 3 = 4</code>）。</li>
 <li>移动到 <code>(2, 2)</code>，获得 <code>4</code> 枚金币（总金币 = <code>4 + 4 = 8</code>）。</li>
 </ol>

 <p><strong class="example">示例 2：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong> <span class="example-io">coins = [[10,10,10],[10,10,10]]</span></p>
 </div>
 <p><strong>输出：</strong> <span class="example-io">40</span></p>
 <p><strong>解释：</strong></p>
 <p>一个获得最多金币的最优路径如下：</p>
 <ol>
 <li>从 <code>(0, 0)</code> 出发，初始金币为 <code>10</code>（总金币 = <code>10</code>）。</li>
 <li>移动到 <code>(0, 1)</code>，获得 <code>10</code> 枚金币（总金币 = <code>10 + 10 = 20</code>）。</li>
 <li>移动到 <code>(0, 2)</code>，再获得 <code>10</code> 枚金币（总金币 = <code>20 + 10 = 30</code>）。</li>
 <li>移动到 <code>(1, 2)</code>，获得 <code>10</code> 枚金币（总金币 = <code>30 + 10 = 40</code>）。</li>
 </ol>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == coins.length</code></li>
 <li><code>n == coins[i].length</code></li>
 <li><code>1 &lt;= m, n &lt;= 500</code></li>
 <li><code>-1000 &lt;= coins[i][j] &lt;= 1000</code></li>
 </ul>
 */
public class MaximumAmountOfMoneyRobotCanEarn {
    public int maximumAmount(int[][] coins) {
        int n = coins.length, m = coins[0].length;
        int[][] dp = new int[m + 1][3], ndp;
        for (int j = 0; j <= m; j++) Arrays.fill(dp[j], -90000000);
        Arrays.fill(dp[1], 0);

        for (int[] coin : coins) {
            ndp = new int[m + 1][3];
            Arrays.fill(ndp[0], -90000000);

            for (int j = 0; j < m; j++) {
                for (int x = 0; x < 3; x++) ndp[j + 1][x] = coin[j] + Math.max(ndp[j][x], dp[j + 1][x]);
                if (coin[j] < 0) {
                    ndp[j + 1][1] = Math.max(ndp[j + 1][1], Math.max(ndp[j][0], dp[j + 1][0]));
                    ndp[j + 1][2] = Math.max(ndp[j + 1][2], Math.max(ndp[j][1], dp[j + 1][1]));
                }
            }
            dp = ndp;
        }
        return Math.max(dp[m][0], Math.max(dp[m][1], dp[m][2]));
    }
}
