package lpf.learn.leetcode.tags.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 1769 移动所有球到每个盒子所需的最小操作数
 * <p>有 <code>n</code> 个盒子。给你一个长度为 <code>n</code> 的二进制字符串 <code>boxes</code> ，其中 <code>boxes[i]</code> 的值为 <code>'0'</code> 表示第 <code>i</code> 个盒子是 <strong>空</strong> 的，而 <code>boxes[i]</code> 的值为 <code>'1'</code> 表示盒子里有 <strong>一个</strong> 小球。</p>
 * <p>在一步操作中，你可以将 <strong>一个</strong> 小球从某个盒子移动到一个与之相邻的盒子中。第 <code>i</code> 个盒子和第 <code>j</code> 个盒子相邻需满足 <code>abs(i - j) == 1</code> 。注意，操作执行后，某些盒子中可能会存在不止一个小球。</p>
 * <p>返回一个长度为 <code>n</code> 的数组 <code>answer</code> ，其中 <code>answer[i]</code> 是将所有小球移动到第 <code>i</code> 个盒子所需的 <strong>最小</strong> 操作数。</p>
 * <p>每个 <code>answer[i]</code> 都需要根据盒子的 <strong>初始状态</strong> 进行计算。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre><strong>输入：</strong>boxes = "110"
 * <strong>输出：</strong>[1,1,3]
 * <strong>解释：</strong>每个盒子对应的最小操作数如下：
 * 1) 第 1 个盒子：将一个小球从第 2 个盒子移动到第 1 个盒子，需要 1 步操作。
 * 2) 第 2 个盒子：将一个小球从第 1 个盒子移动到第 2 个盒子，需要 1 步操作。
 * 3) 第 3 个盒子：将一个小球从第 1 个盒子移动到第 3 个盒子，需要 2 步操作。将一个小球从第 2 个盒子移动到第 3 个盒子，需要 1 步操作。共计 3 步操作。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre><strong>输入：</strong>boxes = "001011"
 * <strong>输出：</strong>[11,8,5,4,3,4]</pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * <li><code>n == boxes.length</code></li>
 * <li><code>1 &lt;= n &lt;= 2000</code></li>
 * <li><code>boxes[i]</code> 为 <code>'0'</code> 或 <code>'1'</code></li>
 * </ul>
 */
public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {

    public int[] minOperations(String boxes) {
        int n = boxes.length(), oneCount = boxes.charAt(0) - '0';

        int[] result = new int[n];
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + oneCount;

            if (boxes.charAt(i) == '1') oneCount++;
        }
        oneCount = boxes.charAt(n - 1) - '0';
        int[] result2 = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            result2[i] = result2[i + 1] + oneCount;

            if (boxes.charAt(i) == '1') oneCount++;
        }

        for (int i = 0; i < n; i++) {
            result[i] += result2[i];
        }
        return result;
    }

    public int[] minOperations2(String boxes) {
        int left = boxes.charAt(0) - '0', right = 0, operations = 0;
        int n = boxes.length();
        for (int i = 1; i < n; i++) {
            if (boxes.charAt(i) == '1') {
                right++;
                operations += i;
            }
        }
        int[] res = new int[n];
        res[0] = operations;
        for (int i = 1; i < n; i++) {
            operations += left - right;
            if (boxes.charAt(i) == '1') {
                left++;
                right--;
            }
            res[i] = operations;
        }
        return res;
    }

    public int[] minOperations3(String boxes) {
        int n = boxes.length();
        List<Integer> indexs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (boxes.charAt(i) == '1') indexs.add(i);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            for (Integer index : indexs) {
                result[i] += Math.abs(i - index);
            }
        }
        return result;
    }

}
