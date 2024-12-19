package lpf.learn.leetcode.tags.binarysearch;

/** 2560 打家劫舍 IV
 <p>沿街有一排连续的房屋。每间房屋内都藏有一定的现金。现在有一位小偷计划从这些房屋中窃取现金。</p>
 <p>由于相邻的房屋装有相互连通的防盗系统，所以小偷 <strong>不会窃取相邻的房屋</strong> 。</p>
 <p>小偷的 <strong>窃取能力</strong> 定义为他在窃取过程中能从单间房屋中窃取的 <strong>最大金额</strong> 。</p>
 <p>给你一个整数数组 <code>nums</code> 表示每间房屋存放的现金金额。形式上，从左起第 <code>i</code> 间房屋中放有 <code>nums[i]</code> 美元。</p>
 <p>另给你一个整数&nbsp;<code>k</code> ，表示窃贼将会窃取的 <strong>最少</strong> 房屋数。小偷总能窃取至少 <code>k</code> 间房屋。</p>
 <p>返回小偷的 <strong>最小</strong> 窃取能力。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [2,3,5,9], k = 2
 <strong>输出：</strong>5
 <strong>解释：</strong>
 小偷窃取至少 2 间房屋，共有 3 种方式：
 - 窃取下标 0 和 2 处的房屋，窃取能力为 max(nums[0], nums[2]) = 5 。
 - 窃取下标 0 和 3 处的房屋，窃取能力为 max(nums[0], nums[3]) = 9 。
 - 窃取下标 1 和 3 处的房屋，窃取能力为 max(nums[1], nums[3]) = 9 。
 因此，返回 min(5, 9, 9) = 5 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [2,7,9,3,1], k = 2
 <strong>输出：</strong>2
 <strong>解释：</strong>共有 7 种窃取方式。窃取能力最小的情况所对应的方式是窃取下标 0 和 4 处的房屋。返回 max(nums[0], nums[4]) = 2 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 <li><code>1 &lt;= k &lt;= (nums.length + 1)/2</code></li>
 </ul>
 */
public class HouseRobberIv {
    public int minCapability(int[] nums, int k) {
        int l = 0, r = 1000_000_000;
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

    private boolean check(int[] nums, int k, int v) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > v) continue;

            c++;
            i++;
        }
        return c >= k;
    }
}
