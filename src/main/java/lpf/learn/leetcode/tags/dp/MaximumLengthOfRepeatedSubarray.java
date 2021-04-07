package lpf.learn.leetcode.tags.dp;

/** [718]最长重复子数组
 *  给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 *
 * 示例：
 * 输入：
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * 输出：3
 * 解释：长度最长的公共子数组是 [3, 2, 1] 。
 *
 * 提示：
 * 1 <= len(A), len(B) <= 1000
 * 0 <= A[i], B[i] < 100
 */
public class MaximumLengthOfRepeatedSubarray {
    public int findLength(int[] A, int[] B) {

        int[][] dp = new int[A.length + 1][B.length + 1];

        int result = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            for (int j = B.length - 1; j >= 0; j--) {
                if (A[i] != B[j]) {
                    continue;
                }
                dp[i][j] = 1 + dp[i + 1][j + 1];
                result = Math.max(result, dp[i][j]);
            }
        }

        return result;
    }
}
