package lpf.learn.leetcode.tags.array;

/**
 * 915 分割数组
 * <p>给定一个数组&nbsp;<code>nums</code>&nbsp;，将其划分为两个连续子数组&nbsp;<code>left</code>&nbsp;和&nbsp;<code>right</code>，&nbsp;使得：</p>
 * <ul>
 * <li><code>left</code>&nbsp;中的每个元素都小于或等于&nbsp;<code>right</code>&nbsp;中的每个元素。</li>
 * <li><code>left</code> 和&nbsp;<code>right</code>&nbsp;都是非空的。</li>
 * <li><code>left</code> 的长度要尽可能小。</li>
 * </ul>
 * <p><em>在完成这样的分组后返回&nbsp;<code>left</code>&nbsp;的&nbsp;<strong>长度&nbsp;</strong></em>。</p>
 * <p>用例可以保证存在这样的划分方法。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <strong>输入：</strong>nums = [5,0,3,8,6]
 * <strong>输出：</strong>3
 * <strong>解释：</strong>left = [5,0,3]，right = [8,6]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre>
 * <strong>输入：</strong>nums = [1,1,1,0,6,12]
 * <strong>输出：</strong>4
 * <strong>解释：</strong>left = [1,1,1,0]，right = [6,12]
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * <li><code>2 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 * <li><code>0 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
 * <li>可以保证至少有一种方法能够按题目所描述的那样对 <code>nums</code> 进行划分。</li>
 * </ul>
 */
public class PartitionArrayIntoDisjointIntervals {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int leftMax = nums[0], leftPos = 0, curMax = nums[0];
        for (int i = 1; i < n - 1; i++) {
            curMax = Math.max(curMax, nums[i]);
            if (nums[i] < leftMax) {
                leftMax = curMax;
                leftPos = i;
            }
        }
        return leftPos + 1;
    }

    public int partitionDisjoint2(int[] nums) {
        int n = nums.length;
        int[] minRight = new int[n];
        minRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(nums[i], minRight[i + 1]);
        }
        int maxLeft = 0;
        for (int i = 0; i < n - 1; i++) {
            maxLeft = Math.max(maxLeft, nums[i]);
            if (maxLeft <= minRight[i + 1]) {
                return i + 1;
            }
        }
        return n - 1;
    }
}
