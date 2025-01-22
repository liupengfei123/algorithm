package lpf.learn.leetcode.tags.bitoperation;

/** 2429 最小异或
 <p>给你两个正整数 <code>num1</code> 和 <code>num2</code> ，找出满足下述条件的正整数 <code>x</code> ：</p>
 <ul>
 <li><code>x</code> 的置位数和 <code>num2</code> 相同，且</li>
 <li><code>x XOR num1</code> 的值 <strong>最小</strong></li>
 </ul>
 <p>注意 <code>XOR</code> 是按位异或运算。</p>
 <p>返回整数<em> </em><code>x</code> 。题目保证，对于生成的测试用例， <code>x</code> 是 <strong>唯一确定</strong> 的。</p>
 <p>整数的 <strong>置位数</strong> 是其二进制表示中 <code>1</code> 的数目。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>num1 = 3, num2 = 5
 <strong>输出：</strong>3
 <strong>解释：</strong>
 num1 和 num2 的二进制表示分别是 0011 和 0101 。
 整数 <strong>3</strong> 的置位数与 num2 相同，且 <span><code>3 XOR 3 = 0</code></span> 是最小的。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>num1 = 1, num2 = 12
 <strong>输出：</strong>3
 <strong>解释：</strong>
 num1 和 num2 的二进制表示分别是 0001 和 1100 。
 整数 <strong>3</strong> 的置位数与 num2 相同，且 <span><code>3 XOR 1 = 2</code></span> 是最小的。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= num1, num2 &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class MinimizeXor {
    public int minimizeXor(int num1, int num2) {
        int c1 = Integer.bitCount(num1), c2 = Integer.bitCount(num2);
        int res = 0;
        if (c1 <= c2) {
            for (int i = 0; i < 31; i++) {
                int mark = (1 << i) - 1;
                res = num1 | mark;
                if (Integer.bitCount(res) == c2) break;
            }
        } else {
            int markO = (1 << 30) - 1;
            for (int i = 0; i < 31; i++) {
                int mark = (1 << i) - 1;
                res = num1 & ( markO ^ mark);
                if (Integer.bitCount(res) == c2) break;
            }
        }
        return res;
    }
}
