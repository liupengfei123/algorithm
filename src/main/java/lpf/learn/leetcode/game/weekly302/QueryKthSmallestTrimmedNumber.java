package lpf.learn.leetcode.game.weekly302;

import java.util.Arrays;
import java.util.Comparator;

/** [2343] 裁剪数字后查询第 K 小的数字
 * <p>给你一个下标从 <strong>0</strong>&nbsp;开始的字符串数组&nbsp;<code>nums</code>&nbsp;，其中每个字符串 <strong>长度相等</strong>&nbsp;且只包含数字。</p>
 * <p>再给你一个下标从 <strong>0</strong>&nbsp;开始的二维整数数组&nbsp;<code>queries</code>&nbsp;，其中&nbsp;<code>queries[i] = [k<sub>i</sub>, trim<sub>i</sub>]</code>&nbsp;。对于每个&nbsp;<code>queries[i]</code>&nbsp;，你需要：</p>
 * <ul>
 * 	<li>将&nbsp;<code>nums</code>&nbsp;中每个数字 <strong>裁剪</strong>&nbsp;到剩下 <strong>最右边</strong>&nbsp;<code>trim<sub>i</sub></code>&nbsp;个数位。</li>
 * 	<li>在裁剪过后的数字中，找到 <code>nums</code>&nbsp;中第&nbsp;<code>k<sub>i</sub></code>&nbsp;小数字对应的 <strong>下标</strong>&nbsp;。如果两个裁剪后数字一样大，那么下标 <strong>更小</strong>&nbsp;的数字视为更小的数字。</li>
 * 	<li>将 <code>nums</code>&nbsp;中每个数字恢复到原本字符串。</li>
 * </ul>
 *
 * <p>请你返回一个长度与 <code><span style="">queries</span></code>&nbsp;相等的数组<em>&nbsp;</em><code>answer</code>，其中<em>&nbsp;</em><code>answer[i]</code>是第<em>&nbsp;</em><code>i</code><em>&nbsp;</em>次查询的结果。</p>
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li>裁剪到剩下 <code>x</code>&nbsp;个数位的意思是不断删除最左边的数位，直到剩下 <code>x</code>&nbsp;个数位。</li>
 * 	<li><code>nums</code>&nbsp;中的字符串可能会有前导 0 。</li>
 * </ul>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <b>输入：</b>nums = ["102","473","251","814"], queries = [[1,1],[2,3],[4,2],[1,2]]
 * <b>输出：</b>[2,2,1,0]
 * <strong>解释：</strong>
 * 1. 裁剪到只剩 1 个数位后，nums = ["2","3","1","4"] 。最小的数字是 1 ，下标为 2 。
 * 2. 裁剪到剩 3 个数位后，nums 没有变化。第 2 小的数字是 251 ，下标为 2 。
 * 3. 裁剪到剩 2 个数位后，nums = ["02","73","51","14"] 。第 4 小的数字是 73 ，下标为 1 。
 * 4. 裁剪到剩 2 个数位后，最小数字是 2 ，下标为 0 。
 *    注意，裁剪后数字 "02" 值为 2 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre>
 * <b>输入：</b>nums = ["24","37","96","04"], queries = [[2,1],[2,2]]
 * <b>输出：</b>[3,0]
 * <strong>解释：</strong>
 * 1. 裁剪到剩 1 个数位，nums = ["4","7","6","4"] 。第 2 小的数字是 4 ，下标为 3 。
 *    有两个 4 ，下标为 0 的 4 视为小于下标为 3 的 4 。
 * 2. 裁剪到剩 2 个数位，nums 不变。第二小的数字是 24 ，下标为 0 。
 * </pre>
 *
 * <p><b>提示：</b></p>
 * <ul>
 * 	<li><code>1 &lt;= nums.length &lt;= 100</code></li>
 * 	<li><code>1 &lt;= nums[i].length &lt;= 100</code></li>
 * 	<li><code>nums[i]</code> 只包含数字。</li>
 * 	<li>所有&nbsp;<code>nums[i].length</code>&nbsp;的长度 <b>相同</b>&nbsp;。</li>
 * 	<li><code>1 &lt;= queries.length &lt;= 100</code></li>
 * 	<li><code>queries[i].length == 2</code></li>
 * 	<li><code>1 &lt;= k<sub>i</sub> &lt;= nums.length</code></li>
 * 	<li><code>1 &lt;= trim<sub>i</sub> &lt;= nums[0].length</code></li>
 * </ul>
 */
public class QueryKthSmallestTrimmedNumber {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int valueL = nums[0].length();
        int numL = nums.length;

        Node[][] array = new Node[valueL + 1][numL];
        for (int trim = 1; trim <= valueL; trim++) {
            for (int i = 0; i < numL; i++) {
                array[trim][i] = new Node(nums[i].substring(valueL - trim), i);
            }
            Arrays.sort(array[trim], Comparator.comparing(a -> a.value));
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = array[queries[i][1]][queries[i][0] - 1].index;
        }
        return result;
    }

    class Node {
        String value;
        int index;
        public Node(String value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}