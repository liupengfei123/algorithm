package lpf.learn.leetcode.tags.slidingwindow;

/** 2953 统计完全子字符串
 <p>给你一个字符串&nbsp;<code>word</code>&nbsp;和一个整数 <code>k</code>&nbsp;。</p>
 <p>如果&nbsp;<code>word</code>&nbsp;的一个子字符串 <code>s</code>&nbsp;满足以下条件，我们称它是 <strong>完全字符串：</strong></p>
 <ul>
 <li><code>s</code>&nbsp;中每个字符 <strong>恰好</strong>&nbsp;出现 <code>k</code>&nbsp;次。</li>
 <li>相邻字符在字母表中的顺序 <strong>至多</strong>&nbsp;相差&nbsp;<code>2</code>&nbsp;。也就是说，<code>s</code>&nbsp;中两个相邻字符&nbsp;<code>c1</code> 和&nbsp;<code>c2</code>&nbsp;，它们在字母表中的位置相差<strong>&nbsp;至多</strong>&nbsp;为 <code>2</code> 。</li>
 </ul>

 <p>请你返回 <code>word</code>&nbsp;中 <strong>完全</strong>&nbsp;子字符串的数目。</p>
 <p><strong>子字符串</strong>&nbsp;指的是一个字符串中一段连续 <strong>非空</strong>&nbsp;的字符序列。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <b>输入：</b>word = "igigee", k = 2
 <b>输出：</b>3
 <b>解释：</b>完全子字符串需要满足每个字符恰好出现 2 次，且相邻字符相差至多为 2 ：<em><strong>igig</strong></em>ee, igig<strong style="font-style: italic;">ee</strong>, <em><strong>igigee</strong>&nbsp;。</em>
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <b>输入：</b>word = "aaabbbccc", k = 3
 <b>输出：</b>6
 <b>解释：</b>完全子字符串需要满足每个字符恰好出现 3 次，且相邻字符相差至多为 2 ：<em><strong>aaa</strong></em>bbbccc, aaa<em><strong>bbb</strong></em>ccc, aaabbb<em><strong>ccc</strong></em>, <em><strong>aaabbb</strong></em>ccc, aaa<em><strong>bbbccc</strong></em>, <em><strong>aaabbbccc </strong></em>。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= word.length &lt;= 10<sup>5</sup></code></li>
 <li><code>word</code>&nbsp;只包含小写英文字母。</li>
 <li><code>1 &lt;= k &lt;= word.length</code></li>
 </ul>
 */
public class CountCompleteSubstrings {
    public int countCompleteSubstrings(String word, int k) {
        int res = 0, n = word.length();

        for (int i = 0; i < n;) {
            int st = i;
            for (i++; i < n && Math.abs(word.charAt(i) - word.charAt(i - 1)) <= 2; i++);

            for (int c = 1; c <= 26; c++) {
                res += solve(word.substring(st, i).toCharArray(),c * k, k);
            }
        }
        return res;
    }



    private int solve(char[] word, int len, int k) {
        int n = word.length;

        if (len > n) return 0;
        if (len == 1) return n;

        int[] cnt = new int[26];

        for (int i = 0; i < len; i++) cnt[word[i] - 'a']++;

        int res = check(cnt, k) ? 1 : 0;

        for (int i = len; i < n; i++) {
            cnt[word[i] - 'a']++;
            cnt[word[i - len] - 'a']--;

            if (check(cnt, k)) res++;
        }
        return res;
    }

    private boolean check(int[] cnt, int k) {
        for (int value : cnt) {
            if (value > 0 && value != k) return false;
        }
        return true;
    }
}
