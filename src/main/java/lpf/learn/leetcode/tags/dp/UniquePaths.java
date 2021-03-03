package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** [62]不同路径
 *
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * 问总共有多少条不同的路径？
 *
 * 示例 1：
 * 输入：m = 3, n = 7
 * 输出：28
 *
 * 示例 2：
 * 输入：m = 3, n = 2
 * 输出：3
 * 解释：
 * 从左上角开始，总共有 3 条路径可以到达右下角。
 * 1. 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右
 * 3. 向下 -> 向右 -> 向下
 *
 * 示例 3：
 * 输入：m = 7, n = 3
 * 输出：28
 *
 * 示例 4：
 * 输入：m = 3, n = 3
 * 输出：6
 *
 * 提示：
 * 1 <= m, n <= 100
 * 题目数据保证答案小于等于 2 * 109
 */
public class UniquePaths {
    private int m;
    private int n;

    public int uniquePaths2(int m, int n) {
        this.m = m;
        this.n = n;
        return help(1, 1, new HashMap<>());
    }


    private int help(int i, int j, Map<String, Integer> map) {
        if (i >= m || j >= n) {
            return 1;
        }
        String key = i + "," + j;
        if (map.containsKey(key)) {
            return map.get(key);
        }

        int result = help(i + 1, j, map) + help(i, j + 1, map);
        map.put(key, result);
        return result;
    }


    public int uniquePaths(int m, int n) {
        int[][] array = new int[m][n];
        Arrays.fill(array[m - 1], 1);
        for (int i = 0; i < m; i++) {
            array[i][n - 1] = 1;
        }

        for (int j = n - 2; j >= 0; j--) {
            for (int i = m - 2; i >= 0; i--) {
                array[i][j] = array[i][j + 1] + array[i + 1][j];
            }
        }
        return array[0][0];
    }


}
