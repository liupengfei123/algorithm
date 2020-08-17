package lpf.learn.leetcode.learn.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** [49]字母异位词分组
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * 示例:
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 * [
 *  ["ate","eat","tea"],
 *  ["nat","tan"],
 *  ["bat"]
 * ]
 * 说明：
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] charIndex = new int[26];
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String info = groupInfo(str, charIndex);
            List<String> list = map.getOrDefault(info, new ArrayList<>());
            list.add(str);
            map.putIfAbsent(info, list);
        }
        return new ArrayList<>(map.values());
    }

    private String groupInfo(String stc, int[] charIndexs) {
        Arrays.fill(charIndexs, 0);

        int size = stc.length();
        for (int i = 0; i < size; i++) {
            charIndexs[stc.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charIndexs.length; i++) {
            if (charIndexs[i] > 0) {
                sb.append('a' + i).append(charIndexs[i]);
            }
        }
        return sb.toString();
    }


    /**
     * 也可以用一些质数进行求积 就可以得出 字母异位词 的特征值，
     * 当字符串很长时需要留意 int 溢出
     */
    private static int[] prime = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    private int getKey(String str) {
        int result = 1;
        int size = str.length();
        for (int i = 0; i < size; i++) {
            result *= prime[str.charAt(i) - 'a'];
        }
        return result;
    }
}
