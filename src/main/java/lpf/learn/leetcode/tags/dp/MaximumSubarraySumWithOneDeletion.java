package lpf.learn.leetcode.tags.dp;

/** [1186]删除一次得到子数组最大和
 * 给你一个整数数组，返回它的某个 非空 子数组（连续元素）在执行一次可选的删除操作后，所能得到的最大元素总和。
 * 换句话说，你可以从原数组中选出一个子数组，并可以决定要不要从中删除一个元素（只能删一次哦），（删除后）子数组中至少应当有一个元素，然后该子数组（剩下）的元素总和是所有子数组之中最大的。
 * 注意，删除一个元素后，子数组 不能为空。
 *
 * 请看示例：
 * 示例 1：
 * 输入：arr = [1,-2,0,3]
 * 输出：4
 * 解释：我们可以选出 [1, -2, 0, 3]，然后删掉 -2，这样得到 [1, 0, 3]，和最大。
 *
 * 示例 2：
 * 输入：arr = [1,-2,-2,3]
 * 输出：3
 * 解释：我们直接选出 [3]，这就是最大和。
 *
 * 示例 3：
 * 输入：arr = [-1,-1,-1,-1]
 * 输出：-1
 * 解释：最后得到的子数组不能为空，所以我们不能选择 [-1] 并从中删去 -1 来得到 0。
 *     我们应该直接选择 [-1]，或者选择 [-1, -1] 再从中删去一个 -1。
 *
 * 提示：
 * 1 <= arr.length <= 10^5
 * -10^4 <= arr[i] <= 10^4
 */
public class MaximumSubarraySumWithOneDeletion {

    public int maximumSum(int[] arr) {
        int length = arr.length;
        int[][] dp = new int[length + 1][2];
        // dp[0][0] = arr[0];
        dp[0][0] = -200001;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            dp[i + 1][0] = Math.max(dp[i][0] + arr[i], arr[i]);
            dp[i + 1][1] = Math.max(dp[i][1] + arr[i], dp[i][0]);

            result = Math.max(result, Math.max(dp[i + 1][0], dp[i + 1][1]));
        }
        return result;
    }

    public int maximumSum2(int[] arr) {
        int length = arr.length;
        int[] preSum = new int[length + 1];
        for (int i = 0; i < length; i++) {
            preSum[i + 1] = preSum[i] + arr[i];
        }

        int[] pdMin = new int[length];
        int result = Integer.MIN_VALUE;
        int value;
        for (int i = length - 1; i >= 0; i--) {
            pdMin[i] = arr[i];
            result = Math.max(result, arr[i]);

            if (arr[i] < 0) {
                int j = i + 1;
                while (j < length && arr[i] < pdMin[j]) {
                    pdMin[j++] = pdMin[i];
                }
                continue;
            }
            for (int j = i + 1; j < length; j++) {
                value = preSum[j + 1] - preSum[i];

                if (pdMin[j] < 0) {
                    value -= pdMin[j];
                }
                result = Math.max(result, value);
            }
        }
        return result;
    }
}
