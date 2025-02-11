package lpf.learn.leetcode.tags.bitoperation;


import java.util.ArrayList;
import java.util.List;

/** 2411 按位或最大的最小子数组长度
 <p>给你一个长度为 <code>n</code>&nbsp;下标从 <strong>0</strong>&nbsp;开始的数组&nbsp;<code>nums</code>&nbsp;，数组中所有数字均为非负整数。对于&nbsp;<code>0</code>&nbsp;到&nbsp;<code>n - 1</code>&nbsp;之间的每一个下标 <code>i</code>&nbsp;，你需要找出&nbsp;<code>nums</code>&nbsp;中一个 <strong>最小</strong> 非空子数组，它的起始位置为&nbsp;<code>i</code>&nbsp;（包含这个位置），同时有&nbsp;<strong>最大</strong>&nbsp;的 <strong>按位或</strong><b>运算值</b>&nbsp;。</p>
 <ul>
 <li>换言之，令&nbsp;<code>B<sub>ij</sub></code>&nbsp;表示子数组&nbsp;<code>nums[i...j]</code>&nbsp;的按位或运算的结果，你需要找到一个起始位置为&nbsp;<code>i</code>&nbsp;的最小子数组，这个子数组的按位或运算的结果等于&nbsp;<code>max(B<sub>ik</sub>)</code>&nbsp;，其中&nbsp;<code>i &lt;= k &lt;= n - 1</code>&nbsp;。</li>
 </ul>
 <p>一个数组的按位或运算值是这个数组里所有数字按位或运算的结果。</p>
 <p>请你返回一个大小为 <code>n</code>&nbsp;的整数数组<em>&nbsp;</em><code>answer</code>，其中<em>&nbsp;</em><code>answer[i]</code>是开始位置为&nbsp;<code>i</code>&nbsp;，按位或运算结果最大，且&nbsp;<strong>最短</strong>&nbsp;子数组的长度。</p>
 <p><strong>子数组</strong>&nbsp;是数组里一段连续非空元素组成的序列。</p>

 <p><strong>示例 1：</strong></p>
 <pre><b>输入：</b>nums = [1,0,2,1,3]
 <b>输出：</b>[3,3,2,2,1]
 <strong>解释：</strong>
 任何位置开始，最大按位或运算的结果都是 3 。
 - 下标 0 处，能得到结果 3 的最短子数组是 [1,0,2] 。
 - 下标 1 处，能得到结果 3 的最短子数组是 [0,2,1] 。
 - 下标 2 处，能得到结果 3 的最短子数组是 [2,1] 。
 - 下标 3 处，能得到结果 3 的最短子数组是 [1,3] 。
 - 下标 4 处，能得到结果 3 的最短子数组是 [3] 。
 所以我们返回 [3,3,2,2,1] 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><b>输入：</b>nums = [1,2]
 <b>输出：</b>[2,1]
 <strong>解释：
 </strong>下标 0 处，能得到最大按位或运算值的最短子数组长度为 2 。
 下标 1 处，能得到最大按位或运算值的最短子数组长度为 1 。
 所以我们返回 [2,1] 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == nums.length</code></li>
 <li><code>1 &lt;= n &lt;= 10<sup>5</sup></code></li>
 <li><code>0 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class SmallestSubarraysWithMaximumBitwiseOr {


    public int[] smallestSubarrays(int[] nums) {
        // todo 通用摸板
        int n = nums.length;
        int[] ans = new int[n];
        List<int[]> ors = new ArrayList<>(); // 按位或的值 + 对应子数组的右端点的最小值
        for (int i = n - 1; i >= 0; --i) {
            ors.add(new int[]{0, i});
            int k = 0;
            for (int[] or : ors) {
                or[0] |= nums[i];
                if (ors.get(k)[0] == or[0])
                    ors.get(k)[1] = or[1]; // 合并相同值，下标取最小的
                else ors.set(++k, or);
            }
            ors.subList(k + 1, ors.size()).clear();
            // 本题只用到了 ors[0]，如果题目改成任意给定数值，可以在 ors 中查找
            ans[i] = ors.get(0)[1] - i + 1;
        }
        return ans;
    }



    public int[] smallestSubarrays2(int[] nums) {
        int n = nums.length, max = 0;
        int[] res = new int[n], cnt = new int[31];

        for (int l = n - 1, r = n - 1; l >= 0; l--) {
            int val = comAndGet(cnt, nums[l], 1);
            max = Math.max(val, max);
            while (l <= r && val == max) val = comAndGet(cnt, nums[r--], -1);
            comAndGet(cnt, nums[++r], 1);

            res[l] = r - l + 1;
        }
        return res;
    }

    private int comAndGet(int[] bitCnt, int num, int flag) {
        for (int i = 0; i < bitCnt.length & num > 0; i++, num >>= 1) {
            if ((num & 1) > 0) bitCnt[i] += flag;
        }

        int res = 0;
        for (int i = 0; i < bitCnt.length; i++) {
            if (bitCnt[i] > 0) res |= 1 << i;
        }
        return res;
    }

}
