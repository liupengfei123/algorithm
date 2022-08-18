package lpf.learn.leetcode.tags.hash;

import java.util.HashMap;
import java.util.Map;

/** 1224 最大相等频率
 <p>给你一个正整数数组&nbsp;<code>nums</code>，请你帮忙从该数组中找出能满足下面要求的 <strong>最长</strong> 前缀，并返回该前缀的长度：</p>
 <ul>
 <li>从前缀中 <strong>恰好删除一个</strong> 元素后，剩下每个数字的出现次数都相同。</li>
 </ul>
 <p>如果删除这个元素后没有剩余元素存在，仍可认为每个数字都具有相同的出现次数（也就是 0 次）。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [2,2,1,1,5,3,3,5]
 <strong>输出：</strong>7
 <strong>解释：</strong>对于长度为 7 的子数组 [2,2,1,1,5,3,3]，如果我们从中删去 nums[4] = 5，就可以得到 [2,2,1,1,3,3]，里面每个数字都出现了两次。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [1,1,1,2,2,2,3,3,3,4,4,4,5]
 <strong>输出：</strong>13
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>2 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
 </ul>
 */
public class MaximumEqualFrequency {
    public int maxEqualFreq(int[] nums) {
        Map<Integer, Integer> numToCount = new HashMap<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        int result = 0;
        int index = 0;
        for (int num : nums) {
            index++;
            numToCount.merge(num, 1, Integer::sum);

            Integer count = numToCount.get(num);

            if (count > 1) {
                countMap.merge(count - 1, -1, (oldValue, value) -> {
                    if (oldValue == 1) {
                        return null;
                    }
                    return oldValue + value;
                });
            }
            countMap.merge(count, 1, Integer::sum);

            if (countMap.size() < 3) {
                int key1 = 0, value1 = 0;
                int key2 = 0, value2 = 0;

                for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                    if (key1 == 0) {
                        key1 = entry.getKey();
                        value1 = entry.getValue();
                    } else {
                        key2 = entry.getKey();
                        value2 = entry.getValue();
                    }
                }
                if ((key1 == 1 && value1 == 1)
                        || (key2 == 1 && value2 == 1)
                        || (value1 == 1 && key1 - key2 == 1)
                        || (value2 == 1 && key2 - key1 == 1)
                        || (key2 == 0 && (value1 == 1 || key1 == 1))) {
                    result = index;
                }
            }
        }
        return result;
    }
}
