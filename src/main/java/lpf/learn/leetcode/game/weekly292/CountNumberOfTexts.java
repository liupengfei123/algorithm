package lpf.learn.leetcode.game.weekly292;

import java.util.HashMap;
import java.util.Map;

/** 6058. 统计打字方案数
 * Alice 在给 Bob 用手机打字。数字到字母的 对应 如下图所示。
 * 为了 打出 一个字母，Alice 需要 按 对应字母 i 次，i 是该字母在这个按键上所处的位置。
 * 比方说，为了按出字母 's' ，Alice 需要按 '7' 四次。类似的， Alice 需要按 '5' 两次得到字母  'k' 。
 * 注意，数字 '0' 和 '1' 不映射到任何字母，所以 Alice 不 使用它们。
 * 但是，由于传输的错误，Bob 没有收到 Alice 打字的字母信息，反而收到了 按键的字符串信息 。
 * 比方说，Alice 发出的信息为 "bob" ，Bob 将收到字符串 "2266622" 。
 * 给你一个字符串 pressedKeys ，表示 Bob 收到的字符串，请你返回 Alice 总共可能发出多少种文字信息 。
 * 由于答案可能很大，将它对 109 + 7 取余 后返回。
 *
 * 示例 1：
 * 输入：pressedKeys = "22233"
 * 输出：8
 * 解释：
 * Alice 可能发出的文字信息包括：
 * "aaadd", "abdd", "badd", "cdd", "aaae", "abe", "bae" 和 "ce" 。
 * 由于总共有 8 种可能的信息，所以我们返回 8 。
 *
 * 示例 2：
 * 输入：pressedKeys = "222222222222222222222222222222222222"
 * 输出：82876089
 * 解释：
 * 总共有 2082876103 种 Alice 可能发出的文字信息。
 * 由于我们需要将答案对 109 + 7 取余，所以我们返回 2082876103 % (109 + 7) = 82876089 。
 *
 * 提示：
 * 1 <= pressedKeys.length <= 10^5
 * pressedKeys 只包含数字 '2' 到 '9' 。
 */
public class CountNumberOfTexts {
    private final int mid = 1000_000_007;
    private Map<Integer, Integer> threeDp;
    private Map<Integer, Integer> fourDp;


    public int countTexts(String pressedKeys) {
        this.threeDp = new HashMap<>();
        threeDp.put(1, 1);
        threeDp.put(2, 2);
        threeDp.put(3, 4);

        this.fourDp = new HashMap<>();
        fourDp.put(1, 1);
        fourDp.put(2, 2);
        fourDp.put(3, 4);
        fourDp.put(4, 8);

        long result = 1;

        int lastCount = 1;
        char lastC = pressedKeys.charAt(0);

        for (int i = 1; i < pressedKeys.length(); i++) {
            char c = pressedKeys.charAt(i);

            if (c == lastC) {
                lastCount++;
            }

            if (c != lastC || i == pressedKeys.length() - 1) {
                int value;
                if (lastC == '7' || lastC == '9') {
                    value = help2(lastCount);
                } else {
                    value = help1(lastCount);
                }
                result = (result * value) % mid;

                lastC = c;
                lastCount = 1;
            }
        }

        return (int) result;
    }

    // 2 到 6 ， 8
    private int help1(int count) {
        if (count < 0) {
            return 0;
        }
        Integer value = threeDp.get(count);
        if (value != null) {
            return value;
        }
        int sum = help1(count - 3) % mid;
        sum = (sum + help1(count - 2)) % mid;
        sum = (sum + help1(count - 1)) % mid;

        threeDp.put(count, sum);
        return sum;
    }

    // 7 和 9
    private int help2(int count) {
        if (count < 0) {
            return 0;
        }
        Integer value = fourDp.get(count);
        if (value != null) {
            return value;
        }
        int sum = help2(count - 4) % mid;
        sum = (sum + help2(count - 3)) % mid;
        sum = (sum + help2(count - 2)) % mid;
        sum = (sum + help2(count - 1)) % mid;

        fourDp.put(count, sum);
        return sum;
    }
}
