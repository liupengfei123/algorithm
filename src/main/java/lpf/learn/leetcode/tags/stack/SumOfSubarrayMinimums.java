package lpf.learn.leetcode.tags.stack;


import java.util.ArrayDeque;
import java.util.Deque;

/** 907 子数组的最小值之和
 <p>给定一个整数数组 <code>arr</code>，找到 <code>min(b)</code>&nbsp;的总和，其中 <code>b</code> 的范围为 <code>arr</code> 的每个（连续）子数组。</p>
 <p>由于答案可能很大，因此<strong> 返回答案模 <code>10^9 + 7</code></strong> 。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [3,1,2,4]
 <strong>输出：</strong>17
 <strong>解释：
 </strong>子数组为<strong> </strong>[3]，[1]，[2]，[4]，[3,1]，[1,2]，[2,4]，[3,1,2]，[1,2,4]，[3,1,2,4]。
 最小值为 3，1，2，4，1，1，2，1，1，1，和为 17。</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [11,81,94,43,3]
 <strong>输出：</strong>444
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= arr.length &lt;= 3 * 10<sup>4</sup></code></li>
 <li><code>1 &lt;= arr[i] &lt;= 3 * 10<sup>4</sup></code></li>
 </ul>
 */
public class SumOfSubarrayMinimums {

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length, mod = 1000_000_007;
        long res = 0;
        Deque<int[]> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int j = i;
            while (!stack.isEmpty() && stack.peek()[0] > arr[i]) {
                int[] pop = stack.pop();
                j = pop[1];
                long l = pop[2] - j + 1, r = i - pop[2];
                res = (res + pop[0] * l * r) % mod;
            }
            stack.push(new int[]{arr[i], j, i});
        }
        while (!stack.isEmpty()) {
            int[] pop = stack.pop();
            long l = pop[2] - pop[1] + 1, r = n - pop[2];
            res = (res + pop[0] * l * r) % mod;
        }
        return (int) (res% mod);
    }

}
