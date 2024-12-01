package lpf.learn.leetcode.tags.slidingwindow;


/** 2875 无限数组的最短子数组
 <p>给你一个下标从 <strong>0</strong> 开始的数组 <code>nums</code> 和一个整数 <code>target</code> 。</p>
 <p>下标从 <strong>0</strong> 开始的数组 <code>infinite_nums</code> 是通过无限地将 nums 的元素追加到自己之后生成的。</p>
 <p>请你从 <code>infinite_nums</code> 中找出满足 <strong>元素和</strong> 等于&nbsp;<code>target</code> 的 <strong>最短</strong> 子数组，并返回该子数组的长度。如果不存在满足条件的子数组，返回 <code>-1</code> 。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,2,3], target = 5
 <strong>输出：</strong>2
 <strong>解释：</strong>在这个例子中 infinite_nums = [1,2,3,1,2,3,1,2,...] 。
 区间 [1,2] 内的子数组的元素和等于 target = 5 ，且长度 length = 2 。
 可以证明，当元素和等于目标值 target = 5 时，2 是子数组的最短长度。</pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,1,1,2,3], target = 4
 <strong>输出：</strong>2
 <strong>解释：</strong>在这个例子中 infinite_nums = [1,1,1,2,3,1,1,1,2,3,1,1,...].
 区间 [4,5] 内的子数组的元素和等于 target = 4 ，且长度 length = 2 。
 可以证明，当元素和等于目标值 target = 4 时，2 是子数组的最短长度。
 </pre>

 <p><strong class="example">示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [2,4,6,8], target = 3
 <strong>输出：</strong>-1
 <strong>解释：</strong>在这个例子中 infinite_nums = [2,4,6,8,2,4,6,8,...] 。
 可以证明，不存在元素和等于目标值 target = 3 的子数组。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= target &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class MinimumSizeSubarrayInInfiniteArray {
    public int minSizeSubarray(int[] nums, int target) {
        long sum = 0;
        for (int num : nums) sum += num;

        int n = nums.length;
        int res = (int) ((target / sum) * n);
        target %= sum;

        sum = 0;
        int len = n + 1;
        for (int l = 0, r = 0; r < n * 2; r++) {
            sum += nums[r % n];

            for (; sum >= target; l++) {
                if (sum == target) len = Math.min(len, r - l + 1);

                sum -= nums[l % n];
            }
        }

        return len > n ? -1 : res + len;
    }
}