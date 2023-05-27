package lpf.learn.leetcode.game.weekly346;

import java.util.HashMap;
import java.util.Map;

/** [2698] 求一个整数的惩罚数
 <p>给你一个正整数&nbsp;<code>n</code>&nbsp;，请你返回&nbsp;<code>n</code>&nbsp;的&nbsp;<strong>惩罚数</strong>&nbsp;。</p>
 <p><code>n</code>&nbsp;的 <strong>惩罚数</strong>&nbsp;定义为所有满足以下条件 <code>i</code>&nbsp;的数的平方和：</p>
 <ul>
 <li><code>1 &lt;= i &lt;= n</code></li>
 <li><code>i * i</code> 的十进制表示的字符串可以分割成若干连续子字符串，且这些子字符串对应的整数值之和等于 <code>i</code> 。</li>
 </ul>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>n = 10
 <b>输出：</b>182
 <b>解释：</b>总共有 3 个整数 i 满足要求：
 - 1 ，因为 1 * 1 = 1
 - 9 ，因为 9 * 9 = 81 ，且 81 可以分割成 8 + 1 。
 - 10 ，因为 10 * 10 = 100 ，且 100 可以分割成 10 + 0 。
 因此，10 的惩罚数为 1 + 81 + 100 = 182
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>n = 37
 <b>输出：</b>1478
 <b>解释：</b>总共有 4 个整数 i 满足要求：
 - 1 ，因为 1 * 1 = 1
 - 9 ，因为 9 * 9 = 81 ，且 81 可以分割成 8 + 1 。
 - 10 ，因为 10 * 10 = 100 ，且 100 可以分割成 10 + 0 。
 - 36 ，因为 36 * 36 = 1296 ，且 1296 可以分割成 1 + 29 + 6 。
 因此，37 的惩罚数为 1 + 81 + 100 + 1296 = 1478
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= n &lt;= 1000</code></li>
 </ul>
 */
public class FindThePunishmentNumberOfAnInteger {
    private static Map<Integer, Boolean> map = new HashMap<>();

    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (cacheCheck(i)) sum += i * i;
        }
        return sum;
    }

    private boolean cacheCheck(int i) {
        return map.computeIfAbsent(i, (key) -> check(key * key, key));
    }

    private boolean check(int value, int t) {
        if (t < 0) return false;
        if (value == t) return true;

        int temp = 10;
        while (value > t) {
            int z = value % temp;
            if (z > t) break;
            if (check(value / temp, t - z)) return true;

            temp *= 10;
        }
        return false;
    }
}
