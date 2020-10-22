package lpf.learn.leetcode.tags.array;

import java.util.ArrayList;
import java.util.List;

/** [1002]查找常用字符
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不
 * 是 4 次，则需要在最终答案中包含该字符 3 次。
 * 你可以按任意顺序返回答案。
 *
 * 示例 1：
 * 输入：["bella","label","roller"]
 * 输出：["e","l","l"]
 *
 * 示例 2：
 * 输入：["cool","lock","cook"]
 * 输出：["c","o"]
 *
 * 提示：
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] 是小写字母
 */
public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        int[] total = mergeStr(A[0]);
        for (int i = 1; i < A.length; i++) {
            int[] map = mergeStr(A[i]);
            for (int j = 0; j < 26; j++) {
                if (map[j] < total[j]) {
                    total[j] = map[j];
                }
            }
        }

        List<String> result = new ArrayList<>();
        String[] words = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int j = 0; j < 26; j++) {
            while (total[j]-- > 0) {
                result.add(words[j]);
            }
        }
        return result;
    }

    private int[] mergeStr(String a) {
        int[] merge = new int[26];
        for (char c : a.toCharArray()) {
            merge[c - 'a']++;
        }
        return merge;
    }
}
