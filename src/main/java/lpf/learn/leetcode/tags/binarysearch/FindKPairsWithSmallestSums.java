package lpf.learn.leetcode.tags.binarysearch;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/** 373 查找和最小的 K 对数字
 <p>给定两个以 <strong>非递减顺序排列</strong> 的整数数组 <code>nums1</code> 和<strong> </strong><code>nums2</code><strong>&nbsp;</strong>,&nbsp;以及一个整数 <code>k</code><strong>&nbsp;</strong>。</p>
 <p>定义一对值&nbsp;<code>(u,v)</code>，其中第一个元素来自&nbsp;<code>nums1</code>，第二个元素来自 <code>nums2</code><strong>&nbsp;</strong>。</p>
 <p>请找到和最小的 <code>k</code>&nbsp;个数对&nbsp;<code>(u<sub>1</sub>,v<sub>1</sub>)</code>, <code>&nbsp;(u<sub>2</sub>,v<sub>2</sub>)</code> &nbsp;... &nbsp;<code>(u<sub>k</sub>,v<sub>k</sub>)</code>&nbsp;。</p>

 <p><strong class="example">示例 1:</strong></p>
 <pre>
 <strong>输入:</strong> nums1 = [1,7,11], nums2 = [2,4,6], k = 3
 <strong>输出:</strong> [1,2],[1,4],[1,6]
 <strong>解释: </strong>返回序列中的前 3 对数：
 [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
 </pre>

 <p><strong class="example">示例 2:</strong></p>
 <pre>
 <strong>输入: </strong>nums1 = [1,1,2], nums2 = [1,2,3], k = 2
 <strong>输出: </strong>[1,1],[1,1]
 <strong>解释: </strong>返回序列中的前 2 对数：
 &nbsp;    [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
 </pre>

 <p><strong>提示:</strong></p>
 <ul>
 <li><code>1 &lt;= nums1.length, nums2.length &lt;= 10<sup>5</sup></code></li>
 <li><code>-10<sup>9</sup> &lt;= nums1[i], nums2[i] &lt;= 10<sup>9</sup></code></li>
 <li><code>nums1</code> 和 <code>nums2</code> 均为 <strong>升序排列</strong></li>
 <li>
 <meta charset="UTF-8" /><code>1 &lt;= k &lt;= 10<sup>4</sup></code></li>
 <li><code>k &lt;=&nbsp;nums1.length *&nbsp;nums2.length</code></li>
 </ul>
 */
public class FindKPairsWithSmallestSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        long sum = getMinSum(nums1, nums2, k);

        List<List<Integer>> res = new ArrayList<>();
        int n = nums1.length, m = nums2.length;
        for (int i = 0, j = m - 1; i < n; i++) {
            while (j >= 0 && nums1[i] + nums2[j] > sum) j--;
            if (j < 0) break;

            if (res.size() >= k && nums1[i] + nums2[0] >= sum) break;

            for (int z = 0; z <= j; z++) res.add(Arrays.asList(nums1[i], nums2[z]));
        }
        res.sort(Comparator.comparing(a -> a.get(0) + a.get(1)));
        return res.subList(0, k + 1);
    }

    private long getMinSum(int[] nums1, int[] nums2, int k) {
        long l = -2000_000_000, r = 2000_000_000;
        while (l < r) {
            long mid = l + (r - l) / 2;

            if (check(nums1, nums2, k, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    private boolean check(int[] nums1, int[] nums2, int k, long x) {
        int n = nums1.length, m = nums2.length;
        int cnt = 0;
        for (int i = 0, j = m - 1; i < n; i++) {
            while (j >= 0 && nums1[i] + nums2[j] > x) j--;

            if (j < 0) break;
            if ((cnt += j + 1) >= k) return true;
        }
        return cnt >= k;
    }

}
