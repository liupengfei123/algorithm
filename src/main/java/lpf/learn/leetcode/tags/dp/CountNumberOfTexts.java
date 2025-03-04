package lpf.learn.leetcode.tags.dp;

/** 2266 统计打字方案数
 <p>Alice 在给 Bob 用手机打字。数字到字母的 <strong>对应</strong>&nbsp;如下图所示。</p>
 <p><img alt="" src="https://pic.leetcode.cn/1722224025-gsUAIv-image.png" style="width: 200px; height: 162px;" /></p>
 <p>为了 <strong>打出</strong>&nbsp;一个字母，Alice 需要 <strong>按</strong>&nbsp;对应字母 <code>i</code>&nbsp;次，<code>i</code>&nbsp;是该字母在这个按键上所处的位置。</p>
 <ul>
 <li>比方说，为了按出字母&nbsp;<code>'s'</code>&nbsp;，Alice 需要按&nbsp;<code>'7'</code>&nbsp;四次。类似的， Alice 需要按&nbsp;<code>'5'</code>&nbsp;两次得到字母&nbsp;&nbsp;<code>'k'</code>&nbsp;。</li>
 <li>注意，数字&nbsp;<code>'0'</code> 和&nbsp;<code>'1'</code>&nbsp;不映射到任何字母，所以&nbsp;Alice <strong>不</strong>&nbsp;使用它们。</li>
 </ul>
 <p>但是，由于传输的错误，Bob 没有收到 Alice 打字的字母信息，反而收到了 <strong>按键的字符串信息</strong>&nbsp;。</p>
 <ul>
 <li>比方说，Alice 发出的信息为&nbsp;<code>"bob"</code>&nbsp;，Bob 将收到字符串&nbsp;<code>"2266622"</code>&nbsp;。</li>
 </ul>
 <p>给你一个字符串&nbsp;<code>pressedKeys</code>&nbsp;，表示 Bob 收到的字符串，请你返回 Alice <strong>总共可能发出多少种文字信息</strong>&nbsp;。</p>
 <p>由于答案可能很大，将它对&nbsp;<code>10<sup>9</sup> + 7</code>&nbsp;<strong>取余</strong> 后返回。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>pressedKeys = "22233"
 <b>输出：</b>8
 <strong>解释：</strong>
 Alice 可能发出的文字信息包括：
 "aaadd", "abdd", "badd", "cdd", "aaae", "abe", "bae" 和 "ce" 。
 由于总共有 8 种可能的信息，所以我们返回 8 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>pressedKeys = "222222222222222222222222222222222222"
 <b>输出：</b>82876089
 <strong>解释：</strong>
 总共有 2082876103 种 Alice 可能发出的文字信息。
 由于我们需要将答案对 10<sup>9</sup> + 7 取余，所以我们返回 2082876103 % (10<sup>9</sup> + 7) = 82876089 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= pressedKeys.length &lt;= 10<sup>5</sup></code></li>
 <li><code>pressedKeys</code> 只包含数字&nbsp;<code>'2'</code>&nbsp;到&nbsp;<code>'9'</code>&nbsp;。</li>
 </ul>
 */
public class CountNumberOfTexts {
    private static final int MOD = 1000_000_007;
    private static final int[] dp3;
    private static final int[] dp4;

    static {
        dp3 = getDp(3, 100000);
        dp4 = getDp(4, 100000);
    }

    public int countTexts(String pressedKeys) {
        int n = pressedKeys.length();
        char[] chars = pressedKeys.toCharArray();

        long res = 1;

        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && chars[j] == chars[i]) j++;

            res = (res * getL(chars[i])[j - i]) % MOD;
            i = j - 1;
        }
        return (int) res;
    }

    private static int[] getDp(int l, int cnt) {
        int[] dp = new int[cnt + 1];
        dp[0] = 1;
        for (int i = 1; i <= cnt; i++) {
            for (int j = 1; i - j >= 0 && j <= l; j++)
                dp[i] = (dp[i] + dp[i - j]) % MOD;
        }
        return dp;
    }

    private int[] getL(char c) {
        switch (c) {
            case '7' :
            case '9' :
                return dp4;
            default:
                return dp3;
        }
    }

}
