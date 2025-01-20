package lpf.learn.leetcode.tags.bitoperation;

/** 2917 找出数组中的 K-or 值
 <p>给你一个整数数组 <code>nums</code> 和一个整数 <code>k</code> 。让我们通过扩展标准的按位或来介绍 <strong>K-or</strong> 操作。在 K-or 操作中，如果在 <code>nums</code> 中，至少存在 <code>k</code> 个元素的第 <code>i</code> 位值为 1 ，那么 K-or 中的第 <code>i</code> 位的值是 1 。</p>
 <p>返回 <code>nums</code> 的 <strong>K-or</strong> 值。</p>

 <p><strong class="example">示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [7,12,9,8,9,15], k = 4
 <strong>输出：</strong>9
 <strong>解释：</strong>
 用二进制表示 numbers：
 </pre>

 <table style="text-indent:10px; margin-bottom=20px;">
 <tbody>
 <tr>
 <th><b>Number</b></th>
 <th>Bit 3</th>
 <th>Bit 2</th>
 <th>Bit 1</th>
 <th>Bit 0</th>
 </tr>
 <tr>
 <td><b>7</b></td>
 <td>0</td>
 <td>1</td>
 <td>1</td>
 <td>1</td>
 </tr>
 <tr>
 <td><b>12</b></td>
 <td>1</td>
 <td>1</td>
 <td>0</td>
 <td>0</td>
 </tr>
 <tr>
 <td><b>9</b></td>
 <td>1</td>
 <td>0</td>
 <td>0</td>
 <td>1</td>
 </tr>
 <tr>
 <td><b>8</b></td>
 <td>1</td>
 <td>0</td>
 <td>0</td>
 <td>0</td>
 </tr>
 <tr>
 <td><b>9</b></td>
 <td>1</td>
 <td>0</td>
 <td>0</td>
 <td>1</td>
 </tr>
 <tr>
 <td><b>15</b></td>
 <td>1</td>
 <td>1</td>
 <td>1</td>
 <td>1</td>
 </tr>
 <tr>
 <td><b>Result = 9</b></td>
 <td>1</td>
 <td>0</td>
 <td>0</td>
 <td>1</td>
 </tr>
 </tbody>
 </table>

 <pre>
 位 0 在 7, 9, 9, 15 中为 1。位 3 在 12, 9, 8, 9, 15 中为 1。 只有位 0 和 3 满足。结果是 (1001)<sub>2</sub> = 9。
 </pre>

 <p><strong class="example">示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [2,12,1,11,4,5], k = 6
 <strong>输出：</strong>0
 <strong>解释：</strong>没有位在所有 6 个数字中都为 1，如 k = 6 所需要的。所以，答案为 0。
 </pre>

 <p><strong class="example">示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [10,8,5,9,11,6,8], k = 1
 <strong>输出：</strong>15
 <strong>解释：</strong>因为 k == 1 ，数组的 1-or 等于其中所有元素按位或运算的结果。因此，答案为 10 OR 8 OR 5 OR 9 OR 11 OR 6 OR 8 = 15 。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 50</code></li>
 <li><code>0 &lt;= nums[i] &lt; 2<sup>31</sup></code></li>
 <li><code>1 &lt;= k &lt;= nums.length</code></li>
 </ul>
 */
public class FindTheKOrOfAnArray {
    public int findKOr(int[] nums, int k) {
        int[] cnt = new int[31];
        for (int num : nums) {
            for (int i = 0; i < 31 && num > 0; i++, num >>= 1) {
                if ((num & 1) ==1) cnt[i]++;
            }
        }
        int res = 0;
        for (int i = 30; i >= 0; i--, res <<= 1) {
            if (cnt[i] >= k) res |= 1;
        }
        return res;
    }
}
