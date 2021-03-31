package lpf.learn.leetcode.tags.dp;

import java.util.HashMap;
import java.util.Map;

/** [673]最长递增子序列的个数
 * 给定一个未排序的整数数组，找到最长递增子序列的个数。
 *
 * 示例 1:
 * 输入: [1,3,5,4,7]
 * 输出: 2
 * 解释: 有两个最长递增子序列，分别是 [1, 3, 4, 7] 和[1, 3, 5, 7]。
 *
 * 示例 2:
 * 输入: [2,2,2,2,2]
 * 输出: 5
 * 解释: 最长递增子序列的长度是1，并且存在5个子序列的长度为1，因此输出5。
 *
 * 注意: 给定的数组长度不超过 2000 并且结果一定是32位有符号整数。
 */
public class NumberOfLongestIncreasingSubsequence {

    public int findNumberOfLIS(int[] nums) {
        int length = nums.length;
        // index: nums 的 index, value: 最大子序列长度
        int[] ldp = new int[length];
        // index: nums 的 index, value: 当前index的最大子序列的个数
        int[] idp = new int[length];
        // index: 最大子序列长度, value: 各个长度的个数
        int[] cdp = new int[length + 1];

        for (int i = 0; i < length; i++) {
            int num = nums[i];
            int len = 1;
            int count = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < num) {
                    if (len == ldp[j] + 1) {
                        count += idp[j];
                    } else if (len < ldp[j] + 1) {
                        len = ldp[j] + 1;
                        count = idp[j];
                    }
                }
            }
            ldp[i] = len;
            idp[i] = count;
            cdp[len] += count;
        }

        int result = 0;
        for (int i = length; i > 0; i--) {
            if (cdp[i] != 0) {
                return cdp[i];
            }
        }
        return result;
    }


    // 超时
    public int findNumberOfLIS2(int[] nums) {
        int length = nums.length;
        // index 子序列长度， key：序列最大值， value 以key 结尾的序列个数
        Map<Integer, Integer>[] maps = new Map[length + 1];

        for (int i = 0; i <= length; i++) {
            maps[i] = new HashMap<>(length);
        }

        for (int i = 0; i < length; i++) {
            int num = nums[i];
            for (int j = i; j > 0; j--) {
                Map<Integer, Integer> map = maps[j];
                if (map.size() == 0) {
                    continue;
                }

                int finalJ = j;
                map.forEach((key, value) -> {
                    if (key < num) {
                        maps[finalJ + 1].merge(num, value, Integer::sum);
                    }
                });
            }
            maps[1].merge(num, 1, Integer::sum);
        }

        int result = 0;
        for (int i = length; i > 0; i--) {
            Map<Integer, Integer> map = maps[i];
            if (map.size() == 0) {
                continue;
            }
            result = map.values().stream().mapToInt(value -> value).sum();
            break;
        }
        return result;
    }
}
