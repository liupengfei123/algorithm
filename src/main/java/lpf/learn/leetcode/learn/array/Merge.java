package lpf.learn.leetcode.learn.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * 示例 1:
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 *
 * 示例 2:
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 */
public class Merge {

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }
        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0]));

        List<int[]> result = new ArrayList<>();

        int[] temp1 = intervals[0];

        for (int[] interval : intervals) {
            if (temp1[1] >= interval[0]) {
                temp1 = new int[]{temp1[0], Math.max(temp1[1], interval[1])};
            } else {
                result.add(temp1);
                temp1 = interval;
            }
        }

        result.add(temp1);
        return result.toArray(new int[0][]);
    }
}
