package lpf.learn.leetcode.tags.array;

import java.util.Arrays;

/** [611]有效三角形的个数
 * 给定一个包含非负整数的数组，你的任务是统计其中可以组成三角形三条边的三元组个数。
 *
 * 示例 1:
 * 输入: [2,2,3,4]
 * 输出: 3
 * 解释:
 * 有效的组合是:
 * 2,3,4 (使用第一个 2)
 * 2,3,4 (使用第二个 2)
 * 2,2,3
 *
 * 注意:
 * 数组长度不超过1000。
 * 数组里整数的范围为 [0, 1000]。
 */
public class ValidTriangleNumber {


    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            int k = i;
            // 使用双指针进行优化
            for (int j = i + 1; j < length; j++) {
                // 因为 K 指向有效的三角形，所以使用 k + 1 检查下一个索引是否可以组成有效的三角形
                while (k + 1 < length && nums[i] + nums[j] > nums[k + 1]) {
                    k++;
                }
                result += Math.max((k - j), 0);
            }
        }
        return result;
    }

    public int triangleNumber2(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }

        Arrays.sort(nums);
        int length = nums.length;
        int result = 0;
        for (int i = 0; i < length - 2; i++) {
            if (nums[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < length - 1; j++) {
                // 使用 二分法优化
                int sum = nums[i] + nums[j];
                int left = j + 1, right = length - 1, k = j;

                while (left <= right) {
                    int mid = (right + left) / 2;
                    if (sum > nums[mid]) {
                        k = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                result += (k - j);
            }
        }
        return result;
    }

    public int triangleNumber3(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }

        Arrays.sort(nums);
        int length = nums.length;
        int result = 0;
        for (int i = 0; i < length - 2; i++) {
            if (nums[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < length - 1; j++) {
                int sum = nums[i] + nums[j];
                for (int k = j + 1; k < length; k++) {
                    if (sum > nums[k]) {
                        result++;
                    } else {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
