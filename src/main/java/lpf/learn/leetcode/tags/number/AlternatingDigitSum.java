package lpf.learn.leetcode.tags.number;


/** 2544 交替数字和
 <p>给你一个正整数 <code>n</code> 。<code>n</code> 中的每一位数字都会按下述规则分配一个符号：</p>
 <ul>
 <li><strong>最高有效位</strong> 上的数字分配到 <strong>正</strong> 号。</li>
 <li>剩余每位上数字的符号都与其相邻数字相反。</li>
 </ul>
 <p>返回所有数字及其对应符号的和。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>n = 521
 <strong>输出：</strong>4
 <strong>解释：</strong>(+5) + (-2) + (+1) = 4</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>n = 111
 <strong>输出：</strong>1
 <strong>解释：</strong>(+1) + (-1) + (+1) = 1
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>n = 886996
 <strong>输出：</strong>0
 <strong>解释：</strong>(+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class AlternatingDigitSum {

    public int alternateDigitSum(int n) {
        char[] chars = Integer.toString(n).toCharArray();
        int flag = 1, res = 0;
        for (char c : chars) {
            res += (c - '0') * flag;
            flag *= -1;
        }
        return res;
    }
}
