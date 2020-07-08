package lpf.learn.leetcode.learn.queue_stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 542. 01 矩阵
 *
 * 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。
 * 两个相邻元素间的距离为 1 。
 *
 * 示例 1:
 * 输入:
 * 0 0 0
 * 0 1 0
 * 0 0 0
 * 输出:
 * 0 0 0
 * 0 1 0
 * 0 0 0
 *
 * 示例 2:
 * 输入:
 * 0 0 0
 * 0 1 0
 * 1 1 1
 * 输出:
 * 0 0 0
 * 0 1 0
 * 1 2 1
 *
 * 注意:
 * 给定矩阵的元素个数不超过 10000。
 * 给定矩阵中至少有一个元素是 0。
 * 矩阵中的元素只在四个方向上相邻: 上、下、左、右。
 */
public class UpdateMatrix {

    public int[][] updateMatrix(int[][] matrix) {
        if (matrix == null || matrix.length <= 0) {
            return matrix;
        }

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    queue.add(new int[]{i, j});
                } else {
                    matrix[i][j] = -1;
                }
            }
        }
        int[] xIndex = {-1, 1, 0, 0};
        int[] yIndex = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0], y = point[1];
            for (int i = 0; i < 4; i++) {
                int newX = x + xIndex[i], newY = y + yIndex[i];
                if (newX < matrix.length && newX >= 0 && newY < matrix[0].length && newY >= 0
                        && matrix[newX][newY] == -1) {
                    matrix[newX][newY] = matrix[x][y] + 1;
                    queue.add(new int[]{newX, newY});
                }
            }
        }
        return matrix;
    }
}
