package lpf.learn.leetcode.tags.dp;

import java.util.stream.IntStream;

/** 1191 K 次串联后最大子数组之和
 <p>给定一个整数数组&nbsp;<code>arr</code>&nbsp;和一个整数&nbsp;<code>k</code>&nbsp;，通过重复&nbsp;<code>k</code>&nbsp;次来修改数组。</p>
 <p>例如，如果&nbsp;<code>arr = [1, 2]</code>&nbsp;，
 <meta charset="UTF-8" />&nbsp;<code>k = 3</code>&nbsp;，那么修改后的数组将是 <code>[1, 2, 1, 2, 1, 2]</code> 。</p>
 <p>返回修改后的数组中的最大的子数组之和。注意，子数组长度可以是 <code>0</code>，在这种情况下它的总和也是 <code>0</code>。</p>
 <p>由于&nbsp;<strong>结果可能会很大</strong>，需要返回的
 <meta charset="UTF-8" />&nbsp;<code>10<sup>9</sup>&nbsp;+ 7</code>&nbsp;的&nbsp;<strong>模</strong>&nbsp;。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [1,2], k = 3
 <strong>输出：</strong>9
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [1,-2,1], k = 5
 <strong>输出：</strong>2
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [-1,-2], k = 7
 <strong>输出：</strong>0
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= arr.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= k &lt;= 10<sup>5</sup></code></li>
 <li><code>-10<sup>4</sup>&nbsp;&lt;= arr[i] &lt;= 10<sup>4</sup></code></li>
 </ul>
 */
public class KConcatenationMaximumSum {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int mod = 1000_000_007;
        int[] newArr;
        if (k >= 2) {
            int sum = IntStream.of(arr).sum();
            sum = sum > 0 && k > 2 ? sum : 0;
            if (sum > 0) sum = (int) (((long)sum * (k - 2)) % mod);

            newArr = new int[arr.length * 2 + 1];
            newArr[arr.length] = sum;
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            System.arraycopy(arr, 0, newArr, arr.length + 1, arr.length);
        } else {
            newArr = arr;
        }

        long res = 0;
        long sum = 0;
        for (int num : newArr) {
            if (sum > 0) sum += num;
            else sum = num;
            res = Math.max(res, sum);
        }
        return (int) (res % mod);
    }
}
