package lpf.learn.leetcode.tags.binarysearch;


import java.util.PriorityQueue;

/** 1642 可以到达的最远建筑
 <p>给你一个整数数组 <code>heights</code> ，表示建筑物的高度。另有一些砖块 <code>bricks</code> 和梯子 <code>ladders</code> 。</p>
 <p>你从建筑物 <code>0</code> 开始旅程，不断向后面的建筑物移动，期间可能会用到砖块或梯子。</p>
 <p>当从建筑物 <code>i</code> 移动到建筑物 <code>i+1</code>（下标<strong> 从 0 开始 </strong>）时：</p>
 <ul>
 <li>如果当前建筑物的高度 <strong>大于或等于</strong> 下一建筑物的高度，则不需要梯子或砖块</li>
 <li>如果当前建筑的高度 <strong>小于</strong> 下一个建筑的高度，您可以使用 <strong>一架梯子</strong> 或 <strong><code>(h[i+1] - h[i])</code> 个砖块</strong></li>
 </ul> 如果以最佳方式使用给定的梯子和砖块，返回你可以到达的最远建筑物的下标（下标
 <strong> 从 0 开始 </strong>）。

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/31/q4.gif" style="width: 562px; height: 561px;" />
 <pre>
 <strong>输入：</strong>heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1
 <strong>输出：</strong>4
 <strong>解释：</strong>从建筑物 0 出发，你可以按此方案完成旅程：
 - 不使用砖块或梯子到达建筑物 1 ，因为 4 &gt;= 2
 - 使用 5 个砖块到达建筑物 2 。你必须使用砖块或梯子，因为 2 &lt; 7
 - 不使用砖块或梯子到达建筑物 3 ，因为 7 &gt;= 6
 - 使用唯一的梯子到达建筑物 4 。你必须使用砖块或梯子，因为 6 &lt; 9
 无法越过建筑物 4 ，因为没有更多砖块或梯子。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>heights = [4,12,2,7,3,18,20,3,19], bricks = 10, ladders = 2
 <strong>输出：</strong>7
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>heights = [14,3,19,3], bricks = 17, ladders = 0
 <strong>输出：</strong>3
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= heights.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= heights[i] &lt;= 10<sup>6</sup></code></li>
 <li><code>0 &lt;= bricks &lt;= 10<sup>9</sup></code></li>
 <li><code>0 &lt;= ladders &lt;= heights.length</code></li>
 </ul>
 */
public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int n = heights.length, sum = 0;
        for (int i = 1; i < n; i++) {
            if (heights[i] <= heights[i - 1]) continue;

            queue.add(heights[i] - heights[i - 1]);

            if (queue.size() <= ladders) continue;

            sum += queue.poll();
            if (sum > bricks) return i - 1;
        }
        return n - 1;
    }



    public int furthestBuilding2(int[] heights, int bricks, int ladders) {
        int l = ladders, r = heights.length - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (check2(heights, bricks, ladders, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return Math.min(l, heights.length - 1);
    }

    private boolean check2(int[] heights, int bricks, int ladders, int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            if (heights[i] > heights[i - 1]) queue.add(heights[i] - heights[i - 1]);
        }

        if (queue.size() < ladders) return true;

        while (queue.size() > ladders) bricks -= queue.poll();

        return bricks < 0;
    }
}
