package lpf.learn.leetcode.tags.greedy;

/**
 * 670 最大交换
 * <p>给定一个非负整数，你<strong>至多</strong>可以交换一次数字中的任意两位。返回你能得到的最大值。</p>
 * <p><strong>示例 1 :</strong></p>
 * <pre>
 * <strong>输入:</strong> 2736
 * <strong>输出:</strong> 7236
 * <strong>解释:</strong> 交换数字2和数字7。
 * </pre>
 *
 * <p><strong>示例 2 :</strong></p>
 * <pre>
 * <strong>输入:</strong> 9973
 * <strong>输出:</strong> 9973
 * <strong>解释:</strong> 不需要交换。
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 * <ol>
 * <li>给定数字的范围是&nbsp;[0, 10<sup>8</sup>]</li>
 * </ol>
 */
public class MaximumSwap {

    public int maximumSwap(int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        int n = charArray.length;
        int maxIdx = n - 1;
        int idx1 = -1, idx2 = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (charArray[i] > charArray[maxIdx]) {
                maxIdx = i;
            } else if (charArray[i] < charArray[maxIdx]) {
                idx1 = i;
                idx2 = maxIdx;
            }
        }
        if (idx1 >= 0) {
            swap(charArray, idx1, idx2);
            return Integer.parseInt(new String(charArray));
        } else {
            return num;
        }
    }


    public int maximumSwap2(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i++) {
            int ti = -1;
            char c = chars[i];
            for (int j = n - 1; j > i; j--) {
                if (c < chars[j] && (ti < 0 || chars[ti] < chars[j])) ti = j;
            }
            if (ti > 0) {
                swap(chars, i, ti);
                break;
            }
        }
        return Integer.parseInt(new String(chars));
    }



    private void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}
