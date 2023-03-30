package lpf.learn.leetcode.tags.sort;

import java.util.Arrays;
import java.util.Comparator;

/** 1637 两点之间不包含任何点的最宽垂直区域
 <p>给你&nbsp;<code>n</code>&nbsp;个二维平面上的点 <code>points</code> ，其中&nbsp;<code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code>&nbsp;，请你返回两点之间内部不包含任何点的&nbsp;<strong>最宽垂直区域</strong> 的宽度。</p>
 <p><strong>垂直区域</strong> 的定义是固定宽度，而 y 轴上无限延伸的一块区域（也就是高度为无穷大）。 <strong>最宽垂直区域</strong> 为宽度最大的一个垂直区域。</p>
 <p>请注意，垂直区域&nbsp;<strong>边上</strong>&nbsp;的点&nbsp;<strong>不在</strong>&nbsp;区域内。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/31/points3.png" style="width: 276px; height: 371px;" />​
 <pre>
 <b>输入：</b>points = [[8,7],[9,9],[7,4],[9,7]]
 <b>输出：</b>1
 <b>解释：</b>红色区域和蓝色区域都是最优区域。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
 <b>输出：</b>3
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == points.length</code></li>
 <li><code>2 &lt;= n &lt;= 10<sup>5</sup></code></li>
 <li><code>points[i].length == 2</code></li>
 <li><code>0 &lt;= x<sub>i</sub>, y<sub>i</sub>&nbsp;&lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparing(a -> a[0]));

        int max = 0;
        for (int i = 1; i < points.length; i++) {
            max = Math.max(max, points[i][0] - points[i - 1][0]);
        }
        return max;
    }
}
