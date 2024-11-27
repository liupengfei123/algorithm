package lpf.learn.leetcode.tags.slidingwindow;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;

/** 2762 不间断子数组
 <p>给你一个下标从 <strong>0</strong>&nbsp;开始的整数数组&nbsp;<code>nums</code>&nbsp;。<code>nums</code>&nbsp;的一个子数组如果满足以下条件，那么它是 <strong>不间断</strong> 的：</p>
 <ul>
 <li><code>i</code>，<code>i + 1</code>&nbsp;，...，<code>j</code><sub> </sub>&nbsp;表示子数组中的下标。对于所有满足&nbsp;<code>i &lt;= i<sub>1</sub>, i<sub>2</sub> &lt;= j</code>&nbsp;的下标对，都有 <code>0 &lt;= |nums[i<sub>1</sub>] - nums[i<sub>2</sub>]| &lt;= 2</code>&nbsp;。</li>
 </ul>
 <p>请你返回 <strong>不间断</strong> 子数组的总数目。</p>
 <p>子数组是一个数组中一段连续 <strong>非空</strong>&nbsp;的元素序列。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>nums = [5,4,2,4]
 <strong>输出：</strong>8
 <b>解释：</b>
 大小为 1 的不间断子数组：[5], [4], [2], [4] 。
 大小为 2 的不间断子数组：[5,4], [4,2], [2,4] 。
 大小为 3 的不间断子数组：[4,2,4] 。
 没有大小为 4 的不间断子数组。
 不间断子数组的总数目为 4 + 3 + 1 = 8 。
 除了这些以外，没有别的不间断子数组。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>nums = [1,2,3]
 <b>输出：</b>6
 <b>解释：</b>
 大小为 1 的不间断子数组：[1], [2], [3] 。
 大小为 2 的不间断子数组：[1,2], [2,3] 。
 大小为 3 的不间断子数组：[1,2,3] 。
 不间断子数组的总数目为 3 + 2 + 1 = 6 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class ContinuousSubarrays {
    public long continuousSubarrays(int[] nums) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        long res = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            treeMap.merge(nums[r], 1, Integer::sum);

            while (treeMap.lastKey() - treeMap.firstKey() > 2) {
                treeMap.merge(nums[l++], -1, (a, b) -> (a += b) == 0 ? null : a);
            }
            res += r - l + 1;
        }
        return res;
    }

    public long continuousSubarrays2(int[] nums) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());

        long res = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            maxQueue.offer(nums[r]);
            minQueue.offer(nums[r]);

            while (maxQueue.peek() - minQueue.peek() > 2) {
                maxQueue.remove(nums[l]);
                minQueue.remove(nums[l]);
                l++;
            }
            res += r - l + 1;
        }
        return res;
    }
}
