package lpf.learn.leetcode.tags.slidingwindow;


import java.util.Arrays;
import java.util.Comparator;

/** 2271 毯子覆盖的最多白色砖块数
 <p>给你一个二维整数数组&nbsp;<code>tiles</code>&nbsp;，其中&nbsp;<code>tiles[i] = [l<sub>i</sub>, r<sub>i</sub>]</code>&nbsp;，表示所有在&nbsp;<code>l<sub>i</sub> &lt;= j &lt;= r<sub>i</sub></code>&nbsp;之间的每个瓷砖位置 <code>j</code>&nbsp;都被涂成了白色。</p>
 <p>同时给你一个整数&nbsp;<code>carpetLen</code>&nbsp;，表示可以放在&nbsp;<strong>任何位置</strong>&nbsp;的一块毯子的长度。</p>
 <p>请你返回使用这块毯子，<strong>最多</strong>&nbsp;可以盖住多少块瓷砖。</p>

 <p><strong>示例 1：</strong></p>
 <p><img alt="" src="https://assets.leetcode.com/uploads/2022/03/25/example1drawio3.png" style="width: 644px; height: 158px;" /></p>
 <pre>
 <b>输入：</b>tiles = [[1,5],[10,11],[12,18],[20,25],[30,32]], carpetLen = 10
 <b>输出：</b>9
 <b>解释：</b>将毯子从瓷砖 10 开始放置。
 总共覆盖 9 块瓷砖，所以返回 9 。
 注意可能有其他方案也可以覆盖 9 块瓷砖。
 可以看出，瓷砖无法覆盖超过 9 块瓷砖。
 </pre>

 <p><strong>示例 2：</strong></p>
 <p><img alt="" src="https://assets.leetcode.com/uploads/2022/03/24/example2drawio.png" style="width: 231px; height: 168px;" /></p>
 <pre>
 <strong>输入：</strong>tiles = [[10,11],[1,1]], carpetLen = 2
 <b>输出：</b>2
 <b>解释：</b>将毯子从瓷砖 10 开始放置。
 总共覆盖 2 块瓷砖，所以我们返回 2 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= tiles.length &lt;= 5 * 10<sup>4</sup></code></li>
 <li><code>tiles[i].length == 2</code></li>
 <li><code>1 &lt;= l<sub>i</sub> &lt;= r<sub>i</sub> &lt;= 10<sup>9</sup></code></li>
 <li><code>1 &lt;= carpetLen &lt;= 10<sup>9</sup></code></li>
 <li><code>tiles</code>&nbsp;互相 <strong>不会重叠</strong>&nbsp;。</li>
 </ul>
 */
public class MaximumWhiteTilesCoveredByACarpet {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        Arrays.sort(tiles, Comparator.comparingInt(a -> a[0]));

        int n = tiles.length;
        long res = 0, cnt = 0;
        for (int l = 0, r = 0; l < n; ++l) {
            if (l > 0) {
                cnt -= tiles[l - 1][1] - tiles[l - 1][0] + 1;
            }
            while (r < n && tiles[l][0] + carpetLen > tiles[r][1]) {
                cnt += tiles[r][1] - tiles[r][0] + 1;
                r++;
            }
            if (r == n) { // 此时无法通过右移增加覆盖瓷砖数，更新最大值并返回即可
                res = Math.max(res, cnt);
                break;
            }
            int extra = Math.max(0, tiles[l][0] + carpetLen - tiles[r][0]); // 当前无法完全覆盖的连续瓷砖段的覆盖瓷砖数
            res = Math.max(res, cnt + extra);
        }
        return (int) res;
    }
}
