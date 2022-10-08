package lpf.learn.leetcode.tags.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 870 优势洗牌
 * <p>给定两个大小相等的数组&nbsp;<code>nums1</code>&nbsp;和&nbsp;<code>nums2</code>，<code>nums1</code>&nbsp;相对于 <code>nums</code>&nbsp;的<em>优势</em>可以用满足&nbsp;<code>nums1[i] &gt; nums2[i]</code>&nbsp;的索引 <code>i</code>&nbsp;的数目来描述。</p>
 * <p>返回 <font color="#c7254e" face="Menlo, Monaco, Consolas, Courier New, monospace" size="1"><span style="background-color: rgb(249, 242, 244);">nums1</span></font>&nbsp;的<strong>任意</strong>排列，使其相对于 <code>nums2</code>&nbsp;的优势最大化。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <strong>输入：</strong>nums1 = [2,7,11,15], nums2 = [1,10,4,11]
 * <strong>输出：</strong>[2,11,7,15]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre>
 * <strong>输入：</strong>nums1 = [12,24,8,32], nums2 = [13,25,32,11]
 * <strong>输出：</strong>[24,32,8,12]
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * <li><code>1 &lt;= nums1.length &lt;= 10<sup>5</sup></code></li>
 * <li><code>nums2.length == nums1.length</code></li>
 * <li><code>0 &lt;= nums1[i], nums2[i] &lt;= 10<sup>9</sup></code></li>
 * </ul>
 */
public class AdvantageShuffle {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);

        int len = nums2.length;
        OrderVal[] orderVals = new OrderVal[len];
        for (int j = 0; j < len; ++j) {
            orderVals[j] = new OrderVal(j, nums2[j]);
        }
        Arrays.sort(orderVals, Comparator.comparing(orderVal -> orderVal.val));

        int[] ans = new int[len];
        int left = 0, right = len - 1;
        for (int j = 0; j < len; ++j) {
            if (nums1[j] > orderVals[left].val) {
                ans[orderVals[left].order] = nums1[j];
                left++;
            } else {
                ans[orderVals[right].order] = nums1[j];
                right--;
            }
        }
        return ans;
    }

    static class OrderVal {
        int order;
        int val;

        public OrderVal(int order, int val) {
            this.order = order;
            this.val = val;
        }
    }


    public int[] advantageCount2(int[] nums1, int[] nums2) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i : nums1) {
            treeMap.merge(i, 1, Integer::sum);
        }
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            Map.Entry<Integer, Integer> entry = treeMap.ceilingEntry(nums2[i] + 1);
            if (entry == null) {
                entry = treeMap.firstEntry();
            }
            Integer key = entry.getKey();
            result[i] = key;
            if (entry.getValue() == 1) {
                treeMap.remove(key);
            } else {
                treeMap.merge(key, -1, Integer::sum);
            }
        }
        return result;
    }
}
