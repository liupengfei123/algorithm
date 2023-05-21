package lpf.learn.leetcode.game.weekly345;

/** [2682] 找出转圈游戏输家
 <p><code>n</code> 个朋友在玩游戏。这些朋友坐成一个圈，按 <strong>顺时针方向</strong> 从 <code>1</code> 到 <code>n</code> 编号。从第 <code>i</code> 个朋友的位置开始顺时针移动 <code>1</code> 步会到达第 <code>(i + 1)</code> 个朋友的位置（<code>1 &lt;= i &lt; n</code>），而从第 <code>n</code> 个朋友的位置开始顺时针移动 <code>1</code> 步会回到第 <code>1</code> 个朋友的位置。</p>
 <p>游戏规则如下：</p>
 <p>第 <code>1</code> 个朋友接球。</p>
 <ul>
 <li>接着，第 <code>1</code> 个朋友将球传给距离他顺时针方向 <code>k</code> 步的朋友。</li>
 <li>然后，接球的朋友应该把球传给距离他顺时针方向 <code>2 * k</code> 步的朋友。</li>
 <li>接着，接球的朋友应该把球传给距离他顺时针方向 <code>3 * k</code> 步的朋友，以此类推。</li>
 </ul>

 <p>换句话说，在第 <code>i</code> 轮中持有球的那位朋友需要将球传递给距离他顺时针方向 <code>i * k</code> 步的朋友。</p>
 <p>当某个朋友第 2 次接到球时，游戏结束。</p>
 <p>在整场游戏中没有接到过球的朋友是 <strong>输家</strong> 。</p>
 <p>给你参与游戏的朋友数量 <code>n</code> 和一个整数 <code>k</code> ，请按升序排列返回包含所有输家编号的数组 <code>answer</code> 作为答案。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>n = 5, k = 2
 <strong>输出：</strong>[4,5]
 <strong>解释：</strong>以下为游戏进行情况：
 1）第 1 个朋友接球，第 <code>1</code> 个朋友将球传给距离他顺时针方向 2 步的玩家 —— 第 3 个朋友。
 2）第 3 个朋友将球传给距离他顺时针方向 4 步的玩家 —— 第 2 个朋友。
 3）第 2 个朋友将球传给距离他顺时针方向 6 步的玩家 —— 第 3 个朋友。
 4）第 3 个朋友接到两次球，游戏结束。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>n = 4, k = 4
 <strong>输出：</strong>[2,3,4]
 <strong>解释：</strong>以下为游戏进行情况：
 1）第 1 个朋友接球，第 <code>1</code> 个朋友将球传给距离他顺时针方向 4 步的玩家 —— 第 1 个朋友。
 2）第 1 个朋友接到两次球，游戏结束。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= k &lt;= n &lt;= 50</code></li>
 </ul>
 */
public class FindTheLosersOfTheCircularGame {
    public int[] circularGameLosers(int n, int k) {
        boolean[] check = new boolean[n];
        int i = 0, j = 0;

        while (true) {
            j = (j + i++ * k) % n;
            if (check[j]) break;
            check[j] = true;
        }

        int c = 0;
        for (int a = 0; a < n; a++) {
            if (!check[a]) c++;
        }

        int[] res = new int[c];
        for (int a = 0, z = 0; a < n; a++) {
            if (!check[a]) res[z++] = a + 1;
        }
        return res;
    }
}
