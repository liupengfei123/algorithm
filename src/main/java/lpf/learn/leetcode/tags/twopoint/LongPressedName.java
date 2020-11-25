package lpf.learn.leetcode.tags.twopoint;

/** [925]长按键入
 * 你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。
 * 你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
 *
 * 示例 1：
 * 输入：name = "alex", typed = "aaleex"
 * 输出：true
 * 解释：'alex' 中的 'a' 和 'e' 被长按。
 *
 * 示例 2：
 * 输入：name = "saeed", typed = "ssaaedd"
 * 输出：false
 * 解释：'e' 一定需要被键入两次，但在 typed 的输出中不是这样。
 *
 * 示例 3：
 * 输入：name = "leelee", typed = "lleeelee"
 * 输出：true
 *
 * 示例 4：
 * 输入：name = "laiden", typed = "laiden"
 * 输出：true
 * 解释：长按名字中的字符并不是必要的。
 *
 * 提示：
 * name.length <= 1000
 * typed.length <= 1000
 * name 和 typed 的字符都是小写字母。
 */
public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        if (name.equals(typed)) {
            return true;
        }

        int fast = 0, slow = 0;
        char lastChar = '.';
        while (slow < name.length() && fast < typed.length()) {
            if (name.charAt(slow) != typed.charAt(fast)) {
                // 检查是否被长按的
                if (typed.charAt(fast) != lastChar) {
                    return false;
                } else {
                    fast++;
                    continue;
                }
            }
            lastChar = name.charAt(slow);
            slow++;
            fast++;
        }
        // 如果 name 还没有比对完成，说明一定不对，typed在结尾没有输入
        if (slow < name.length()) {
            return false;
        }
        // 如果 typed 还没有比对完成，需要之后的字符全部于 name 最后的字符相同
        while (fast < typed.length()) {
            if (lastChar != typed.charAt(fast++)) {
                return false;
            }
        }
        return true;
    }
}
