package lpf.learn.leetcode.tags.graph;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 面试题 16.19 水域大小
 <p>你有一个用于表示一片土地的整数矩阵<code>land</code>，该矩阵中每个点的值代表对应地点的海拔高度。若值为0则表示水域。由垂直、水平或对角连接的水域为池塘。池塘的大小是指相连接的水域的个数。编写一个方法来计算矩阵中所有池塘的大小，返回值需要从小到大排序。</p>

 <p><strong>示例：</strong></p>
 <pre><strong>输入：</strong>
 [
 [0,2,1,0],
 [0,1,0,1],
 [1,1,0,1],
 [0,1,0,1]
 ]
 <strong>输出：</strong> [1,2,4]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>0 &lt; len(land) &lt;= 1000</code></li>
 <li><code>0 &lt; len(land[i]) &lt;= 1000</code></li>
 </ul>
 */
public class PondSizesLcci {
    private static final int[][] dict = new int[][]{{1,0},{1,1},{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1}};

    private int[][] land;
    private boolean[][] visited;
    private int n;
    private int m;

    public int[] pondSizes(int[][] land) {
        this.land = land;
        this.n = land.length;
        this.m = land[0].length;
        this.visited = new boolean[n][m];

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] || land[i][j] != 0) continue;

                res.add(dfs(i, j));
            }
        }
        Collections.sort(res);
        int[] a = new int[res.size()];
        for (int i = 0; i < res.size(); i++) a[i] = res.get(i);
        return a;
    }

    private int dfs(int i, int j) {
        if (visited[i][j]) return 0;
        visited[i][j] = true;

        int c = 1;
        for (int[] d : dict) {
            int ni = i + d[0], nj = j + d[1];
            if (ni < 0 || ni >= n || nj < 0 || nj >= m || land[ni][nj] != 0) continue;

            c += dfs(ni, nj);
        }
        return c;
    }
}
