package lpf.learn.leetcode.tags.design;


import java.util.Iterator;
import java.util.LinkedList;

/** 1032 字符流
 <p>设计一个算法：接收一个字符流，并检查这些字符的后缀是否是字符串数组 <code>words</code> 中的一个字符串。</p>
 <p>例如，<code>words = ["abc", "xyz"]</code> 且字符流中逐个依次加入 4 个字符 <code>'a'</code>、<code>'x'</code>、<code>'y'</code> 和 <code>'z'</code> ，你所设计的算法应当可以检测到&nbsp;<code>"axyz"</code> 的后缀 <code>"xyz"</code> 与&nbsp;<code>words</code> 中的字符串 <code>"xyz"</code> 匹配。</p>
 <p>按下述要求实现 <code>StreamChecker</code> 类：</p>
 <ul>
 <li><code>StreamChecker(String[] words)</code> ：构造函数，用字符串数组&nbsp;<code>words</code> 初始化数据结构。</li>
 <li><code>boolean query(char letter)</code>：从字符流中接收一个新字符，如果字符流中的任一非空后缀能匹配 <code>words</code> 中的某一字符串，返回 <code>true</code> ；否则，返回 <code>false</code>。</li>
 </ul>

 <p><strong>示例：</strong></p>
 <pre>
 <strong>输入：</strong>
 ["StreamChecker", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query"]
 [[["cd", "f", "kl"]], ["a"], ["b"], ["c"], ["d"], ["e"], ["f"], ["g"], ["h"], ["i"], ["j"], ["k"], ["l"]]
 <strong>输出：</strong>
 [null, false, false, false, true, false, true, false, false, false, false, false, true]

 <strong>解释：</strong>
 StreamChecker streamChecker = new StreamChecker(["cd", "f", "kl"]);
 streamChecker.query("a"); // 返回 False
 streamChecker.query("b"); // 返回 False
 streamChecker.query("c"); // 返回n False
 streamChecker.query("d"); // 返回 True ，因为 'cd' 在 words 中
 streamChecker.query("e"); // 返回 False
 streamChecker.query("f"); // 返回 True ，因为 'f' 在 words 中
 streamChecker.query("g"); // 返回 False
 streamChecker.query("h"); // 返回 False
 streamChecker.query("i"); // 返回 False
 streamChecker.query("j"); // 返回 False
 streamChecker.query("k"); // 返回 False
 streamChecker.query("l"); // 返回 True ，因为 'kl' 在 words 中
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= words.length &lt;= 2000</code></li>
 <li><code>1 &lt;= words[i].length &lt;= 200</code></li>
 <li><code>words[i]</code> 由小写英文字母组成</li>
 <li><code>letter</code> 是一个小写英文字母</li>
 <li>最多调用查询 <code>4 * 10<sup>4</sup></code> 次</li>
 </ul>
 */
public class StreamOfCharacters {

    private final Tried root;
    private final LinkedList<Character> letterTemp;
    private int maxLength;

    public StreamOfCharacters(String[] words) {
        this.root = new Tried();
        this.letterTemp = new LinkedList<>();

        for (String word : words) {
            this.maxLength = Math.max(this.maxLength, word.length());
            this.root.insert(word);
        }
    }

    public boolean query(char letter) {
        letterTemp.offer(letter);
        if (letterTemp.size() > this.maxLength) letterTemp.poll();

        return this.root.query(letterTemp);
    }


    private static class Tried {
        boolean flag;
        Tried[] child;

        public void insert(String word) {
            char[] chars = word.toCharArray();
            int length = word.length();

            Tried node = this;
            for (int i = length - 1; i >= 0; i--) {
                char c = chars[i];
                if (node.child == null) node.child = new Tried[26];
                if (node.child[c - 'a'] == null) node.child[c - 'a'] = new Tried();
                node = node.child[c - 'a'];
            }
            node.flag = true;
        }

        public boolean query(LinkedList<Character> letterTemp) {
            Tried node = this;
            Iterator<Character> iterator = letterTemp.descendingIterator();

            while (iterator.hasNext()) {
                char c = iterator.next();
                if (node.child == null) return false;
                if (node.child[c - 'a'] == null) return false;

                node = node.child[c - 'a'];
                if (node.flag) return true;
            }
            return false;
        }
    }
}
