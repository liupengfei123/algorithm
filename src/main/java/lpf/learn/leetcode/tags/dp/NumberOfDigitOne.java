package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;

/** [233] 数字 1 的个数
 <p>给定一个整数 <code>n</code>，计算所有小于等于 <code>n</code> 的非负整数中数字 <code>1</code> 出现的个数。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>n = 13
 <strong>输出：</strong>6
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>n = 0
 <strong>输出：</strong>0
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>0 &lt;= n &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class NumberOfDigitOne {
    private int[][] dp;
    private int l;
    private char[] chars;

    public int countDigitOne(int n) {
        this.chars = String.valueOf(n).toCharArray();
        this.l = chars.length;
        this.dp = new int[l][l];
        for (int i = 0; i < l; i++) Arrays.fill(dp[i], -1);

        return run(0, 0,true);
    }


    private int run(int i, int cnt1, boolean isLimit) {
        if (i == l) return cnt1;

        if (!isLimit && dp[i][cnt1] != -1) return dp[i][cnt1];

        int up = isLimit ? chars[i] - '0' : 9;

        int res = 0;
        for (int j = 0; j <= up; j++) {
            res += run(i + 1, cnt1 + (j == 1 ? 1 : 0),isLimit & j == up);
        }
        if (!isLimit) dp[i][cnt1] = res;
        return res;
    }


    public int countDigitOne2(int n) {
        // mulk 表示 10^k
        // 在下面的代码中，可以发现 k 并没有被直接使用到（都是使用 10^k）
        // 但为了让代码看起来更加直观，这里保留了 k
        long mulk = 1;
        int ans = 0;
        for (int k = 0; n >= mulk; ++k) {
            ans += (n / (mulk * 10)) * mulk + Math.min(Math.max(n % (mulk * 10) - mulk + 1, 0), mulk);
            mulk *= 10;
        }
        return ans;
    }
}
