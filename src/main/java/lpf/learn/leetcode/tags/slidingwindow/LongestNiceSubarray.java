package lpf.learn.leetcode.tags.slidingwindow;


/** [2401] 最长优雅子数组
 <p>给你一个由 <strong>正</strong> 整数组成的数组 <code>nums</code> 。</p>
 <p>如果&nbsp;<code>nums</code> 的子数组中位于 <strong>不同</strong> 位置的每对元素按位 <strong>与（AND）</strong>运算的结果等于 <code>0</code> ，则称该子数组为 <strong>优雅</strong> 子数组。</p>
 <p>返回 <strong>最长</strong> 的优雅子数组的长度。</p>
 <p><strong>子数组</strong> 是数组中的一个 <strong>连续</strong> 部分。</p>
 <p><strong>注意：</strong>长度为 <code>1</code> 的子数组始终视作优雅子数组。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>nums = [1,3,8,48,10]
 <strong>输出：</strong>3
 <strong>解释：</strong>最长的优雅子数组是 [3,8,48] 。子数组满足题目条件：
 - 3 AND 8 = 0
 - 3 AND 48 = 0
 - 8 AND 48 = 0
 可以证明不存在更长的优雅子数组，所以返回 3 。</pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>nums = [3,1,5,11,13]
 <strong>输出：</strong>1
 <strong>解释：</strong>最长的优雅子数组长度为 1 ，任何长度为 1 的子数组都满足题目条件。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class LongestNiceSubarray {


    public int longestNiceSubarray(int[] nums) {
        int result = 1;
        for (int l = 0, r = 0; r < nums.length; r++) {
            l = check(nums, l, r);
            result = Math.max(result, r - l + 1);
        }
        return result;
    }

    private int check(int[] nums, int left, int right) {
        if (left == right)  return left;

        for (int i = right - 1; i >= left; i--) {
            if ((nums[right] & nums[i]) != 0) return i + 1;
        }
        return left;
    }


    public int longestNiceSubarray2(int[] nums) {
        int[] cnt = new int[32];
        int res = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            codeCnt(cnt, nums[r], 1);

            while (!check(cnt)) {
                codeCnt(cnt, nums[l++], -1);
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    private void codeCnt(int[] cnt, int v, int f) {
        int i = 0;
        while (v != 0) {
            if ((v & 1) == 1) cnt[i] += f;

            v >>= 1;
            i++;
        }
    }
    private boolean check(int[] cnt) {
        for (int i : cnt) {
            if (i > 1) return false;
        }
        return true;
    }
}
