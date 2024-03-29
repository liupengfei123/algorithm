package lpf.learn.leetcode.game.weekly238;

import java.util.Arrays;
import java.util.Comparator;

/** 5741. 最高建筑高度
 * 在一座城市里，你需要建 n 栋新的建筑。这些新的建筑会从 1 到 n 编号排成一列。
 *
 * 这座城市对这些新建筑有一些规定：
 * 每栋建筑的高度必须是一个非负整数。
 * 第一栋建筑的高度 必须 是 0 。
 * 任意两栋相邻建筑的高度差 不能超过  1 。
 * 除此以外，某些建筑还有额外的最高高度限制。这些限制会以二维整数数组 restrictions 的形式给出，其中 restrictions[i] = [idi, maxHeighti] ，表示建筑 idi 的高度 不能超过 maxHeighti 。
 * 题目保证每栋建筑在 restrictions 中 至多出现一次 ，同时建筑 1 不会 出现在 restrictions 中。
 * 请你返回 最高 建筑能达到的 最高高度 。
 *
 * 示例 1：
 * 输入：n = 5, restrictions = [[2,1],[4,1]]
 * 输出：2
 * 解释：上图中的绿色区域为每栋建筑被允许的最高高度。
 * 我们可以使建筑高度分别为 [0,1,2,1,2] ，最高建筑的高度为 2 。
 *
 * 示例 2：
 * 输入：n = 6, restrictions = []
 * 输出：5
 * 解释：上图中的绿色区域为每栋建筑被允许的最高高度。
 * 我们可以使建筑高度分别为 [0,1,2,3,4,5] ，最高建筑的高度为 5 。
 *
 * 示例 3：
 * 输入：n = 10, restrictions = [[5,3],[2,5],[7,4],[10,3]]
 * 输出：5
 * 解释：上图中的绿色区域为每栋建筑被允许的最高高度。
 * 我们可以使建筑高度分别为 [0,1,2,3,3,4,4,5,4,3] ，最高建筑的高度为 5 。
 *
 * 提示：
 * 2 <= n <= 10^9
 * 0 <= restrictions.length <= min(n - 1, 10^5)
 * 2 <= idi <= n
 * idi 是 唯一的 。
 * 0 <= maxHeighti <= 10^9
 */
public class MaximumBuildingHeight {

    public int maxBuilding(int n, int[][] r) {
        if (r == null || r.length == 0) {
            return n - 1;
        }
        Arrays.sort(r, Comparator.comparingInt(x -> x[0]));

        int[][] nr = new int[r.length + 2][2];

        System.arraycopy(r, 0, nr, 1, r.length);
        // 增加限制 (1, 0)
        nr[0] = new int[]{1, 0};
        nr[nr.length - 1] = new int[]{n, n - 1};
        r = nr;
        int m = r.length;

        // 从左向右传递限制
        for (int i = 1; i < m; ++i) {
            r[i][1] = Math.min(r[i][1], r[i - 1][1] + (r[i][0] - r[i - 1][0]));
        }
        // 从右向左传递限制
        for (int i = m - 2; i >= 0; --i) {
            r[i][1] = Math.min(r[i][1], r[i + 1][1] + (r[i + 1][0] - r[i][0]));
        }

        int ans = 0;
        for (int i = 0; i < m - 1; ++i) {
            // 计算 r[i][0] 和 r[i][1] 之间的建筑的最大高度
            int best = ((r[i + 1][0] - r[i][0]) + r[i][1] + r[i + 1][1]) / 2;
            ans = Math.max(ans, best);
        }

        return ans;
    }


}
