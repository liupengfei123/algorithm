package lpf.learn.leetcode.tags.bitoperation;

/** 3153 所有数对中数位差之和
 <p>你有一个数组&nbsp;<code>nums</code>&nbsp;，它只包含 <strong>正</strong>&nbsp;整数，所有正整数的数位长度都 <strong>相同</strong>&nbsp;。</p>
 <p>两个整数的 <strong>数位差</strong>&nbsp;指的是两个整数 <b>相同</b>&nbsp;位置上不同数字的数目。</p>
 <p>请你返回 <code>nums</code>&nbsp;中 <strong>所有</strong>&nbsp;整数对里，<strong>数位差之和。</strong></p>

 <p><strong class="example">示例 1：</strong></p>
 <div class="example-block">
 <p><span class="example-io"><b>输入：</b>nums = [13,23,12]</span></p>
 </div>
 <p><b>输出：</b>4</p>
 <p><strong>解释：</strong><br /> 计算过程如下：<br /> -&nbsp;<strong>1</strong>3 和&nbsp;<strong>2</strong>3 的数位差为&nbsp;1 。<br /> - 1<strong>3</strong> 和 1<strong>2</strong>&nbsp;的数位差为&nbsp;1 。<br /> -&nbsp;<strong>23</strong> 和&nbsp;<strong>12</strong>&nbsp;的数位差为&nbsp;2 。<br /> 所以所有整数数对的数位差之和为&nbsp;<code>1 + 1 + 2 = 4</code>&nbsp;。</p>

 <p><strong class="example">示例 2：</strong></p>
 <div class="example-block">
 <p><span class="example-io"><b>输入：</b>nums = [10,10,10,10]</span></p>
 </div>
 <p><span class="example-io"><b>输出：</b>0</span></p>
 <p><strong>解释：</strong><br /> 数组中所有整数都相同，所以所有整数数对的数位不同之和为 0 。</p>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>2 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= nums[i] &lt; 10<sup>9</sup></code></li>
 <li><code>nums</code>&nbsp;中的整数都有相同的数位长度。</li>
 </ul>
 */
public class SumOfDigitDifferencesOfAllPairs {
    public long sumDigitDifferences(int[] nums) {
        int l = Integer.toString(nums[0]).length();

        int[][] cnts = new int[l][10];
        for (int num : nums) {
            for (int i = 0; i < l; i++, num /= 10) cnts[i][num % 10]++;
        }

        long res = 0;
        for (int[] cnt : cnts) {
            for (int i = 0, c = 0; i < 10; c += cnt[i], i++)
                res += (long) c * cnt[i];
        }
        return res;
    }
}
