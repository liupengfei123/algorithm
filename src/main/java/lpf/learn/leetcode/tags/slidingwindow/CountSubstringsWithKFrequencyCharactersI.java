package lpf.learn.leetcode.tags.slidingwindow;


/** 3325 字符至少出现 K 次的子字符串 I
 <p>给你一个字符串 <code>s</code> 和一个整数 <code>k</code>，在 <code>s</code> 的所有子字符串中，请你统计并返回 <strong>至少有一个 </strong>字符 <strong>至少出现</strong> <code>k</code> 次的子字符串总数。</p>
 <p><strong>子字符串 </strong>是字符串中的一个连续、<b> 非空</b> 的字符序列。</p>

 <p><strong class="example">示例 1：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong> <span class="example-io">s = "abacb", k = 2</span></p>
 </div>
 <p><strong>输出：</strong> <span class="example-io">4</span></p>
 <p><strong>解释：</strong></p>
 <p>符合条件的子字符串如下：</p>
 <ul>
 <li><code>"aba"</code>（字符 <code>'a'</code> 出现 2 次）。</li>
 <li><code>"abac"</code>（字符 <code>'a'</code> 出现 2 次）。</li>
 <li><code>"abacb"</code>（字符 <code>'a'</code> 出现 2 次）。</li>
 <li><code>"bacb"</code>（字符 <code>'b'</code> 出现 2 次）。</li>
 </ul>

 <p><strong class="example">示例 2：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong> <span class="example-io">s = "abcde", k = 1</span></p>
 </div>
 <p><strong>输出：</strong> <span class="example-io">15</span></p>
 <p><strong>解释：</strong></p>
 <p>所有子字符串都有效，因为每个字符至少出现一次。</p>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length &lt;= 3000</code></li>
 <li><code>1 &lt;= k &lt;= s.length</code></li>
 <li><code>s</code> 仅由小写英文字母组成。</li>
 </ul>
 */
public class CountSubstringsWithKFrequencyCharactersI {
    public int numberOfSubstrings(String s, int k) {
        int[] cnt = new int[26];
        char[] chars = s.toCharArray();
        int n = s.length(), res = 0;

        for (int l = 0, r = 0; r < n; r++) {
            int i = chars[r] - 'a';
            cnt[i]++;

            while (cnt[i] >= k) cnt[chars[l++] - 'a']--;

            res += l;
        }
        return res;
    }
}
