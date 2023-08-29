package lpf.learn.leetcode.tags.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** 823 带因子的二叉树
 <p>给出一个含有不重复整数元素的数组 <code>arr</code> ，每个整数 <code>arr[i]</code> 均大于 1。</p>
 <p>用这些整数来构建二叉树，每个整数可以使用任意次数。其中：每个非叶结点的值应等于它的两个子结点的值的乘积。</p>
 <p>满足条件的二叉树一共有多少个？答案可能很大，返回<strong> 对 </strong><code>10<sup>9</sup> + 7</code> <strong>取余</strong> 的结果。</p>

 <p><strong>示例 1:</strong></p>
 <pre>
 <strong>输入:</strong> <code>arr = [2, 4]</code>
 <strong>输出:</strong> 3
 <strong>解释:</strong> 可以得到这些二叉树: <code>[2], [4], [4, 2, 2]</code></pre>

 <p><strong>示例 2:</strong></p>
 <pre>
 <strong>输入:</strong> <code>arr = [2, 4, 5, 10]</code>
 <strong>输出:</strong> <code>7</code>
 <strong>解释:</strong> 可以得到这些二叉树: <code>[2], [4], [5], [10], [4, 2, 2], [10, 2, 5], [10, 5, 2]</code>.</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= arr.length &lt;= 1000</code></li>
 <li><code>2 &lt;= arr[i] &lt;= 10<sup>9</sup></code></li>
 <li><code>arr</code> 中的所有值 <strong>互不相同</strong></li>
 </ul>
 */
public class BinaryTreesWithFactors {
    private static final int MOD = 1000_000_007;

    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        Map<Integer, Long> map = new HashMap<>();
        long res = 0;
        for (int i = 0; i < n; i++) {
            long v = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] != 0) continue;

                Long temp = map.get(arr[i] / arr[j]);
                if (temp != null) v += temp * map.get(arr[j]);
            }
            res = (res + v) % MOD;
            map.put(arr[i], v);
        }
        return (int) (res % MOD);
    }
}
