package lpf.learn.leetcode.tags.twopoint;


import java.util.Arrays;

/** 面试题 16.06 最小差
 <p>给定两个整数数组<code>a</code>和<code>b</code>，计算具有最小差绝对值的一对数值（每个数组中取一个值），并返回该对数值的差</p>

 <p><strong>示例：</strong></p>
 <pre>
 <strong>输入：</strong>{1, 3, 15, 11, 2}, {23, 127, 235, 19, 8}
 <strong>输出：</strong>3，即数值对(11, 8)
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= a.length, b.length &lt;= 100000</code></li>
 <li><code>-2147483648 &lt;= a[i], b[i] &lt;= 2147483647</code></li>
 <li>正确结果在区间 <code>[0, 2147483647]</code> 内</li>
 </ul>
 */
public class SmallestDifferenceLcci {
    public int smallestDifference(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        long min = 2147483647;
        int n = a.length, m = b.length, i = 0, j = 0;

        while (i < n && j < m) {
            long temp = Math.abs(0L + a[i] - b[j]);
            int ignore = i + 1 < n && Math.abs(0L + a[i + 1] - b[j]) < temp ? i++ : j++;
            min = Math.min(min, temp);
        }
        return (int) min;
    }
}
