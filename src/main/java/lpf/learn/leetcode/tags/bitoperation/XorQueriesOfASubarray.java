package lpf.learn.leetcode.tags.bitoperation;


/** 1310 子数组异或查询
 <p>有一个正整数数组&nbsp;<code>arr</code>，现给你一个对应的查询数组&nbsp;<code>queries</code>，其中&nbsp;<code>queries[i] = [L<sub>i,&nbsp;</sub>R<sub>i</sub>]</code>。</p>
 <p>对于每个查询&nbsp;<code>i</code>，请你计算从&nbsp;<code>L<sub>i</sub></code>&nbsp;到&nbsp;<code>R<sub>i</sub></code>&nbsp;的&nbsp;<strong>XOR</strong>&nbsp;值（即&nbsp;<code>arr[L<sub>i</sub>] <strong>xor</strong> arr[L<sub>i</sub>+1] <strong>xor</strong> ... <strong>xor</strong> arr[R<sub>i</sub>]</code>）作为本次查询的结果。</p>
 <p>并返回一个包含给定查询&nbsp;<code>queries</code>&nbsp;所有结果的数组。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
 <strong>输出：</strong>[2,7,14,8]
 <strong>解释：</strong>
 数组中元素的二进制表示形式是：
 1 = 0001
 3 = 0011
 4 = 0100
 8 = 1000
 查询的 XOR 值为：
 [0,1] = 1 xor 3 = 2
 [1,2] = 3 xor 4 = 7
 [0,3] = 1 xor 3 xor 4 xor 8 = 14
 [3,3] = 8
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [4,8,2,10], queries = [[2,3],[1,3],[0,0],[0,3]]
 <strong>输出：</strong>[8,0,4,4]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= arr.length &lt;= 3 *&nbsp;10^4</code></li>
 <li><code>1 &lt;= arr[i] &lt;= 10^9</code></li>
 <li><code>1 &lt;= queries.length &lt;= 3 * 10^4</code></li>
 <li><code>queries[i].length == 2</code></li>
 <li><code>0 &lt;= queries[i][0] &lt;= queries[i][1] &lt; arr.length</code></li>
 </ul>
 */
public class XorQueriesOfASubarray {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) pre[i + 1] = pre[i] ^ arr[i];

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res[i] = pre[queries[i][1] + 1] ^ pre[queries[i][0]];
        }
        return res;
    }

}
