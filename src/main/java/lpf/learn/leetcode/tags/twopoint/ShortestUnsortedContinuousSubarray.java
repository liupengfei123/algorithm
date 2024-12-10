package lpf.learn.leetcode.tags.twopoint;


import java.util.TreeMap;

/** 581 最短无序连续子数组
 <p>给你一个整数数组 <code>nums</code> ，你需要找出一个 <strong>连续子数组</strong> ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。</p>
 <p>请你找出符合题意的 <strong>最短</strong> 子数组，并输出它的长度。</p>

 <div class="original__bRMd">
 <div>
 <p><strong>示例 1：</strong></p>
 </div>
 </div>
 <pre>
 <strong>输入：</strong>nums = [2,6,4,8,10,9,15]
 <strong>输出：</strong>5
 <strong>解释：</strong>你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,2,3,4]
 <strong>输出：</strong>0
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1]
 <strong>输出：</strong>0
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
 <li><code>-10<sup>5</sup> &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
 </ul>

 <p><strong>进阶：</strong>你可以设计一个时间复杂度为 <code>O(n)</code> 的解决方案吗？</p>
 */
public class ShortestUnsortedContinuousSubarray {


    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] max = new int[n], min = new int[n];

        int temp = nums[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            min[i] = temp = Math.min(nums[i], temp);
        }
        temp = nums[0];
        for (int i = 0; i < n; i++) {
            max[i] = temp = Math.max(nums[i], temp);
        }

        int l = 0, r = n - 1;
        while (l <= r && nums[l] == min[l]) l++;

        while (l <= r && nums[r] == max[r]) r--;

        return r - l + 1;
    }


    public int findUnsortedSubarray2(int[] nums) {
        TreeMap<Integer, Integer> treeSet = new TreeMap<>();
        for (int num : nums) treeSet.merge(num, 1, Integer::sum);

        int n = nums.length;
        int l = 0, r = n - 1;
        while (!treeSet.isEmpty() && nums[l] == treeSet.firstKey())
            treeSet.merge(nums[l++], -1, (a, b) -> (a += b) == 0 ? null : a);

        while (!treeSet.isEmpty() && nums[r] == treeSet.lastKey())
            treeSet.merge(nums[r--], -1, (a, b) -> (a += b) == 0 ? null : a);

        return r - l + 1;
    }


}
