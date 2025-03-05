package lpf.learn.leetcode.tags.dp;


/** 198 打家劫舍
 <p>你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，<strong>如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警</strong>。</p>
 <p>给定一个代表每个房屋存放金额的非负整数数组，计算你<strong> 不触动警报装置的情况下 </strong>，一夜之内能够偷窃到的最高金额。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>[1,2,3,1]
 <strong>输出：</strong>4
 <strong>解释：</strong>偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 &nbsp;    偷窃到的最高金额 = 1 + 3 = 4 。</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>[2,7,9,3,1]
 <strong>输出：</strong>12
 <strong>解释：</strong>偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 &nbsp;    偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 100</code></li>
 <li><code>0 &lt;= nums[i] &lt;= 400</code></li>
 </ul>
 */
public class HouseRobber {

    public int rob(int[] nums) {
        int[] dp = new int[2];  // [0] 偷的最大金额， [1] 不偷的最大金额

        for (int num : nums) {
            int v1 = dp[0], v2 = dp[1];
            dp[0] = num + v2;
            dp[1] = Math.max(v1, v2);
        }
        return Math.max(dp[0], dp[1]);
    }
}
