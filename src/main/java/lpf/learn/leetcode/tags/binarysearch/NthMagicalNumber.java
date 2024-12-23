package lpf.learn.leetcode.tags.binarysearch;


/** 878 第 N 个神奇数字
 <p>一个正整数如果能被 <code>a</code> 或 <code>b</code> 整除，那么它是神奇的。</p>
 <p>给定三个整数 <code>n</code> ,&nbsp;<code>a</code> , <code>b</code> ，返回第 <code>n</code> 个神奇的数字。因为答案可能很大，所以返回答案&nbsp;<strong>对&nbsp;</strong><code>10<sup>9</sup>&nbsp;+ 7</code> <strong>取模&nbsp;</strong>后的值。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>n = 1, a = 2, b = 3
 <strong>输出：</strong>2
 </pre>

 <p><strong>示例&nbsp;2：</strong></p>
 <pre>
 <strong>输入：</strong>n = 4, a = 2, b = 3
 <strong>输出：</strong>6
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n &lt;= 10<sup>9</sup></code></li>
 <li><code>2 &lt;= a, b &lt;= 4 * 10<sup>4</sup></code></li>
 </ul>
 */
public class NthMagicalNumber {
    public int nthMagicalNumber(int n, int a, int b) {
        int gcd = gcd(a, b);
        int c = (a * b) / gcd;

        long l = 0, r = Long.MAX_VALUE;
        while (l < r) {
            long mid = l + (r - l) / 2;
            if (check(n, a, b, c, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return (int) (r % 1000_000_007);
    }

    private boolean check(int n, int a, int b, int c, long value) {
        long cnt = value / a + value / b - value / c;
        return n <= cnt;
    }

    private int gcd(int a, int b) {
        while (a != 0) {
            int temp = b % a;
            b = a;
            a = temp;
        }
        return b;
    }
}
