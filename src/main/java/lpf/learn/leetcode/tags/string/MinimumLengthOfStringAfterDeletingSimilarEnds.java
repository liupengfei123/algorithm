package lpf.learn.leetcode.tags.string;

/** 1750 删除字符串两端相同字符后的最短长度
 <p>给你一个只包含字符 <code>'a'</code>，<code>'b'</code> 和 <code>'c'</code> 的字符串 <code>s</code> ，你可以执行下面这个操作（5 个步骤）任意次：</p>
 <ol>
 <li>选择字符串 <code>s</code> 一个 <strong>非空</strong> 的前缀，这个前缀的所有字符都相同。</li>
 <li>选择字符串 <code>s</code> 一个 <strong>非空</strong> 的后缀，这个后缀的所有字符都相同。</li>
 <li>前缀和后缀在字符串中任意位置都不能有交集。</li>
 <li>前缀和后缀包含的所有字符都要相同。</li>
 <li>同时删除前缀和后缀。</li>
 </ol>
 <p>请你返回对字符串 <code>s</code> 执行上面操作任意次以后（可能 0 次），能得到的 <strong>最短长度</strong> 。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>s = "ca"
 <b>输出：</b>2
 <strong>解释：</strong>你没法删除任何一个字符，所以字符串长度仍然保持不变。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>s = "cabaabac"
 <b>输出：</b>0
 <b>解释：</b>最优操作序列为：
 - 选择前缀 "c" 和后缀 "c" 并删除它们，得到 s = "abaaba" 。
 - 选择前缀 "a" 和后缀 "a" 并删除它们，得到 s = "baab" 。
 - 选择前缀 "b" 和后缀 "b" 并删除它们，得到 s = "aa" 。
 - 选择前缀 "a" 和后缀 "a" 并删除它们，得到 s = "" 。</pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <b>输入：</b>s = "aabccabba"
 <b>输出：</b>3
 <b>解释：</b>最优操作序列为：
 - 选择前缀 "aa" 和后缀 "a" 并删除它们，得到 s = "bccabb" 。
 - 选择前缀 "b" 和后缀 "bb" 并删除它们，得到 s = "cca" 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 <= s.length <= 10<sup>5</sup></code></li>
 <li><code>s</code> 只包含字符 <code>'a'</code>，<code>'b'</code> 和 <code>'c'</code> 。</li>
 </ul>
 */
public class MinimumLengthOfStringAfterDeletingSimilarEnds {
    public int minimumLength(String s) {
        char[] chars = s.toCharArray();
        int n = s.length(), l = 0, r = n - 1;
        while (l < r && chars[l] == chars[r]) {
            int lT = l;
            while (l < r + 1 && chars[lT] == chars[l]) l++;

            int rT = r;
            while (l - 1 < r && chars[rT] == chars[r]) r--;
        }
        return Math.max(0, r - l + 1);
    }
}
