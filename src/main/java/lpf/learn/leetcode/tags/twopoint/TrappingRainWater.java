package lpf.learn.leetcode.tags.twopoint;


/** 42 接雨水
 <p>给定&nbsp;<code>n</code> 个非负整数表示每个宽度为 <code>1</code> 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。</p>

 <p><strong>示例 1：</strong></p>
 <p><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/22/rainwatertrap.png" style="height: 161px; width: 412px;" /></p>
 <pre>
 <strong>输入：</strong>height = [0,1,0,2,1,0,1,3,2,1,2,1]
 <strong>输出：</strong>6
 <strong>解释：</strong>上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>height = [4,2,0,3,2,5]
 <strong>输出：</strong>9
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == height.length</code></li>
 <li><code>1 &lt;= n &lt;= 2 * 10<sup>4</sup></code></li>
 <li><code>0 &lt;= height[i] &lt;= 10<sup>5</sup></code></li>
 </ul>
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length, res = 0, sum = 0, h = 0;
        for (int l = 0, r = n - 1; l <= r;) {
            int ht = Math.min(height[l], height[r]);
            if (h < ht) {
                res += (ht - h) * (r - l + 1);
                h = ht;
            }
            if (height[l] < height[r])
                sum += height[l++];
            else
                sum += height[r--];
        }
        return res - sum;
    }
}
