package lpf.learn.leetcode.tags.string;

/** 1832 判断句子是否为全字母句
 <p><strong>全字母句</strong> 指包含英语字母表中每个字母至少一次的句子。</p>
 <p>给你一个仅由小写英文字母组成的字符串 <code>sentence</code> ，请你判断 <code>sentence</code> 是否为 <strong>全字母句</strong> 。</p>
 <p>如果是，返回<em> </em><code>true</code> ；否则，返回<em> </em><code>false</code> 。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>sentence = "thequickbrownfoxjumpsoverthelazydog"
 <strong>输出：</strong>true
 <strong>解释：</strong><code>sentence</code> 包含英语字母表中每个字母至少一次。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>sentence = "leetcode"
 <strong>输出：</strong>false
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 <= sentence.length <= 1000</code></li>
 <li><code>sentence</code> 由小写英语字母组成</li>
 </ul>
 */
public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        int value = 0;
        for (char c : sentence.toCharArray()) {
            value |= 1 << (c - 'a');
        }
        return value == (1 << 26) - 1;
    }
}
