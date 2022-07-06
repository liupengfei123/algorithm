package lpf.learn.leetcode.game.weekly300;

import lpf.learn.leetcode.entity.ListNode;

import java.util.Arrays;

/** [2326] 螺旋矩阵 IV
 * <p>给你两个整数：<code>m</code> 和 <code>n</code> ，表示矩阵的维数。</p>
 * <p>另给你一个整数链表的头节点 <code>head</code> 。</p>
 * <p>请你生成一个大小为 <code>m x n</code> 的螺旋矩阵，矩阵包含链表中的所有整数。链表中的整数从矩阵 <strong>左上角</strong> 开始、<strong>顺时针 </strong>按 <strong>螺旋</strong> 顺序填充。如果还存在剩余的空格，则用 <code>-1</code> 填充。</p>
 * <p>返回生成的矩阵。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2022/05/09/ex1new.jpg" style="width: 240px; height: 150px;">
 * <pre><strong>输入：</strong>m = 3, n = 5, head = [3,0,2,6,8,1,7,9,4,2,5,5,0]
 * <strong>输出：</strong>[[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]
 * <strong>解释：</strong>上图展示了链表中的整数在矩阵中是如何排布的。
 * 注意，矩阵中剩下的空格用 -1 填充。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2022/05/11/ex2.jpg" style="width: 221px; height: 60px;">
 * <pre><strong>输入：</strong>m = 1, n = 4, head = [0,1,2]
 * <strong>输出：</strong>[[0,1,2,-1]]
 * <strong>解释：</strong>上图展示了链表中的整数在矩阵中是如何从左到右排布的。
 * 注意，矩阵中剩下的空格用 -1 填充。</pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>1 &lt;= m, n &lt;= 10<sup>5</sup></code></li>
 * 	<li><code>1 &lt;= m * n &lt;= 10<sup>5</sup></code></li>
 * 	<li>链表中节点数目在范围 <code>[1, m * n]</code> 内</li>
 * 	<li><code>0 &lt;= Node.val &lt;= 1000</code></li>
 * </ul>
 */
public class SpiralMatrixIv {

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(result[i], -1);
        }

        ListNode node = head;
        int[][] go = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int goIndex = 0;

        int x = 0, y = 0;

        while (node != null) {
            result[x][y] = node.val;
            node = node.next;

            int newX = x + go[goIndex][0];
            int newY = y + go[goIndex][1];

            if (newX < 0 || newX >= m || newY < 0 || newY >= n || result[newX][newY] != -1) {
                goIndex = (goIndex + 1) % 4;

                newX = x + go[goIndex][0];
                newY = y + go[goIndex][1];
            }
            x = newX;
            y = newY;
        }

        return result;
    }
}
