package lpf.learn.leetcode.learn.array;

public class FindDiagonalOrder {


    /**
     * 给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。
     *
     * 示例:
     * 输入:
     * [
     *  [ 1, 2, 3 ],
     *  [ 4, 5, 6 ],
     *  [ 7, 8, 9 ]
     * ]
     * 输出:  [1,2,4,7,5,3,6,8,9]
     *
     * 同一条斜线上的 x + y 的值相同, 且沿着斜线走是 x + 1, y -1 （从右上往左下） 或者 x - 1, y + 1  （从左下往右上）
     *
     * 在碰到二维数组边缘 进行变向， 并 x + y 的值加一， x + 1 或者 y + 1
     * @param matrix
     * @return
     */
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int[] result = new int[matrix.length * matrix[0].length];

        int index = 0;
        int x = 0, y = 0, step = -1; // -1： 从左下往右上， 1：从右上往左下
        while (x < matrix.length && y < matrix[x].length) {
            result[index++] = matrix[x][y];

            if (y - step >= matrix[0].length) { //右边框触碰反弹
                x++;
                step = 1;
            } else if (x + step >= matrix.length) { //下边框触碰反弹
                y++;
                step = -1;
            } else if (x + step < 0) {  //上边框触碰反弹
                y++;
                step = 1;
            } else if (y - step < 0) {  //坐边框触碰反弹
                x++;
                step = -1;
            } else {
                x += step;
                y -= step;
            }
        }
        return result;
    }
}
