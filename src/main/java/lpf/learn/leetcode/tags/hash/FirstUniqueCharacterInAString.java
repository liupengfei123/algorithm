package lpf.learn.leetcode.tags.hash;

/** [387]字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 示例：
 * s = "leetcode"
 * 返回 0
 * s = "loveleetcode"
 * 返回 2
 *
 * 提示：你可以假定该字符串只包含小写字母。
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] array = new int[26];
        int i = 1;
        for (char c : s.toCharArray()) {
            if (array[c - 'a'] != 0) {
                array[c - 'a'] = Integer.MAX_VALUE;
            } else {
                array[c - 'a'] = i;
            }
            i++;
        }
        int min = Integer.MAX_VALUE;
        for (Integer value : array) {
            if (value != 0)  min = Math.min(min, value);
        }
        return min == Integer.MAX_VALUE ? -1 : min - 1;
    }

}
