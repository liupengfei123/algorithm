package lpf.learn.leetcode.tags.graph;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/** [675]为高尔夫比赛砍树
 <p>你被请来给一个要举办高尔夫比赛的树林砍树。树林由一个&nbsp;<code>m x n</code> 的矩阵表示， 在这个矩阵中：</p>
 <ul>
 <li><code>0</code> 表示障碍，无法触碰</li>
 <li><code>1</code>&nbsp;表示地面，可以行走</li>
 <li><code>比 1 大的数</code>&nbsp;表示有树的单元格，可以行走，数值表示树的高度</li>
 </ul>
 <p>每一步，你都可以向上、下、左、右四个方向之一移动一个单位，如果你站的地方有一棵树，那么你可以决定是否要砍倒它。</p>
 <p>你需要按照树的高度从低向高砍掉所有的树，每砍过一颗树，该单元格的值变为 <code>1</code>（即变为地面）。</p>
 <p>你将从 <code>(0, 0)</code> 点开始工作，返回你砍完所有树需要走的最小步数。 如果你无法砍完所有的树，返回 <code>-1</code> 。</p>
 <p>可以保证的是，没有两棵树的高度是相同的，并且你至少需要砍倒一棵树。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2020/11/26/trees1.jpg" style="width: 242px; height: 242px;" />
 <pre>
 <strong>输入：</strong>forest = [[1,2,3],[0,0,4],[7,6,5]]
 <strong>输出：</strong>6
 <strong>解释：</strong>沿着上面的路径，你可以用 6 步，按从最矮到最高的顺序砍掉这些树。</pre>

 <p><strong>示例 2：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2020/11/26/trees2.jpg" style="width: 242px; height: 242px;" />
 <pre>
 <strong>输入：</strong>forest = [[1,2,3],[0,0,0],[7,6,5]]
 <strong>输出：</strong>-1
 <strong>解释：</strong>由于中间一行被障碍阻塞，无法访问最下面一行中的树。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>forest = [[2,3,4],[0,0,5],[8,7,6]]
 <strong>输出：</strong>6
 <strong>解释：</strong>可以按与示例 1 相同的路径来砍掉所有的树。
 (0,0) 位置的树，可以直接砍去，不用算步数。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>m == forest.length</code></li>
 <li><code>n == forest[i].length</code></li>
 <li><code>1 &lt;= m, n &lt;= 50</code></li>
 <li><code>0 &lt;= forest[i][j] &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class CutOffTreesForGolfEvent {
    private static final int[][] dict = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private List<List<Integer>> forest;
    private int n;
    private int m;

    public int cutOffTree(List<List<Integer>> forest) {
        this.forest = forest;
        this.n = forest.size();
        this.m = forest.get(0).size();

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (forest.get(i).get(j) > 1) pq.add(new int[]{i, j, forest.get(i).get(j)});
            }
        }
        int[] last = new int[]{0, 0};
        int res = 0;
        while (!pq.isEmpty()) {
            int[] poll = pq.poll();
            int step = bfs(last[0], last[1], poll[0], poll[1], new boolean[n][m]);
            if (step < 0) return -1;

            res += step;
            last = poll;
        }
        return res;
    }

    private int bfs(int si, int sj, int ti, int tj, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{si, sj, 0});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int i = poll[0], j = poll[1], x = poll[2]; // [x, y]  d  max

            if (i == ti && j == tj) return x;
            for (int[] d : dict) {
                int ni = i + d[0], nj = j + d[1];
                if (ni < 0 || ni >= n || nj < 0 || nj >= m || visited[ni][nj] || forest.get(ni).get(nj) == 0) continue;

                queue.add(new int[]{ni, nj, x + 1});
                visited[ni][nj] = true;
            }
        }
        return -1;
    }
}
