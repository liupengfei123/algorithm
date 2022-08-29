package lpf.learn.leetcode.game.weekly307;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/** 2386 找出数组的第 K 大和
 <p>给你一个整数数组 <code>nums</code> 和一个 <strong>正</strong> 整数 <code>k</code> 。你可以选择数组的任一 <strong>子序列</strong> 并且对其全部元素求和。</p>
 <p>数组的 <strong>第 k 大和</strong> 定义为：可以获得的第 <code>k</code> 个 <strong>最大</strong> 子序列和（子序列和允许出现重复）</p>
 <p>返回数组的 <strong>第 k 大和</strong> 。</p>
 <p>子序列是一个可以由其他数组删除某些或不删除元素排生而来的数组，且派生过程不改变剩余元素的顺序。</p>
 <p><strong>注意：</strong>空子序列的和视作 <code>0</code> 。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>nums = [2,4,-2], k = 5
 <strong>输出：</strong>2
 <strong>解释：</strong>所有可能获得的子序列和列出如下，按递减顺序排列：
 - 6、4、4、2、<strong><em>2</em></strong>、0、0、-2
 数组的第 5 大和是 2 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>nums = [1,-2,3,4,-10,12], k = 16
 <strong>输出：</strong>10
 <strong>解释：</strong>数组的第 16 大和是 10 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == nums.length</code></li>
 <li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
 <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 <li><code>1 &lt;= k &lt;= min(2000, 2<sup>n</sup>)</code></li>
 </ul>
 */
public class FindTheKSumOfAnArray {
    public long kSum(int[] nums, int k) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                sum += nums[i];
            nums[i] = Math.abs(nums[i]);
        }

        Arrays.sort(nums);

        PriorityQueue<long[]> queue = new PriorityQueue<>(Comparator.comparingLong((long[] a) -> a[0]).reversed());
        queue.offer(new long[]{sum, 0});

        while (--k > 0) {
            long[] poll = queue.poll();
            long s = poll[0];
            int i = (int) poll[1];
            if (i < nums.length) {
                queue.offer(new long[]{s - nums[i], i + 1});
                if (i > 0) {
                    queue.offer(new long[]{s - nums[i] + nums[i - 1], i + 1});
                }
            }
        }
        return queue.peek()[0];
    }
}
