package lpf.learn.leetcode.tags.binarysearch;

import java.util.Arrays;

/** [2517] 礼盒的最大甜蜜度
 <p>给你一个正整数数组 <code>price</code> ，其中 <code>price[i]</code> 表示第 <code>i</code> 类糖果的价格，另给你一个正整数 <code>k</code> 。</p>
 <p>商店组合 <code>k</code> 类 <strong>不同</strong> 糖果打包成礼盒出售。礼盒的 <strong>甜蜜度</strong> 是礼盒中任意两种糖果 <strong>价格</strong> 绝对差的最小值。</p>
 <p>返回礼盒的 <strong>最大 </strong>甜蜜度<em>。</em></p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>price = [13,5,1,8,21,2], k = 3
 <strong>输出：</strong>8
 <strong>解释：</strong>选出价格分别为 [13,5,21] 的三类糖果。
 礼盒的甜蜜度为 min(|13 - 5|, |13 - 21|, |5 - 21|) = min(8, 8, 16) = 8 。
 可以证明能够取得的最大甜蜜度就是 8 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>price = [1,3,1], k = 2
 <strong>输出：</strong>2
 <strong>解释：</strong>选出价格分别为 [1,3] 的两类糖果。
 礼盒的甜蜜度为 min(|1 - 3|) = min(2) = 2 。
 可以证明能够取得的最大甜蜜度就是 2 。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>price = [7,7,7,7], k = 2
 <strong>输出：</strong>0
 <strong>解释：</strong>从现有的糖果中任选两类糖果，甜蜜度都会是 0 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= price.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= price[i] &lt;= 10<sup>9</sup></code></li>
 <li><code>2 &lt;= k &lt;= price.length</code></li>
 </ul>
 */
public class MaximumTastinessOfCandyBasket {

    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);

        int l = 0, r = price[price.length - 1] - price[0];
        while (l < r) {
            int mid = l + (r - l + 1) / 2;
            if (check(price, k, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    private boolean check(int[] price, int k, int x) {
        int n = price.length, cnt = 0;

        for (int i = 0, j = 0; i < n; i = j) {
            while (j < n && price[j] - price[i] < x) j++;

            if (j < n && price[j] - price[i] >= x) {
                cnt++;
            }
        }
        return cnt + 1 >= k;
    }


}
