package lpf.learn.leetcode.tags.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** [500]键盘行
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 * 示例：
 *
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *
 * 注意：
 * 你可以重复使用键盘上同一字符。
 * 你可以假设输入的字符串将只包含字母。
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        char[][] chars = new char[][]{{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'}
                , {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'}
                , {'z', 'x', 'c', 'v', 'b', 'n', 'm', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'}};

        Map<Character, Integer> map = new HashMap<>(60);
        for (int i = 0; i < chars.length; i++) {
            for (char c : chars[i]) {
                map.put(c, i);
            }
        }

        List<String> list = new ArrayList<>();
        boolean pass;
        Integer last;
        for (String word : words) {
            pass = true;
            last = null;
            for (char c : word.toCharArray()) {
                int v = map.get(c);
                if (last != null && last != v) {
                    pass = false;
                    break;
                }
                last = v;
            }

            if (pass) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}
