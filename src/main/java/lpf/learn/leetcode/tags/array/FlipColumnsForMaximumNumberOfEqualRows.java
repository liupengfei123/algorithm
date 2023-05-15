package lpf.learn.leetcode.tags.array;

/** 1072 按列翻转得到最大值等行数
 <p>给定&nbsp;<code>m x n</code>&nbsp;矩阵&nbsp;<code>matrix</code>&nbsp;。</p>
 <p>你可以从中选出任意数量的列并翻转其上的&nbsp;<strong>每个&nbsp;</strong>单元格。（即翻转后，单元格的值从 <code>0</code> 变成 <code>1</code>，或者从 <code>1</code> 变为 <code>0</code> 。）</p>
 <p>返回 <em>经过一些翻转后，行与行之间所有值都相等的最大行数</em>&nbsp;。</p>
 <ol>
 </ol>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>matrix = [[0,1],[1,1]]
 <strong>输出：</strong>1
 <strong>解释：</strong>不进行翻转，有 1 行所有值都相等。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>matrix = [[0,1],[1,0]]
 <strong>输出：</strong>2
 <strong>解释：</strong>翻转第一列的值之后，这两行都由相等的值组成。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>matrix = [[0,0,0],[0,0,1],[1,1,0]]
 <strong>输出：</strong>2
 <strong>解释：</strong>翻转前两列的值之后，后两行由相等的值组成。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == matrix.length</code></li>
 <li><code>n == matrix[i].length</code></li>
 <li><code>1 &lt;= m, n &lt;= 300</code></li>
 <li><code>matrix[i][j] == 0</code> 或&nbsp;<code>1</code></li>
 </ul>
 */
public class FlipColumnsForMaximumNumberOfEqualRows {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        long[][][] bitMarks = new long[n][2][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) bitMarks[i][matrix[i][j]][j / 63] |= 1L << (j % 63);
        }

        int res = 0;
        for (int i = 0; i < n; i++) res = Math.max(res, run(bitMarks[i][0], bitMarks));

        return res;
    }

    private int run(long[] flips, long[][][] bitMarks) {
        int res = 0;
        for (long[][] bitMark : bitMarks) {
            if (check(flips, bitMark[0])) res++;
            else if (check(flips, bitMark[1])) res++;
        }
        return res;
    }

    private boolean check(long[] t, long[] s) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] != s[i]) return false;
        }
        return true;
    }
}
