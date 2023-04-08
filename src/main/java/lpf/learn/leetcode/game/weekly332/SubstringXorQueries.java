package lpf.learn.leetcode.game.weekly332;

import java.util.HashMap;
import java.util.Map;

/** [2564] 子字符串异或查询
 <p>给你一个 <strong>二进制字符串</strong>&nbsp;<code>s</code>&nbsp;和一个整数数组&nbsp;<code>queries</code>&nbsp;，其中&nbsp;<code>queries[i] = [first<sub>i</sub>, second<sub>i</sub>]</code>&nbsp;。</p>
 <p>对于第&nbsp;<code>i</code>&nbsp;个查询，找到 <code>s</code>&nbsp;的 <strong>最短子字符串</strong>&nbsp;，它对应的 <strong>十进制</strong>值&nbsp;<code>val</code>&nbsp;与&nbsp;<code>first<sub>i</sub></code>&nbsp;<b>按位异或</b>&nbsp;得到&nbsp;<code>second<sub>i</sub></code>&nbsp;，换言之，<code>val ^ first<sub>i</sub> == second<sub>i</sub></code>&nbsp;。</p>
 <p>第&nbsp;<code>i</code>&nbsp;个查询的答案是子字符串&nbsp;<code>[left<sub>i</sub>, right<sub>i</sub>]</code> 的两个端点（下标从&nbsp;<strong>0</strong>&nbsp;开始），如果不存在这样的子字符串，则答案为&nbsp;<code>[-1, -1]</code>&nbsp;。如果有多个答案，请你选择&nbsp;<code>left<sub>i</sub></code>&nbsp;最小的一个。</p>
 <p>请你返回一个数组&nbsp;<code>ans</code>&nbsp;，其中&nbsp;<code>ans[i] = [left<sub>i</sub>, right<sub>i</sub>]</code>&nbsp;是第&nbsp;<code>i</code>&nbsp;个查询的答案。</p>
 <p><strong>子字符串</strong>&nbsp;是一个字符串中一段连续非空的字符序列。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>s = "101101", queries = [[0,5],[1,2]]
 <b>输出：</b>[[0,2],[2,3]]
 <b>解释：</b>第一个查询，端点为 <code>[0,2]</code> 的子字符串为 <strong>"101"</strong> ，对应十进制数字 <strong><code>5 ，且</code></strong> <strong><code>5 ^ 0 = 5</code></strong>&nbsp;，所以第一个查询的答案为 <code>[0,2]。第二个查询中，</code>端点为 <code>[2,3] 的子字符串为 </code><strong>"11" ，对应十进制数字</strong> <strong>3</strong>&nbsp;，且 <strong>3<code> ^ 1 = 2</code></strong><code>&nbsp;。所以第二个查询的答案为</code> <code>[2,3]</code> 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>s = "0101", queries = [[12,8]]
 <b>输出：</b>[[-1,-1]]
 <b>解释：</b>这个例子中，没有符合查询的答案，所以返回 <code>[-1,-1] 。</code>
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <b>输入：</b>s = "1", queries = [[4,5]]
 <b>输出：</b>[[0,0]]
 <b>解释：</b>这个例子中，端点为 <code>[0,0]</code> 的子字符串对应的十进制值为 <strong><code>1</code></strong><code>&nbsp;，且</code> <strong><code>1 ^ 4 = 5</code></strong><code>&nbsp;。所以答案为</code> <code>[0,0] 。</code>
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
 <li><code>s[i]</code>&nbsp;要么是&nbsp;<code>'0'</code>&nbsp;，要么是&nbsp;<code>'1'</code>&nbsp;。</li>
 <li><code>1 &lt;= queries.length &lt;= 10<sup>5</sup></code></li>
 <li><code>0 &lt;= first<sub>i</sub>, second<sub>i</sub> &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class SubstringXorQueries {
    public int[][] substringXorQueries(String s, int[][] queries) {
        int length = s.length();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length && j - i < 33; j++)  map.putIfAbsent(s.substring(i, j + 1), i);
        }

        int[][] res = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];

            String value = Integer.toBinaryString(query[0] ^ query[1]);

            int left = map.getOrDefault(value, -1);
            res[i][0] = left;
            if (left < 0) {
                res[i][1] = -1;
            } else {
                res[i][1] = left + value.length() - 1;
            }
        }
        return res;
    }

}
