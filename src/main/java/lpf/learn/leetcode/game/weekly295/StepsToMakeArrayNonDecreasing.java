package lpf.learn.leetcode.game.weekly295;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/** 6080. 使数组按非递减顺序排列
 * 给你一个下标从 0 开始的整数数组 nums 。在一步操作中，移除所有满足 nums[i - 1] > nums[i] 的 nums[i] ，其中 0 < i < nums.length 。
 * 重复执行步骤，直到 nums 变为 非递减 数组，返回所需执行的操作数。
 *
 * 示例 1：
 * 输入：nums = [5,3,4,4,7,3,6,11,8,5,11]
 * 输出：3
 * 解释：执行下述几个步骤：
 * - 步骤 1 ：[5,3,4,4,7,3,6,11,8,5,11] 变为 [5,4,4,7,6,11,11]
 * - 步骤 2 ：[5,4,4,7,6,11,11] 变为 [5,4,7,11,11]
 * - 步骤 3 ：[5,4,7,11,11] 变为 [5,7,11,11]
 * [5,7,11,11] 是一个非递减数组，因此，返回 3 。
 *
 * 示例 2：
 * 输入：nums = [4,5,7,7,13]
 * 输出：0
 * 解释：nums 已经是一个非递减数组，因此，返回 0 。
 *
 * 提示：
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^9
 */
public class StepsToMakeArrayNonDecreasing {
    public int totalSteps(int[] nums) {
        Map<Integer, Integer> intMapCount = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            int p = 0;
            while (!stack.empty() && nums[stack.peek()] <= nums[i]) {
                p = Math.max(p, intMapCount.getOrDefault(stack.pop(), 0));
            }
            if (!stack.empty()) {
                result = Math.max(result, p + 1);
                intMapCount.put(i, p + 1);
            }
            stack.push(i);
        }
        return result;
    }
}
