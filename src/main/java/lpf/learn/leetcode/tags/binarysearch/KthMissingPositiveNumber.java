package lpf.learn.leetcode.tags.binarysearch;


import java.util.TreeMap;

/** 1539 第 k 个缺失的正整数
 <p>给你一个 <strong>严格升序排列</strong>&nbsp;的正整数数组 <code>arr</code>&nbsp;和一个整数&nbsp;<code>k</code>&nbsp;。</p>
 <p>请你找到这个数组里第&nbsp;<code>k</code>&nbsp;个缺失的正整数。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [2,3,4,7,11], k = 5
 <strong>输出：</strong>9
 <strong>解释：</strong>缺失的正整数包括 [1,5,6,8,9,10,12,13,...] 。第 5 个缺失的正整数为 9 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [1,2,3,4], k = 2
 <strong>输出：</strong>6
 <strong>解释：</strong>缺失的正整数包括 [5,6,7,...] 。第 2 个缺失的正整数为 6 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= arr.length &lt;= 1000</code></li>
 <li><code>1 &lt;= arr[i] &lt;= 1000</code></li>
 <li><code>1 &lt;= k &lt;= 1000</code></li>
 <li>对于所有&nbsp;<code>1 &lt;= i &lt; j &lt;= arr.length</code>&nbsp;的 <code>i</code>&nbsp;和 <code>j</code> 满足&nbsp;<code>arr[i] &lt; arr[j]</code>&nbsp;</li>
 </ul>

 <p><strong>进阶：</strong></p>
 <p>你可以设计一个时间复杂度小于 O(n) 的算法解决此问题吗？</p>
 */
public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(0, 0);
        for (int i = 0; i < n; i++) treeMap.put(arr[i], i + 1);

        int l = 1, r = arr[n - 1] + k;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (check(treeMap, k, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    private boolean check(TreeMap<Integer, Integer> treeMap, int k, int mid) {
        int count = treeMap.floorEntry(mid).getValue();
        return mid - count >= k;
    }


}
