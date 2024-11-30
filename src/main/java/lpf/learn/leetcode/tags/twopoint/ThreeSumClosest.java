package lpf.learn.leetcode.tags.twopoint;

import java.util.Arrays;

/** 16 最接近的三数之和
 <p>给你一个长度为 <code>n</code> 的整数数组&nbsp;<code>nums</code><em>&nbsp;</em>和 一个目标值&nbsp;<code>target</code>。请你从 <code>nums</code><em> </em>中选出三个整数，使它们的和与&nbsp;<code>target</code>&nbsp;最接近。</p>
 <p>返回这三个数的和。</p>
 <p>假定每组输入只存在恰好一个解。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [-1,2,1,-4], target = 1
 <strong>输出：</strong>2
 <strong>解释：</strong>与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [0,0,0], target = 1
 <strong>输出：</strong>0
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>3 &lt;= nums.length &lt;= 1000</code></li>
 <li><code>-1000 &lt;= nums[i] &lt;= 1000</code></li>
 <li><code>-10<sup>4</sup> &lt;= target &lt;= 10<sup>4</sup></code></li>
 </ul>
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length, res = Integer.MAX_VALUE / 2;

        for (int i = 0; i < n; i++) {
            int l = i + 1, r = n - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
                if (sum == target) return res;

                if (sum < target) l++;
                else r--;
            }
        }
        return res;
    }
}
