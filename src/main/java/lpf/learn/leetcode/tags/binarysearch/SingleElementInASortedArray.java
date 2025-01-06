package lpf.learn.leetcode.tags.binarysearch;


/** 540 有序数组中的单一元素
 <p>给你一个仅由整数组成的有序数组，其中每个元素都会出现两次，唯有一个数只会出现一次。</p>
 <p>请你找出并返回只出现一次的那个数。</p>
 <p>你设计的解决方案必须满足 <code>O(log n)</code> 时间复杂度和 <code>O(1)</code> 空间复杂度。</p>

 <p><strong>示例 1:</strong></p>
 <pre>
 <strong>输入:</strong> nums = [1,1,2,3,3,4,4,8,8]
 <strong>输出:</strong> 2
 </pre>

 <p><strong>示例 2:</strong></p>
 <pre>
 <strong>输入:</strong> nums =  [3,3,7,7,10,11,11]
 <strong>输出:</strong> 10
 </pre>

 <p><strong>提示:</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>0 &lt;= nums[i]&nbsp;&lt;= 10<sup>5</sup></code></li>
 </ul>
 */
public class SingleElementInASortedArray {
    /**
     *  由于数组是有序的，因此数组中相同的元素一定相邻。对于下标 x 左边的下标 y，如果 nums[y] == nums[y + 1]，则 y 一定是偶数；
     *  对于下标 x 右边的下标 z，如果 nums[z] == nums[z + 1]，则 z 一定是奇数。由于下标 x 是相同元素的开始下标的奇偶性的分界，
     *  因此可以使用二分查找的方法寻找下标 x。
     */
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] == nums[mid ^ 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return nums[r];
    }
}
