package lpf.learn.leetcode.tags.binarysearch;

import java.util.List;

/** 2861 最大合金数
 <p>假设你是一家合金制造公司的老板，你的公司使用多种金属来制造合金。现在共有 <code>n</code> 种不同类型的金属可以使用，并且你可以使用 <code>k</code> 台机器来制造合金。每台机器都需要特定数量的每种金属来创建合金。</p>
 <p>对于第 <code>i</code> 台机器而言，创建合金需要 <code>composition[i][j]</code> 份 <code>j</code> 类型金属。最初，你拥有 <code>stock[i]</code> 份 <code>i</code> 类型金属，而每购入一份 <code>i</code> 类型金属需要花费 <code>cost[i]</code> 的金钱。</p>
 <p>给你整数 <code>n</code>、<code>k</code>、<code>budget</code>，下标从 <strong>1</strong> 开始的二维数组 <code>composition</code>，两个下标从 <strong>1</strong> 开始的数组 <code>stock</code> 和 <code>cost</code>，请你在预算不超过 <code>budget</code> 金钱的前提下，<strong>最大化</strong> 公司制造合金的数量。</p>
 <p><strong>所有合金都需要由同一台机器制造。</strong></p>
 <p>返回公司可以制造的最大合金数。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>n = 3, k = 2, budget = 15, composition = [[1,1,1],[1,1,10]], stock = [0,0,0], cost = [1,2,3]
 <strong>输出：</strong>2
 <strong>解释：</strong>最优的方法是使用第 1 台机器来制造合金。
 要想制造 2 份合金，我们需要购买：
 - 2 份第 1 类金属。
 - 2 份第 2 类金属。
 - 2 份第 3 类金属。
 总共需要 2 * 1 + 2 * 2 + 2 * 3 = 12 的金钱，小于等于预算 15 。
 注意，我们最开始时候没有任何一类金属，所以必须买齐所有需要的金属。
 可以证明在示例条件下最多可以制造 2 份合金。
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>n = 3, k = 2, budget = 15, composition = [[1,1,1],[1,1,10]], stock = [0,0,100], cost = [1,2,3]
 <strong>输出：</strong>5
 <strong>解释：</strong>最优的方法是使用第 2 台机器来制造合金。
 要想制造 5 份合金，我们需要购买：
 - 5 份第 1 类金属。
 - 5 份第 2 类金属。
 - 0 份第 3 类金属。
 总共需要 5 * 1 + 5 * 2 + 0 * 3 = 15 的金钱，小于等于预算 15 。
 可以证明在示例条件下最多可以制造 5 份合金。
 </pre>

 <p><strong class="example">示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>n = 2, k = 3, budget = 10, composition = [[2,1],[1,2],[1,1]], stock = [1,1], cost = [5,5]
 <strong>输出：</strong>2
 <strong>解释：</strong>最优的方法是使用第 3 台机器来制造合金。
 要想制造 2 份合金，我们需要购买：
 - 1 份第 1 类金属。
 - 1 份第 2 类金属。
 总共需要 1 * 5 + 1 * 5 = 10 的金钱，小于等于预算 10 。
 可以证明在示例条件下最多可以制造 2 份合金。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n, k &lt;= 100</code></li>
 <li><code>0 &lt;= budget &lt;= 10<sup>8</sup></code></li>
 <li><code>composition.length == k</code></li>
 <li><code>composition[i].length == n</code></li>
 <li><code>1 &lt;= composition[i][j] &lt;= 100</code></li>
 <li><code>stock.length == cost.length == n</code></li>
 <li><code>0 &lt;= stock[i] &lt;= 10<sup>8</sup></code></li>
 <li><code>1 &lt;= cost[i] &lt;= 100</code></li>
 </ul>
 */
public class MaximumNumberOfAlloys {
    public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> stock, List<Integer> cost) {
        int l = 0, r = 2000_000_000;
        while (l < r) {
            int mid = l + (r - l + 1) / 2;
            if (check(n, budget, composition, stock, cost, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
    private boolean check(int n, int budget, List<List<Integer>> composition, List<Integer> stock, List<Integer> cost, long x) {
        for (List<Integer> list : composition) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += (long)cost.get(j) * Math.max(0, list.get(j) * x - stock.get(j));
            }
            if (sum <= budget) return true;
        }
        return false;
    }

}
