package lpf.learn.leetcode.learn.hash;

import java.util.LinkedHashMap;
import java.util.Map;

/** [387]字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 示例：
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 *
 * 提示：你可以假定该字符串只包含小写字母。
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        Map<Character, Integer> indexMap = new LinkedHashMap<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            indexMap.putIfAbsent(s.charAt(i), i);
            map.merge(s.charAt(i), 1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return indexMap.get(entry.getKey());
            }
        }
        return -1;
    }
}
