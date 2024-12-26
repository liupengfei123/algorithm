package lpf.learn.leetcode.tags.binarysearch;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 1439 有序矩阵中的第 k 个最小数组和
 <p>给你一个 <code>m&nbsp;* n</code> 的矩阵 <code>mat</code>，以及一个整数 <code>k</code> ，矩阵中的每一行都以非递减的顺序排列。</p>
 <p>你可以从每一行中选出 1 个元素形成一个数组。返回所有可能数组中的第 k 个 <strong>最小</strong> 数组和。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>mat = [[1,3,11],[2,4,6]], k = 5
 <strong>输出：</strong>7
 <strong>解释：</strong>从每一行中选出一个元素，前 k 个和最小的数组分别是：
 [1,2], [1,4], [3,2], [3,4], [1,6]。其中第 5 个的和是 7 。  </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>mat = [[1,3,11],[2,4,6]], k = 9
 <strong>输出：</strong>17
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>mat = [[1,10,10],[1,4,5],[2,3,6]], k = 7
 <strong>输出：</strong>9
 <strong>解释：</strong>从每一行中选出一个元素，前 k 个和最小的数组分别是：
 [1,1,2], [1,1,3], [1,4,2], [1,4,3], [1,1,6], [1,5,2], [1,5,3]。其中第 7 个的和是 9 。
 </pre>

 <p><strong>示例 4：</strong></p>
 <pre><strong>输入：</strong>mat = [[1,1,10],[2,2,9]], k = 7
 <strong>输出：</strong>12
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == mat.length</code></li>
 <li><code>n == mat.length[i]</code></li>
 <li><code>1 &lt;= m, n &lt;= 40</code></li>
 <li><code>1 &lt;= k &lt;= min(200, n ^&nbsp;m)</code></li>
 <li><code>1 &lt;= mat[i][j] &lt;= 5000</code></li>
 <li><code>mat[i]</code> 是一个非递减数组</li>
 </ul>
 */
public class FindTheKthSmallestSumOfAMatrixWithSortedRows {
    public int kthSmallest(int[][] mat, int k) {
        int[] pre = mat[0];

        for (int i = 1; i < mat.length; i++) pre = merge(pre, mat[i], k);

        return pre[k - 1];
    }

    private int[] merge(int[] pre, int[] a, int k) {
        int n = pre.length, m = a.length;
        k = Math.min(k, n * m);

        int sum = getSum(pre, a, k);
        List<Integer> list = new ArrayList<>(k);

        for (int i = 0, j = m - 1; i < n && j >= 0; i++) {
            while (j >= 0 && pre[i] + a[j] > sum) j--;
            if (j >= 0)
                for (int z = 0; z <= j; z++) list.add(pre[i] + a[z]);
        }

        Collections.sort(list);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = list.get(i);
        return res;
    }

    private int getSum(int[] pre, int[] a, int k) {
        int l = 0, r = 200000;
        while (l < r) {
            int mid = (l + r) / 2;
            if (check(pre, a, k, mid)) r = mid;
            else l = mid + 1;
        }
        return r;
    }

    private boolean check(int[] pre, int[] a, int k, int sum) {
        int n = pre.length, m = a.length;
        int cnt = 0;
        for (int i = 0, j = m - 1; i < n; i++) {
            while (j >= 0 && pre[i] + a[j] > sum) j--;

            if (j < 0) break;
            if ((cnt += j + 1) >= k) return true;
        }
        return cnt >= k;
    }
}
