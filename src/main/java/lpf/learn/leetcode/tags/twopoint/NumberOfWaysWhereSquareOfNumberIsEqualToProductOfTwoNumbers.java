package lpf.learn.leetcode.tags.twopoint;


import java.util.Arrays;

/** 1577 数的平方等于两数乘积的方法数
 <p>给你两个整数数组 <code>nums1</code> 和 <code>nums2</code> ，请你返回根据以下规则形成的三元组的数目（类型 1 和类型 2 ）：</p>
 <ul>
 <li>类型 1：三元组 <code>(i, j, k)</code> ，如果 <code>nums1[i]<sup>2</sup>&nbsp;== nums2[j] * nums2[k]</code> 其中 <code>0 &lt;= i &lt; nums1.length</code> 且 <code>0 &lt;= j &lt; k &lt; nums2.length</code></li>
 <li>类型 2：三元组 <code>(i, j, k)</code> ，如果 <code>nums2[i]<sup>2</sup>&nbsp;== nums1[j] * nums1[k]</code> 其中 <code>0 &lt;= i &lt; nums2.length</code> 且 <code>0 &lt;= j &lt; k &lt; nums1.length</code></li>
 </ul>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>nums1 = [7,4], nums2 = [5,2,8,9]
 <strong>输出：</strong>1
 <strong>解释：</strong>类型 1：(1,1,2), nums1[1]^2 = nums2[1] * nums2[2] (4^2 = 2 * 8)</pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>nums1 = [1,1], nums2 = [1,1,1]
 <strong>输出：</strong>9
 <strong>解释：</strong>所有三元组都符合题目要求，因为 1^2 = 1 * 1
 类型 1：(0,0,1), (0,0,2), (0,1,2), (1,0,1), (1,0,2), (1,1,2), nums1[i]^2 = nums2[j] * nums2[k]
 类型 2：(0,0,1), (1,0,1), (2,0,1), nums2[i]^2 = nums1[j] * nums1[k]
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>nums1 = [7,7,8,3], nums2 = [1,2,9,7]
 <strong>输出：</strong>2
 <strong>解释：</strong>有两个符合题目要求的三元组
 类型 1：(3,0,2), nums1[3]^2 = nums2[0] * nums2[2]
 类型 2：(3,0,1), nums2[3]^2 = nums1[0] * nums1[1]
 </pre>

 <p><strong>示例 4：</strong></p>
 <pre><strong>输入：</strong>nums1 = [4,7,9,11,23], nums2 = [3,5,1024,12,18]
 <strong>输出：</strong>0
 <strong>解释：</strong>不存在符合题目要求的三元组
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums1.length, nums2.length &lt;= 1000</code></li>
 <li><code>1 &lt;= nums1[i], nums2[i] &lt;= 10^5</code></li>
 </ul>
 */
public class NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers {
    public int numTriplets(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        return solve(nums1, nums2) + solve(nums2, nums1);
    }

    private int solve(int[] nums1, int[] nums2) {
        int n2 = nums2.length, res = 0;
        for (int v : nums1) {
            long val1 = (long) v * v;

            for (int l = 0, r = n2 - 1; l < r; ) {
                long val2 = (long) nums2[l] * nums2[r];

                if (val1 != val2) {
                    int ignore = val1 < val2 ? r-- : l++;
                    continue;
                }
                if (nums2[l] == nums2[r]) {
                    res += (r - l + 1) * (r - l) / 2;
                    break;
                }
                int nl = l, nr = r;
                while (nums2[nl] == nums2[l]) nl++;
                while (nums2[nr] == nums2[r]) nr--;

                res += (nl - l) * (r - nr);
                l = nl;
                r = nr;
            }
        }
        return res;
    }
}
