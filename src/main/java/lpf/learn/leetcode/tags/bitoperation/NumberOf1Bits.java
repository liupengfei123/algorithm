package lpf.learn.leetcode.tags.bitoperation;


/** 191 位1的个数
 <p>给定一个正整数 <code>n</code>，编写一个函数，获取一个正整数的二进制形式并返回其二进制表达式中 <span data-keyword="set-bit">设置位</span> 的个数（也被称为<a href="https://baike.baidu.com/item/%E6%B1%89%E6%98%8E%E9%87%8D%E9%87%8F" target="_blank">汉明重量</a>）。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>n = 11
 <strong>输出：</strong>3
 <strong>解释：</strong>输入的二进制串 <span><code><strong>1011</strong>&nbsp;中，共有 3 个设置位。</code></span>
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>n = 128
 <strong>输出：</strong>1
 <strong>解释：</strong>输入的二进制串 <strong>10000000</strong>&nbsp;中，共有 1 个设置位。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>n = 2147483645
 <strong>输出：</strong>30
 <strong>解释：</strong>输入的二进制串 <strong>1111111111111111111111111111101</strong> 中，共有 30 个设置位。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n &lt;= 2<sup>31</sup> - 1</code></li>
 </ul>

 <p><strong>进阶</strong>：</p>
 <ul>
 <li>如果多次调用这个函数，你将如何优化你的算法？</li>
 </ul>
 */
public class NumberOf1Bits {

    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
