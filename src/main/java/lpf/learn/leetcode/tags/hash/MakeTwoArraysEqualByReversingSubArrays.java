package lpf.learn.leetcode.tags.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** 1460 通过翻转子数组使两个数组相等
 <p>给你两个长度相同的整数数组&nbsp;<code>target</code>&nbsp;和&nbsp;<code>arr</code>&nbsp;。每一步中，你可以选择&nbsp;<code>arr</code>&nbsp;的任意 <strong>非空子数组</strong>&nbsp;并将它翻转。你可以执行此过程任意次。</p>
 <p><em>如果你能让 <code>arr</code>&nbsp;变得与 <code>target</code>&nbsp;相同，返回 True；否则，返回 False 。</em></p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>target = [1,2,3,4], arr = [2,4,1,3]
 <strong>输出：</strong>true
 <strong>解释：</strong>你可以按照如下步骤使 arr 变成 target：
 1- 翻转子数组 [2,4,1] ，arr 变成 [1,4,2,3]
 2- 翻转子数组 [4,2] ，arr 变成 [1,2,4,3]
 3- 翻转子数组 [4,3] ，arr 变成 [1,2,3,4]
 上述方法并不是唯一的，还存在多种将 arr 变成 target 的方法。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>target = [7], arr = [7]
 <strong>输出：</strong>true
 <strong>解释：</strong>arr 不需要做任何翻转已经与 target 相等。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>target = [3,7,9], arr = [3,7,11]
 <strong>输出：</strong>false
 <strong>解释：</strong>arr 没有数字 9 ，所以无论如何也无法变成 target 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>target.length == arr.length</code></li>
 <li><code>1 &lt;= target.length &lt;= 1000</code></li>
 <li><code>1 &lt;= target[i] &lt;= 1000</code></li>
 <li><code>1 &lt;= arr[i] &lt;= 1000</code></li>
 </ul>
 */
public class MakeTwoArraysEqualByReversingSubArrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }

    public boolean canBeEqual2(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : target) {
            map.merge(i, 1, Integer::sum);
        }
        for (int i : arr) {
            map.merge(i, -1, Integer::sum);
        }
        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
