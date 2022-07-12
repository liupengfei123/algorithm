package lpf.learn.leetcode.game.weekly301;

import java.util.ArrayList;
import java.util.List;

/** [2338] 统计理想数组的数目
 * <p>给你两个整数 <code>n</code> 和 <code>maxValue</code> ，用于描述一个 <strong>理想数组</strong> 。</p>
 * <p>对于下标从 <strong>0</strong> 开始、长度为 <code>n</code> 的整数数组 <code>arr</code> ，如果满足以下条件，则认为该数组是一个 <strong>理想数组</strong> ：</p>
 * <ul>
 * 	<li>每个 <code>arr[i]</code> 都是从 <code>1</code> 到 <code>maxValue</code> 范围内的一个值，其中 <code>0 &lt;= i &lt; n</code> 。</li>
 * 	<li>每个 <code>arr[i]</code> 都可以被 <code>arr[i - 1]</code> 整除，其中 <code>0 &lt; i &lt; n</code> 。</li>
 * </ul>
 *
 * <p>返回长度为 <code>n</code> 的 <strong>不同</strong> 理想数组的数目。由于答案可能很大，返回对 <code>10<sup>9</sup> + 7</code> 取余的结果。</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>n = 2, maxValue = 5
 * <strong>输出：</strong>10
 * <strong>解释：</strong>存在以下理想数组：
 * - 以 1 开头的数组（5 个）：[1,1]、[1,2]、[1,3]、[1,4]、[1,5]
 * - 以 2 开头的数组（2 个）：[2,2]、[2,4]
 * - 以 3 开头的数组（1 个）：[3,3]
 * - 以 4 开头的数组（1 个）：[4,4]
 * - 以 5 开头的数组（1 个）：[5,5]
 * 共计 5 + 2 + 1 + 1 + 1 = 10 个不同理想数组。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre><strong>输入：</strong>n = 5, maxValue = 3
 * <strong>输出：</strong>11
 * <strong>解释：</strong>存在以下理想数组：
 * - 以 1 开头的数组（9 个）：
 *    - 不含其他不同值（1 个）：[1,1,1,1,1]
 *    - 含一个不同值 2（4 个）：[1,1,1,1,2], [1,1,1,2,2], [1,1,2,2,2], [1,2,2,2,2]
 *    - 含一个不同值 3（4 个）：[1,1,1,1,3], [1,1,1,3,3], [1,1,3,3,3], [1,3,3,3,3]
 * - 以 2 开头的数组（1 个）：[2,2,2,2,2]
 * - 以 3 开头的数组（1 个）：[3,3,3,3,3]
 * 共计 9 + 1 + 1 = 11 个不同理想数组。
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>2 &lt;= n &lt;= 10<sup>4</sup></code></li>
 * 	<li><code>1 &lt;= maxValue &lt;= 10<sup>4</sup></code></li>
 * </ul>
 */
public class CountTheNumberOfIdealArrays {
    public int idealArrays(int n, int maxValue) {
        int mod = 1000_000_007;
        int maxK = 1;

        List<Integer>[] dp = new List[maxValue + 1];
        for (int i = 1; i <= maxValue; i++) {
            dp[i] = new ArrayList<>();
            int temp = i;
            for (int p = 2; p * p <= temp; p++) {
                if (temp % p == 0) {
                    int k = 1;
                    for (temp /= p; temp % p == 0; temp /= p) ++k;
                    dp[i].add(k);
                    maxK = Math.max(k, maxK);
                }
            }
            if (temp > 1) dp[i].add(1);
        }


        int[][] cdp = new int[n + maxK + 2][maxK + 1];
        cdp[0][0] = 1;

        for (int i = 1; i < cdp.length; i++) {
            cdp[i][0] = 1;
            for (int j = 1; j <= maxK && j <= i; j++) {
                cdp[i][j] = (cdp[i - 1][j] + cdp[i - 1][j - 1]) % mod;
            }
        }

        long result = 0;
        for (int i = 1; i <= maxValue; i++) {
            long temp = 1;
            for (Integer k : dp[i]) {
                temp = (temp * cdp[n + k - 1][k]) % mod;
            }

            result = (result + temp) % mod;
        }
        return (int) result;
    }
}
