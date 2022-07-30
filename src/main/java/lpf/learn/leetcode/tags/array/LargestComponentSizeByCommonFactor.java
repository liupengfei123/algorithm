package lpf.learn.leetcode.tags.array;

import java.util.*;
/** [952] 按公因数计算最大组件大小
 <p>给定一个由不同正整数的组成的非空数组&nbsp;<code>nums</code> ，考虑下面的图：</p>
 <ul>
 <li>有&nbsp;<code>nums.length</code>&nbsp;个节点，按从&nbsp;<code>nums[0]</code>&nbsp;到&nbsp;<code>nums[nums.length - 1]</code>&nbsp;标记；</li>
 <li>只有当&nbsp;<code>nums[i]</code>&nbsp;和&nbsp;<code>nums[j]</code>&nbsp;共用一个大于 1 的公因数时，<code>nums[i]</code>&nbsp;和&nbsp;<code>nums[j]</code>之间才有一条边。</li>
 </ul>
 <p>返回 <em>图中最大连通组件的大小</em> 。</p>

 <p><strong>示例 1：</strong></p>
 <p><img src="https://assets.leetcode.com/uploads/2018/12/01/ex1.png" style="height: 97px; width: 500px;" /></p>
 <pre>
 <strong>输入：</strong>nums = [4,6,15,35]
 <strong>输出：</strong>4
 </pre>

 <p><strong>示例 2：</strong></p>
 <p><img src="https://assets.leetcode.com/uploads/2018/12/01/ex2.png" style="height: 85px; width: 500px;" /></p>
 <pre>
 <strong>输入：</strong>nums = [20,50,9,63]
 <strong>输出：</strong>2
 </pre>

 <p><strong>示例 3：</strong></p>
 <p><img src="https://assets.leetcode.com/uploads/2018/12/01/ex3.png" style="height: 260px; width: 500px;" /></p>
 <pre>
 <strong>输入：</strong>nums = [2,3,6,7,4,12,21,39]
 <strong>输出：</strong>8
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 2 * 10<sup>4</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
 <li><code>nums</code>&nbsp;中所有值都 <strong>不同</strong></li>
 </ul>
 */
public class LargestComponentSizeByCommonFactor {

    public int largestComponentSize(int[] nums) {
        int m = Arrays.stream(nums).max().getAsInt();
        UnionFind uf = new UnionFind(m + 1);
        for (int num : nums) {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    uf.union(num, i);
                    uf.union(num, num / i);
                }
            }
        }
        int[] counts = new int[m + 1];
        int ans = 0;
        for (int num : nums) {
            int root = uf.find(num);
            counts[root]++;
            ans = Math.max(ans, counts[root]);
        }
        return ans;
    }
}

class UnionFind {
    int[] parent;
    int[] rank;

    public UnionFind(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        rank = new int[n];
    }

    public void union(int x, int y) {
        int rootx = find(x);
        int rooty = find(y);
        if (rootx != rooty) {
            if (rank[rootx] > rank[rooty]) {
                parent[rooty] = rootx;
            } else if (rank[rootx] < rank[rooty]) {
                parent[rootx] = rooty;
            } else {
                parent[rooty] = rootx;
                rank[rootx]++;
            }
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
}
