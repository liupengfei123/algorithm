package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * 1187 使数组严格递增
 * <p>给你两个整数数组&nbsp;<code>arr1</code> 和 <code>arr2</code>，返回使&nbsp;<code>arr1</code>&nbsp;严格递增所需要的最小「操作」数（可能为 0）。</p>
 * <p>每一步「操作」中，你可以分别从 <code>arr1</code> 和 <code>arr2</code> 中各选出一个索引，分别为&nbsp;<code>i</code> 和&nbsp;<code>j</code>，<code>0 &lt;=&nbsp;i &lt; arr1.length</code>&nbsp;和&nbsp;<code>0 &lt;= j &lt; arr2.length</code>，然后进行赋值运算&nbsp;<code>arr1[i] = arr2[j]</code>。</p>
 * <p>如果无法让&nbsp;<code>arr1</code>&nbsp;严格递增，请返回&nbsp;<code>-1</code>。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre><strong>输入：</strong>arr1 = [1,5,3,6,7], arr2 = [1,3,2,4]
 * <strong>输出：</strong>1
 * <strong>解释：</strong>用 2 来替换 <code>5，之后</code> <code>arr1 = [1, 2, 3, 6, 7]</code>。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre><strong>输入：</strong>arr1 = [1,5,3,6,7], arr2 = [4,3,1]
 * <strong>输出：</strong>2
 * <strong>解释：</strong>用 3 来替换 <code>5，然后</code>用 4 来替换 3<code>，得到</code> <code>arr1 = [1, 3, 4, 6, 7]</code>。
 * </pre>
 *
 * <p><strong>示例&nbsp;3：</strong></p>
 * <pre><strong>输入：</strong>arr1 = [1,5,3,6,7], arr2 = [1,6,3,3]
 * <strong>输出：</strong>-1
 * <strong>解释：</strong>无法使 <code>arr1 严格递增</code>。</pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * <li><code>1 &lt;= arr1.length, arr2.length &lt;= 2000</code></li>
 * <li><code>0 &lt;= arr1[i], arr2[i] &lt;= 10^9</code></li>
 * </ul>
 */
public class MakeArrayStrictlyIncreasing {
    private final static int INF = Integer.MAX_VALUE;

    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);

        TreeSet<Integer> treeMap = new TreeSet<>();
        int prev = -1;
        for (int num : arr2) {
            if (num != prev) {
                treeMap.add(num);
                prev = num;
            }
        }

        int n = arr1.length;
        int m = treeMap.size();

        int[][] dp = new int[n + 1][Math.min(n, m) + 1];
        Arrays.fill(dp[0], INF);
        dp[0][0] = -1;

        for (int i = 1; i <= n; i++) {
            Arrays.fill(dp[i], INF);

            for (int j = 0; j <= Math.min(i, m); j++) {
                if (dp[i - 1][j] < arr1[i - 1]) {
                    dp[i][j] = arr1[i - 1];
                }
                if (j > 0 && dp[i - 1][j - 1] != INF) {
                    Integer ceiling = treeMap.ceiling(dp[i - 1][j - 1] + 1);
                    if (ceiling != null) {
                        dp[i][j] = Math.min(dp[i][j], ceiling);
                    }
                }
            }
        }
        for (int i = 0; i <= Math.min(n, m); i++) {
            if (dp[n][i] != INF) return i;
        }
        return -1;
    }
}
