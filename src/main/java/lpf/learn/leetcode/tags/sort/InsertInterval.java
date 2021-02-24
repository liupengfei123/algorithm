package lpf.learn.leetcode.tags.sort;

import java.util.ArrayList;
import java.util.List;

/** [57]插入区间
 * 给你一个 无重叠的 ，按照区间起始端点排序的区间列表。
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 *
 * 示例 1：
 * 输入：intervals = [[1,3],[6,9]], newInterval = [2,5]
 * 输出：[[1,5],[6,9]]
 *
 * 示例 2：
 * 输入：intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * 输出：[[1,2],[3,10],[12,16]]
 * 解释：这是因为新的区间 [4,8] 与 [3,5],[6,7],[8,10] 重叠。
 *
 * 示例 3：
 * 输入：intervals = [], newInterval = [5,7]
 * 输出：[[5,7]]
 *
 * 示例 4：
 * 输入：intervals = [[1,5]], newInterval = [2,3]
 * 输出：[[1,5]]
 *
 * 示例 5：
 * 输入：intervals = [[1,5]], newInterval = [2,7]
 * 输出：[[1,7]]
 *
 * 提示：
 * 0 <= intervals.length <= 104
 * intervals[i].length == 2
 * 0 <= intervals[i][0] <= intervals[i][1] <= 105
 * intervals 根据 intervals[i][0] 按 升序 排列
 * newInterval.length == 2
 * 0 <= newInterval[0] <= newInterval[1] <= 105
 */
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>(intervals.length + 1);
        int lastValue = Integer.MIN_VALUE;
        boolean isAdd = false;
        for (int[] interval : intervals) {
            if (interval[1] >= newInterval[0] && interval[1] <= newInterval[1]) {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                continue;
            }
            if (interval[0] <= newInterval[1] && interval[0] >= newInterval[0]) {
                newInterval[1] = Math.max(interval[1], newInterval[1]);
                continue;
            }
            if (!isAdd && interval[0] > newInterval[1] && newInterval[0] > lastValue) {
                list.add(newInterval);
                isAdd = true;
            }
            lastValue = interval[1];
            list.add(interval);
        }

        if (lastValue < newInterval[0]) {
            list.add(newInterval);
        }

        int[][] result = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
