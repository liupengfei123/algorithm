package lpf.learn.leetcode.learn.array;

/** 面试题 01.07 旋转矩阵
 * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
 * 不占用额外内存空间能否做到？
 *
 * 示例 1:
 * 给定 matrix =
 * [
 *   [1,2,3],
 *   [4,5,6],
 *   [7,8,9]
 * ],
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [7,4,1],
 *   [8,5,2],
 *   [9,6,3]
 * ]
 *
 * 示例 2:
 * 给定 matrix =
 * [
 *   [ 5, 1, 9,11],
 *   [ 2, 4, 8,10],
 *   [13, 3, 6, 7],
 *   [15,14,12,16]
 * ],
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [15,13, 2, 5],
 *   [14, 3, 4, 1],
 *   [12, 6, 8, 9],
 *   [16, 7,10,11]
 * ]
 */
public class RotateMatrixLcci {

    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0){
            return;
        }
        diagonalFlip(matrix);
        midlineFlip(matrix);
    }

    /**
     *  将数组沿着对角线 （右上-左下 /）翻转
     * @param matrix   N*N的二维数组
     */
    private void diagonalFlip(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - i; j++) {
                swap(matrix, i, j, matrix.length - j - 1, matrix.length - i - 1);
            }
        }
    }

    /**
     *  将数组上下翻转
     * @param matrix   N*N的二维数组
     */
    private void midlineFlip(int[][] matrix) {
        for (int i = 0; i < (matrix.length + 1) / 2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                swap(matrix, i, j, matrix.length - i - 1, j);
            }
        }
    }

    /**
     * 交换位置
     * @param matrix 二维数组
     * @param x1    第一个位置的 x 坐标
     * @param y1    第一个位置的 y 坐标
     * @param x2    第二个位置的 x 坐标
     * @param y2    第二个位置的 y 坐标
     */
    private void swap(int[][] matrix, int x1, int y1, int x2, int y2){
        if (matrix[x1][y1] == matrix[x2][y2]) {
            return;
        }

        matrix[x1][y1] = matrix[x1][y1] ^ matrix[x2][y2];
        matrix[x2][y2] = matrix[x1][y1] ^ matrix[x2][y2];
        matrix[x1][y1] = matrix[x1][y1] ^ matrix[x2][y2];
    }
}
