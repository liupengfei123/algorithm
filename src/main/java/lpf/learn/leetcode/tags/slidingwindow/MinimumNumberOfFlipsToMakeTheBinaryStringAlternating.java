package lpf.learn.leetcode.tags.slidingwindow;


/** 1888 使二进制字符串字符交替的最少反转次数
 <p>给你一个二进制字符串&nbsp;<code>s</code>&nbsp;。你可以按任意顺序执行以下两种操作任意次：</p>

 <ul>
 <li><strong>类型 1 ：删除</strong> 字符串&nbsp;<code>s</code>&nbsp;的第一个字符并将它 <strong>添加</strong>&nbsp;到字符串结尾。</li>
 <li><strong>类型 2 ：选择 </strong>字符串&nbsp;<code>s</code>&nbsp;中任意一个字符并将该字符&nbsp;<strong>反转&nbsp;</strong>，也就是如果值为&nbsp;<code>'0'</code>&nbsp;，则反转得到&nbsp;<code>'1'</code>&nbsp;，反之亦然。</li>
 </ul>

 <p>请你返回使 <code>s</code>&nbsp;变成 <strong>交替</strong> 字符串的前提下，&nbsp;<strong>类型 2&nbsp;</strong>的 <strong>最少</strong>&nbsp;操作次数&nbsp;。</p>
 <p>我们称一个字符串是 <strong>交替</strong>&nbsp;的，需要满足任意相邻字符都不同。</p>
 <ul>
 <li>比方说，字符串&nbsp;<code>"010"</code> 和&nbsp;<code>"1010"</code>&nbsp;都是交替的，但是字符串&nbsp;<code>"0100"</code>&nbsp;不是。</li>
 </ul>

 <p><strong>示例 1：</strong></p>
 <pre><b>输入：</b>s = "111000"
 <b>输出：</b>2
 <b>解释：</b>执行第一种操作两次，得到 s = "100011" 。
 然后对第三个和第六个字符执行第二种操作，得到 s = "10<strong>1</strong>01<strong>0</strong>" 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><b>输入：</b>s = "010"
 <b>输出：</b>0
 <strong>解释：</strong>字符串已经是交替的。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><b>输入：</b>s = "1110"
 <b>输出：</b>1
 <b>解释：</b>对第二个字符执行第二种操作，得到 s = "1<strong>0</strong>10" 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
 <li><code>s[i]</code>&nbsp;要么是&nbsp;<code>'0'</code>&nbsp;，要么是&nbsp;<code>'1'</code>&nbsp;。</li>
 </ul>
 */
public class MinimumNumberOfFlipsToMakeTheBinaryStringAlternating {

    public int minFlips(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();

        int cnt = 0;

        char[] flips = new char[]{'0', '1'};
        for (int i = 0; i < n; i++) cnt += chars[i] == flips[i % 2] ? 0 : 1;

        int res = Math.min(cnt, n - cnt);

        if ((n & 1) == 0) return res;


        for (int i = 0; i < n; i++) {
            cnt -= chars[i] == flips[i % 2] ? 0 : 1;
            cnt += chars[i] == flips[(i + n) % 2] ? 0 : 1;

            res = Math.min(res, Math.min(cnt, n - cnt));
        }
        return res;
    }


    public int minFlips2(String s) {
        char[] chars = s.toCharArray();
        int n = s.length();

        int[][] pre = new int[n][2];
        pre[0][0] = chars[0] == '0' ? 0 : 1;
        pre[0][1] = chars[0] == '1' ? 0 : 1;
        for (int i = 1; i < n; i++) {
            pre[i][0] = pre[i - 1][1] + (chars[i] == '0' ? 0 : 1);
            pre[i][1] = pre[i - 1][0] + (chars[i] == '1' ? 0 : 1);
        }
        int res = Math.min(pre[n - 1][0], pre[n - 1][1]);

        if ((n & 1) == 0) return res;

        int suff0 = chars[n - 1] == '0' ? 0 : 1;
        int suff1 = chars[n - 1] == '1' ? 0 : 1;

        for (int i = n - 2; i >= 0; i--) {
            res = Math.min(res, pre[i][0] + suff0);
            res = Math.min(res, pre[i][1] + suff1);

            int temp0 = suff1 + (chars[i] == '0' ? 0 : 1);
            int temp1 = suff0 + (chars[i] == '1' ? 0 : 1);

            suff0 = temp0;
            suff1 = temp1;
        }
        return res;
    }
}
