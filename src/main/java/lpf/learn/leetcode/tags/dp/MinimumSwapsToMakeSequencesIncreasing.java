package lpf.learn.leetcode.tags.dp;

/** 801 使序列递增的最小交换次数
 <p>我们有两个长度相等且不为空的整型数组&nbsp;<code>nums1</code>&nbsp;和&nbsp;<code>nums2</code>&nbsp;。在一次操作中，我们可以交换&nbsp;<code>nums1[i]</code>&nbsp;和&nbsp;<code>nums2[i]</code>的元素。</p>
 <ul>
 <li>例如，如果 <code>nums1 = [1,2,3,<u>8</u>]</code> ， <code>nums2 =[5,6,7,<u>4</u>]</code> ，你可以交换 <code>i = 3</code> 处的元素，得到 <code>nums1 =[1,2,3,4]</code> 和 <code>nums2 =[5,6,7,8]</code> 。</li>
 </ul>
 <p>返回 <em>使 <code>nums1</code> 和 <code>nums2</code> <strong>严格递增&nbsp;</strong>所需操作的最小次数</em> 。</p>
 <p>数组&nbsp;<code>arr</code>&nbsp;<strong>严格递增</strong> 且&nbsp;&nbsp;<code>arr[0] &lt; arr[1] &lt; arr[2] &lt; ... &lt; arr[arr.length - 1]</code>&nbsp;。</p>
 <p><b>注意：</b></p>
 <ul>
 <li>用例保证可以实现操作。</li>
 </ul>

 <p><strong>示例 1:</strong></p>
 <pre>
 <strong>输入:</strong> nums1 = [1,3,5,4], nums2 = [1,2,3,7]
 <strong>输出:</strong> 1
 <strong>解释: </strong>
 交换 A[3] 和 B[3] 后，两个数组如下:
 A = [1, 3, 5, 7] ， B = [1, 2, 3, 4]
 两个数组均为严格递增的。</pre>

 <p><strong>示例 2:</strong></p>
 <pre>
 <strong>输入:</strong> nums1 = [0,3,5,8,9], nums2 = [2,1,4,6,9]
 <strong>输出:</strong> 1
 </pre>

 <p><strong>提示:</strong></p>
 <ul>
 <li><code>2 &lt;= nums1.length &lt;= 10<sup>5</sup></code></li>
 <li><code>nums2.length == nums1.length</code></li>
 <li><code>0 &lt;= nums1[i], nums2[i] &lt;= 2 * 10<sup>5</sup></code></li>
 </ul>
 */
public class MinimumSwapsToMakeSequencesIncreasing {
    public int minSwap(int[] A, int[] B) {
        // n: natural, s: swapped
        int n1 = 0, s1 = 1;
        for (int i = 1; i < A.length; ++i) {
            int n2 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
            if (A[i-1] < A[i] && B[i-1] < B[i]) {
                n2 = Math.min(n2, n1);
                s2 = Math.min(s2, s1 + 1);
            }
            if (A[i-1] < B[i] && B[i-1] < A[i]) {
                n2 = Math.min(n2, s1);
                s2 = Math.min(s2, n1 + 1);
            }
            n1 = n2;
            s1 = s2;
        }
        return Math.min(n1, s1);
    }
}
