package lpf.learn.leetcode.tags.slidingwindow;

import java.util.Arrays;

/** 1838 最高频元素的频数
 <p>元素的 <strong>频数</strong> 是该元素在一个数组中出现的次数。</p>
 <p>给你一个整数数组 <code>nums</code> 和一个整数 <code>k</code> 。在一步操作中，你可以选择 <code>nums</code> 的一个下标，并将该下标对应元素的值增加 <code>1</code> 。</p>
 <p>执行最多 <code>k</code> 次操作后，返回数组中最高频元素的 <strong>最大可能频数</strong> <em>。</em></p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,2,4], k = 5
 <strong>输出：</strong>3
 <strong>解释：</strong>对第一个元素执行 3 次递增操作，对第二个元素执 2 次递增操作，此时 nums = [4,4,4] 。
 4 是数组中最高频元素，频数是 3 。</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,4,8,13], k = 5
 <strong>输出：</strong>2
 <strong>解释：</strong>存在多种最优解决方案：
 - 对第一个元素执行 3 次递增操作，此时 nums = [4,4,8,13] 。4 是数组中最高频元素，频数是 2
 - 对第二个元素执行 4 次递增操作，此时 nums = [1,8,8,13] 。8 是数组中最高频元素，频数是 2
 - 对第三个元素执行 5 次递增操作，此时 nums = [1,4,13,13] 。13 是数组中最高频元素，频数是 2
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [3,9,6], k = 2
 <strong>输出：</strong>1
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= k &lt;= 10<sup>5</sup></code></li>
 </ul>
 */

public class FrequencyoftheMostFrequentElement {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        long sum = 0, cnt;
        int res = 1;

        for (int l = 0, r = 0; r < n; r++) {
            sum += nums[r];

            for (cnt = r - l + 1; sum + k < nums[r] * cnt; l++, cnt = r - l + 1) {
                sum -= nums[l];
            }
            res = (int) Math.max(res, cnt);
        }

        return res;
    }
}
