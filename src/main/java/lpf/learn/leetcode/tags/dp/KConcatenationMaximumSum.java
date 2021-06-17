package lpf.learn.leetcode.tags.dp;

import java.util.stream.IntStream;

/**
 * [1191]K 次串联后最大子数组之和
 * <p>
 * 给你一个整数数组 arr 和一个整数 k。
 * 首先，我们要对该数组进行修改，即把原数组 arr 重复 k 次。
 * 举个例子，如果 arr = [1, 2] 且 k = 3，那么修改后的数组就是 [1, 2, 1, 2, 1, 2]。
 * 然后，请你返回修改后的数组中的最大的子数组之和。
 * 注意，子数组长度可以是 0，在这种情况下它的总和也是 0。
 * 由于 结果可能会很大，所以需要 模（mod） 10^9 + 7 后再返回。
 * <p>
 * 示例 1：
 * 输入：arr = [1,2], k = 3
 * 输出：9
 * <p>
 * 示例 2：
 * 输入：arr = [1,-2,1], k = 5
 * 输出：2
 * <p>
 * 示例 3：
 * 输入：arr = [-1,-2], k = 7
 * 输出：0
 * <p>
 * 提示：
 * 1 <= arr.length <= 10^5
 * 1 <= k <= 10^5
 * -10^4 <= arr[i] <= 10^4
 */
public class KConcatenationMaximumSum {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int mod = 1000_000_007;
        int[] newArr;
        if (k >= 2) {
            int tempSum = IntStream.of(arr).sum();
            tempSum = tempSum > 0 && k > 2 ? tempSum : 0;
            int sum = 0;
            if (tempSum > 0) {
                for (int i = 0; i < k - 2; i++) {
                    sum = (sum + tempSum) % mod;
                }
            }

            newArr = new int[arr.length * 2 + 1];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            newArr[arr.length] = sum;
            System.arraycopy(arr, 0, newArr, arr.length + 1, arr.length);
        } else {
            newArr = arr;
        }

        long result = 0;
        long sum = 0;
        for (int num : newArr) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            result = Math.max(result, sum);
        }
        return (int) (result % mod);
    }
}
