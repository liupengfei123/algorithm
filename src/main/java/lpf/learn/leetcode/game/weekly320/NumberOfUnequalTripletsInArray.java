package lpf.learn.leetcode.game.weekly320;

import java.util.*;


/** [2475] 数组中不等三元组的数目
 <p>给你一个下标从 <strong>0</strong> 开始的正整数数组 <code>nums</code> 。请你找出并统计满足下述条件的三元组 <code>(i, j, k)</code> 的数目：</p>
 <ul>
 <li><code>0 &lt;= i &lt; j &lt; k &lt; nums.length</code></li>
 <li><code>nums[i]</code>、<code>nums[j]</code> 和 <code>nums[k]</code> <strong>两两不同</strong> 。
 <ul>
 <li>换句话说：<code>nums[i] != nums[j]</code>、<code>nums[i] != nums[k]</code> 且 <code>nums[j] != nums[k]</code> 。</li>
 </ul>
 </li>
 </ul>

 <p>返回满足上述条件三元组的数目<em>。</em></p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [4,4,2,4,3]
 <strong>输出：</strong>3
 <strong>解释：</strong>下面列出的三元组均满足题目条件：
 - (0, 2, 4) 因为 4 != 2 != 3
 - (1, 2, 4) 因为 4 != 2 != 3
 - (2, 3, 4) 因为 2 != 4 != 3
 共计 3 个三元组，返回 3 。
 注意 (2, 0, 4) 不是有效的三元组，因为 2 &gt; 0 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,1,1,1,1]
 <strong>输出：</strong>0
 <strong>解释：</strong>不存在满足条件的三元组，所以返回 0 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>3 &lt;= nums.length &lt;= 100</code></li>
 <li><code>1 &lt;= nums[i] &lt;= 1000</code></li>
 </ul>
 */
public class NumberOfUnequalTripletsInArray {
    public int unequalTriplets(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) count.merge(num, 1, Integer::sum);

        if (count.size() < 3)  return 0;

        int result = 0;
        List<Integer> values = new ArrayList<>(count.values());

        int size = values.size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int z = j + 1; z < size; z++) {
                    result += values.get(i) * values.get(j) * values.get(z);
                }
            }
        }
        return result;
    }
}
