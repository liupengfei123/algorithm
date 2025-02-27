package lpf.learn.leetcode.tags.bitoperation;


import java.util.Arrays;
import java.util.Comparator;

/** 1356 根据数字二进制下 1 的数目排序
 <p>给你一个整数数组&nbsp;<code>arr</code>&nbsp;。请你将数组中的元素按照其二进制表示中数字 <strong>1</strong> 的数目升序排序。</p>
 <p>如果存在多个数字二进制中&nbsp;<strong>1</strong>&nbsp;的数目相同，则必须将它们按照数值大小升序排列。</p>
 <p>请你返回排序后的数组。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>arr = [0,1,2,3,4,5,6,7,8]
 <strong>输出：</strong>[0,1,2,4,8,3,5,6,7]
 <strong>解释：</strong>[0] 是唯一一个有 0 个 1 的数。
 [1,2,4,8] 都有 1 个 1 。
 [3,5,6] 有 2 个 1 。
 [7] 有 3 个 1 。
 按照 1 的个数排序得到的结果数组为 [0,1,2,4,8,3,5,6,7]
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>arr = [1024,512,256,128,64,32,16,8,4,2,1]
 <strong>输出：</strong>[1,2,4,8,16,32,64,128,256,512,1024]
 <strong>解释：</strong>数组中所有整数二进制下都只有 1 个 1 ，所以你需要按照数值大小将它们排序。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>arr = [10000,10000]
 <strong>输出：</strong>[10000,10000]
 </pre>

 <p><strong>示例 4：</strong></p>
 <pre><strong>输入：</strong>arr = [2,3,5,7,11,13,17,19]
 <strong>输出：</strong>[2,3,5,17,7,11,13,19]
 </pre>

 <p><strong>示例 5：</strong></p>
 <pre><strong>输入：</strong>arr = [10,100,1000,10000]
 <strong>输出：</strong>[10,100,10000,1000]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= arr.length &lt;= 500</code></li>
 <li><code>0 &lt;= arr[i] &lt;= 10^4</code></li>
 </ul>
 */
public class SortIntegersByTheNumberOf1Bits {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];
        Arrays.setAll(temp, i -> arr[i]);

        Arrays.sort(temp, Comparator.comparing(Integer::bitCount).thenComparing(a -> a));

        int[] res = new int[arr.length];
        Arrays.setAll(res, i -> temp[i]);
        return res;
    }
}
