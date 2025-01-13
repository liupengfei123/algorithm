package lpf.learn.leetcode.tags.stack;


/** 1776 车队 II
 <p>在一条单车道上有 <code>n</code>&nbsp;辆车，它们朝着同样的方向行驶。给你一个长度为 <code>n</code>&nbsp;的数组 <code>cars</code>&nbsp;，其中&nbsp;<code>cars[i] = [position<sub>i</sub>, speed<sub>i</sub>]</code>&nbsp;，它表示：</p>
 <ul>
 <li><code>position<sub>i</sub></code>&nbsp;是第 <code>i</code>&nbsp;辆车和道路起点之间的距离（单位：米）。题目保证&nbsp;<code>position<sub>i</sub> &lt; position<sub>i+1</sub></code><sub>&nbsp;</sub>。</li>
 <li><code>speed<sub>i</sub></code>&nbsp;是第 <code>i</code>&nbsp;辆车的初始速度（单位：米/秒）。</li>
 </ul>
 <p>简单起见，所有车子可以视为在数轴上移动的点。当两辆车占据同一个位置时，我们称它们相遇了。一旦两辆车相遇，它们会合并成一个车队，这个车队里的车有着同样的位置和相同的速度，速度为这个车队里&nbsp;<strong>最慢</strong>&nbsp;一辆车的速度。</p>
 <p>请你返回一个数组&nbsp;<code>answer</code>&nbsp;，其中&nbsp;<code>answer[i]</code>&nbsp;是第 <code>i</code>&nbsp;辆车与下一辆车相遇的时间（单位：秒），如果这辆车不会与下一辆车相遇，则 <code>answer[i]</code>&nbsp;为 <code>-1</code>&nbsp;。答案精度误差需在 <code>10<sup>-5</sup></code>&nbsp;以内。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>cars = [[1,2],[2,1],[4,3],[7,2]]
 <b>输出：</b>[1.00000,-1.00000,3.00000,-1.00000]
 <b>解释：</b>经过恰好 1 秒以后，第一辆车会与第二辆车相遇，并形成一个 1 m/s 的车队。经过恰好 3 秒以后，第三辆车会与第四辆车相遇，并形成一个 2 m/s 的车队。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>cars = [[3,4],[5,4],[6,3],[9,1]]
 <b>输出：</b>[2.00000,1.00000,1.50000,-1.00000]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= cars.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= position<sub>i</sub>, speed<sub>i</sub> &lt;= 10<sup>6</sup></code></li>
 <li><code>position<sub>i</sub> &lt; position<sub>i+1</sub></code></li>
 </ul>
 */
public class CarFleetIi {
    public double[] getCollisionTimes(int[][] cars) {
        // todo
        return null;
    }
}
