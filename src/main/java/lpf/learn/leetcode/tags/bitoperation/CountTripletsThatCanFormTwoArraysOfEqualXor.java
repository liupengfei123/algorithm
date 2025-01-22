package lpf.learn.leetcode.tags.bitoperation;


/** 1442 形成两个异或相等数组的三元组数目
 <p>给你一个整数数组 <code>arr</code> 。</p>
 <p>现需要从数组中取三个下标 <code>i</code>、<code>j</code> 和 <code>k</code> ，其中 <code>(0 &lt;= i &lt; j &lt;= k &lt; arr.length)</code> 。</p>
 <p><code>a</code> 和 <code>b</code> 定义如下：</p>
 <ul>
 <li><code>a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]</code></li>
 <li><code>b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]</code></li>
 </ul>
 <p>注意：<strong>^</strong> 表示 <strong>按位异或</strong> 操作。</p>
 <p>请返回能够令 <code>a == b</code> 成立的三元组 (<code>i</code>, <code>j</code> , <code>k</code>) 的数目。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>arr = [2,3,1,6,7]
 <strong>输出：</strong>4
 <strong>解释：</strong>满足题意的三元组分别是 (0,1,2), (0,2,2), (2,3,4) 以及 (2,4,4)
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>arr = [1,1,1,1,1]
 <strong>输出：</strong>10
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>arr = [2,3]
 <strong>输出：</strong>0
 </pre>

 <p><strong>示例 4：</strong></p>
 <pre><strong>输入：</strong>arr = [1,3,5,7,9]
 <strong>输出：</strong>3
 </pre>

 <p><strong>示例 5：</strong></p>
 <pre><strong>输入：</strong>arr = [7,11,12,9,5,2,7,17,22]
 <strong>输出：</strong>8
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= arr.length &lt;= 300</code></li>
 <li><code>1 &lt;= arr[i] &lt;= 10^8</code></li>
 </ul>
 */
public class CountTripletsThatCanFormTwoArraysOfEqualXor {
    public int countTriplets(int[] arr) {
        int n = arr.length;

        int[] preXor = new int[n + 1];
        for (int i = 0; i < n; i++) {
            preXor[i + 1] = preXor[i] ^ arr[i];
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                // 若 a=b，则有 a ^ b = 0 即 S_i=S_{k+1}
                // 当等式 S_i=S_{k+1} 成立时，[i+1, k] 的范围内的任意 j 都是符合要求的
                if (preXor[k + 1] == preXor[i]) {
                    res += k - i;
                }
            }
        }
        return res;
    }
}
