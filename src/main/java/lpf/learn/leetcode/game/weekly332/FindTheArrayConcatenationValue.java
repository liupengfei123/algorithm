package lpf.learn.leetcode.game.weekly332;


/** [2562] 找出数组的串联值
 <p>给你一个下标从 <strong>0</strong> 开始的整数数组&nbsp;<code>nums</code> 。</p>
 <p>现定义两个数字的 <strong>串联</strong>&nbsp;是由这两个数值串联起来形成的新数字。</p>
 <ul>
 <li>例如，<code>15</code><span style="">&nbsp;和&nbsp;</span><code>49</code>&nbsp;的串联是&nbsp;<code>1549</code> 。</li>
 </ul>
 <p><code>nums</code>&nbsp;的 <strong>串联值</strong>&nbsp;最初等于 <code>0</code> 。执行下述操作直到&nbsp;<code>nums</code>&nbsp;变为空：</p>
 <ul>
 <li>如果&nbsp;<code>nums</code>&nbsp;中存在不止一个数字，分别选中 <code>nums</code> 中的第一个元素和最后一个元素，将二者串联得到的值加到&nbsp;<code>nums</code>&nbsp;的 <strong>串联值</strong> 上，然后从&nbsp;<code>nums</code>&nbsp;中删除第一个和最后一个元素。</li>
 <li>如果仅存在一个元素，则将该元素的值加到&nbsp;<code>nums</code> 的串联值上，然后删除这个元素。</li>
 </ul>

 <p>返回执行完所有操作后<em>&nbsp;</em><code>nums</code> 的串联值。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>nums = [7,52,2,4]
 <b>输出：</b>596
 <b>解释：</b>在执行任一步操作前，nums 为 [7,52,2,4] ，串联值为 0 。
 - 在第一步操作中：
 我们选中第一个元素 7 和最后一个元素 4 。
 二者的串联是 74 ，将其加到串联值上，所以串联值等于 74 。
 接着我们从 nums 中移除这两个元素，所以 nums 变为 [52,2] 。
 - 在第二步操作中：
 我们选中第一个元素 52 和最后一个元素 2 。
 二者的串联是 522 ，将其加到串联值上，所以串联值等于 596 。
 接着我们从 nums 中移除这两个元素，所以 nums 变为空。
 由于串联值等于 596 ，所以答案就是 596 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>nums = [5,14,13,8,12]
 <b>输出：</b>673
 <b>解释：</b>在执行任一步操作前，nums 为 [5,14,13,8,12] ，串联值为 0 。
 - 在第一步操作中：
 我们选中第一个元素 5 和最后一个元素 12 。
 二者的串联是 512 ，将其加到串联值上，所以串联值等于 512 。
 接着我们从 nums 中移除这两个元素，所以 nums 变为 [14,13,8] 。
 - 在第二步操作中：
 我们选中第一个元素 14 和最后一个元素 8 。
 二者的串联是 148 ，将其加到串联值上，所以串联值等于 660 。
 接着我们从 nums 中移除这两个元素，所以 nums 变为 [13] 。
 - 在第三步操作中：
 nums 只有一个元素，所以我们选中 13 并将其加到串联值上，所以串联值等于 673 。
 接着我们从 nums 中移除这个元素，所以 nums 变为空。
 由于串联值等于 673 ，所以答案就是 673 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 1000</code></li>
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
 </ul>
 */
public class FindTheArrayConcatenationValue {

    public long findTheArrayConcVal(int[] nums) {
        long res = 0;
        int begin = 0, end = nums.length - 1;

        while (begin < end) {
            long c = nums[begin];

            int temp = nums[end];
            while (temp > 0) {
                c *= 10;
                temp /= 10;
            }

            c += nums[end];
            res += c;

            begin++;
            end--;
        }
        if (begin == end) res += nums[begin];

        return res;
    }
}
