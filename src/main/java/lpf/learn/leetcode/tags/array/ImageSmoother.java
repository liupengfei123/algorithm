package lpf.learn.leetcode.tags.array;

/**
 * [661]图片平滑器
 * 包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，平均灰度的计算是周围的8个单元和它本身的值
 * 求平均，如果周围的单元格不足八个，则尽可能多的利用它们。
 * <p>
 * 示例 1:
 * 输入:
 * [[1,1,1],
 * [1,0,1],
 * [1,1,1]]
 * 输出:
 * [[0, 0, 0],
 * [0, 0, 0],
 * [0, 0, 0]]
 * 解释:
 * 对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0
 * 对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0
 * 对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0
 * <p>
 * 注意:
 * 给定矩阵中的整数范围为 [0, 255]。
 * 矩阵的长和宽的范围均为 [1, 150]。
 */
public class ImageSmoother {

    public int[][] imageSmoother(int[][] M) {
        int rowLength = M.length;
        int colLength = M[0].length;

        int[][] dest = new int[rowLength][colLength];

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                dest[i][j] = getValue(M, i, j, rowLength, colLength);
            }
        }
        return dest;
    }


    private int getValue(int[][] src, int i, int j, int rowLength, int colLength) {
        int sum = 0;
        int total = 0;
        for (int k = -1; k < 2; k++) {
            int xIndex = k + i;
            if (xIndex < 0 || xIndex >= rowLength) {
                continue;
            }
            for (int l = -1; l < 2; l++) {
                int yIndex = l + j;
                if (yIndex < 0 || yIndex >= colLength) {
                    continue;
                }
                sum += src[xIndex][yIndex];
                total++;
            }
        }
        return sum / total;
    }
}
