package lpf.learn.leetcode.game.weekly342;

/** 2651 计算列车到站时间
 <p>给你一个正整数 <code>arrivalTime</code> 表示列车正点到站的时间（单位：小时），另给你一个正整数 <code>delayedTime</code> 表示列车延误的小时数。</p>
 <p>返回列车实际到站的时间。</p>
 <p>注意，该问题中的时间采用 24 小时制。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>arrivalTime = 15, delayedTime = 5
 <strong>输出：</strong>20
 <strong>解释：</strong>列车正点到站时间是 15:00 ，延误 5 小时，所以列车实际到站的时间是 15 + 5 = 20（20:00）。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>arrivalTime = 13, delayedTime = 11
 <strong>输出：</strong>0
 <strong>解释：</strong>列车正点到站时间是 13:00 ，延误 11 小时，所以列车实际到站的时间是 13 + 11 = 24（在 24 小时制中表示为 00:00 ，所以返回 0）。</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= arrivaltime &lt;&nbsp;24</code></li>
 <li><code>1 &lt;= delayedTime &lt;= 24</code></li>
 </ul>
 */
public class CalculateDelayedArrivalTime {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}
