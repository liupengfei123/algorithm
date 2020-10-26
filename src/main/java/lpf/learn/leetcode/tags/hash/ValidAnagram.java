package lpf.learn.leetcode.tags.hash;

/** [242]有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 *
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int[] merge1 = merge(s);
        int[] merge2 = merge(t);

        for (int i = 0; i < 26; i++) {
            if (merge1[i] != merge2[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] merge(String s) {
        int[] array = new int[26];
        for (char c : s.toCharArray()) {
            array[c - 'a']++;
        }
        return array;
    }


}
