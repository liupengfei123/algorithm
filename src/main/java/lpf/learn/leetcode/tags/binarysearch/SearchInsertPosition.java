package lpf.learn.leetcode.tags.binarysearch;


/** 35 搜索插入位置
 <p>给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。</p>
 <p>请必须使用时间复杂度为 <code>O(log n)</code> 的算法。</p>

 <p><strong>示例 1:</strong></p>
 <pre>
 <strong>输入:</strong> nums = [1,3,5,6], target = 5
 <strong>输出:</strong> 2
 </pre>

 <p><strong>示例&nbsp;2:</strong></p>
 <pre>
 <strong>输入:</strong> nums = [1,3,5,6], target = 2
 <strong>输出:</strong> 1
 </pre>

 <p><strong>示例 3:</strong></p>
 <pre>
 <strong>输入:</strong> nums = [1,3,5,6], target = 7
 <strong>输出:</strong> 4
 </pre>

 <p><strong>提示:</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
 <li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
 <li><code>nums</code> 为&nbsp;<strong>无重复元素&nbsp;</strong>的&nbsp;<strong>升序&nbsp;</strong>排列数组</li>
 <li><code>-10<sup>4</sup> &lt;= target &lt;= 10<sup>4</sup></code></li>
 </ul>
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length;

        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) return mid;

            if (nums[mid] > target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
}
