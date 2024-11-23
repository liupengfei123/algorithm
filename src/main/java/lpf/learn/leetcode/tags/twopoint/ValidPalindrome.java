package lpf.learn.leetcode.tags.twopoint;


/** [125]验证回文串
 <p>如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 <strong>回文串</strong> 。</p>
 <p>字母和数字都属于字母数字字符。</p>
 <p>给你一个字符串 <code>s</code>，如果它是 <strong>回文串</strong> ，返回 <code>true</code><em> </em>；否则，返回<em> </em><code>false</code><em> </em>。</p>
 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入:</strong> s = "A man, a plan, a canal: Panama"
 <strong>输出：</strong>true
 <strong>解释：</strong>"amanaplanacanalpanama" 是回文串。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>s = "race a car"
 <strong>输出：</strong>false
 <strong>解释：</strong>"raceacar" 不是回文串。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>s = " "
 <strong>输出：</strong>true
 <strong>解释：</strong>在移除非字母数字字符之后，s 是一个空字符串 "" 。
 由于空字符串正着反着读都一样，所以是回文串。
 </pre>

 <p><strong>提示：</strong></p>

 <ul>
 <li><code>1 &lt;= s.length &lt;= 2 * 10<sup>5</sup></code></li>
 <li><code>s</code> 仅由可打印的 ASCII 字符组成</li>
 </ul>
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left <= right) {
            if (ignoreChar(chars[left])) {
                left++;
                continue;
            }
            if (ignoreChar(chars[right])) {
                right--;
                continue;
            }
            if (Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean ignoreChar(char c) {
        return !(('0' <= c && c <= '9') || ('A' <= c && c <= 'Z')|| ('a' <= c && c <= 'z'));
    }
}
