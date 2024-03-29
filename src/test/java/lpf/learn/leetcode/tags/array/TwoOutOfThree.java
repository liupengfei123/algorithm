package lpf.learn.leetcode.tags.array;

import java.util.ArrayList;
import java.util.List;

/** 2032 至少在两个数组中出现的值
 给你三个整数数组 <code>nums1</code>、<code>nums2</code> 和 <code>nums3</code> ，请你构造并返回一个 <strong>元素各不相同的</strong> 数组，且由 <strong>至少</strong> 在 <strong>两个</strong> 数组中出现的所有值组成<em>。</em>数组中的元素可以按 <strong>任意</strong> 顺序排列。
 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
 <strong>输出：</strong>[3,2]
 <strong>解释：</strong>至少在两个数组中出现的所有值为：
 - 3 ，在全部三个数组中都出现过。
 - 2 ，在数组 nums1 和 nums2 中出现过。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
 <strong>输出：</strong>[2,3,1]
 <strong>解释：</strong>至少在两个数组中出现的所有值为：
 - 2 ，在数组 nums2 和 nums3 中出现过。
 - 3 ，在数组 nums1 和 nums2 中出现过。
 - 1 ，在数组 nums1 和 nums3 中出现过。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
 <strong>输出：</strong>[]
 <strong>解释：</strong>不存在至少在两个数组中出现的值。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums1.length, nums2.length, nums3.length &lt;= 100</code></li>
 <li><code>1 &lt;= nums1[i], nums2[j], nums3[k] &lt;= 100</code></li>
 </ul>
 */
public class TwoOutOfThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] array = new int[101];

        for (int i : nums1) array[i] |= 1;
        for (int i : nums2) array[i] |= 2;
        for (int i : nums3) array[i] |= 4;

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if ((array[i] & (array[i] - 1)) != 0) res.add(i);
        }
        return res;
    }
}
