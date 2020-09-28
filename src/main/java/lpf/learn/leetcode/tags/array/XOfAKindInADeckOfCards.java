package lpf.learn.leetcode.tags.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** [914]卡牌分组
 * 给定一副牌，每张牌上都写着一个整数。
 * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 * 每组都有 X 张牌。
 * 组内所有的牌上都写着相同的整数。
 * 仅当你可选的 X >= 2 时返回 true。
 *
 * 示例 1：
 * 输入：[1,2,3,4,4,3,2,1]
 * 输出：true
 * 解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
 *
 * 示例 2：
 * 输入：[1,1,1,2,2,2,3,3]
 * 输出：false
 * 解释：没有满足要求的分组。
 *
 * 示例 3：
 * 输入：[1]
 * 输出：false
 * 解释：没有满足要求的分组。
 *
 * 示例 4：
 * 输入：[1,1]
 * 输出：true
 * 解释：可行的分组是 [1,1]
 *
 * 示例 5：
 * 输入：[1,1,2,2,2,2]
 * 输出：true
 * 解释：可行的分组是 [1,1]，[2,2]，[2,2]
 *
 * 提示：
 * 1 <= deck.length <= 10000
 * 0 <= deck[i] < 10000
 */
public class XOfAKindInADeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : deck) {
            map.merge(i, 1, Integer::sum);
        }
        int factor = 0;
        for (Integer value : map.values()) {
            factor = gcd(factor, value);
        }
        return factor >= 2;
    }

    private int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }



    public boolean hasGroupsSizeX2(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : deck) {
            map.merge(i, 1, Integer::sum);
        }
        List<Integer> counts = new ArrayList<>(map.values());

        Collections.sort(counts);
        Set<Integer> factors = getFactors(counts.get(0));
        out:
        for (Integer factor: factors ) {
            for (Integer count : counts) {
                if (count % factor != 0) {
                    continue out;
                }
            }
            return true;
        }
        return false;
    }
    private Set<Integer> getFactors(int value) {
        Set<Integer> set = new HashSet<>();
        if (value <= 1) {
            return set;
        }
        for (int i = 2; i <= value; i++) {
            if (value % i == 0) {
                set.add(i);
            }
        }
        return set;
    }


}
