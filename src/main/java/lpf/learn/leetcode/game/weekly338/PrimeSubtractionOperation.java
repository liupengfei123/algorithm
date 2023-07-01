package lpf.learn.leetcode.game.weekly338;

import java.util.TreeSet;


/** [2601] 质数减法运算
 <p>给你一个下标从 <strong>0</strong> 开始的整数数组 <code>nums</code> ，数组长度为 <code>n</code> 。</p>
 <p>你可以执行无限次下述运算：</p>
 <ul>
 <li>选择一个之前未选过的下标 <code>i</code> ，并选择一个 <strong>严格小于</strong> <code>nums[i]</code> 的质数 <code>p</code> ，从 <code>nums[i]</code> 中减去 <code>p</code> 。</li>
 </ul>
 <p>如果你能通过上述运算使得 <code>nums</code> 成为严格递增数组，则返回 <code>true</code> ；否则返回 <code>false</code> 。</p>
 <p><strong>严格递增数组</strong> 中的每个元素都严格大于其前面的元素。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [4,9,6,10]
 <strong>输出：</strong>true
 <strong>解释：</strong>
 在第一次运算中：选择 i = 0 和 p = 3 ，然后从 nums[0] 减去 3 ，nums 变为 [1,9,6,10] 。
 在第二次运算中：选择 i = 1 和 p = 7 ，然后从 nums[1] 减去 7 ，nums 变为 [1,2,6,10] 。
 第二次运算后，nums 按严格递增顺序排序，因此答案为 true 。</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [6,8,11,12]
 <strong>输出：</strong>true
 <strong>解释：</strong>nums 从一开始就按严格递增顺序排序，因此不需要执行任何运算。</pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>nums = [5,8,3]
 <strong>输出：</strong>false
 <strong>解释：</strong>可以证明，执行运算无法使 nums 按严格递增顺序排序，因此答案是 false 。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 1000</code></li>
 <li><code>1 &lt;= nums[i] &lt;= 1000</code></li>
 <li><code>nums.length == n</code></li>
 </ul>
 */
public class PrimeSubtractionOperation {

    private static TreeSet<Integer> treeSet = new TreeSet<>();

    static {
        int[] ints = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,
                151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,
                353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,
                547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709,719,727,733,739,743,751,757,761,
                769,773,787,797,809,811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,911,919,929,937,941,947,953,967,971,977,983,991,997};
        for (int i : ints) treeSet.add(i);
    }

    public boolean primeSubOperation(int[] nums) {
        int n = nums.length;
        int last = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < last) {
                last = nums[i];
                continue;
            }
            int temp = nums[i] - last + 1;

            Integer ceiling = treeSet.ceiling(temp);
            if (ceiling == null || ceiling >= nums[i]) {
                return false;
            }
            last = nums[i] - ceiling;
        }
        return true;
    }
}
