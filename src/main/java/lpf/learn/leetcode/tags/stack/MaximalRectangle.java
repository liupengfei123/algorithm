package lpf.learn.leetcode.tags.stack;


import java.util.ArrayDeque;
import java.util.Deque;

/** 85 最大矩形
 <p>给定一个仅包含&nbsp;<code>0</code> 和 <code>1</code> 、大小为 <code>rows x cols</code> 的二维二进制矩阵，找出只包含 <code>1</code> 的最大矩形，并返回其面积。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://pic.leetcode.cn/1722912576-boIxpm-image.png" style="width: 402px; height: 322px;" />
 <pre>
 <strong>输入：</strong>matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
 <strong>输出：</strong>6
 <strong>解释：</strong>最大矩形如上图所示。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>matrix = [["0"]]
 <strong>输出：</strong>0
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>matrix = [["1"]]
 <strong>输出：</strong>1
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>rows == matrix.length</code></li>
 <li><code>cols == matrix[0].length</code></li>
 <li><code>1 &lt;= row, cols &lt;= 200</code></li>
 <li><code>matrix[i][j]</code> 为 <code>'0'</code> 或 <code>'1'</code></li>
 </ul>
 */
public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        int n  = matrix.length, m = matrix[0].length;
        int[][] rows = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') rows[i][j] = j == 0 ? 1 : rows[i][j - 1] + 1;
            }
        }

        int res = 0;
        for (int j = 0; j < m; j++) {
            Deque<int[]> stack = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                int z = i;
                while (!stack.isEmpty() && stack.peek()[0] >= rows[i][j]) {
                    int[] pop = stack.pop();
                    z = pop[1];
                    res = Math.max(res, pop[0] * (i - pop[1]));
                }
                stack.push(new int[] {rows[i][j], z});
            }
            while (!stack.isEmpty()) {
                int[] pop = stack.pop();
                res = Math.max(res, pop[0] * (n - pop[1]));
            }
        }
        return res;
    }
}
