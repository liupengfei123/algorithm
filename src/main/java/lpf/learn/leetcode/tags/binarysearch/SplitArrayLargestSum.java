package lpf.learn.leetcode.tags.binarysearch;


/** 410 分割数组的最大值
 <p>给定一个非负整数数组 <code>nums</code> 和一个整数&nbsp;<code>k</code> ，你需要将这个数组分成&nbsp;<code>k</code><em>&nbsp;</em>个非空的连续子数组，使得这&nbsp;<code>k</code><em>&nbsp;</em>个子数组各自和的最大值 <strong>最小</strong>。</p>
 <p>返回分割后最小的和的最大值。</p>
 <p><strong>子数组</strong> 是数组中连续的部份。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [7,2,5,10,8], k = 2
 <strong>输出：</strong>18
 <strong>解释：</strong>
 一共有四种方法将 nums 分割为 2 个子数组。
 其中最好的方式是将其分为 [7,2,5] 和 [10,8] 。
 因为此时这两个子数组各自的和的最大值为18，在所有情况中最小。</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,2,3,4,5], k = 2
 <strong>输出：</strong>9
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,4,4], k = 3
 <strong>输出：</strong>4
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 1000</code></li>
 <li><code>0 &lt;= nums[i] &lt;= 10<sup>6</sup></code></li>
 <li><code>1 &lt;= k &lt;= min(50, nums.length)</code></li>
 </ul>
 */
public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int l = 0, r = 1000_000_001;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (check(nums, k, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }


    private boolean check(int[] nums, int k, int max) {
        int c = 0, s = 0;
        for (int num : nums) {
            if (num > max) return false;
            
            s += num;
            if (s > max) {
                c++;
                s = num;
            }
        }
        return c < k;
    }
}
