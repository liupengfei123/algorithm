package lpf.learn.leetcode.tags.slidingwindow;


/** 2134 最少交换次数来组合所有的 1 II
 <p><strong>交换</strong> 定义为选中一个数组中的两个 <strong>互不相同</strong> 的位置并交换二者的值。</p>
 <p><strong>环形</strong> 数组是一个数组，可以认为 <strong>第一个</strong> 元素和 <strong>最后一个</strong> 元素 <strong>相邻</strong> 。</p>
 <p>给你一个 <strong>二进制环形</strong> 数组 <code>nums</code> ，返回在 <strong>任意位置</strong> 将数组中的所有 <code>1</code> 聚集在一起需要的最少交换次数。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>nums = [0,1,0,1,1,0,0]
 <strong>输出：</strong>1
 <strong>解释：</strong>这里列出一些能够将所有 1 聚集在一起的方案：
 [0,<strong><em>0</em></strong>,<em><strong>1</strong></em>,1,1,0,0] 交换 1 次。
 [0,1,<em><strong>1</strong></em>,1,<em><strong>0</strong></em>,0,0] 交换 1 次。
 [1,1,0,0,0,0,1] 交换 2 次（利用数组的环形特性）。
 无法在交换 0 次的情况下将数组中的所有 1 聚集在一起。
 因此，需要的最少交换次数为 1 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>nums = [0,1,1,1,0,0,1,1,0]
 <strong>输出：</strong>2
 <strong>解释：</strong>这里列出一些能够将所有 1 聚集在一起的方案：
 [1,1,1,0,0,0,0,1,1] 交换 2 次（利用数组的环形特性）。
 [1,1,1,1,1,0,0,0,0] 交换 2 次。
 无法在交换 0 次或 1 次的情况下将数组中的所有 1 聚集在一起。
 因此，需要的最少交换次数为 2 。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre><strong>输入：</strong>nums = [1,1,0,0,1]
 <strong>输出：</strong>0
 <strong>解释：</strong>得益于数组的环形特性，所有的 1 已经聚集在一起。
 因此，需要的最少交换次数为 0 。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
 <li><code>nums[i]</code> 为 <code>0</code> 或者 <code>1</code></li>
 </ul>
 */
public class MinimumSwapsToGroupAll1sTogetherIi {
    public int minSwaps(int[] nums) {
        int n = nums.length, oneCnt = 0;
        for (int num : nums) if (num == 1) oneCnt++;

        if (oneCnt <= 1 || oneCnt == n)
            return 0;

        int cnt = 0;
        for (int i = 0; i < oneCnt; i++) if (nums[i] == 1) cnt++;

        int max = cnt;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) cnt--;
            if (nums[(i + oneCnt) % n] == 1) cnt++;

            max = Math.max(max, cnt);
        }
        return oneCnt - max;
    }
}
