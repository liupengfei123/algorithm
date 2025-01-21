package lpf.learn.leetcode.tags.bitoperation;


/** [342] 4的幂
 <p>给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 <code>true</code> ；否则，返回 <code>false</code> 。</p>
 <p>整数 <code>n</code> 是 4 的幂次方需满足：存在整数 <code>x</code> 使得 <code>n == 4<sup>x</sup></code></p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>n = 16
 <strong>输出：</strong>true
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>n = 5
 <strong>输出：</strong>false
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>n = 1
 <strong>输出：</strong>true
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>-2<sup>31</sup> &lt;= n &lt;= 2<sup>31</sup> - 1</code></li>
 </ul>
 <p><strong>进阶：</strong>你能不使用循环或者递归来完成本题吗？</p>
 */
public class PowerOfFour {

    public boolean isPowerOfFour(int n) {
        if (n < 1 || Integer.bitCount(n) != 1) return false;

        int cnt = Integer.numberOfTrailingZeros(n);
        return (cnt & 1) == 0;
    }
}
