package lpf.learn.leetcode.tags.slidingwindow;


/** 2962 统计最大元素出现至少 K 次的子数组
 <p>给你一个整数数组 <code>nums</code> 和一个 <strong>正整数</strong> <code>k</code> 。</p>
 <p>请你统计有多少满足 「&nbsp;<code>nums</code> 中的 <strong>最大</strong> 元素」至少出现 <code>k</code> 次的子数组，并返回满足这一条件的子数组的数目。</p>
 <p>子数组是数组中的一个连续元素序列。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,3,2,3,3], k = 2
 <strong>输出：</strong>6
 <strong>解释：</strong>包含元素 3 至少 2 次的子数组为：[1,3,2,3]、[1,3,2,3,3]、[3,2,3]、[3,2,3,3]、[2,3,3] 和 [3,3] 。
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,4,2,1], k = 3
 <strong>输出：</strong>0
 <strong>解释：</strong>没有子数组包含元素 4 至少 3 次。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
 <li><code>1 &lt;= k &lt;= 10<sup>5</sup></code></li>
 </ul>
 */
public class CountSubarraysWhereMaxElementAppearsAtLeastKTimes {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        for (int num : nums) if (max < num) max = num;

        int cnt = 0;
        long res = 0;

        for (int l = 0, r = 0; r < nums.length; r++) {
            if (nums[r] == max) cnt++;

            while (cnt >= k) if (nums[l++] == max) cnt--;

            res += l;
        }
        return res;
    }
}
