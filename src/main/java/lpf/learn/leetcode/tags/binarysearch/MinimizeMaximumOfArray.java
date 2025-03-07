package lpf.learn.leetcode.tags.binarysearch;


/** 2439 最小化数组中的最大值
 <p>给你一个下标从 <strong>0</strong>&nbsp;开始的数组&nbsp;<code>nums</code>&nbsp;，它含有&nbsp;<code>n</code>&nbsp;个非负整数。</p>
 <p>每一步操作中，你需要：</p>
 <ul>
 <li>选择一个满足&nbsp;<code>1 &lt;= i &lt; n</code>&nbsp;的整数 <code>i</code>&nbsp;，且&nbsp;<code>nums[i] &gt; 0</code>&nbsp;。</li>
 <li>将&nbsp;<code>nums[i]</code>&nbsp;减 1 。</li>
 <li>将&nbsp;<code>nums[i - 1]</code>&nbsp;加 1 。</li>
 </ul>

 <p>你可以对数组执行 <strong>任意</strong>&nbsp;次上述操作，请你返回可以得到的 <code>nums</code>&nbsp;数组中<b>&nbsp;最大值</b>&nbsp;<strong>最小</strong> 为多少。</p>

 <p><strong>示例 1：</strong></p>
 <pre><b>输入：</b>nums = [3,7,1,6]
 <b>输出：</b>5
 <strong>解释：</strong>
 一串最优操作是：
 1. 选择 i = 1 ，nums 变为 [4,6,1,6] 。
 2. 选择 i = 3 ，nums 变为 [4,6,2,5] 。
 3. 选择 i = 1 ，nums 变为 [5,5,2,5] 。
 nums 中最大值为 5 。无法得到比 5 更小的最大值。
 所以我们返回 5 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><b>输入：</b>nums = [10,1]
 <b>输出：</b>10
 <strong>解释：</strong>
 最优解是不改动 nums ，10 是最大值，所以返回 10 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == nums.length</code></li>
 <li><code>2 &lt;= n &lt;= 10<sup>5</sup></code></li>
 <li><code>0 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class MinimizeMaximumOfArray {
    public int minimizeArrayValue(int[] nums) {
        long max = 0, sum = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }
        int l = 0, r = (int) max;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (sum <= (long) mid * nums.length && check(nums, mid)) {
                r = mid;
            } else{
                l = mid + 1;
            }
        }
        return r;
    }

    private boolean check(int[] nums, int max) {
        long diff = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            diff = Math.max(nums[i] + diff - max, 0);
        }
        return nums[0] + diff <= max;
    }
}
