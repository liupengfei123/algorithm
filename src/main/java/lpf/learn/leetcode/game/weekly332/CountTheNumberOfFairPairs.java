package lpf.learn.leetcode.game.weekly332;

import java.util.Arrays;

/** [2563] 统计公平数对的数目
 <p>给你一个下标从 <strong>0</strong> 开始、长度为 <code>n</code> 的整数数组&nbsp;<code>nums</code>&nbsp;，和两个整数&nbsp;<code>lower</code> 和&nbsp;<code>upper</code> ，返回 <strong>公平数对的数目</strong> 。</p>
 <p>如果&nbsp;<code>(i, j)</code>&nbsp;数对满足以下情况，则认为它是一个 <strong>公平数对</strong>&nbsp;：</p>

 <ul>
 <li><code>0 &lt;= i &lt; j &lt; n</code>，且</li>
 <li><code>lower &lt;= nums[i] + nums[j] &lt;= upper</code></li>
 </ul>

 <p><b>示例 1：</b></p>
 <pre>
 <b>输入：</b>nums = [0,1,7,4,4,5], lower = 3, upper = 6
 <b>输出：</b>6
 <b>解释：</b>共计 6 个公平数对：(0,3)、(0,4)、(0,5)、(1,3)、(1,4) 和 (1,5) 。
 </pre>

 <p><b>示例 2：</b></p>
 <pre>
 <b>输入：</b>nums = [1,7,9,2,5], lower = 11, upper = 11
 <b>输出：</b>1
 <b>解释：</b>只有单个公平数对：(2,3) 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>nums.length == n</code></li>
 <li><code>-10<sup>9</sup>&nbsp;&lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 <li><code>-10<sup>9</sup>&nbsp;&lt;= lower &lt;= upper &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class CountTheNumberOfFairPairs {

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long res = 0;

        for (int num : nums) {
            if (lower <= 2 * num && 2 * num <= upper) res -= 1;

            int l = bsearchLeft(nums, lower - num);
            int r = bsearchRight(nums, upper - num);

            if ((r - l) == 0 && (nums[l] < lower - num || nums[r] > upper - num)) {
                continue;
            }
            res += (r - l) + 1;
        }
        return res / 2;
    }


    // 区间[l, r]被划分成[l, mid]和[mid + 1, r]时使用：
    int bsearchLeft(int[] nums, int key) {
        int l = 0,  r = nums.length - 1;
        while (l < r)  {
            int mid = l + r >> 1;
            if (nums[mid] >= key) r = mid;    // check()判断mid是否满足性质
            else l = mid + 1;
        }
        return l;
    }

    // 区间[l, r]被划分成[l, mid]和[mid + 1, r]时使用：
    int bsearchRight(int[] nums, int key) {
        int l = 0,  r = nums.length - 1;
        while (l < r)  {
            int mid = l + r + 1 >> 1;
            if (nums[mid] <= key) l = mid;
            else r = mid - 1;
        }
        return l;
    }
}
