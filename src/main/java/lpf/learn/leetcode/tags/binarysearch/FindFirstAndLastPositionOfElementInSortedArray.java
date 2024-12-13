package lpf.learn.leetcode.tags.binarysearch;


/** 34 在排序数组中查找元素的第一个和最后一个位置
 <p>给你一个按照非递减顺序排列的整数数组 <code>nums</code>，和一个目标值 <code>target</code>。请你找出给定目标值在数组中的开始位置和结束位置。</p>
 <p>如果数组中不存在目标值 <code>target</code>，返回&nbsp;<code>[-1, -1]</code>。</p>
 <p>你必须设计并实现时间复杂度为&nbsp;<code>O(log n)</code>&nbsp;的算法解决此问题。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [<span><code>5,7,7,8,8,10]</code></span>, target = 8
 <strong>输出：</strong>[3,4]</pre>

 <p><strong>示例&nbsp;2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [<span><code>5,7,7,8,8,10]</code></span>, target = 6
 <strong>输出：</strong>[-1,-1]</pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [], target = 0
 <strong>输出：</strong>[-1,-1]</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>0 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>-10<sup>9</sup>&nbsp;&lt;= nums[i]&nbsp;&lt;= 10<sup>9</sup></code></li>
 <li><code>nums</code>&nbsp;是一个非递减数组</li>
 <li><code>-10<sup>9</sup>&nbsp;&lt;= target&nbsp;&lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int l = solve(nums, target);
        if (nums.length == 0 || nums[l] != target) return new int[]{-1, -1};

        int r = solve(nums, target + 1);
        if (nums[r] != target) r--;

        return new int[]{l, r};
    }

    private int solve(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
