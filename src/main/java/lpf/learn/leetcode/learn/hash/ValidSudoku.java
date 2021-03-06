package lpf.learn.leetcode.learn.hash;

import java.util.Arrays;

/** [36]有效的数独
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 * 上图是一个部分填充的有效的数独。
 * 数独部分空格内已填入了数字，空白格用 '.' 表示。
 *
 * 示例 1:
 * 输入:
 * [
 *  ["5","3",".",".","7",".",".",".","."],
 *  ["6",".",".","1","9","5",".",".","."],
 *  [".","9","8",".",".",".",".","6","."],
 *  ["8",".",".",".","6",".",".",".","3"],
 *  ["4",".",".","8",".","3",".",".","1"],
 *  ["7",".",".",".","2",".",".",".","6"],
 *  [".","6",".",".",".",".","2","8","."],
 *  [".",".",".","4","1","9",".",".","5"],
 *  [".",".",".",".","8",".",".","7","9"]
 * ]
 * 输出: true
 *
 * 示例 2:
 * 输入:
 * [
 *   ["8","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * 输出: false
 * 解释: 除了第一行的第一个数字从 5 改为 8 以外，空格内其他数字均与 示例1 相同。
 *     但由于位于左上角的 3x3 宫内有两个 8 存在, 因此这个数独是无效的。
 * 说明:
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 * 给定数独序列只包含数字 1-9 和字符 '.' 。
 * 给定数独永远是 9x9 形式的。
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[] array = new int[9];
        boolean resule = true;
        for (int i = 0; i < 9; i++) {
            resule = isValidSudokuRow(board, i, array) && isValidSudokuCol(board, i, array) && isValidSudoku3(board, i, array);
            if (!resule) {
                break;
            }
        }
        return resule;
    }

    //判断行
    private boolean isValidSudokuRow(char[][] board, int index, int[] array) {
        Arrays.fill(array, 0);
        for (int i = 0; i < 9; i++) {
            char c = board[index][i];
            if (c != '.') {
                array[c - '1']++;
            }
        }
        return testArray(array);
    }

    //判断列
    private boolean isValidSudokuCol(char[][] board, int index, int[] array) {
        Arrays.fill(array, 0);
        for (int i = 0; i < 9; i++) {
            char c = board[i][index];
            if (c != '.') {
                array[c - '1']++;
            }
        }
        return testArray(array);
    }

    //判断矩阵
    private boolean isValidSudoku3(char[][] board, int index, int[] array) {
        Arrays.fill(array, 0);
        int startRow = (index / 3) * 3;
        int startCol = (index % 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char c = board[startRow + i][startCol + j];
                if (c != '.') {
                    array[c - '1']++;
                }
            }
        }
        return testArray(array);
    }

    private boolean testArray(int[] array) {
        for (int i : array) {
            if (i > 1) {
                return false;
            }
        }
        return true;
    }
}
