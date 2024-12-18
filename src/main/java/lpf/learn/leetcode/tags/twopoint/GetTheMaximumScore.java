package lpf.learn.leetcode.tags.twopoint;


/** 1537 最大得分
 <p>你有两个 <strong>有序</strong>&nbsp;且数组内元素互不相同的数组&nbsp;<code>nums1</code> 和&nbsp;<code>nums2</code>&nbsp;。</p>
 <p>一条&nbsp;<strong>合法路径</strong>&nbsp;定义如下：</p>
 <ul>
 <li>选择数组 <code>nums1</code> 或者 <code>nums2</code> 开始遍历（从下标 0 处开始）。</li>
 <li>从左到右遍历当前数组。</li>
 <li>如果你遇到了 <code>nums1</code>&nbsp;和 <code>nums2</code>&nbsp;中都存在的值，那么你可以切换路径到另一个数组对应数字处继续遍历（但在合法路径中重复数字只会被统计一次）。</li>
 </ul>
 <p><strong>得分</strong> 定义为合法路径中不同数字的和。</p>
 <p>请你返回 <em>所有可能 <strong>合法路径</strong> 中的最大得分。</em>由于答案可能很大，请你将它对 10^9 + 7 取余后返回。</p>

 <p><strong>示例 1：</strong></p>
 <p><strong><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/08/02/sample_1_1893.png" style="height: 163px; width: 538px;" /></strong></p>
 <pre>
 <strong>输入：</strong>nums1 = [2,4,5,8,10], nums2 = [4,6,8,9]
 <strong>输出：</strong>30
 <strong>解释：</strong>合法路径包括：
 [2,4,5,8,10], [2,4,5,8,9], [2,4,6,8,9], [2,4,6,8,10],（从 nums1 开始遍历）
 [4,6,8,9], [4,5,8,10], [4,5,8,9], [4,6,8,10]  （从 nums2 开始遍历）
 最大得分为上图中的绿色路径 <strong>[2,4,6,8,10]</strong>&nbsp;。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums1 = [1,3,5,7,9], nums2 = [3,5,100]
 <strong>输出：</strong>109
 <strong>解释：</strong>最大得分由路径 <strong>[1,3,5,100]</strong> 得到。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums1 = [1,2,3,4,5], nums2 = [6,7,8,9,10]
 <strong>输出：</strong>40
 <strong>解释：</strong>nums1 和 nums2 之间无相同数字。
 最大得分由路径[6,7,8,9,10]得到。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums1.length, nums2.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums1[i], nums2[i] &lt;= 10<sup>7</sup></code></li>
 <li><code>nums1</code> 和&nbsp;<code>nums2</code>&nbsp;都是严格递增的数组。</li>
 </ul>
 */
public class GetTheMaximumScore {
    public int maxSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0;
        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0;

        while (i < n && j < m) {
            int val1 = nums1[i], val2 = nums2[j];

            if (val1 > val2) {
                sum2 += val2;
                j++;
            } else if (val1 < val2){
                sum1 += val1;
                i++;
            } else {
                sum1 = sum2 = Math.max(sum1, sum2) + val1;
                i++;
                j++;
            }
        }
        while (i < n) sum1 += nums1[i++];
        while (j < m) sum2 += nums2[j++];

        return (int) (Math.max(sum1, sum2) % 1000_000_007);
    }
}
