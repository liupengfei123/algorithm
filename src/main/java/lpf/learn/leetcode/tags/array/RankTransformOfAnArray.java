package lpf.learn.leetcode.tags.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 1331 数组序号转换
 * <p>给你一个整数数组&nbsp;<code>arr</code> ，请你将数组中的每个元素替换为它们排序后的序号。</p>
 * <p>序号代表了一个元素有多大。序号编号的规则如下：</p>
 * <ul>
 * 	<li>序号从 1 开始编号。</li>
 * 	<li>一个元素越大，那么序号越大。如果两个元素相等，那么它们的序号相同。</li>
 * 	<li>每个数字的序号都应该尽可能地小。</li>
 * </ul>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre><strong>输入：</strong>arr = [40,10,20,30]
 * <strong>输出：</strong>[4,1,2,3]
 * <strong>解释：</strong>40 是最大的元素。 10 是最小的元素。 20 是第二小的数字。 30 是第三小的数字。</pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre><strong>输入：</strong>arr = [100,100,100]
 * <strong>输出：</strong>[1,1,1]
 * <strong>解释：</strong>所有元素有相同的序号。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 * <pre><strong>输入：</strong>arr = [37,12,28,9,100,56,80,5,12]
 * <strong>输出：</strong>[5,3,4,2,8,6,7,1,3]
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>0 &lt;= arr.length &lt;= 10<sup>5</sup></code></li>
 * 	<li><code>-10<sup>9</sup>&nbsp;&lt;= arr[i] &lt;= 10<sup>9</sup></code></li>
 * </ul>
 */
public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = new int[arr.length];
        System.arraycopy(arr, 0, sortedArr, 0, arr.length);
        Arrays.sort(sortedArr);
        Map<Integer, Integer> ranks = new HashMap<>();
        int[] ans = new int[arr.length];
        for (int a : sortedArr) {
            if (!ranks.containsKey(a)) {
                ranks.put(a, ranks.size() + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i] = ranks.get(arr[i]);
        }
        return ans;
    }

    public int[] arrayRankTransform2(int[] arr) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparing(a -> a[0]));

        for (int i = 0; i < arr.length; i++) {
            queue.add(new int[]{arr[i], i});
        }

        int[] result = new int[arr.length];

        int index = 0;
        int lastValue = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            if (lastValue != poll[0]) {
                index++;
                lastValue = poll[0];
            }
            result[poll[1]] = index;
        }

        return result;
    }
}
