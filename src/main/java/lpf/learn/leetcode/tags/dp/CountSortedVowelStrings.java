package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;

/** 1641 统计字典序元音字符串的数目
 <p>给你一个整数 <code>n</code>，请返回长度为 <code>n</code> 、仅由元音 (<code>a</code>, <code>e</code>, <code>i</code>, <code>o</code>, <code>u</code>) 组成且按 <strong>字典序排列</strong> 的字符串数量。</p>
 <p>字符串 <code>s</code> 按 <strong>字典序排列</strong> 需要满足：对于所有有效的 <code>i</code>，<code>s[i]</code> 在字母表中的位置总是与 <code>s[i+1]</code> 相同或在 <code>s[i+1]</code> 之前。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>n = 1
 <strong>输出：</strong>5
 <strong>解释：</strong>仅由元音组成的 5 个字典序字符串为 <code>["a","e","i","o","u"]</code>
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>n = 2
 <strong>输出：</strong>15
 <strong>解释：</strong>仅由元音组成的 15 个字典序字符串为
 ["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"]
 注意，"ea" 不是符合题意的字符串，因为 'e' 在字母表中的位置比 'a' 靠后
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>n = 33
 <strong>输出：</strong>66045
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 <= n <= 50</code> </li>
 </ul>
 */
public class CountSortedVowelStrings {
    public int countVowelStrings(int n) {
        int[] dp = new int[5];
        Arrays.fill(dp, 1);

        for (int i = 2; i <= n; i++) {
            for (int j = 3; j >= 0; j--) dp[j] += dp[j + 1];
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) sum += dp[i];
        return sum;
    }
}
