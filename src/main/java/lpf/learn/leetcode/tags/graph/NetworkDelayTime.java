package lpf.learn.leetcode.tags.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/** [743]网络延迟时间
 * 有 n 个网络节点，标记为 1 到 n。
 * 给你一个列表 times，表示信号经过 有向 边的传递时间。 times[i] = (ui, vi, wi)，其中 ui 是源节点，vi 是目标节点， wi 是一个信号从源节点传递到目标节点的时间。
 * 现在，从某个节点 K 发出一个信号。需要多久才能使所有节点都收到信号？如果不能使所有节点收到信号，返回 -1 。
 *
 * 示例 1：
 * 输入：times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
 * 输出：2
 *
 * 示例 2：
 * 输入：times = [[1,2,1]], n = 2, k = 1
 * 输出：1
 *
 * 示例 3：
 * 输入：times = [[1,2,1]], n = 2, k = 2
 * 输出：-1
 *
 * 提示：
 * 1 <= k <= n <= 100
 * 1 <= times.length <= 6000
 * times[i].length == 3
 * 1 <= ui, vi <= n
 * ui != vi
 * 0 <= wi <= 100
 * 所有 (ui, vi) 对都 互不相同（即，不含重复边）
 */
public class NetworkDelayTime {

    public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]>[] listArray = new ArrayList[n + 1];
        for (int[] time : times) {
            if (listArray[time[0]] == null) {
                listArray[time[0]] = new ArrayList<>();
            }
            listArray[time[0]].add(new int[]{time[1], time[2]});
        }

        int[] delay = new int[n + 1];
        Arrays.fill(delay, Integer.MAX_VALUE);
        delay[0] = 0;
        help(k, 0, listArray, delay);

        int result = IntStream.of(delay).max().getAsInt();

        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private void help(int s, int value, List<int[]>[] listArray, int[] delay) {
        if (delay[s] < value) {
            return;
        }
        delay[s] = value;

        if (listArray[s] != null) {
            for (int[] ints : listArray[s]) {
                help(ints[0], value + ints[1], listArray, delay);
            }
        }
    }

}
