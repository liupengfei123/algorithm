package lpf.learn.leetcode.tags.dp;

import java.util.HashMap;
import java.util.Map;

/** [446]等差数列划分 II - 子序列
 * 如果一个数列至少有三个元素，并且任意两个相邻元素之差相同，则称该数列为等差数列。
 * 例如，以下数列为等差数列:
 * 1, 3, 5, 7, 9
 * 7, 7, 7, 7
 * 3, -1, -5, -9
 *
 * 以下数列不是等差数列。
 * 1, 1, 2, 5, 7
 *
 * 数组 A 包含 N 个数，且索引从 0 开始。该数组子序列将划分为整数序列 (P0, P1, ..., Pk)，满足 0 ≤ P0 < P1 < ... < Pk < N。
 * 如果序列 A[P0]，A[P1]，...，A[Pk-1]，A[Pk] 是等差的，那么数组 A 的子序列 (P0，P1，…，PK) 称为等差序列。值得注意的是，这意味着 k ≥ 2。
 * 函数要返回数组 A 中所有等差子序列的个数。
 * 输入包含 N 个整数。每个整数都在 -231 和 231-1 之间，另外 0 ≤ N ≤ 1000。保证输出小于 231-1。
 *
 * 示例：
 * 输入：[2, 4, 6, 8, 10]
 * 输出：7
 * 解释：
 * 所有的等差子序列为：
 * [2,4,6]
 * [4,6,8]
 * [6,8,10]
 * [2,4,6,8]
 * [4,6,8,10]
 * [2,4,6,8,10]
 * [2,6,10]
 */
public class ArithmeticSlicesIiSubsequence {

    public int numberOfArithmeticSlices(int[] A) {
        int n = A.length;
        long ans = 0;
        Map<Integer, Integer>[] cnt = new Map[n];
        for (int i = 0; i < n; i++) {
            cnt[i] = new HashMap<>(i);
            for (int j = 0; j < i; j++) {
                long delta = (long)A[i] - (long)A[j];
                if (delta < Integer.MIN_VALUE || delta > Integer.MAX_VALUE) {
                    continue;
                }
                int diff = (int)delta;
                int sum = cnt[j].getOrDefault(diff, 0);
                int origin = cnt[i].getOrDefault(diff, 0);
                cnt[i].put(diff, origin + sum + 1);
                ans += sum;
            }
        }
        return (int)ans;
    }


    public int numberOfArithmeticSlices2(int[] A) {
        // 输入包含 N 个整数。每个整数都在 -231 和 231-1 之间，另外 0 ≤ N ≤ 1000。保证输出小于 231-1。
        // 淦 是 2 的 31 次方
        int[][] dp = new int[A.length][461];

        int result = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int diff = A[i] - A[j];
                if (Math.abs(diff) > 230) {
                    continue;
                }
                dp[i][diff + 230] += dp[j][diff + 230] + 1;
                result += dp[j][diff + 230];
            }
        }
        return result;
    }
}
