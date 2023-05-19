package lpf.learn.leetcode.tags.string;

import java.util.HashSet;
import java.util.Set;

/** 1079 活字印刷
 <p>你有一套活字字模&nbsp;<code>tiles</code>，其中每个字模上都刻有一个字母&nbsp;<code>tiles[i]</code>。返回你可以印出的非空字母序列的数目。</p>
 <p><strong>注意：</strong>本题中，每个活字字模只能使用一次。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>"AAB"
 <strong>输出：</strong>8
 <strong>解释：</strong>可能的序列为 "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA"。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>"AAABBC"
 <strong>输出：</strong>188
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>"V"
 <strong>输出：</strong>1</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= tiles.length &lt;= 7</code></li>
 <li><code>tiles</code> 由大写英文字母组成</li>
 </ul>
 */
public class LetterTilePossibilities {

    public int numTilePossibilities(String tiles) {
        int[] cnt = new int[26];
        for (char c : tiles.toCharArray()) cnt[c - 'A']++;

        Set<Long> set = new HashSet<>(1 << tiles.length());

        run(cnt, set, 0, 0);

        return set.size() - 1;
    }

    private void run(int[] cnt, Set<Long> set, long value, int pos) {
        set.add(value);

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == 0) continue;

            cnt[i]--;
            run(cnt, set, value | (i + 1L) << (5 * pos), pos + 1);
            cnt[i]++;
        }
    }
}
