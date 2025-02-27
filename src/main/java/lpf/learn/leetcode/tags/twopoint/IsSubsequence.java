package lpf.learn.leetcode.tags.twopoint;


/** 392 判断子序列
 <p>给定字符串 <strong>s</strong> 和 <strong>t</strong> ，判断 <strong>s</strong> 是否为 <strong>t</strong> 的子序列。</p>
 <p>字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，<code>"ace"</code>是<code>"abcde"</code>的一个子序列，而<code>"aec"</code>不是）。</p>
 <p><strong>进阶：</strong></p>
 <p>如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k &gt;= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>s = "abc", t = "ahbgdc"
 <strong>输出：</strong>true
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>s = "axc", t = "ahbgdc"
 <strong>输出：</strong>false
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>0 &lt;= s.length &lt;= 100</code></li>
 <li><code>0 &lt;= t.length &lt;= 10^4</code></li>
 <li>两个字符串都只由小写字符组成。</li>
 </ul>
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] sc = s.toCharArray(), tc = t.toCharArray();

        int n = sc.length, m = tc.length, i = 0, j = 0;
        while (i < n && j < m) {
            if (sc[i] == tc[j]) i++;

            j++;
        }
        return i >= n;
    }
}
