package lpf.learn.leetcode.game.weekly294;

import java.util.Arrays;
import java.util.Stack;

/** 2281. 巫师的总力量和
 *  作为国王的统治者，你有一支巫师军队听你指挥。
 * 给你一个下标从 0开始的整数数组strength，其中strength[i]表示第i位巫师的力量值。对于连续的一组巫师（也就是这些巫师的力量值是strength的子数组），总力量定义为以下两个值的乘积：
 *
 * 巫师中 最弱的能力值。
 * 组中所有巫师的个人力量值 之和。
 * 请你返回 所有巫师组的 总力量之和。由于答案可能很大，请将答案对109 + 7取余后返回。
 * 子数组是一个数组里 非空连续子序列。
 *
 * 示例 1：
 * 输入：strength = [1,3,1,2]
 * 输出：44
 * 解释：以下是所有连续巫师组：
 * - [1,3,1,2] 中 [1] ，总力量值为 min([1]) * sum([1]) = 1 * 1 = 1
 * - [1,3,1,2] 中 [3] ，总力量值为 min([3]) * sum([3]) = 3 * 3 = 9
 * - [1,3,1,2] 中 [1] ，总力量值为 min([1]) * sum([1]) = 1 * 1 = 1
 * - [1,3,1,2] 中 [2] ，总力量值为 min([2]) * sum([2]) = 2 * 2 = 4
 * - [1,3,1,2] 中 [1,3] ，总力量值为 min([1,3]) * sum([1,3]) = 1 * 4 = 4
 * - [1,3,1,2] 中 [3,1] ，总力量值为 min([3,1]) * sum([3,1]) = 1 * 4 = 4
 * - [1,3,1,2] 中 [1,2] ，总力量值为 min([1,2]) * sum([1,2]) = 1 * 3 = 3
 * - [1,3,1,2] 中 [1,3,1] ，总力量值为 min([1,3,1]) * sum([1,3,1]) = 1 * 5 = 5
 * - [1,3,1,2] 中 [3,1,2] ，总力量值为 min([3,1,2]) * sum([3,1,2]) = 1 * 6 = 6
 * - [1,3,1,2] 中 [1,3,1,2] ，总力量值为 min([1,3,1,2]) * sum([1,3,1,2]) = 1 * 7 = 7
 * 所有力量值之和为 1 + 9 + 1 + 4 + 4 + 4 + 3 + 5 + 6 + 7 = 44 。
 *
 * 示例 2：
 * 输入：strength = [5,4,6]
 * 输出：213
 * 解释：以下是所有连续巫师组：
 * - [5,4,6] 中 [5] ，总力量值为 min([5]) * sum([5]) = 5 * 5 = 25
 * - [5,4,6] 中 [4] ，总力量值为 min([4]) * sum([4]) = 4 * 4 = 16
 * - [5,4,6] 中 [6] ，总力量值为 min([6]) * sum([6]) = 6 * 6 = 36
 * - [5,4,6] 中 [5,4] ，总力量值为 min([5,4]) * sum([5,4]) = 4 * 9 = 36
 * - [5,4,6] 中 [4,6] ，总力量值为 min([4,6]) * sum([4,6]) = 4 * 10 = 40
 * - [5,4,6] 中 [5,4,6] ，总力量值为 min([5,4,6]) * sum([5,4,6]) = 4 * 15 = 60
 * 所有力量值之和为 25 + 16 + 36 + 36 + 40 + 60 = 213 。
 *
 * 提示：
 * 1 <= strength.length <= 10^5
 * 1 <= strength[i] <= 10^9
 */
public class SumOfTotalStrengthOfWizards {
    public int totalStrength(int[] strength) {
        int length = strength.length;
        int mod = 1_000_000_007;

        // right[i] 为右侧小于等于 strength[i] 的最近元素位置（不存在时为 n）
        int[] minIndexRight = new int[length];

        // left[i] 为左侧严格小于 strength[i] 的最近元素位置（不存在时为 -1）
        int[] minIndexLeft = new int[length];
        Arrays.fill(minIndexRight, length);
        Arrays.fill(minIndexLeft, -1);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            int value = strength[i];
            while (!stack.isEmpty() && strength[stack.peek()] >= value) {
                minIndexRight[stack.pop()] = i;
            }
            stack.push(i);
        }

        stack.clear();
        for (int i = length - 1; i >= 0; i--) {
            int value = strength[i];
            while (!stack.isEmpty() && strength[stack.peek()] > value) {
                minIndexLeft[stack.pop()] = i;
            }
            stack.push(i);
        }

        int[] s = new int[length + 1]; // 前缀和
        for (int i = 0; i < length; ++i) {
            s[i + 1] = (s[i] + strength[i]) % mod;
        }

        int[] ss = new int[length + 2]; // 前缀和的前缀和
        for (int i = 0; i <= length; ++i) {
            ss[i + 1] = (ss[i] + s[i]) % mod;
        }


        int result = 0;
        for (int i = 0; i < length; i++) {

            int l = minIndexLeft[i] + 1;
            int r = minIndexRight[i] - 1;
            long sum = ((long) (i - l + 1) * (ss[r + 2] - ss[i + 1]) - (long) (r - i + 1) * (ss[i + 1] - ss[l])) % mod;


            int value = (int) ((sum * strength[i]) % mod);
            result = (result + value) % mod;
        }

        return (result + mod) % mod;
    }
}
