package lpf.learn.leetcode.tags.graph;

/** LCS 03 主题空间
 「以扣会友」线下活动所在场地由若干主题空间与走廊组成，场地的地图记作由一维字符串型数组 `grid`，字符串中仅包含 `"0"～"5"` 这 6 个字符。
 地图上每一个字符代表面积为 1 的区域，其中 `"0"` 表示走廊，其他字符表示主题空间。相同且连续（连续指上、下、左、右四个方向连接）的字符组成同一个主题空间。
 假如整个 `grid` 区域的外侧均为走廊。请问，不与走廊直接相邻的主题空间的最大面积是多少？如果不存在这样的空间请返回 `0`。

 **示例 1：**
 > 输入：`grid = ["110","231","221"]`
 > 输出：`1`
 > 解释：4 个主题空间中，只有 1 个不与走廊相邻，面积为 1。
 > ![image.png](https://pic.leetcode-cn.com/1613708145-rscctN-image.png)

 **示例 2：**
 > 输入：`grid = ["11111100000","21243101111","21224101221","11111101111"]`
 > 输出：`3`
 > 解释：8 个主题空间中，有 5 个不与走廊相邻，面积分别为 3、1、1、1、2，最大面积为 3。
 > ![image.png](https://pic.leetcode-cn.com/1613707985-KJyiXJ-image.png)

 **提示：**
 - `1 <= grid.length <= 500`
 - `1 <= grid[i].length <= 500`
 - `grid[i][j]` 仅可能为 `"0"～"5"`
 */
public class YesdPw {
    private static final int[][] dict = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private static final int[] EMPTY = new int[2];

    private String[] grid;
    private boolean[][] visited;
    private int n;
    private int m;

    public int largestArea(String[] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length();
        this.visited = new boolean[n][m];

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char t = grid[i].charAt(j);
                if (visited[i][j] || t == '0') continue;

                int[] temp = dfs(i, j, t);
                if (temp[1] >= 0) res = Math.max(res, temp[0]);
            }
        }
        return res;
    }

    private int[] dfs(int i, int j, char t) {
        if (visited[i][j]) return EMPTY;
        visited[i][j] = true;

        int[] c = new int[]{1, 0};
        for (int[] d : dict) {
            int ni = i + d[0], nj = j + d[1];

            if (ni < 0 || ni >= n || nj < 0 || nj >= m || grid[ni].charAt(nj) == '0') {
                c[1] = -1;
                continue;
            }
            if (grid[ni].charAt(nj) != t) continue;

            int[] temp = dfs(ni, nj, t);
            c[0] += temp[0];
            c[1] += temp[1];
        }
        return c;
    }
}
