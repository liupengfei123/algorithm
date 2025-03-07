package lpf.learn.leetcode.tags.bitoperation;


/** 136 只出现一次的数字
 <p>给你一个 <strong>非空</strong> 整数数组 <code>nums</code> ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。</p>
 <p>你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。</p>

 <p><strong class="example">示例 1 ：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong>nums = [2,2,1]</p>
 </div>
 <p><strong>输出：</strong>1</p>

 <p><strong class="example">示例 2 ：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong>nums = [4,1,2,1,2]</p>
 </div>

 <p><strong>输出：</strong>4</p>
 <p><strong class="example">示例 3 ：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong>nums = [1]</p>
 </div>
 <p><strong>输出：</strong>1</p>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 3 * 10<sup>4</sup></code></li>
 <li><code>-3 * 10<sup>4</sup> &lt;= nums[i] &lt;= 3 * 10<sup>4</sup></code></li>
 <li>除了某个元素只出现一次以外，其余每个元素均出现两次。</li>
 </ul>
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
