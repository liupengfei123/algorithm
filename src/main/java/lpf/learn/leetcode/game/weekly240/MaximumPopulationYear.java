package lpf.learn.leetcode.game.weekly240;

/** 5750. 人口最多的年份
 *
 * 给你一个二维整数数组 logs ，其中每个 logs[i] = [birthi, deathi] 表示第 i 个人的出生和死亡年份。
 * 年份 x 的 人口 定义为这一年期间活着的人的数目。第 i 个人被计入年份 x 的人口需要满足：x 在闭区间 [birthi, deathi - 1] 内。注意，人不应当计入他们死亡当年的人口中。
 * 返回 人口最多 且 最早 的年份。
 *
 * 示例 1：
 * 输入：logs = [[1993,1999],[2000,2010]]
 * 输出：1993
 * 解释：人口最多为 1 ，而 1993 是人口为 1 的最早年份。
 * 示例 2：
 *
 * 输入：logs = [[1950,1961],[1960,1971],[1970,1981]]
 * 输出：1960
 * 解释：
 * 人口最多为 2 ，分别出现在 1960 和 1970 。
 * 其中最早年份是 1960 。
 *
 * 提示：
 * 1 <= logs.length <= 100
 * 1950 <= birthi < deathi <= 2050
 *
 * @author liupf
 * @date 2021-05-09 10:30
 */
public class MaximumPopulationYear {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];
        for (int[] log : logs) {
            for (int i = log[0]; i < log[1]; i++) {
                years[i - 1950]++;
            }
        }

        int max = 0;
        int year = 0;

        for (int i = 0; i < years.length; i++) {
            if (max < years[i]) {
                max = years[i];
                year = i;
            }
        }
        return year + 1950;
    }
}
