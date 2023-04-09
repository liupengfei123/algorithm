package lpf.learn.leetcode.game.weekly325;

/** [2518] 好分区的数目
 <p>给你一个正整数数组 <code>nums</code> 和一个整数 <code>k</code> 。</p>
 <p><strong>分区</strong> 的定义是：将数组划分成两个有序的 <strong>组</strong> ，并满足每个元素 <strong>恰好</strong> 存在于 <strong>某一个</strong> 组中。如果分区中每个组的元素和都大于等于 <code>k</code> ，则认为分区是一个好分区。</p>
 <p>返回 <strong>不同</strong> 的好分区的数目。由于答案可能很大，请返回对 <code>10<sup>9</sup> + 7</code> <strong>取余</strong> 后的结果。</p>
 <p>如果在两个分区中，存在某个元素 <code>nums[i]</code> 被分在不同的组中，则认为这两个分区不同。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,2,3,4], k = 4
 <strong>输出：</strong>6
 <strong>解释：</strong>好分区的情况是 ([1,2,3], [4]), ([1,3], [2,4]), ([1,4], [2,3]), ([2,3], [1,4]), ([2,4], [1,3]) 和 ([4], [1,2,3]) 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [3,3,3], k = 4
 <strong>输出：</strong>0
 <strong>解释：</strong>数组中不存在好分区。
 </pre>

 <p><strong class="example">示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [6,6], k = 2
 <strong>输出：</strong>2
 <strong>解释：</strong>可以将 nums[0] 放入第一个分区或第二个分区中。
 好分区的情况是 ([6], [6]) 和 ([6], [6]) 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length, k &lt;= 1000</code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class NumberOfGreatPartitions {
    private static final int MOD = (int) 1e9 + 7;

    public int countPartitions(int[] nums, int k) {
        long sum = 0L;
        for (int x : nums) sum += x;
        if (sum < k * 2L) return 0;
        int ans = 1;
        int[] f = new int[k];
        f[0] = 1;
        for (int x : nums) {
            ans = ans * 2 % MOD;
            for (int j = k - 1; j >= x; --j)
                f[j] = (f[j] + f[j - x]) % MOD;
        }
        for (int x : f)
            ans = (ans - x * 2 % MOD + MOD) % MOD; // 保证答案非负
        return ans;
    }
}
