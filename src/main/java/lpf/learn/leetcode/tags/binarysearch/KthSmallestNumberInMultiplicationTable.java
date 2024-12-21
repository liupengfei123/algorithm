package lpf.learn.leetcode.tags.binarysearch;

/** [668]乘法表中第k小的数
 <p>几乎每一个人都用&nbsp;<a href="https://baike.baidu.com/item/%E4%B9%98%E6%B3%95%E8%A1%A8">乘法表</a>。但是你能在乘法表中快速找到第 <code>k</code> 小的数字吗？</p>
 <p>乘法表是大小为 <code>m x n</code> 的一个整数矩阵，其中&nbsp;<code>mat[i][j] == i * j</code>（下标从 <strong>1</strong> 开始）。</p>
 <p>给你三个整数 <code>m</code>、<code>n</code> 和 <code>k</code>，请你在大小为&nbsp;<code>m x n</code> 的乘法表中，找出并返回第 <code>k</code>&nbsp;小的数字。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2021/05/02/multtable1-grid.jpg" style="width: 500px; height: 254px;" />
 <pre>
 <strong>输入：</strong>m = 3, n = 3, k = 5
 <strong>输出：</strong>3
 <strong>解释：</strong>第 5 小的数字是 3 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2021/05/02/multtable2-grid.jpg" style="width: 493px; height: 293px;" />
 <pre>
 <strong>输入：</strong>m = 2, n = 3, k = 6
 <strong>输出：</strong>6
 <strong>解释：</strong>第 6 小的数字是 6 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= m, n &lt;= 3 * 10<sup>4</sup></code></li>
 <li><code>1 &lt;= k &lt;= m * n</code></li>
 </ul>
 */
public class KthSmallestNumberInMultiplicationTable {



    public int findKthNumber(int m, int n, int k) {
        int l = 1, r = m * n;
        while (l < r) {
            int mid = l + (r - l) / 2;

            if (check(m, n, k, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    private boolean check(int m, int n, int k, int x) {
        //我们可以遍历乘法表的每一行，对于乘法表的第 i 行，其数字均为 i 的倍数，因此不超过 x 的数字有 min(⌊i / x⌋,n) 个

        int c = x / n * n;
        for (int i = x / n + 1; i <= m; ++i) {
            c += x / i;
        }
        return c >= k;
    }

    private boolean check2(int m, int n, int k, int x) {
        int c = 0;

        for (int i = 1; i <= m; i++) {
            if (i > x) break;

            int l = 1, r = n;
            while (l < r) {
                int mid = l + (r - l + 1) / 2;

                if (mid * i <= x) l = mid;
                else r = mid - 1;
            }
            c += l;

            if (c >= k) return true;
        }
        return c >= k;
    }
}
