package lpf.learn.leetcode.game.weekly340;

import java.util.HashMap;
import java.util.Map;


/** [2615] 等值距离和
 <p>给你一个下标从 <strong>0</strong> 开始的整数数组 <code>nums</code> 。现有一个长度等于 <code>nums.length</code> 的数组 <code>arr</code> 。对于满足 <code>nums[j] == nums[i]</code> 且 <code>j != i</code> 的所有 <code>j</code> ，<code>arr[i]</code> 等于所有 <code>|i - j|</code> 之和。如果不存在这样的 <code>j</code> ，则令 <code>arr[i]</code> 等于 <code>0</code> 。</p>
 <p>返回数组<em> </em><code>arr</code><em> 。</em></p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,3,1,1,2]
 <strong>输出：</strong>[5,0,3,4,0]
 <strong>解释：</strong>
 i = 0 ，nums[0] == nums[2] 且 nums[0] == nums[3] 。因此，arr[0] = |0 - 2| + |0 - 3| = 5 。
 i = 1 ，arr[1] = 0 因为不存在值等于 3 的其他下标。
 i = 2 ，nums[2] == nums[0] 且 nums[2] == nums[3] 。因此，arr[2] = |2 - 0| + |2 - 3| = 3 。
 i = 3 ，nums[3] == nums[0] 且 nums[3] == nums[2] 。因此，arr[3] = |3 - 0| + |3 - 2| = 4 。
 i = 4 ，arr[4] = 0 因为不存在值等于 2 的其他下标。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [0,5,3]
 <strong>输出：</strong>[0,0,0]
 <strong>解释：</strong>因为 nums 中的元素互不相同，对于所有 i ，都有 arr[i] = 0 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>0 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class SumOfDistances {
    public long[] distance(int[] nums) {
        int n = nums.length;
        Map<Integer, Long> sum = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            first.putIfAbsent(nums[i], i);
            int fist = first.get(nums[i]);

            sum.merge(nums[i], (long) (i - fist), Long::sum);
            count.merge(nums[i], 1, Integer::sum);
        }
        Map<Integer, Integer> last = new HashMap<>();
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            int key = nums[i];
            Integer j = last.get(key);
            if (j == null) j = i;

            Integer c = count.get(key);
            long v = sum.get(key);
            long nv = v - c * (i - j);

            res[i] = nv;
            sum.put(key, nv);
            count.merge(key, -2, Integer::sum);

            last.put(key, i);
        }
        return res;
    }
}
