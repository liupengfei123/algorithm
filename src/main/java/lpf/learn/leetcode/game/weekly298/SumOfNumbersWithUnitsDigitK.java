package lpf.learn.leetcode.game.weekly298;

/** [2310] 个位数字为 K 的整数之和
 * <p>给你两个整数 <code>num</code> 和 <code>k</code> ，考虑具有以下属性的正整数多重集：</p>
 * <ul>
 * 	<li>每个整数个位数字都是 <code>k</code> 。</li>
 * 	<li>所有整数之和是 <code>num</code> 。</li>
 * </ul>
 *
 * <p>返回该多重集的最小大小，如果不存在这样的多重集，返回<em> </em><code>-1</code> 。</p>
 *
 * <p>注意：</p>
 * <ul>
 * 	<li>多重集与集合类似，但多重集可以包含多个同一整数，空多重集的和为 <code>0</code> 。</li>
 * 	<li><strong>个位数字</strong> 是数字最右边的数位。</li>
 * </ul>
 *
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <strong>输入：</strong>num = 58, k = 9
 * <strong>输出：</strong>2
 * <strong>解释：</strong>
 * 多重集 [9,49] 满足题目条件，和为 58 且每个整数的个位数字是 9 。
 * 另一个满足条件的多重集是 [19,39] 。
 * 可以证明 2 是满足题目条件的多重集的最小长度。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre>
 * <strong>输入：</strong>num = 37, k = 2
 * <strong>输出：</strong>-1
 * <strong>解释：</strong>个位数字为 2 的整数无法相加得到 37 。</pre>
 *
 * <p><strong>示例 3：</strong></p>
 * <pre>
 * <strong>输入：</strong>num = 0, k = 7
 * <strong>输出：</strong>0
 * <strong>解释：</strong>空多重集的和为 0 。
 * </pre>
 *
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>0 &lt;= num &lt;= 3000</code></li>
 * 	<li><code>0 &lt;= k &lt;= 9</code></li>
 * </ul>
 */
public class SumOfNumbersWithUnitsDigitK {
    public int minimumNumbers(int num, int k) {
        if (num == 0) {
            return 0;
        }
        if (k == 0 ) {
            return num % 10 != 0 ? -1 : 1;
        }
        int result = 0;
        int temp = 0;

        while (temp <= num) {
            temp += k;
            result++;
            if (num % 10 == temp % 10) {
                return result;
            }
        }
        return -1;
    }
}
