package lpf.learn.leetcode.tags.binarysearch;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 658 找到 K 个最接近的元素
 <p>给定一个 <strong>排序好</strong> 的数组&nbsp;<code>arr</code> ，两个整数 <code>k</code> 和 <code>x</code> ，从数组中找到最靠近 <code>x</code>（两数之差最小）的 <code>k</code> 个数。返回的结果必须要是按升序排好的。</p>
 <p>整数 <code>a</code> 比整数 <code>b</code> 更接近 <code>x</code> 需要满足：</p>
 <ul>
 <li><code>|a - x| &lt; |b - x|</code> 或者</li>
 <li><code>|a - x| == |b - x|</code> 且 <code>a &lt; b</code></li>
 </ul>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [1,2,3,4,5], k = 4, x = 3
 <strong>输出：</strong>[1,2,3,4]
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [1,1,2,3,4,5], k = 4, x = -1
 <strong>输出：</strong>[1,1,2,3]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= k &lt;= arr.length</code></li>
 <li><code>1 &lt;= arr.length&nbsp;&lt;= 10<sup>4</sup></code>
 <meta charset="UTF-8" /></li>
 <li><code>arr</code>&nbsp;按 <strong>升序</strong> 排列</li>
 <li><code>-10<sup>4</sup>&nbsp;&lt;= arr[i], x &lt;= 10<sup>4</sup></code></li>
 </ul>
 */
public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int l = solve(arr, x), r = l + 1;
        if (l > 0 && Math.abs(arr[l - 1] - x) <= Math.abs(arr[l] - x)) {
            l--;
            r--;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int minL = l >= 0 ? Math.abs(arr[l] - x) : Integer.MAX_VALUE;
            int minR = r < n ? Math.abs(arr[r] - x) : Integer.MAX_VALUE;

            if (minL > minR) {
                res.add(arr[r++]);
            } else {
                res.add(arr[l--]);
            }
        }
        Collections.sort(res);
        return res;
    }

    private int solve(int[] a, int x) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a[mid] >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
}
