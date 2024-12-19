package lpf.learn.leetcode.tags.binarysearch;


/** 1648 销售价值减少的颜色球
 <p>你有一些球的库存&nbsp;<code>inventory</code>&nbsp;，里面包含着不同颜色的球。一个顾客想要&nbsp;<strong>任意颜色</strong> 总数为&nbsp;<code>orders</code>&nbsp;的球。</p>
 <p>这位顾客有一种特殊的方式衡量球的价值：每个球的价值是目前剩下的&nbsp;<strong>同色球</strong>&nbsp;的数目。比方说还剩下&nbsp;<code>6</code>&nbsp;个黄球，那么顾客买第一个黄球的时候该黄球的价值为&nbsp;<code>6</code>&nbsp;。这笔交易以后，只剩下&nbsp;<code>5</code>&nbsp;个黄球了，所以下一个黄球的价值为&nbsp;<code>5</code>&nbsp;（也就是球的价值随着顾客购买同色球是递减的）</p>
 <p>给你整数数组&nbsp;<code>inventory</code>&nbsp;，其中&nbsp;<code>inventory[i]</code>&nbsp;表示第&nbsp;<code>i</code>&nbsp;种颜色球一开始的数目。同时给你整数&nbsp;<code>orders</code>&nbsp;，表示顾客总共想买的球数目。你可以按照 <strong>任意顺序</strong>&nbsp;卖球。</p>
 <p>请你返回卖了 <code>orders</code>&nbsp;个球以后 <strong>最大</strong>&nbsp;总价值之和。由于答案可能会很大，请你返回答案对 <code>10<sup>9</sup>&nbsp;+ 7</code>&nbsp;<strong>取余数</strong>&nbsp;的结果。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/11/08/jj.gif" style="width: 480px; height: 270px;" />
 <pre>
 <b>输入：</b>inventory = [2,5], orders = 4
 <b>输出：</b>14
 <b>解释：</b>卖 1 个第一种颜色的球（价值为 2 )，卖 3 个第二种颜色的球（价值为 5 + 4 + 3）。
 最大总和为 2 + 5 + 4 + 3 = 14 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>inventory = [3,5], orders = 6
 <b>输出：</b>19
 <strong>解释：</strong>卖 2 个第一种颜色的球（价值为 3 + 2），卖 4 个第二种颜色的球（价值为 5 + 4 + 3 + 2）。
 最大总和为 3 + 2 + 5 + 4 + 3 + 2 = 19 。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <b>输入：</b>inventory = [2,8,4,10,6], orders = 20
 <b>输出：</b>110
 </pre>

 <p><strong>示例 4：</strong></p>
 <pre>
 <b>输入：</b>inventory = [1000000000], orders = 1000000000
 <b>输出：</b>21
 <strong>解释：</strong>卖 1000000000 次第一种颜色的球，总价值为 500000000500000000 。 500000000500000000 对 10<sup>9 </sup>+ 7 取余为 21 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= inventory.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= inventory[i] &lt;= 10<sup>9</sup></code></li>
 <li><code>1 &lt;= orders &lt;= min(sum(inventory[i]), 10<sup>9</sup>)</code></li>
 </ul>
 */
public class SellDiminishingValuedColoredBalls {
    public int maxProfit(int[] inventory, int orders) {
        long sum = 0;
        int t = getT(inventory, orders), mod = 1000_000_007;

        for (int i : inventory) {
            if (t >= i) continue;

            sum = (sum + (long) (i - t) * (i + t + 1) / 2) % mod;
            orders -= i - t;
        }
        sum = (sum + (long) orders * t) % mod;
        return (int) sum;
    }

    private int getT(int[] inventory, int orders) {
        int l = 0, r = 1000_000_000;
        while (l < r) {
            int mid = l + (r - l + 1) / 2;
            if (check(inventory, orders, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    private boolean check(int[] inventory, int orders, int t) {
        int sum = 0;
        for (int i : inventory) {
            if (i < t) continue;
            sum += (i - t + 1);
            if (sum >= orders) return true;
        }
        return false;
    }
}
