package lpf.learn.leetcode.tags.binarysearch;


/** 1201 丑数 III
 <p>丑数是可以被&nbsp;<code>a</code>&nbsp;<strong>或</strong>&nbsp;<code>b</code>&nbsp;<strong>或</strong> <code>c</code>&nbsp;整除的 <strong>正整数</strong> 。</p>
 <p>给你四个整数：<code>n</code> 、<code>a</code> 、<code>b</code> 、<code>c</code> ，请你设计一个算法来找出第&nbsp;<code>n</code>&nbsp;个丑数。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>n = 3, a = 2, b = 3, c = 5
 <strong>输出：</strong>4
 <strong>解释：</strong>丑数序列为 2, 3, 4, 5, 6, 8, 9, 10... 其中第 3 个是 4。</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>n = 4, a = 2, b = 3, c = 4
 <strong>输出：</strong>6
 <strong>解释：</strong>丑数序列为 2, 3, 4, 6, 8, 9, 10, 12... 其中第 4 个是 6。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>n = 5, a = 2, b = 11, c = 13
 <strong>输出：</strong>10
 <strong>解释：</strong>丑数序列为 2, 4, 6, 8, 10, 11, 12, 13... 其中第 5 个是 10。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n, a, b, c &lt;= 10<sup>9</sup></code></li>
 <li><code>1 &lt;= a * b * c &lt;= 10<sup>18</sup></code></li>
 <li>本题结果在&nbsp;<code>[1,&nbsp;2 * 10<sup>9</sup>]</code>&nbsp;的范围内</li>
 </ul>
 */
public class UglyNumberIii {
    public int nthUglyNumber(int n, int a, int b, int c) {
        long ab = (long) a * b / gcd(a, b), bc = (long) c * b / gcd(c, b), ac = (long) a * c / gcd(a, c);
        long abc = ab * c / gcd((int) ab, c);

        int l = 1, r = 2000_000_000;
        while (l < r) {
            int mid = l + (r - l) / 2;

            long cnt = (long) mid / a + mid / b + mid / c - mid / ab - mid / bc - mid / ac + mid / abc;
            if (cnt >= n) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }


    private int gcd(int a, int b) {
        while (a != 0) {
            int t = b % a;
            b = a;
            a = t;
        }
        return b;
    }
}
