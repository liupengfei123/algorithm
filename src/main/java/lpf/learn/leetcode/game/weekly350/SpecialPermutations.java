package lpf.learn.leetcode.game.weekly350;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** [2741] 特别的排列
 <p>给你一个下标从 <strong>0</strong>&nbsp;开始的整数数组&nbsp;<code>nums</code>&nbsp;，它包含 <code>n</code>&nbsp;个 <strong>互不相同</strong>&nbsp;的正整数。如果&nbsp;<code>nums</code>&nbsp;的一个排列满足以下条件，我们称它是一个特别的排列：</p>
 <ul>
 <li>对于&nbsp;<code>0 &lt;= i &lt; n - 1</code>&nbsp;的下标 <code>i</code>&nbsp;，要么&nbsp;<code>nums[i] % nums[i+1] == 0</code>&nbsp;，要么&nbsp;<code>nums[i+1] % nums[i] == 0</code>&nbsp;。</li>
 </ul>
 <p>请你返回特别排列的总数目，由于答案可能很大，请将它对<strong>&nbsp;</strong><code>10<sup>9&nbsp;</sup>+ 7</code>&nbsp;<strong>取余</strong>&nbsp;后返回。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>nums = [2,3,6]
 <b>输出：</b>2
 <b>解释：</b>[3,6,2] 和 [2,6,3] 是 nums 两个特别的排列。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><b>输入：</b>nums = [1,4,3]
 <b>输出：</b>2
 <b>解释：</b>[3,1,4] 和 [4,1,3] 是 nums 两个特别的排列。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>2 &lt;= nums.length &lt;= 14</code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class SpecialPermutations {
    private final static int MOD = 1000_000_007;
    private int n;
    private Set<Integer>[] sets;
    private int[][][] dp;

    public int specialPerm(int[] nums) {
        this.n = nums.length;
        this.sets = new Set[n];
        Arrays.setAll(sets, i -> new HashSet<>());

        this.dp = new int[n][n][1 << 14];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) Arrays.fill(dp[i][j], -1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] % nums[j]!=0 && nums[j] % nums[i]!=0) continue;
                sets[i].add(j);
                sets[j].add(i);
            }
            if (sets[i].size() == 0) return 0;
        }

        int res = 0;
        for (int i = 0; i < n; i++) res = (res + run(1, 1 << i, i)) % MOD;

        return res;
    }

    private int run(int i, int mark, int x) {
        if (i == n) return 1;

        if (dp[i][x][mark] != -1) return dp[i][x][mark];
        int res = 0;
        for (Integer j : sets[x]) {
            if ((mark & 1 << j) != 0) continue;
            res = (res + run(i + 1, mark | 1 << j, j)) % MOD;
        }
        dp[i][x][mark] = res;
        return res;
    }
}
