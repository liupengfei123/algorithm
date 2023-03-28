package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;

/** 1092 最短公共超序列
 <p>给出两个字符串&nbsp;<code>str1</code> 和&nbsp;<code>str2</code>，返回同时以&nbsp;<code>str1</code>&nbsp;和&nbsp;<code>str2</code>&nbsp;作为子序列的最短字符串。如果答案不止一个，则可以返回满足条件的任意一个答案。</p>
 <p>（如果从字符串 T 中删除一些字符（也可能不删除，并且选出的这些字符可以位于 T 中的&nbsp;<strong>任意位置</strong>），可以得到字符串 S，那么&nbsp;S 就是&nbsp;T 的子序列）</p>

 <p><strong>示例：</strong></p>
 <pre><strong>输入：</strong>str1 = &quot;abac&quot;, str2 = &quot;cab&quot;
 <strong>输出：</strong>&quot;cabac&quot;
 <strong>解释：</strong>
 str1 = &quot;abac&quot; 是 &quot;cabac&quot; 的一个子串，因为我们可以删去 &quot;cabac&quot; 的第一个 &quot;c&quot;得到 &quot;abac&quot;。
 str2 = &quot;cab&quot; 是 &quot;cabac&quot; 的一个子串，因为我们可以删去 &quot;cabac&quot; 末尾的 &quot;ac&quot; 得到 &quot;cab&quot;。
 最终我们给出的答案是满足上述属性的最短字符串。
 </pre>

 <p><strong>提示：</strong></p>
 <ol>
 <li><code>1 &lt;= str1.length, str2.length &lt;= 1000</code></li>
 <li><code>str1</code> 和&nbsp;<code>str2</code>&nbsp;都由小写英文字母组成。</li>
 </ol>
 */
public class ShortestCommonSupersequence {

    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        char[] s1 = str1.toCharArray(), s2 = str2.toCharArray();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (s1[i] == s2[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + s1[i];
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = n - 1, j = m - 1;

        while (i >= 0 || j >= 0) {
            if (i < 0) sb.append(s2[j--]);
            else if (j < 0) sb.append(s1[i--]);
            else {
                if (s1[i] == s2[j]) {
                    sb.append(s1[i]);
                    i--;
                    j--;
                } else if (dp[i + 1][j + 1] == dp[i][j + 1]) {
                    sb.append(s1[i--]);
                } else {
                    sb.append(s2[j--]);
                }
            }
        }
        return sb.reverse().toString();
    }

    public String shortestCommonSupersequence2(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        char[] chars1 = str1.toCharArray(), chars2 = str2.toCharArray();

        String[][] dp = new String[n + 1][m + 1];
        for (int i = 0; i <= n; i++) Arrays.fill(dp[i], "");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (chars1[i] == chars2[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + chars1[i];
                    continue;
                }
                String temp = dp[i][j];
                if (dp[i + 1][j].length() > temp.length()) {
                    temp = dp[i + 1][j];
                }
                if (dp[i][j + 1].length() > temp.length()) {
                    temp = dp[i][j + 1];
                }
                dp[i + 1][j + 1] = temp;
            }
        }

        String maxSup = dp[n][m];
        StringBuilder sb = new StringBuilder();
        int i1 = 0, i2 = 0, j = 0;

        while (i1 < n && i2 < m && j < maxSup.length()) {
            if (chars1[i1] != maxSup.charAt(j)) {
                sb.append(chars1[i1++]);
            }
            if (chars2[i2] != maxSup.charAt(j)) {
                sb.append(chars2[i2++]);
            }
            if (chars1[i1] == chars2[i2] && chars1[i1] == maxSup.charAt(j)) {
                sb.append(chars1[i1]);
                i1++;
                i2++;
                j++;
            }
        }
        while (i1 < n) sb.append(chars1[i1++]);
        while (i2 < m) sb.append(chars2[i2++]);

        return sb.toString();
    }
}
