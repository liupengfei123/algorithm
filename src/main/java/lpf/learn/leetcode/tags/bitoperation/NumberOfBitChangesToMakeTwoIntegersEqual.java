package lpf.learn.leetcode.tags.bitoperation;


/** [3226]使两个整数相等的位更改次数
 <p>给你两个正整数 <code>n</code> 和 <code>k</code>。</p>
 <p>你可以选择 <code>n</code> 的 <strong>二进制表示</strong> 中任意一个值为 1 的位，并将其改为 0。</p>
 <p>返回使得 <code>n</code> 等于 <code>k</code> 所需要的更改次数。如果无法实现，返回 -1。</p>

 <p><strong class="example">示例 1：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong> <span class="example-io">n = 13, k = 4</span></p>
 </div>
 <p><strong>输出：</strong> <span class="example-io">2</span></p>
 <p><strong>解释：</strong><br /> 最初，<code>n</code> 和 <code>k</code> 的二进制表示分别为 <code>n = (1101)<sub>2</sub></code> 和 <code>k = (0100)<sub>2</sub></code>，</p>
 <p>我们可以改变 <code>n</code> 的第一位和第四位。结果整数为 <code>n = (<u><strong>0</strong></u>10<u><strong>0</strong></u>)<sub>2</sub> = k</code>。</p>

 <p><strong class="example">示例 2：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong> <span class="example-io">n = 21, k = 21</span></p>
 </div>
 <p><strong>输出：</strong> <span class="example-io">0</span></p>
 <p><strong>解释：</strong><br /> <code>n</code> 和 <code>k</code> 已经相等，因此不需要更改。</p>

 <p><strong class="example">示例 3：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong> <span class="example-io">n = 14, k = 13</span></p>
 </div>
 <p><strong>输出：</strong> <span class="example-io">-1</span></p>
 <p><strong>解释：</strong><br /> 无法使 <code>n</code> 等于 <code>k</code>。</p>

 <p><strong>提示：</strong></p>

 <li><code>1 &lt;= n, k &lt;= 10<sup>6</sup></code></li>
 </ul>
 */
public class NumberOfBitChangesToMakeTwoIntegersEqual {


    public int minChanges(int n, int k) {
        return (n & k) != k ? -1 : Integer.bitCount(n ^ k);
    }

    public int minChanges2(int n, int k) {
        int res = 0;
        for (; n > 0 || k > 0; n >>= 1, k >>= 1) {
            if ((n & 1) != (k & 1)) continue;

            if ((k & 1)== 0) res ++;
            else return -1;
        }
        return res;
    }
}
