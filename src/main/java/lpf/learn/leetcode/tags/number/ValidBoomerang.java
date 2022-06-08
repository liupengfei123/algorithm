package lpf.learn.leetcode.tags.number;

/** 1037 有效的回旋镖
 * <p>给定一个数组<meta charset="UTF-8" />&nbsp;<code>points</code>&nbsp;，其中<meta charset="UTF-8" />&nbsp;<code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code>&nbsp;表示 <strong>X-Y</strong> 平面上的一个点，<em>如果这些点构成一个&nbsp;</em><strong>回旋镖</strong>&nbsp;则返回&nbsp;<code>true</code>&nbsp;。</p>
 * <p><strong>回旋镖</strong>&nbsp;定义为一组三个点，这些点&nbsp;<strong>各不相同</strong>&nbsp;且&nbsp;<strong>不在一条直线上</strong>&nbsp;。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <strong>输入：</strong>points = [[1,1],[2,3],[3,2]]
 * <strong>输出：</strong>true
 * </pre>
 * <p><strong>示例 2：</strong></p>
 * <pre>
 * <strong>输入：</strong>points = [[1,1],[2,2],[3,3]]
 * <strong>输出：</strong>false</pre>
 *
 * <p><strong>提示：</strong></p>
 * <meta charset="UTF-8" />
 * <ul>
 * 	<li><code>points.length == 3</code></li>
 * 	<li><code>points[i].length == 2</code></li>
 * 	<li><code>0 &lt;= x<sub>i</sub>, y<sub>i</sub>&nbsp;&lt;= 100</code></li>
 * </ul>
 */
public class ValidBoomerang {
    public boolean isBoomerang(int[][] points) {
        int l1 = points[1][0] - points[0][0];
        int l2 = points[1][1] - points[0][1];

        if (l1 == 0 && l2 == 0) {
            return false;
        }

        int r1 = points[2][0] - points[1][0];
        int r2 = points[2][1] - points[1][1];

        if (r1 == 0 && r2 == 0) {
            return false;
        }

        return l1 * r2 != l2 * r1;
    }
}
