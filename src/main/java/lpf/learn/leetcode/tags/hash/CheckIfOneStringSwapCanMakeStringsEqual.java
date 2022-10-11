package lpf.learn.leetcode.tags.hash;


import java.util.ArrayList;
import java.util.List;

/**
 * 1790 仅执行一次字符串交换能否使两个字符串相等
 * <p>给你长度相等的两个字符串 <code>s1</code> 和 <code>s2</code> 。一次<strong> 字符串交换 </strong>操作的步骤如下：选出某个字符串中的两个下标（不必不同），并交换这两个下标所对应的字符。</p>
 * <p>如果对 <strong>其中一个字符串</strong> 执行 <strong>最多一次字符串交换</strong> 就可以使两个字符串相等，返回 <code>true</code> ；否则，返回 <code>false</code> 。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre><strong>输入：</strong>s1 = "bank", s2 = "kanb"
 * <strong>输出：</strong>true
 * <strong>解释：</strong>例如，交换 s2 中的第一个和最后一个字符可以得到 "bank"
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre><strong>输入：</strong>s1 = "attack", s2 = "defend"
 * <strong>输出：</strong>false
 * <strong>解释：</strong>一次字符串交换无法使两个字符串相等
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 * <pre><strong>输入：</strong>s1 = "kelb", s2 = "kelb"
 * <strong>输出：</strong>true
 * <strong>解释：</strong>两个字符串已经相等，所以不需要进行字符串交换
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 * <pre><strong>输入：</strong>s1 = "abcd", s2 = "dcba"
 * <strong>输出：</strong>false
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * <li><code>1 &lt;= s1.length, s2.length &lt;= 100</code></li>
 * <li><code>s1.length == s2.length</code></li>
 * <li><code>s1</code> 和 <code>s2</code> 仅由小写英文字母组成</li>
 * </ul>
 */
public class CheckIfOneStringSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < s1.length(); ++i) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diff.size() >= 2) return false;

                diff.add(i);
            }
        }
        if (diff.isEmpty()) return true;
        if (diff.size() != 2) return false;

        return s1.charAt(diff.get(0)) == s2.charAt(diff.get(1)) && s1.charAt(diff.get(1)) == s2.charAt(diff.get(0));
    }


    public boolean areAlmostEqual2(String s1, String s2) {
        if (s1.equals(s2)) return true;

        int[] counts = new int[26];
        for (char c : s1.toCharArray()) counts[c - 'a']++;
        for (char c : s2.toCharArray()) counts[c - 'a']--;

        for (int count : counts) {
            if (count != 0) return false;
        }

        int diffCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) diffCount++;
        }
        return diffCount <= 2;
    }
}
