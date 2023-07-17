package lpf.learn.leetcode.tags.string;

/** 415 字符串相加
 <p>给定两个字符串形式的非负整数&nbsp;<code>num1</code> 和<code>num2</code>&nbsp;，计算它们的和并同样以字符串形式返回。</p>
 <p>你不能使用任何內建的用于处理大整数的库（比如 <code>BigInteger</code>），&nbsp;也不能直接将输入的字符串转换为整数形式。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>num1 = "11", num2 = "123"
 <strong>输出：</strong>"134"
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>num1 = "456", num2 = "77"
 <strong>输出：</strong>"533"
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>num1 = "0", num2 = "0"
 <strong>输出：</strong>"0"
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= num1.length, num2.length &lt;= 10<sup>4</sup></code></li>
 <li><code>num1</code> 和<code>num2</code> 都只包含数字&nbsp;<code>0-9</code></li>
 <li><code>num1</code> 和<code>num2</code> 都不包含任何前导零</li>
 </ul>
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length(), l2 = num2.length();

        char[] chars = new char[Math.max(l1, l2) + 1];
        int i = chars.length - 1;

        int flag = 0;
        while (l1 > 0 && l2 > 0) {
            int v = num1.charAt(--l1) - '0' + num2.charAt(--l2) - '0' + flag;
            chars[i--] = (char) (v % 10 + '0');
            flag = v / 10;
        }
        while (l1 > 0) {
            int v = num1.charAt(--l1) - '0' + flag;
            chars[i--] = (char) (v % 10 + '0');
            flag = v / 10;
        }
        while (l2 > 0) {
            int v = num2.charAt(--l2) - '0' + flag;
            chars[i--] = (char) (v % 10 + '0');
            flag = v / 10;
        }
        if (flag > 0) chars[i--] = (char) (flag + '0');

        return new String(chars, i + 1, chars.length - i - 1);
    }
}
