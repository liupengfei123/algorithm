package lpf.learn.leetcode.tags.binarysearch;


/** [378]有序矩阵中第 K 小的元素
 <p>给你一个&nbsp;<code>n x n</code><em>&nbsp;</em>矩阵&nbsp;<code>matrix</code> ，其中每行和每列元素均按升序排序，找到矩阵中第 <code>k</code> 小的元素。<br /> 请注意，它是 <strong>排序后</strong> 的第 <code>k</code> 小元素，而不是第 <code>k</code> 个 <strong>不同</strong> 的元素。</p>
 <p>你必须找到一个内存复杂度优于&nbsp;<code>O(n<sup>2</sup>)</code> 的解决方案。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
 <strong>输出：</strong>13
 <strong>解释：</strong>矩阵中的元素为 [1,5,9,10,11,12,13,<strong>13</strong>,15]，第 8 小元素是 13
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>matrix = [[-5]], k = 1
 <strong>输出：</strong>-5
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == matrix.length</code></li>
 <li><code>n == matrix[i].length</code></li>
 <li><code>1 &lt;= n &lt;= 300</code></li>
 <li><code>-10<sup>9</sup> &lt;= matrix[i][j] &lt;= 10<sup>9</sup></code></li>
 <li>题目数据 <strong>保证</strong> <code>matrix</code> 中的所有行和列都按 <strong>非递减顺序</strong> 排列</li>
 <li><code>1 &lt;= k &lt;= n<sup>2</sup></code></li>
 </ul>

 <p><strong>进阶：</strong></p>
 <ul>
 <li>你能否用一个恒定的内存(即 <code>O(1)</code> 内存复杂度)来解决这个问题?</li>
 <li>你能在 <code>O(n)</code> 的时间复杂度下解决这个问题吗?这个方法对于面试来说可能太超前了，但是你会发现阅读这篇文章（&nbsp;<a href="http://www.cse.yorku.ca/~andy/pubs/X+Y.pdf" target="_blank">this paper</a>&nbsp;）很有趣。</li>
 </ul>
 */
public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length, m = matrix[0].length;
        int l = matrix[0][0], r = matrix[n - 1][m - 1];
        while (l < r) {
            int mid = l + (r - l) / 2;

            if (check(matrix, k, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    public boolean check(int[][] matrix, int k, int n, int x) {
        int i = n - 1;
        int j = 0;
        int num = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] <= x) {
                num += i + 1;
                j++;
            } else {
                i--;
            }
        }
        return num >= k;
    }


    private boolean check(int[][] matrix, int k, int x) {
        int m = matrix[0].length, c = 0;

        for (int[] a : matrix) {
            if (a[0] > x) break;

            int l = 0, r = m - 1;
            while (l < r) {
                int mid = l + (r - l + 1) / 2;

                if (a[mid] <= x) l = mid;
                else r = mid - 1;
            }
            c += l + 1;

            if (c >= k) return true;
        }
        return c >= k;
    }
}
