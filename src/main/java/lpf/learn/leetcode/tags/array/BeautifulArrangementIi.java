package lpf.learn.leetcode.tags.array;


import java.util.Arrays;

/**
 * 667 优美的排列 II
 * <p>给你两个整数 <code>n</code> 和 <code>k</code> ，请你构造一个答案列表 <code>answer</code> ，该列表应当包含从 <code>1</code> 到 <code>n</code> 的 <code>n</code> 个不同正整数，并同时满足下述条件：</p>
 * <ul>
 * <li>假设该列表是 <code>answer = [a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub>, ... , a<sub>n</sub>]</code> ，那么列表 <code>[|a<sub>1</sub> - a<sub>2</sub>|, |a<sub>2</sub> - a<sub>3</sub>|, |a<sub>3</sub> - a<sub>4</sub>|, ... , |a<sub>n-1</sub> - a<sub>n</sub>|]</code> 中应该有且仅有 <code>k</code> 个不同整数。</li>
 * </ul>
 * <p>返回列表 <code>answer</code> 。如果存在多种答案，只需返回其中 <strong>任意一种</strong> 。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <strong>输入：</strong>n = 3, k = 1
 * <strong>输出：</strong>[1, 2, 3]
 * <strong>解释：</strong>[1, 2, 3] 包含 3 个范围在 1-3 的不同整数，并且 [1, 1] 中有且仅有 1 个不同整数：1
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre>
 * <strong>输入：</strong>n = 3, k = 2
 * <strong>输出：</strong>[1, 3, 2]
 * <strong>解释：</strong>[1, 3, 2] 包含 3 个范围在 1-3 的不同整数，并且 [2, 1] 中有且仅有 2 个不同整数：1 和 2
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * <li><code>1 <= k < n <= 10<sup>4</sup></code></li>
 * </ul>
 */
public class BeautifulArrangementIi {

    public int[] constructArray(int n, int k) {
        int[] result = new int[n];
        int idx = 0;
        for (int i = 1, j = k + 1; i <= j; ++i, --j) {
            result[idx++] = i;
            if (i != j) result[idx++] = j;
        }

        for (int i = idx; i < n; ++i) {
            result[i] = i + 1;
        }
        return result;
    }

    public int[] constructArray3(int n, int k) {
        int[] result = new int[n];
        Arrays.setAll(result, i -> i + 1);

        for (int idx = 0, i = 1, j = k + 1; i <= j; ++i, --j) {
            result[idx++] = i;
            if (i != j) result[idx++] = j;
        }
        return result;
    }

    public int[] constructArray2(int n, int k) {
        int[] result = new int[n];
        Arrays.setAll(result, i -> i + 1);

        for (int i = k; i > 0; i--) {
            for (int j = k - i + 1, z = k; j < z; j++, z--) {
                int temp = result[j];
                result[j] = result[z];
                result[z] = temp;
            }
        }
        return result;
    }
}
