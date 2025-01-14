package lpf.learn.leetcode.tags.graph;


/** 1559 二维网格图中探测环
 <p>给你一个二维字符网格数组&nbsp;<code>grid</code>&nbsp;，大小为&nbsp;<code>m x n</code>&nbsp;，你需要检查&nbsp;<code>grid</code>&nbsp;中是否存在 <strong>相同值</strong> 形成的环。</p>
 <p>一个环是一条开始和结束于同一个格子的长度 <strong>大于等于 4</strong>&nbsp;的路径。对于一个给定的格子，你可以移动到它上、下、左、右四个方向相邻的格子之一，可以移动的前提是这两个格子有 <strong>相同的值&nbsp;</strong>。</p>
 <p>同时，你也不能回到上一次移动时所在的格子。比方说，环&nbsp;&nbsp;<code>(1, 1) -&gt; (1, 2) -&gt; (1, 1)</code>&nbsp;是不合法的，因为从 <code>(1, 2)</code>&nbsp;移动到 <code>(1, 1)</code> 回到了上一次移动时的格子。</p>
 <p>如果 <code>grid</code>&nbsp;中有相同值形成的环，请你返回 <code>true</code>&nbsp;，否则返回 <code>false</code>&nbsp;。</p>

 <p><strong>示例 1：</strong></p>
 <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/22/5482e1.png" style="height: 152px; width: 231px;" /></strong></p>
 <pre><strong>输入：</strong>grid = [["a","a","a","a"],["a","b","b","a"],["a","b","b","a"],["a","a","a","a"]]
 <strong>输出：</strong>true
 <strong>解释：</strong>如下图所示，有 2 个用不同颜色标出来的环：
 <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/22/5482e11.png" style="height: 163px; width: 225px;">
 </img></pre>

 <p><strong>示例 2：</strong></p>
 <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/22/5482e2.png" style="height: 154px; width: 236px;" /></strong></p>
 <pre><strong>输入：</strong>grid = [["c","c","c","a"],["c","d","c","c"],["c","c","e","c"],["f","c","c","c"]]
 <strong>输出：</strong>true
 <strong>解释：</strong>如下图所示，只有高亮所示的一个合法环：
 <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/22/5482e22.png" style="height: 157px; width: 229px;">
 </img></pre>

 <p><strong>示例 3：</strong></p>
 <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/22/5482e3.png" style="height: 120px; width: 183px;" /></strong></p>
 <pre><strong>输入：</strong>grid = [["a","b","b"],["b","z","b"],["b","b","a"]]
 <strong>输出：</strong>false
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == grid.length</code></li>
 <li><code>n == grid[i].length</code></li>
 <li><code>1 &lt;= m &lt;= 500</code></li>
 <li><code>1 &lt;= n &lt;= 500</code></li>
 <li><code>grid</code>&nbsp;只包含小写英文字母。</li>
 </ul>
 */
public class DetectCyclesIn2dGrid {

    private final int[][] dict = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    private char[][] grid;
    private int[][] type;
    private int[][] count;
    private int n;
    private int m;
    private boolean res;


    public boolean containsCycle(char[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        this.type = new int[n][m];
        this.count = new int[n][m];
        this.res = false;

        int d = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (type[i][j] != 0) continue;

                dfs(i, j, grid[i][j], 1, d++);
            }
        }
        return res;
    }


    private void dfs(int i, int j, char t, int c, int d) {
        if (type[i][j] != 0) {
            if (type[i][j] == d && c - count[i][j] >= 4) res = true;
            return;
        }

        count[i][j] = c;
        type[i][j] = d;
        for (int[] temp : dict) {
            int ni = i + temp[0], nj = j + temp[1];
            if (ni < 0 || ni >= n || nj < 0 || nj >= m || grid[ni][nj] != t) continue;

            dfs(ni, nj, t, c + 1, d);
        }
    }

}
