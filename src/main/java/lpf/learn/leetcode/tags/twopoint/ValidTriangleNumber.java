package lpf.learn.leetcode.tags.twopoint;


import java.util.Arrays;

/** 611 有效三角形的个数
 <p>给定一个包含非负整数的数组&nbsp;<code>nums</code> ，返回其中可以组成三角形三条边的三元组个数。</p>

 <p><strong>示例 1:</strong></p>
 <pre>
 <strong>输入:</strong> nums = [2,2,3,4]
 <strong>输出:</strong> 3
 <strong>解释:</strong>有效的组合是:
 2,3,4 (使用第一个 2)
 2,3,4 (使用第二个 2)
 2,2,3
 </pre>

 <p><strong>示例 2:</strong></p>
 <pre>
 <strong>输入:</strong> nums = [4,2,3,4]
 <strong>输出:</strong> 4</pre>

 <p><strong>提示:</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 1000</code></li>
 <li><code>0 &lt;= nums[i] &lt;= 1000</code></li>
 </ul>
 */
public class ValidTriangleNumber {

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, res = 0;

        for (int c = 2; c < n; c++) {
            int a = 0, b = c - 1;
            while (a < b) {
                if (nums[a] + nums[b] > nums[c]) {
                    res += (b - a);
                    b--;
                } else{
                    a++;
                }
            }
        }
        return res;
    }
}
