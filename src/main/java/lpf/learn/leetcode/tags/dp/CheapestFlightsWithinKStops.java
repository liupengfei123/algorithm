package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;

/** [787]K 站中转内最便宜的航班
 * 有 n 个城市通过 m 个航班连接。每个航班都从城市 u 开始，以价格 w 抵达 v。
 * 现在给定所有的城市和航班，以及出发城市 src 和目的地 dst，你的任务是找到从 src 到 dst 最多经过 k 站中转的最便宜的价格。 如果没有这样的路线，则输出 -1。
 *
 * 示例 1：
 * 输入:
 * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
 * src = 0, dst = 2, k = 1
 * 输出: 200
 * 解释: 城市航班图如下
 * 从城市 0 到城市 2 在 1 站中转以内的最便宜价格是 200，如图中红色所示。
 *
 * 示例 2
 * 输入:
 * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
 * src = 0, dst = 2, k = 0
 * 输出: 500
 * 解释:
 * 城市航班图如下
 * 从城市 0 到城市 2 在 0 站中转以内的最便宜价格是 500，如图中蓝色所示。
 *
 * 提示：
 * n 范围是 [1, 100]，城市标签从 0 到 n - 1
 * 航班数量范围是 [0, n * (n - 1) / 2]
 * 每个航班的格式 (src, dst, price)
 * 每个航班的价格范围是 [1, 10000]
 * k 范围是 [0, n - 1]
 * 航班没有重复，且不存在自环
 */
public class CheapestFlightsWithinKStops {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[][] dp = new int[n][K + 1];
        // 初始化 1：由于找最短路径，因此初始化的时候赋值成为一个不可能的较大的值
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        // 自己到自己，不管经过几个顶点，最短路径都是 0
        for (int i = 0; i <= K; i++) {
            dp[src][i] = 0;
        }
        // 第 1 轮松弛操作，只需要对从 src 出发的边进行松弛操作
        for (int[] flight : flights) {
            if (flight[0] == src) {
                dp[flight[1]][0] = flight[2];
            }
        }
        // 第 2 轮到第 K + 1 轮松弛操作，最后一轮松弛操作是为了检测是否可达
        for (int i = 1; i <= K; i++) {
            for (int[] flight : flights) {
                int from = flight[0];
                int to = flight[1];
                // 每一次松弛操作的结果是互相独立的，因此只有在上一轮（第 i - 1 轮）得到单源最短路径的顶点，才需要执行松弛操作
                if (dp[from][i - 1] != Integer.MAX_VALUE) {
                    dp[to][i] = Math.min(dp[from][i - 1] + flight[2], dp[to][i]);
                }
            }
        }
        return dp[dst][K] == Integer.MAX_VALUE ? - 1 : dp[dst][K];
    }

}
