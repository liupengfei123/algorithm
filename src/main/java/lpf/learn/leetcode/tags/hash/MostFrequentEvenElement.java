package lpf.learn.leetcode.tags.hash;

import java.util.HashMap;
import java.util.Map;

/** 2404 出现最频繁的偶数元素
 <p>给你一个整数数组 <code>nums</code> ，返回出现最频繁的偶数元素。</p>
 <p>如果存在多个满足条件的元素，只需要返回 <strong>最小</strong> 的一个。如果不存在这样的元素，返回 <code>-1</code> 。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>nums = [0,1,2,2,4,4,1]
 <strong>输出：</strong>2
 <strong>解释：</strong>
 数组中的偶数元素为 0、2 和 4 ，在这些元素中，2 和 4 出现次数最多。
 返回最小的那个，即返回 2 。</pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>nums = [4,4,4,9,2,4]
 <strong>输出：</strong>4
 <strong>解释：</strong>4 是出现最频繁的偶数元素。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>nums = [29,47,21,41,13,37,25,7]
 <strong>输出：</strong>-1
 <strong>解释：</strong>不存在偶数元素。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 2000</code></li>
 <li><code>0 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
 </ul>
 */
public class MostFrequentEvenElement {

    public int mostFrequentEven(int[] nums) {
        int[] cnt = new int[50001];
        int res = -1, max = 0;
        for (int n : nums) {
            if ((n & 1) == 1) continue;

            int cur = ++cnt[n >> 1];
            if (cur > max) {
                res = n;
                max = cur;
            } else if (cur == max && n < res) res = n;
        }
        return res;
    }
    public int mostFrequentEven3(int[] nums) {
        int[] counts = new int[100010];

        for (int num : nums) counts[num]++;

        int v = 0, c = 0;
        for (int i = 0; i < counts.length; i += 2) {
            if (counts[i] > c) {
                v = i;
                c = counts[i];
            }
        }
        return v;
    }

    public int mostFrequentEven2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if ((num & 1) == 0) map.merge(num, 1, Integer::sum);
        }
        if (map.size() == 0) return -1;

        int v = 0, c = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int tempK = entry.getKey(), tempC = entry.getValue();
            if (tempC > c) {
                v = tempK;
                c = tempC;
            } else if (tempC == c) {
                v = Math.min(v, tempK);
            }
        }
        return v;
    }

}
