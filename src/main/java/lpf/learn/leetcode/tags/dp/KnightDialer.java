package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;

/** [935]骑士拨号器
 * 国际象棋中的骑士可以按下图所示进行移动： 图片
 *
 * 这一次，我们将 “骑士” 放在电话拨号盘的任意数字键（如上图所示）上，接下来，骑士将会跳 N-1 步。每一步必须是从一个数字键跳到另一个数字键。
 * 每当它落在一个键上（包括骑士的初始位置），都会拨出键所对应的数字，总共按下 N 位数字。
 * 你能用这种方式拨出多少个不同的号码？
 * 因为答案可能很大，所以输出答案模 10^9 + 7。
 *
 * 示例 1：
 * 输入：1
 * 输出：10
 *
 * 示例 2：
 * 输入：2
 * 输出：20
 *
 * 示例 3：
 * 输入：3
 * 输出：46
 *
 * 提示：
 * 1 <= N <= 5000
 */
public class KnightDialer {
    public int knightDialer(int n) {
        int mod = 1000_000_007;
        int[][] dialer = new int[][]{
                {4,6}, {6,8}, {7,9}, {4,8}, {0,3,9},
                {},  {0,1,7}, {2,6}, {1,3}, {2,4}};

        int[] dp = new int[10];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            int[] ndp = new int[10];

            for (int j = 0; j < 10; j++) {
                for (int z : dialer[j]) {
                    ndp[z] += dp[j];
                    ndp[z] %= mod;
                }
            }
            dp = ndp;
        }

        int result = 0;
        for (int value : dp) {
            result += value;
            result %= mod;
        }
        return result;
    }
}
