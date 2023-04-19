package lpf.learn.leetcode.tags.dp;

/** 1043 分隔数组以得到最大和
 <p>给你一个整数数组 <code>arr</code>，请你将该数组分隔为长度 <strong>最多 </strong>为 k 的一些（连续）子数组。分隔完成后，每个子数组的中的所有值都会变为该子数组中的最大值。</p>
 <p>返回将数组分隔变换后能够得到的元素最大和。本题所用到的测试用例会确保答案是一个 32 位整数。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [1,15,7,9,2,5,10], k = 3
 <strong>输出：</strong>84
 <strong>解释：</strong>数组变为 [15,15,15,9,10,10,10]</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [1,4,1,5,7,3,6,1,9,9,3], k = 4
 <strong>输出：</strong>83
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [1], k = 1
 <strong>输出：</strong>1
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= arr.length &lt;= 500</code></li>
 <li><code>0 &lt;= arr[i] &lt;= 10<sup>9</sup></code></li>
 <li><code>1 &lt;= k &lt;= arr.length</code></li>
 </ul>
 */
public class PartitionArrayForMaximumSum {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int max = 0;
            for (int j = i; j > Math.max(i - k, 0); j--) {
                max = Math.max(max, arr[j - 1]);
                dp[i] = Math.max(dp[i], dp[j - 1] + max * (i - j + 1));
            }
        }
        return dp[n];
    }
}
