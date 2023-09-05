package lpf.learn.leetcode.tags.array;


import java.util.HashSet;
import java.util.Set;

/** 2605 从两个数字数组里生成最小数字
 给你两个只包含 1 到 9 之间数字的数组&nbsp;<code>nums1</code> 和&nbsp;<code>nums2</code>&nbsp;，每个数组中的元素 <strong>互不相同</strong>&nbsp;，请你返回 <strong>最小</strong> 的数字，两个数组都 <strong>至少</strong> 包含这个数字的某个数位。

 <p><strong>示例 1：</strong></p>
 <pre><b>输入：</b>nums1 = [4,1,3], nums2 = [5,7]
 <b>输出：</b>15
 <b>解释：</b>数字 15 的数位 1 在 nums1 中出现，数位 5 在 nums2 中出现。15 是我们能得到的最小数字。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><b>输入：</b>nums1 = [3,5,2,6], nums2 = [3,1,7]
 <b>输出：</b>3
 <b>解释：</b>数字 3 的数位 3 在两个数组中都出现了。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums1.length, nums2.length &lt;= 9</code></li>
 <li><code>1 &lt;= nums1[i], nums2[i] &lt;= 9</code></li>
 <li>每个数组中，元素 <strong>互不相同</strong>&nbsp;。</li>
 </ul>
 */
public class FormSmallestNumberFromTwoDigitArrays {
    public int minNumber(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int min1 = 10, min2 = 10;
        for (int i : nums1) {
            set.add(i);
            min1 = Math.min(min1, i);
        }
        int res = 100;
        for (int j : nums2) {
            if (set.contains(j)) res = Math.min(res, j);
            min2 = Math.min(min2, j);
        }
        res = Math.min(res, min1 < min2 ? (min1 * 10 + min2) : (min2 * 10 + min1));
        return res;
    }
}
