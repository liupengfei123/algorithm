package lpf.learn.leetcode.tags.twopoint;


/** [1089]复写零
 <p>给你一个长度固定的整数数组&nbsp;<code>arr</code> ，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。</p>
 <p>注意：请不要在超过该数组长度的位置写入元素。请对输入的数组&nbsp;<strong>就地&nbsp;</strong>进行上述修改，不要从函数返回任何东西。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [1,0,2,3,0,4,5,0]
 <strong>输出：</strong>[1,0,0,2,3,0,0,4]
 <strong>解释：</strong>调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]</pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>arr = [1,2,3]
 <strong>输出：</strong>[1,2,3]
 <strong>解释：</strong>调用函数后，输入的数组将被修改为：[1,2,3]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= arr.length &lt;= 10<sup>4</sup></code></li>
 <li><code>0 &lt;= arr[i] &lt;= 9</code></li>
 </ul>
 */
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int n = arr.length, cnt = 0;
        for (int v : arr) {
            if (v == 0) cnt++;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[Math.min(n - 1, i + cnt--)] = 0;
            }
            arr[Math.min(n - 1, i + cnt)] = arr[i];
        }
    }
}
