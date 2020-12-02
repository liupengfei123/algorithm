package lpf.learn.leetcode.tags.twopoint;

/** [845]数组中的最长山脉
 * 我们把数组 A 中符合下列属性的任意连续子数组 B 称为 “山脉”：B.length >= 3 存在 0 < i < B.length - 1 使得 B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
 * （注意：B 可以是 A 的任意子数组，包括整个数组 A。）
 * 给出一个整数数组 A，返回最长 “山脉” 的长度。如果不含有 “山脉” 则返回 0。
 *
 * 示例 1：
 * 输入：[2,1,4,7,3,2,5]
 * 输出：5
 * 解释：最长的 “山脉” 是 [1,4,7,3,2]，长度为 5。
 *
 * 示例 2：
 * 输入：[2,2,2]
 * 输出：0
 * 解释：不含 “山脉”。
 *
 * 提示：
 * 0 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 */
public class LongestMountainInArray {
    public int longestMountain(int[] arr) {
        if (arr == null || arr.length < 3) {
            return 0;
        }

        int result = 0, left = 0, right = 0;
        int lastValue = arr[0];
        int stat = 0;   // 0 为 初始化， 1为 上坡， 2 为下坡

        while (right < arr.length) {
            if (arr[right] > lastValue) {
                if (stat == 2) {
                    result = Math.max(result, right - left);
                    left = right - 1;
                }
                stat = 1;
            } else if (arr[right] == lastValue) {
                if (stat == 2) {
                    result = Math.max(result, right - left);
                }
                left = right;
                stat = 0;
            } else {
                if (stat == 1) {
                    stat = 2;
                } else if (stat == 0){
                    left = right;
                }
            }
            lastValue = arr[right++];
        }

        if (stat == 2) {
            result = Math.max(result, right - left);
        }
        return result;
    }



    public int longestMountain2(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int left = 0;
        while (left + 2 < n) {
            int right = left + 1;
            if (arr[left] < arr[left + 1]) {
                while (right + 1 < n && arr[right] < arr[right + 1]) {
                    ++right;
                }
                if (right < n - 1 && arr[right] > arr[right + 1]) {
                    while (right + 1 < n && arr[right] > arr[right + 1]) {
                        ++right;
                    }
                    ans = Math.max(ans, right - left + 1);
                } else {
                    ++right;
                }
            }
            left = right;
        }
        return ans;
    }
}
