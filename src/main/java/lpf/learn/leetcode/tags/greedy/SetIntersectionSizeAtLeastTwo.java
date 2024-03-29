package lpf.learn.leetcode.tags.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 757 设置交集大小至少为2
 * <p>一个整数区间&nbsp;<code>[a, b]</code>&nbsp;&nbsp;(&nbsp;<code>a &lt; b</code>&nbsp;) 代表着从&nbsp;<code>a</code>&nbsp;到&nbsp;<code>b</code>&nbsp;的所有连续整数，包括&nbsp;<code>a</code>&nbsp;和&nbsp;<code>b</code>。</p>
 * <p>给你一组整数区间<code>intervals</code>，请找到一个最小的集合 S，使得 S 里的元素与区间<code>intervals</code>中的每一个整数区间都至少有2个元素相交。</p>
 * <p>输出这个最小集合S的大小。</p>
 *
 * <p><strong>示例 1:</strong></p>
 * <pre><strong>输入:</strong> intervals = [[1, 3], [1, 4], [2, 5], [3, 5]]
 * <strong>输出:</strong> 3
 * <strong>解释:</strong>
 * 考虑集合 S = {2, 3, 4}. S与intervals中的四个区间都有至少2个相交的元素。
 * 且这是S最小的情况，故我们输出3。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 * <pre><strong>输入:</strong> intervals = [[1, 2], [2, 3], [2, 4], [4, 5]]
 * <strong>输出:</strong> 5
 * <strong>解释:</strong>
 * 最小的集合S = {1, 2, 3, 4, 5}.
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 * <ol>
 * 	<li><code>intervals</code>&nbsp;的长度范围为<code>[1, 3000]</code>。</li>
 * 	<li><code>intervals[i]</code>&nbsp;长度为&nbsp;<code>2</code>，分别代表左、右边界。</li>
 * 	<li><code>intervals[i][j]</code> 的值是&nbsp;<code>[0, 10^8]</code>范围内的整数。</li>
 * </ol>
 */
public class SetIntersectionSizeAtLeastTwo {
    public int intersectionSizeTwo(int[][] intervals) {
        int n = intervals.length;
        int res = 0;
        int m = 2;
        Arrays.sort(intervals, Comparator.comparing((int[] a) -> a[0]).thenComparing(a -> -a[1]));

        List<Integer>[] temp = new List[n];
        for (int i = 0; i < n; i++) {
            temp[i] = new ArrayList<>();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = intervals[i][0], k = temp[i].size(); k < m; j++, k++) {
                res++;
                help(intervals, temp, i - 1, j);
            }
        }
        return res;
    }

    public void help(int[][] intervals, List<Integer>[] temp, int pos, int num) {
        for (int i = pos; i >= 0; i--) {
            if (intervals[i][1] < num) {
                break;
            }
            temp[i].add(num);
        }
    }
}
