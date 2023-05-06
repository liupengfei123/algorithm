package lpf.learn.leetcode.tags.string;

/** 1419 数青蛙
 <p>给你一个字符串 <code>croakOfFrogs</code>，它表示不同青蛙发出的蛙鸣声（字符串 <code>"croak"</code> ）的组合。由于同一时间可以有多只青蛙呱呱作响，所以&nbsp;<code>croakOfFrogs</code> 中会混合多个 <code>“croak”</code> <em>。</em></p>
 <p>请你返回模拟字符串中所有蛙鸣所需不同青蛙的最少数目。</p>
 <p>要想发出蛙鸣 "croak"，青蛙必须 <strong>依序</strong> 输出 <code>‘c’, ’r’, ’o’, ’a’, ’k’</code> 这 5 个字母。如果没有输出全部五个字母，那么它就不会发出声音。如果字符串 <code>croakOfFrogs</code> 不是由若干有效的 "croak" 字符混合而成，请返回 <code>-1</code> 。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>croakOfFrogs = "croakcroak"
 <strong>输出：</strong>1
 <strong>解释：</strong>一只青蛙 “呱呱” 两次
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>croakOfFrogs = "crcoakroak"
 <strong>输出：</strong>2
 <strong>解释：</strong>最少需要两只青蛙，“呱呱” 声用黑体标注
 第一只青蛙 "<strong>cr</strong>c<strong>oak</strong>roak"
 第二只青蛙 "cr<strong>c</strong>oak<strong>roak</strong>"
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>croakOfFrogs = "croakcrook"
 <strong>输出：</strong>-1
 <strong>解释：</strong>给出的字符串不是 "croak<strong>"</strong> 的有效组合。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= croakOfFrogs.length &lt;= 10<sup>5</sup></code></li>
 <li>字符串中的字符只有 <code>'c'</code>, <code>'r'</code>, <code>'o'</code>, <code>'a'</code> 或者 <code>'k'</code></li>
 </ul>
 */
public class MinimumNumberOfFrogsCroaking {

    public int minNumberOfFrogs(String croakOfFrogs) {
        char[] chars = croakOfFrogs.toCharArray();
        int[] cnt = new int[6];
        cnt[0] = 10000000;

        int res = 0;
        for (char c : chars) {
            int i = getIndex(c);

            if (cnt[i - 1] <= 0) return -1;

            cnt[i - 1]--;
            cnt[i]++;

            res = Math.max(res, cnt[1] + cnt[2] + cnt[3] + cnt[4]);
        }
        if (cnt[1] > 0 || cnt[2] > 0 || cnt[3] > 0 || cnt[4] > 0) return -1;

        return res;
    }

    private int getIndex(char c) {
        switch (c) {
            case 'c' : return 1;
            case 'r' : return 2;
            case 'o' : return 3;
            case 'a' : return 4;
            case 'k' : return 5;
        }
        return -1;
    }
}
