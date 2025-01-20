package lpf.learn.leetcode.tags.bitoperation;

import java.util.ArrayList;
import java.util.List;

/** 3211 生成不含相邻零的二进制字符串
 <p>给你一个正整数 <code>n</code>。</p>
 <p>如果一个二进制字符串 <code>x</code> 的所有长度为 2 的<span data-keyword="substring-nonempty">子字符串</span>中包含 <strong>至少</strong> 一个 <code>"1"</code>，则称 <code>x</code> 是一个<strong> 有效</strong> 字符串。</p>
 <p>返回所有长度为 <code>n</code> 的<strong> 有效</strong> 字符串，可以以任意顺序排列。</p>

 <p><strong class="example">示例 1：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong> <span class="example-io">n = 3</span></p>
 </div>
 <p><strong>输出：</strong> <span class="example-io">["010","011","101","110","111"]</span></p>
 <p><strong>解释：</strong></p>
 <p>长度为 3 的有效字符串有：<code>"010"</code>、<code>"011"</code>、<code>"101"</code>、<code>"110"</code> 和 <code>"111"</code>。</p>

 <p><strong class="example">示例 2：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong> <span class="example-io">n = 1</span></p>
 </div>
 <p><strong>输出：</strong> <span class="example-io">["0","1"]</span></p>
 <p><strong>解释：</strong></p>
 <p>长度为 1 的有效字符串有：<code>"0"</code> 和 <code>"1"</code>。</p>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n &lt;= 18</code></li>
 </ul>
 */
public class GenerateBinaryStringsWithoutAdjacentZeros {
    private int n;
    public List<String> validStrings(int n) {
        this.n = n;
        List<String> res = new ArrayList<>();

        solve(1, 0, res);
        solve(1, 1, res);

        return res;
    }

    private void solve(int c, int v, List<String> res) {
        if (c == n) {
            String s = Integer.toBinaryString(v);
            if (s.length() != n) s = "0" + s;
            res.add(s);
            return;
        }

        if ((v & 1) == 0) {
            solve(c + 1, v << 1 | 1, res);
        } else {
            solve(c + 1, v << 1, res);
            solve(c + 1, v << 1 | 1, res);
        }
    }
}
