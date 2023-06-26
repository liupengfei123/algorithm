package lpf.learn.leetcode.tags.number;

/** 2485 找出中枢整数
 <p>给你一个正整数 <code>n</code> ，找出满足下述条件的<strong> 中枢整数</strong> <code>x</code> ：</p>
 <ul>
 <li><code>1</code> 和 <code>x</code> 之间的所有元素之和等于 <code>x</code> 和 <code>n</code> 之间所有元素之和。</li>
 </ul>
 <p>返回中枢整数<em> </em><code>x</code> 。如果不存在中枢整数，则返回 <code>-1</code> 。题目保证对于给定的输入，至多存在一个中枢整数。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>n = 8
 <strong>输出：</strong>6
 <strong>解释：</strong>6 是中枢整数，因为 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21 。
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>n = 1
 <strong>输出：</strong>1
 <strong>解释：</strong>1 是中枢整数，因为 1 = 1 。
 </pre>

 <p><strong class="example">示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>n = 4
 <strong>输出：</strong>-1
 <strong>解释：</strong>可以证明不存在满足题目要求的整数。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n &lt;= 1000</code></li>
 </ul>
 */
public class FindThePivotInteger {
    public int pivotInteger(int n) {
        int[] preSum = new int[n + 1];

        for (int i = 1; i <= n; i++) preSum[i] = i + preSum[i - 1];

        for (int i = 1; i <= n; i++) {
            if (preSum[i] == preSum[n] - preSum[i - 1]) return i;
        }
        return -1;
    }
}
