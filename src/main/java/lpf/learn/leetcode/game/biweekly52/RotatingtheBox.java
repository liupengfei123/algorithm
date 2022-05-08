package lpf.learn.leetcode.game.biweekly52;

import java.util.Arrays;

/** 5744. 旋转盒子
 *  给你一个 m x n 的字符矩阵 box ，它表示一个箱子的侧视图。箱子的每一个格子可能为：
 * '#' 表示石头
 * '*' 表示固定的障碍物
 * '.' 表示空位置
 * 这个箱子被 顺时针旋转 90 度 ，由于重力原因，部分石头的位置会发生改变。每个石头会垂直掉落，直到它遇到障碍物，另一个石头或者箱子的底部。重力 不会 影响障碍物的位置，同时箱子旋转不会产生惯性 ，也就是说石头的水平位置不会发生改变。
 * 题目保证初始时 box 中的石头要么在一个障碍物上，要么在另一个石头上，要么在箱子的底部。
 * 请你返回一个 n x m的矩阵，表示按照上述旋转后，箱子内的结果。
 *
 * 示例 1：
 * 输入：box = [["#",".","#"]]
 * 输出：[["."],
 *       ["#"],
 *       ["#"]]
 *
 * 示例 2：
 * 输入：box = [["#",".","*","."],
 *             ["#","#","*","."]]
 * 输出：[["#","."],
 *       ["#","#"],
 *       ["*","*"],
 *       [".","."]]
 *
 * 示例 3：
 * 输入：box = [["#","#","*",".","*","."],
 *             ["#","#","#","*",".","."],
 *             ["#","#","#",".","#","."]]
 * 输出：[[".","#","#"],
 *       [".","#","#"],
 *       ["#","#","*"],
 *       ["#","*","."],
 *       ["#",".","*"],
 *       ["#",".","."]]
 *
 * 提示：
 * m == box.length
 * n == box[i].length
 * 1 <= m, n <= 500
 * box[i][j] 只可能是 '#' ，'*' 或者 '.' 。
 *
 * @author liupf
 * @date 2021-05-15 22:46
 */
public class RotatingtheBox {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;

        char[][] result = new char[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(result[i], '.');
        }

        for (int i = 0; i < m; i++) {
            int start = n - 1, count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (box[i][j] == '#') {
                    count++;
                }
                if (box[i][j] != '*' && j != 0) {
                    continue;
                }
                if (box[i][j] == '*') {
                    result[j][m - i - 1] = '*';
                }
                for (int z = count; z > 0; z--) {
                    result[start--][m - i - 1] = '#';
                }
                start = j - 1;
                count = 0;
            }
        }
        return result;
    }
}
