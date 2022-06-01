package lpf.learn.leetcode.tags.backtrack;

import java.util.Arrays;

/**
 * 473 火柴拼正方形
 * <p>你将得到一个整数数组 <code>matchsticks</code> ，其中 <code>matchsticks[i]</code> 是第 <code>i</code>&nbsp;个火柴棒的长度。你要用 <strong>所有的火柴棍</strong>&nbsp;拼成一个正方形。你 <strong>不能折断</strong> 任何一根火柴棒，但你可以把它们连在一起，而且每根火柴棒必须 <strong>使用一次</strong> 。</p>
 *
 * <p>如果你能使这个正方形，则返回 <code>true</code> ，否则返回 <code>false</code> 。</p>
 * <p>&nbsp;</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <p><img src="https://assets.leetcode.com/uploads/2021/04/09/matchsticks1-grid.jpg" /></p>
 *
 * <pre>
 * <strong>输入:</strong> matchsticks = [1,1,2,2,2]
 * <strong>输出:</strong> true
 * <strong>解释:</strong> 能拼成一个边长为2的正方形，每边两根火柴。
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 * <pre>
 * <strong>输入:</strong> matchsticks = [3,3,3,3,4]
 * <strong>输出:</strong> false
 * <strong>解释:</strong> 不能用所有火柴拼成一个正方形。
 * </pre>
 *
 * <p><strong>提示:</strong></p>
 * <ul>
 * 	<li><code>1 &lt;= matchsticks.length &lt;= 15</code></li>
 * 	<li><code>1 &lt;= matchsticks[i] &lt;= 10<sup>8</sup></code></li>
 * </ul>
 */
public class MatchsticksToSquare {

    private int[] matchsticks;
    private int target;

    public boolean makesquare(int[] matchsticks) {
        if (matchsticks.length < 4) {
            return false;
        }
        this.matchsticks = matchsticks;
        int sum = 0;
        int max = 0;
        for (int matchstick : matchsticks) {
            sum += matchstick;
            max = Math.max(max, matchstick);
        }
        this.target = sum / 4;
        if (sum % 4 != 0 || target < max) {
            return false;
        }

        Arrays.sort(matchsticks);
        for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }

        int[] edges = new int[4];
        return dfs(0, edges);
    }

    public boolean dfs(int index, int[] edges) {
        if (index == matchsticks.length) {
            return true;
        }
        for (int i = 0; i < edges.length; i++) {
            edges[i] += matchsticks[index];
            if (edges[i] <= target && dfs(index + 1, edges)) {
                return true;
            }
            edges[i] -= matchsticks[index];
        }
        return false;
    }

}
