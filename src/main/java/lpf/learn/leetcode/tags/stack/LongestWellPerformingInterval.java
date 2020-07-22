package lpf.learn.leetcode.tags.stack;

import java.util.Stack;

/**[1124]表现良好的最长时间段
 * 给你一份工作时间表 hours，上面记录着某一位员工每天的工作小时数。
 * 我们认为当员工一天中的工作小时数大于 8 小时的时候，那么这一天就是「劳累的一天」。
 * 所谓「表现良好的时间段」，意味在这段时间内，「劳累的天数」是严格 大于「不劳累的天数」。
 * 请你返回「表现良好时间段」的最大长度。
 *
 * 示例 1：
 * 输入：hours = [9,9,6,0,6,6,9]
 * 输出：3
 * 解释：最长的表现良好时间段是 [9,9,6]。
 *
 * 提示：
 * 1 <= hours.length <= 10000
 * 0 <= hours[i] <= 16
 */
public class LongestWellPerformingInterval {
    public int longestWPI(int[] hours) {
        if (hours == null) {
            return 0;
        }

        int size = hours.length;
        for (int i = 0; i < size; i++) {
            hours[i] = hours[i] > 8 ? 1 : -1;
        }
        int[] presum = new int[size + 1];
        for (int i = 1; i < presum.length; i++) {
            presum[i] = presum[i - 1] + hours[i - 1];
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < presum.length; i++) {
            if (stack.isEmpty() || presum[stack.peek()] > presum[i]) {
                stack.push(i);
            }
        }

        int maxLength = 0;
        for (int i = presum.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && presum[stack.peek()] < presum[i]) {
                maxLength = Math.max(maxLength, i - stack.pop());
            }
        }
        return maxLength;
    }
}
