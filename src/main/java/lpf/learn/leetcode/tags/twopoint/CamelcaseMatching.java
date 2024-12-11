package lpf.learn.leetcode.tags.twopoint;


import java.util.ArrayList;
import java.util.List;

/** 1023 驼峰式匹配
 <p>给你一个字符串数组 <code>queries</code>，和一个表示模式的字符串&nbsp;<code>pattern</code>，请你返回一个布尔数组 <code>answer</code> 。只有在待查项&nbsp;<code>queries[i]</code> 与模式串&nbsp;<code>pattern</code> 匹配时，&nbsp;<code>answer[i]</code>&nbsp;才为 <code>true</code>，否则为 <code>false</code>。</p>
 <p>如果可以将<strong>小写字母</strong>插入模式串&nbsp;<code>pattern</code>&nbsp;得到待查询项&nbsp;<code>queries[i]</code>，那么待查询项与给定模式串匹配。可以在任何位置插入每个字符，也可以不插入字符。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FB"
 <strong>输出：</strong>[true,false,true,true,false]
 <strong>示例：</strong>
 "FooBar" 可以这样生成："F" + "oo" + "B" + "ar"。
 "FootBall" 可以这样生成："F" + "oot" + "B" + "all".
 "FrameBuffer" 可以这样生成："F" + "rame" + "B" + "uffer".</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FoBa"
 <strong>输出：</strong>[true,false,true,false,false]
 <strong>解释：</strong>
 "FooBar" 可以这样生成："Fo" + "o" + "Ba" + "r".
 "FootBall" 可以这样生成："Fo" + "ot" + "Ba" + "ll".
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FoBaT"
 <strong>输出：</strong>[false,true,false,false,false]
 <strong>解释： </strong>
 "FooBarTest" 可以这样生成："Fo" + "o" + "Ba" + "r" + "T" + "est".
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= pattern.length, queries.length &lt;= 100</code></li>
 <li><code>1 &lt;= queries[i].length &lt;= 100</code></li>
 <li><code>queries[i]</code> 和 <code>pattern</code> 由英文字母组成</li>
 </ul>
 */
public class CamelcaseMatching {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();

        for (String query : queries) {
            res.add(solve(query, pattern));
        }

        return res;
    }

    private boolean solve(String s, String t) {
        char[] sc = s.toCharArray(), tc = t.toCharArray();
        int n = s.length(), m = t.length();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (sc[i] == tc[j]) {
                j++;
                i++;
            } else {
                if (Character.isUpperCase(sc[i++])) return false;
            }
        }
        while (i < n) {
            if (Character.isUpperCase(sc[i++])) return false;
        }
        return j >= m;
    }
}
