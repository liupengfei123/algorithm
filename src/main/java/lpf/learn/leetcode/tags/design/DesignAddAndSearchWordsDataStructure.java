package lpf.learn.leetcode.tags.design;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/** [211]添加与搜索单词 - 数据结构设计
 * 请你设计一个数据结构，支持 添加新单词 和 查找字符串是否与任何先前添加的字符串匹配 。
 * 实现词典类 WordDictionary ：
 * WordDictionary() 初始化词典对象
 * void addWord(word) 将 word 添加到数据结构中，之后可以对它进行匹配
 * bool search(word) 如果数据结构中存在字符串与 word 匹配，则返回 true ；否则，返回 false 。word 中可能包含一些'.'，每个 . 都可以表示任何一个字母。
 *
 * 示例：
 * 输入：["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
 * [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
 * 输出：[null,null,null,null,false,true,true,true]
 * 解释：
 * WordDictionary wordDictionary = new WordDictionary();
 * wordDictionary.addWord("bad");
 * wordDictionary.addWord("dad");
 * wordDictionary.addWord("mad");
 * wordDictionary.search("pad"); // return False
 * wordDictionary.search("bad"); // return True
 * wordDictionary.search(".ad"); // return True
 * wordDictionary.search("b.."); // return True
 *
 * 提示：
 * 1 <= word.length <= 500
 * addWord 中的 word 由小写英文字母组成
 * search 中的 word 由 '.' 或小写英文字母组成
 * 最多调用 50000 次 addWord 和 search
 */
public class DesignAddAndSearchWordsDataStructure {

    private Map<Character, Map> root;

    public DesignAddAndSearchWordsDataStructure() {
        root = new HashMap<>();
    }

    public void addWord(String word) {
        Map<Character, Map> temp = root;
        for (int i = 0; i < word.length(); i++) {
            Map value = temp.getOrDefault(word.charAt(i), new HashMap<>(26));
            temp.put(word.charAt(i), value);
            temp = value;
        }
        temp.putIfAbsent('#', Collections.EMPTY_MAP);
    }

    public boolean search(String word) {
        return searchHelp(word, root);
    }

    private boolean searchHelp(String word, Map<Character, Map> temp) {
        if (word == null || word.length() <= 0) {
            return temp.get('#') != null;
        }
        char c = word.charAt(0);
        if (c == '.') {
            boolean result = false;
            for (Map map : temp.values()) {
                result = result || searchHelp(word.substring(1), map);
            }
            return result;
        } else {
            Map map = temp.get(c);
            if (map == null) {
                return false;
            } else {
                return searchHelp(word.substring(1), map);
            }
        }
    }

}
