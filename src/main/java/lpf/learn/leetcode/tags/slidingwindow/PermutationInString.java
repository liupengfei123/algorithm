package lpf.learn.leetcode.tags.slidingwindow;

/** 567 字符串的排列
 <p>给你两个字符串&nbsp;<code>s1</code>&nbsp;和&nbsp;<code>s2</code> ，写一个函数来判断 <code>s2</code> 是否包含 <code>s1</code><strong>&nbsp;</strong>的 <span data-keyword="permutation-string">排列</span>。如果是，返回 <code>true</code> ；否则，返回 <code>false</code> 。</p>
 <p>换句话说，<code>s1</code> 的排列之一是 <code>s2</code> 的 <strong>子串</strong> 。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>s1 = "ab" s2 = "eidbaooo"
 <strong>输出：</strong>true
 <strong>解释：</strong>s2 包含 s1 的排列之一 ("ba").
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>s1= "ab" s2 = "eidboaoo"
 <strong>输出：</strong>false
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s1.length, s2.length &lt;= 10<sup>4</sup></code></li>
 <li><code>s1</code> 和 <code>s2</code> 仅包含小写字母</li>
 </ul>
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int n = s2.length(), m = s1.length();
        if (m > n) return false;

        int[] target = new int[26], source = new int[26];
        for (char c : s1.toCharArray()) target[c - 'a']++;

        char[] chars = s2.toCharArray();
        for (int i = 0; i < m; i++) source[chars[i] - 'a']++;

        if (check(target, source)) return true;

        for (int i = m; i < n; i++) {
            source[chars[i] - 'a']++;
            source[chars[i - m] - 'a']--;

            if (check(target, source)) return true;
        }
        return false;
    }


    private boolean check(int[] target, int[] source) {
        for (int i = 0; i < 26; i++) {
            if (target[i] != source[i]) return false;
        }
        return true;
    }

}
