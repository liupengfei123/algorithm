package lpf.learn.leetcode.tags.dp;

/** [1049]最后一块石头的重量 II
 * 有一堆石头，每块石头的重量都是正整数。
 * 每一回合，从中选出任意两块石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 *
 * 如果 x == y，那么两块石头都会被完全粉碎；
 * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 *
 * 最后，最多只会剩下一块石头。返回此石头最小的可能重量。如果没有石头剩下，就返回 0。
 *
 * 示例：
 * 输入：[2,7,4,1,8,1]
 * 输出：1
 * 解释：
 * 组合 2 和 4，得到 2，所以数组转化为 [2,7,1,8,1]，
 * 组合 7 和 8，得到 1，所以数组转化为 [2,1,1,1]，
 * 组合 2 和 1，得到 1，所以数组转化为 [1,1,1]，
 * 组合 1 和 1，得到 0，所以数组转化为 [1]，这就是最优值。
 *
 * 提示：
 * 1 <= stones.length <= 30
 * 1 <= stones[i] <= 1000
 */
public class LastStoneWeightIi {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }

        int target = sum / 2;
        int[][] dp = new int[n][target + 1];
        for (int j=0;j<=target;j++) {
            dp[0][j] = j >= stones[0] ? stones[0] : 0;
        }

        for (int i=1;i<n;i++) {
            for (int j=0;j<=target;j++) {
                if (j < stones[i]) { // 不选第 i 个元素
                    dp[i][j] = dp[i - 1][j];
                } else { // 选第 i 个元素
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j -stones[i]] + stones[i]);
                }
            }
        }
        //所有石头里面，重量不超过这堆石头重量一半的，最佳组合的重量
        return sum - 2 * dp[n - 1][target];

    }
}
