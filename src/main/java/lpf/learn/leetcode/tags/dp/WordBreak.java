package lpf.learn.leetcode.tags.dp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** [139]单词拆分
 *  给定一个非空字符串 s 和一个包含非空单词的列表 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 *  说明：
 *  拆分时可以重复使用字典中的单词。
 *  你可以假设字典中没有重复的单词。
 *
 *  示例 1：
 *  输入: s = "leetcode", wordDict = ["leet", "code"]
 *  输出: true
 *  解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 *
 *  示例 2：
 *  输入: s = "applepenapple", wordDict = ["apple", "pen"]
 *  输出: true
 *  解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。注意你可以重复使用字典中的单词。
 *
 *  示例 3：
 *  输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 *  输出: false
 *
 * @author liupf
 * @date 2021-03-06 18:55
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        return help(s, wordDict, new HashMap<>());
    }

    private boolean help(String source, List<String> wordDict, Map<String, Boolean> dp){
        if (source.isEmpty()) {
            return true;
        }
        if (dp.containsKey(source)) {
            return dp.get(source);
        }

        boolean result = false;
        for (String s : wordDict) {
            if (source.startsWith(s)) {
                result = help(source.substring(s.length()), wordDict, dp);
                if (result) {
                    break;
                }
            }
        }

        dp.put(source, result);
        return result;
    }
}
