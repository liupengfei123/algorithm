package lpf.learn.leetcode.tags.binarysearch;

/** 875 爱吃香蕉的珂珂
 * <p>珂珂喜欢吃香蕉。这里有 <code>n</code> 堆香蕉，第 <code>i</code> 堆中有&nbsp;<code>piles[i]</code>&nbsp;根香蕉。警卫已经离开了，将在 <code>h</code> 小时后回来。</p>
 * <p>珂珂可以决定她吃香蕉的速度 <code>k</code> （单位：根/小时）。每个小时，她将会选择一堆香蕉，从中吃掉 <code>k</code> 根。如果这堆香蕉少于 <code>k</code> 根，她将吃掉这堆的所有香蕉，然后这一小时内不会再吃更多的香蕉。&nbsp;&nbsp;</p>
 * <p>珂珂喜欢慢慢吃，但仍然想在警卫回来前吃掉所有的香蕉。</p>
 * <p>返回她可以在 <code>h</code> 小时内吃掉所有香蕉的最小速度 <code>k</code>（<code>k</code> 为整数）。</p>
 *
 * <p><strong>示例 1：</strong></p>
 * <pre>
 * <strong>输入：</strong>piles = [3,6,7,11], h = 8
 * <strong>输出：</strong>4
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 * <pre>
 * <strong>输入：</strong>piles = [30,11,23,4,20], h = 5
 * <strong>输出：</strong>30
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 * <pre>
 * <strong>输入：</strong>piles = [30,11,23,4,20], h = 6
 * <strong>输出：</strong>23
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>1 &lt;= piles.length &lt;= 10<sup>4</sup></code></li>
 * 	<li><code>piles.length &lt;= h &lt;= 10<sup>9</sup></code></li>
 * 	<li><code>1 &lt;= piles[i] &lt;= 10<sup>9</sup></code></li>
 * </ul>
 */
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 1000_000_001;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (check(piles, h, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    private boolean check(int[] piles, int h, int speed) {
        int sum = 0;
        for (int pile : piles) {
            sum += (pile - 1) / speed + 1;
        }
        return sum <= h;
    }
}
