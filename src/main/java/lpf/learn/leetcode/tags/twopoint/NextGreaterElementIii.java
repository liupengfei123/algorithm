package lpf.learn.leetcode.tags.twopoint;

import java.util.Arrays;

/** [556] 下一个更大元素 III
 * <p>给你一个正整数 <code>n</code> ，请你找出符合条件的最小整数，其由重新排列 <code>n</code><strong> </strong>中存在的每位数字组成，并且其值大于 <code>n</code> 。如果不存在这样的正整数，则返回 <code>-1</code> 。</p>
 * <p><strong>注意</strong> ，返回的整数应当是一个 <strong>32 位整数</strong> ，如果存在满足题意的答案，但不是 <strong>32 位整数</strong> ，同样返回 <code>-1</code> 。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <strong>输入：</strong>n = 12
 * <strong>输出：</strong>21
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre>
 * <strong>输入：</strong>n = 21
 * <strong>输出：</strong>-1
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>1 <= n <= 2<sup>31</sup> - 1</code></li>
 * </ul>
 */
public class NextGreaterElementIii {
    public int nextGreaterElement(int n) {
        char[] chars = Integer.toString(n).toCharArray();
        int l = chars.length - 1;

        while (l >= 0) {
            for (int r = chars.length - 1; r > l; r--) {
                if (chars[r] > chars[l]) {
                    char temp = chars[l];
                    chars[l] = chars[r];
                    chars[r] = temp;

                    Arrays.sort(chars, l + 1, chars.length);

                    try {
                        return Integer.parseInt(new String(chars));
                    } catch (Exception e) {
                        return -1;
                    }
                }
            }
            l--;
        }
        return -1;
    }
}
