package lpf.learn.leetcode.tags.bitoperation;


/** 461 汉明距离
 <p>两个整数之间的 <a href="https://baike.baidu.com/item/%E6%B1%89%E6%98%8E%E8%B7%9D%E7%A6%BB">汉明距离</a> 指的是这两个数字对应二进制位不同的位置的数目。</p>
 <p>给你两个整数 <code>x</code> 和 <code>y</code>，计算并返回它们之间的汉明距离。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>x = 1, y = 4
 <strong>输出：</strong>2
 <strong>解释：</strong>
 1   (0 0 0 1)
 4   (0 1 0 0)
 ↑   ↑
 上面的箭头指出了对应二进制位不同的位置。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>x = 3, y = 1
 <strong>输出：</strong>1
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>0 &lt;=&nbsp;x, y &lt;= 2<sup>31</sup> - 1</code></li>
 </ul>

 <p><strong>注意：</strong>本题与&nbsp;<a href="https://leetcode.cn/problems/minimum-bit-flips-to-convert-number/">2220. 转换数字的最少位翻转次数</a>&nbsp;相同。</p>
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
