package lpf.learn.leetcode.tags.twopoint;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** [15]三数之和
 <p>给你一个整数数组 <code>nums</code> ，判断是否存在三元组 <code>[nums[i], nums[j], nums[k]]</code> 满足 <code>i != j</code>、<code>i != k</code> 且 <code>j != k</code> ，同时还满足 <code>nums[i] + nums[j] + nums[k] == 0</code> 。请你返回所有和为 <code>0</code> 且不重复的三元组。</p>

 <p><strong>注意：</strong>答案中不可以包含重复的三元组。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [-1,0,1,2,-1,-4]
 <strong>输出：</strong>[[-1,-1,2],[-1,0,1]]
 <strong>解释：</strong>
 nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
 nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
 nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
 注意，输出的顺序和三元组的顺序并不重要。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [0,1,1]
 <strong>输出：</strong>[]
 <strong>解释：</strong>唯一可能的三元组和不为 0 。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [0,0,0]
 <strong>输出：</strong>[[0,0,0]]
 <strong>解释：</strong>唯一可能的三元组和为 0 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>3 &lt;= nums.length &lt;= 3000</code></li>
 <li><code>-10<sup>5</sup> &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
 </ul>
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for (int fisrt = 0; fisrt < n; fisrt++) {
            if (fisrt > 0 && nums[fisrt] == nums[fisrt - 1]) continue;

            int third = n - 1;
            int target = -nums[fisrt];

            for (int second = fisrt + 1; second < n; second++) {
                if (second > fisrt + 1 && nums[second] == nums[second - 1]) continue;

                while (second < third && nums[second] + nums[third] > target) third--;

                if (second == third) continue;

                if (nums[second] + nums[third] == target) {
                    res.add(Arrays.asList(nums[fisrt], nums[second], nums[third]));
                }
            }
        }
        return res;
    }
}
