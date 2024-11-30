package lpf.learn.leetcode.tags.twopoint;


/** [633]平方数之和
 <p>给定一个非负整数&nbsp;<code>c</code>&nbsp;，你要判断是否存在两个整数 <code>a</code> 和 <code>b</code>，使得&nbsp;<code>a<sup>2</sup> + b<sup>2</sup> = c</code> 。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>c = 5
 <strong>输出：</strong>true
 <strong>解释：</strong>1 * 1 + 2 * 2 = 5
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>c = 3
 <strong>输出：</strong>false
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>0 &lt;= c &lt;= 2<sup>31</sup> - 1</code></li>
 </ul>
 */
public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        long l = 0, r = (long) Math.sqrt(c) + 1;

        while (l <= r) {
            long sum = l * l + r * r;

            if (sum == c) return true;
            else if (sum < c) l++;
            else r--;
        }
        return false;
    }
}
