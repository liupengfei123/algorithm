package lpf.learn.leetcode.tags.slidingwindow;


import java.util.Arrays;

/** 1234 替换子串得到平衡字符串
 <p>有一个只含有&nbsp;<code>'Q', 'W', 'E',&nbsp;'R'</code>&nbsp;四种字符，且长度为 <code>n</code>&nbsp;的字符串。</p>
 <p>假如在该字符串中，这四个字符都恰好出现&nbsp;<code>n/4</code>&nbsp;次，那么它就是一个「平衡字符串」。</p>

 <p>给你一个这样的字符串 <code>s</code>，请通过「替换一个子串」的方式，使原字符串 <code>s</code> 变成一个「平衡字符串」。</p>
 <p>你可以用和「待替换子串」长度相同的&nbsp;<strong>任何</strong> 其他字符串来完成替换。</p>
 <p>请返回待替换子串的最小可能长度。</p>
 <p>如果原字符串自身就是一个平衡字符串，则返回 <code>0</code>。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>s = "QWER"
 <strong>输出：</strong>0
 <strong>解释：</strong>s 已经是平衡的了。</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>s = "QQWE"
 <strong>输出：</strong>1
 <strong>解释：</strong>我们需要把一个 'Q' 替换成 'R'，这样得到的 "RQWE" (或 "QRWE") 是平衡的。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>s = "QQQW"
 <strong>输出：</strong>2
 <strong>解释：</strong>我们可以把前面的 "QQ" 替换成 "ER"。
 </pre>

 <p><strong>示例 4：</strong></p>
 <pre>
 <strong>输入：</strong>s = "QQQQ"
 <strong>输出：</strong>3
 <strong>解释：</strong>我们可以替换后 3 个 'Q'，使 s = "QWER"。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length &lt;= 10^5</code></li>
 <li><code>s.length</code>&nbsp;是&nbsp;<code>4</code>&nbsp;的倍数</li>
 <li><code>s</code>&nbsp;中只含有&nbsp;<code>'Q'</code>, <code>'W'</code>, <code>'E'</code>,&nbsp;<code>'R'</code>&nbsp;四种字符</li>
 </ul>
 */
public class ReplaceTheSubstringForBalancedString {
    public int balancedString(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        int[] tCnt = new int['Z'];

        Arrays.fill(tCnt, -n / 4);
        for (char c : chars) tCnt[c]++;

        if (tCnt['Q'] == 0 && tCnt['W'] == 0 && tCnt['E'] == 0 && tCnt['R'] == 0) return 0;

        int res = n + 1;
        int[] cnt = new int['Z'];

        for (int l = 0, r = 0; r < n; r++) {
            cnt[chars[r]]++;

            while (l <= r && cnt['Q'] >= tCnt['Q'] && cnt['W'] >= tCnt['W'] && cnt['E'] >= tCnt['E'] && cnt['R'] >= tCnt['R']) {

                res = Math.min(res, r - l + 1);
                cnt[chars[l++]]--;
            }
        }
        return res;
    }
}
