package lpf.learn.leetcode.game.weekly339;

import java.util.Arrays;
import java.util.Comparator;


/** [2611] 老鼠和奶酪
 <p>有两只老鼠和&nbsp;<code>n</code>&nbsp;块不同类型的奶酪，每块奶酪都只能被其中一只老鼠吃掉。</p>
 <p>下标为 <code>i</code>&nbsp;处的奶酪被吃掉的得分为：</p>
 <ul>
 <li>如果第一只老鼠吃掉，则得分为&nbsp;<code>reward1[i]</code>&nbsp;。</li>
 <li>如果第二只老鼠吃掉，则得分为&nbsp;<code>reward2[i]</code>&nbsp;。</li>
 </ul>
 <p>给你一个正整数数组&nbsp;<code>reward1</code>&nbsp;，一个正整数数组&nbsp;<code>reward2</code>&nbsp;，和一个非负整数&nbsp;<code>k</code>&nbsp;。</p>
 <p>请你返回第一只老鼠恰好吃掉 <code>k</code>&nbsp;块奶酪的情况下，<strong>最大</strong>&nbsp;得分为多少。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>reward1 = [1,1,3,4], reward2 = [4,4,1,1], k = 2
 <b>输出：</b>15
 <b>解释：</b>这个例子中，第一只老鼠吃掉第 2&nbsp;和 3 块奶酪（下标从 0 开始），第二只老鼠吃掉第 0 和 1 块奶酪。
 总得分为 4 + 4 + 3 + 4 = 15 。
 15 是最高得分。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>reward1 = [1,1], reward2 = [1,1], k = 2
 <b>输出：</b>2
 <b>解释：</b>这个例子中，第一只老鼠吃掉第 0 和 1 块奶酪（下标从 0 开始），第二只老鼠不吃任何奶酪。
 总得分为 1 + 1 = 2 。
 2 是最高得分。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n == reward1.length == reward2.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= reward1[i],&nbsp;reward2[i] &lt;= 1000</code></li>
 <li><code>0 &lt;= k &lt;= n</code></li>
 </ul>
 */
public class MiceAndCheese {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int n = reward1.length;
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = reward1[i];
            array[i][1] = reward2[i];
        }

        Arrays.sort(array, Comparator.comparing((int[] a) -> a[0] - a[1]).reversed());

        int res = 0;
        for (int i = 0; i < k; i++) res += array[i][0];
        for (int i = k; i < n; i++) res += array[i][1];

        return res;
    }
}
