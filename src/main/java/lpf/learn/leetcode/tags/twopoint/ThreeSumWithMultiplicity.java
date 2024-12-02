package lpf.learn.leetcode.tags.twopoint;


import java.util.Arrays;

/** 923 三数之和的多种可能
 <p>给定一个整数数组
 <meta charset="UTF-8" />&nbsp;<code>arr</code>&nbsp;，以及一个整数&nbsp;<code>target</code>&nbsp;作为目标值，返回满足 <code>i &lt; j &lt; k</code> 且
 <meta charset="UTF-8" />&nbsp;<code>arr[i] + arr[j] + arr[k] == target</code>&nbsp;的元组&nbsp;<code>i, j, k</code>&nbsp;的数量。</p>
 <p>由于结果会非常大，请返回 <code>10<sup>9</sup>&nbsp;+ 7</code>&nbsp;的模。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [1,1,2,2,3,3,4,4,5,5], target = 8
 <strong>输出：</strong>20
 <strong>解释：</strong>
 按值枚举(arr[i], arr[j], arr[k])：
 (1, 2, 5) 出现 8 次；
 (1, 3, 4) 出现 8 次；
 (2, 2, 4) 出现 2 次；
 (2, 3, 3) 出现 2 次。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [1,1,2,2,2,2], target = 5
 <strong>输出：</strong>12
 <strong>解释：</strong>
 arr[i] = 1, arr[j] = arr[k] = 2 出现 12 次：
 我们从 [1,1] 中选择一个 1，有 2 种情况，
 从 [2,2,2,2] 中选出两个 2，有 6 种情况。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>3 &lt;= arr.length &lt;= 3000</code></li>
 <li><code>0 &lt;= arr[i] &lt;= 100</code></li>
 <li><code>0 &lt;= target &lt;= 300</code></li>
 </ul>
 */
public class ThreeSumWithMultiplicity {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length, mod = 1000_000_007,res = 0;
        for (int a = 0; a < n; a++) {
            int b = a + 1, c = n - 1;
            while (b < c) {
                int val = arr[a] + arr[b] + arr[c];
                if (val != target) {
                    int ignore = val > target ? c-- : b++;
                    continue;
                }
                if (arr[b] == arr[c]) {
                    res = (res + (c - b + 1) * (c - b) / 2) % mod;
                    break;
                }
                int nb = b, nc = c;
                while (arr[nb] == arr[b]) nb++;
                while (arr[nc] == arr[c]) nc--;

                res = (res + (nb - b) * (c - nc)) % mod;
                b = nb;
                c = nc;
            }
        }
        return res;
    }
}
