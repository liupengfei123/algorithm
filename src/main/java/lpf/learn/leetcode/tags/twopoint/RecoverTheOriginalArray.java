package lpf.learn.leetcode.tags.twopoint;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** 2122 还原原数组
 <p>Alice 有一个下标从 <strong>0</strong> 开始的数组 <code>arr</code> ，由 <code>n</code> 个正整数组成。她会选择一个任意的 <strong>正整数 </strong><code>k</code> 并按下述方式创建两个下标从 <strong>0</strong> 开始的新整数数组 <code>lower</code> 和 <code>higher</code> ：</p>
 <ol>
 <li>对每个满足 <code>0 &lt;= i &lt; n</code> 的下标 <code>i</code> ，<code>lower[i] = arr[i] - k</code></li>
 <li>对每个满足 <code>0 &lt;= i &lt; n</code> 的下标 <code>i</code> ，<code>higher[i] = arr[i] + k</code></li>
 </ol>
 <p>不幸地是，Alice 丢失了全部三个数组。但是，她记住了在数组 <code>lower</code> 和 <code>higher</code> 中出现的整数，但不知道每个整数属于哪个数组。请你帮助 Alice 还原原数组。</p>
 <p>给你一个由 2n 个整数组成的整数数组 <code>nums</code> ，其中 <strong>恰好</strong> <code>n</code> 个整数出现在 <code>lower</code> ，剩下的出现在 <code>higher</code> ，还原并返回 <strong>原数组</strong> <code>arr</code> 。如果出现答案不唯一的情况，返回 <strong>任一</strong> 有效数组。</p>
 <p><strong>注意：</strong>生成的测试用例保证存在 <strong>至少一个</strong> 有效数组 <code>arr</code> 。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>nums = [2,10,6,4,8,12]
 <strong>输出：</strong>[3,7,11]
 <strong>解释：</strong>
 如果 arr = [3,7,11] 且 k = 1 ，那么 lower = [2,6,10] 且 higher = [4,8,12] 。
 组合 lower 和 higher 得到 [2,6,10,4,8,12] ，这是 nums 的一个排列。
 另一个有效的数组是 arr = [5,7,9] 且 k = 3 。在这种情况下，lower = [2,4,6] 且 higher = [8,10,12] 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>nums = [1,1,3,3]
 <strong>输出：</strong>[2,2]
 <strong>解释：</strong>
 如果 arr = [2,2] 且 k = 1 ，那么 lower = [1,1] 且 higher = [3,3] 。
 组合 lower 和 higher 得到 [1,1,3,3] ，这是 nums 的一个排列。
 注意，数组不能是 [1,3] ，因为在这种情况下，获得 [1,1,3,3] 唯一可行的方案是 k = 0 。
 这种方案是无效的，k 必须是一个正整数。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>nums = [5,435]
 <strong>输出：</strong>[220]
 <strong>解释：</strong>
 唯一可行的组合是 arr = [220] 且 k = 215 。在这种情况下，lower = [5] 且 higher = [435] 。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>2 * n == nums.length</code></li>
 <li><code>1 &lt;= n &lt;= 1000</code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 <li>生成的测试用例保证存在 <strong>至少一个</strong> 有效数组 <code>arr</code></li>
 </ul>
 */
public class RecoverTheOriginalArray {


    public int[] recoverArray(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length / 2;
        for (int i = 1; i <= n; i++) {
            int[] solve = solve(n, nums, nums[i] - nums[0]);
            if (solve != null) {
                return solve;
            }
        }
        return null;
    }

    private int[] solve(int n, int[] nums, int k) {
        if ((k & 1) != 0 || k == 0) return null;

        int len = n * 2, d = k / 2;
        boolean[] flag = new boolean[len];
        int[] res = new int[n];

        for (int i = 0, l = 0, r = 0; l < len; l++) {
            if (flag[l]) continue;

            while (r < len && nums[r] - nums[l] != k) r++;

            if (r == len) return null;

            res[i++] = nums[l] + d;
            flag[l] = flag[r++] = true;
        }
        return res;
    }

    private int[] solve2(int n, int[] nums, int k) {
        if ((k & 1) != 0 || k == 0) return null;

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.merge(num, 1, Integer::sum);
        }

        int[] res = new int[n];
        int i = 0, d = k / 2;
        for (int num : nums) {
            if (!count.containsKey(num)) continue;
            if (!count.containsKey(num + k)) return null;

            count.merge(num, -1, (a, b) -> (a += b) == 0 ? null : a);
            count.merge(num + k, -1, (a, b) -> (a += b) == 0 ? null : a);

            res[i++] = num + d;
        }
        return res;
    }



}
