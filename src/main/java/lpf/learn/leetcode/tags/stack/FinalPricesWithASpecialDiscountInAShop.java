package lpf.learn.leetcode.tags.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/** 1475 商品折扣后的最终价格
 <p>给你一个数组&nbsp;<code>prices</code>&nbsp;，其中&nbsp;<code>prices[i]</code>&nbsp;是商店里第&nbsp;<code>i</code>&nbsp;件商品的价格。</p>
 <p>商店里正在进行促销活动，如果你要买第&nbsp;<code>i</code>&nbsp;件商品，那么你可以得到与 <code>prices[j]</code> 相等的折扣，其中&nbsp;<code>j</code>&nbsp;是满足&nbsp;<code>j &gt; i</code>&nbsp;且&nbsp;<code>prices[j] &lt;= prices[i]</code>&nbsp;的&nbsp;<strong>最小下标</strong>&nbsp;，如果没有满足条件的&nbsp;<code>j</code>&nbsp;，你将没有任何折扣。</p>
 <p>请你返回一个数组，数组中第&nbsp;<code>i</code>&nbsp;个元素是折扣后你购买商品 <code>i</code>&nbsp;最终需要支付的价格。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>prices = [8,4,6,2,3]
 <strong>输出：</strong>[4,2,4,2,3]
 <strong>解释：</strong>
 商品 0 的价格为 price[0]=8 ，你将得到 prices[1]=4 的折扣，所以最终价格为 8 - 4 = 4 。
 商品 1 的价格为 price[1]=4 ，你将得到 prices[3]=2 的折扣，所以最终价格为 4 - 2 = 2 。
 商品 2 的价格为 price[2]=6 ，你将得到 prices[3]=2 的折扣，所以最终价格为 6 - 2 = 4 。
 商品 3 和 4 都没有折扣。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>prices = [1,2,3,4,5]
 <strong>输出：</strong>[1,2,3,4,5]
 <strong>解释：</strong>在这个例子中，所有商品都没有折扣。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>prices = [10,1,1,6]
 <strong>输出：</strong>[9,0,1,6]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= prices.length &lt;= 500</code></li>
 <li><code>1 &lt;= prices[i] &lt;= 10^3</code></li>
 </ul>
 */
public class FinalPricesWithASpecialDiscountInAShop {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Deque<Integer> stack = new ArrayDeque<>(n);

        int[] res = new int[n];
        for (int j = 0; j < n; j++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[j]) {
                int i = stack.pop();
                res[i] = prices[i] - prices[j];
            }
            stack.push(j);
        }
        while (!stack.isEmpty()) {
            int i = stack.pop();
            res[i] = prices[i];
        }
        return res;
    }
}
