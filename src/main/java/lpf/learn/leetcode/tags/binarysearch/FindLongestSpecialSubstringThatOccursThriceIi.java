package lpf.learn.leetcode.tags.binarysearch;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 2982 找出出现至少三次的最长特殊子字符串 II
 <p>给你一个仅由小写英文字母组成的字符串 <code>s</code> 。</p>
 <p>如果一个字符串仅由单一字符组成，那么它被称为 <strong>特殊 </strong>字符串。例如，字符串 <code>"abc"</code> 不是特殊字符串，而字符串 <code>"ddd"</code>、<code>"zz"</code> 和 <code>"f"</code> 是特殊字符串。</p>
 <p>返回在 <code>s</code> 中出现 <strong>至少三次 </strong>的<strong> 最长特殊子字符串 </strong>的长度，如果不存在出现至少三次的特殊子字符串，则返回 <code>-1</code> 。</p>
 <p><strong>子字符串 </strong>是字符串中的一个连续<strong> 非空 </strong>字符序列。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>s = "aaaa"
 <strong>输出：</strong>2
 <strong>解释：</strong>出现三次的最长特殊子字符串是 "aa" ：子字符串 "<em><strong>aa</strong></em>aa"、"a<em><strong>aa</strong></em>a" 和 "aa<em><strong>aa</strong></em>"。
 可以证明最大长度是 2 。
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>s = "abcdef"
 <strong>输出：</strong>-1
 <strong>解释：</strong>不存在出现至少三次的特殊子字符串。因此返回 -1 。
 </pre>

 <p><strong class="example">示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>s = "abcaba"
 <strong>输出：</strong>1
 <strong>解释：</strong>出现三次的最长特殊子字符串是 "a" ：子字符串 "<em><strong>a</strong></em>bcaba"、"abc<em><strong>a</strong></em>ba" 和 "abcab<em><strong>a</strong></em>"。
 可以证明最大长度是 1 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>3 &lt;= s.length &lt;= 5 * 10<sup>5</sup></code></li>
 <li><code>s</code> 仅由小写英文字母组成。</li>
 </ul>
 */
public class FindLongestSpecialSubstringThatOccursThriceIi {
    public int maximumLength(String s) {
        List<Integer>[] array = new List[26];
        Arrays.setAll(array, (i) -> new ArrayList<>());

        int n = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0, j = 0; i < n; i = j) {
            while (j < n && chars[j] == chars[i]) j++;

            array[chars[i] - 'a'].add(j - i);
        }

        int l = 0, r = n;
        while (l < r) {
            int mid = (l + r + 1) / 2;

            if (check(array, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l == 0 ? -1 : l;
    }

    private boolean check(List<Integer>[] array, int x) {
        for (List<Integer> list : array) {
            if (list.isEmpty()) continue;

            int cnt = 0;
            for (Integer l : list) {
                cnt += Math.max(0, l - x + 1);

                if (cnt >= 3) return true;
            }
        }
        return false;
    }
}
