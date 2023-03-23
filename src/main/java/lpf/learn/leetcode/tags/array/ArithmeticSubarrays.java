package lpf.learn.leetcode.tags.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 1630 等差子数组
 <p>如果一个数列由至少两个元素组成，且每两个连续元素之间的差值都相同，那么这个序列就是 <strong>等差数列</strong> 。更正式地，数列 <code>s</code> 是等差数列，只需要满足：对于每个有效的 <code>i</code> ， <code>s[i+1] - s[i] == s[1] - s[0]</code> 都成立。</p>
 <p>例如，下面这些都是 <strong>等差数列</strong> ：</p>
 <pre>1, 3, 5, 7, 9
 7, 7, 7, 7
 3, -1, -5, -9</pre>
 <p>下面的数列 <strong>不是等差数列</strong> ：</p>
 <pre>1, 1, 2, 5, 7</pre>
 <p>给你一个由 <code>n</code> 个整数组成的数组 <code>nums</code>，和两个由 <code>m</code> 个整数组成的数组 <code>l</code> 和 <code>r</code>，后两个数组表示 <code>m</code> 组范围查询，其中第 <code>i</code> 个查询对应范围 <code>[l[i], r[i]]</code> 。所有数组的下标都是 <strong>从 0 开始</strong> 的。</p>
 <p>返回<em> </em><code>boolean</code> 元素构成的答案列表 <code>answer</code> 。如果子数组 <code>nums[l[i]], nums[l[i]+1], ... , nums[r[i]]</code> 可以 <strong>重新排列</strong> 形成 <strong>等差数列</strong> ，<code>answer[i]</code> 的值就是 <code>true</code>；否则<code>answer[i]</code> 的值就是 <code>false</code> 。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>nums = <code>[4,6,5,9,3,7]</code>, l = <code>[0,0,2]</code>, r = <code>[2,3,5]</code>
 <strong>输出：</strong><code>[true,false,true]</code>
 <strong>解释：</strong>
 第 0 个查询，对应子数组 [4,6,5] 。可以重新排列为等差数列 [6,5,4] 。
 第 1 个查询，对应子数组 [4,6,5,9] 。无法重新排列形成等差数列。
 第 2 个查询，对应子数组 <code>[5,9,3,7] 。</code>可以重新排列为等差数列 <code>[3,5,7,9] 。</code></pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>nums = [-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10], l = [0,1,6,4,8,7], r = [4,4,9,7,9,10]
 <strong>输出：</strong>[false,true,false,false,true,true]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == nums.length</code></li>
 <li><code>m == l.length</code></li>
 <li><code>m == r.length</code></li>
 <li><code>2 &lt;= n &lt;= 500</code></li>
 <li><code>1 &lt;= m &lt;= 500</code></li>
 <li><code>0 &lt;= l[i] &lt; r[i] &lt; n</code></li>
 <li><code>-10<sup>5</sup> &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
 </ul>
 */
public class ArithmeticSubarrays {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int m = l.length;

        List<Boolean> res = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            int li = l[i], ri = r[i];

            int[] arr = new int[ri - li + 1];
            System.arraycopy(nums, li, arr, 0, arr.length);

            Arrays.sort(arr);
            res.add(checkArithmetic(arr));
        }
        return res;
    }

    private boolean checkArithmetic(int[] array) {
        int diff = array[1] - array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }


    private Boolean check(int[] nums, int l, int r) {
        int min = nums[l], max = nums[r];
        for (int i = l; i <= r; ++i) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        if (min == max) return true;
        if ((max-min) % (r-l) != 0) return false;
        int d = (max-min)/(r-l);
        boolean[] dict = new boolean[r-l+1];
        for (int i = l; i <= r; ++i) {
            if ((nums[i] - min) % d != 0) return false;
            int j = (nums[i] - min) / d;
            if (dict[j]) return false;
            dict[j] = true;
        }
        return true;
    }
}
