package lpf.learn.leetcode.tags.array;

import java.util.HashMap;
import java.util.Map;

/** [447]回旋镖的数量
 * 给定平面上 n 对 互不相同 的点 points ，其中 points[i] = [xi, yi] 。回旋镖 是由点 (i, j, k) 表示的元组 ，
 * 其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
 * 返回平面上所有回旋镖的数量。
 *
 * 示例 1：
 * 输入：points = [[0,0],[1,0],[2,0]]
 * 输出：2
 * 解释：两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
 *
 * 示例 2：
 * 输入：points = [[1,1],[2,2],[3,3]]
 * 输出：2
 *
 * 示例 3：
 * 输入：points = [[1,1]]
 * 输出：0
 *
 * 提示：
 * n == points.length
 * 1 <= n <= 500
 * points[i].length == 2
 * -10^4 <= xi, yi <= 10^4
 * 所有点都 互不相同
 */
public class NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int length = points.length;
        Map<Integer, Integer>[] maps = new HashMap[length];
        for (int i = 0; i < length; i++) {
            maps[i] = new HashMap<>();
        }

        for (int i = 0; i < length; i++) {
            int[] p1 = points[i];
            for (int j = i + 1; j < length; j++) {
                int[] p2 = points[j];

                int dis = (p2[0] - p1[0]) * (p2[0] - p1[0]) + (p2[1] - p1[1]) * (p2[1] - p1[1]);

                maps[i].merge(dis, 1, Integer::sum);
                maps[j].merge(dis, 1, Integer::sum);
            }
        }

        int result = 0;
        for (int i = 0; i < length; i++) {
            for (Integer value : maps[i].values()) {
                result += value * (value - 1);
            }
        }
        return result;
    }
}
