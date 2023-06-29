package lpf.learn.leetcode.tags.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 1253 重构 2 行二进制矩阵
 <p>给你一个&nbsp;<code>2</code>&nbsp;行 <code>n</code> 列的二进制数组：</p>
 <ul>
 <li>矩阵是一个二进制矩阵，这意味着矩阵中的每个元素不是&nbsp;<code>0</code>&nbsp;就是&nbsp;<code>1</code>。</li>
 <li>第 <code>0</code> 行的元素之和为&nbsp;<code>upper</code>。</li>
 <li>第 <code>1</code> 行的元素之和为 <code>lower</code>。</li>
 <li>第 <code>i</code> 列（从 <code>0</code> 开始编号）的元素之和为&nbsp;<code>colsum[i]</code>，<code>colsum</code>&nbsp;是一个长度为&nbsp;<code>n</code>&nbsp;的整数数组。</li>
 </ul>

 <p>你需要利用&nbsp;<code>upper</code>，<code>lower</code>&nbsp;和&nbsp;<code>colsum</code>&nbsp;来重构这个矩阵，并以二维整数数组的形式返回它。</p>
 <p>如果有多个不同的答案，那么任意一个都可以通过本题。</p>
 <p>如果不存在符合要求的答案，就请返回一个空的二维数组。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>upper = 2, lower = 1, colsum = [1,1,1]
 <strong>输出：</strong>[[1,1,0],[0,0,1]]
 <strong>解释：</strong>[[1,0,1],[0,1,0]] 和 [[0,1,1],[1,0,0]] 也是正确答案。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>upper = 2, lower = 3, colsum = [2,2,1,1]
 <strong>输出：</strong>[]
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>upper = 5, lower = 5, colsum = [2,1,2,0,1,0,1,2,0,1]
 <strong>输出：</strong>[[1,1,1,0,1,0,0,1,0,0],[1,0,1,0,0,0,1,1,0,1]]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= colsum.length &lt;= 10^5</code></li>
 <li><code>0 &lt;= upper, lower &lt;= colsum.length</code></li>
 <li><code>0 &lt;= colsum[i] &lt;= 2</code></li>
 </ul>
 */
public class ReconstructA2RowBinaryMatrix {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int n = colsum.length;
        int[][] a = new int[2][n];

        for (int i = 0; i < colsum.length; i++) {
            if (colsum[i] == 0) continue;
            if (colsum[i] == 2) {
                a[i][0] = a[i][1] = 1;
                upper--;lower--;
                continue;
            }
            a[i][upper > lower ? 0 : 1] = 1;
            if (upper > lower) upper--;
            else lower--;
        }
        if (upper < 0 || lower < 0) return Collections.emptyList();

        List res = new ArrayList<>();
        res.add(a[0]);
        res.add(a[1]);
        return res;
    }
}
