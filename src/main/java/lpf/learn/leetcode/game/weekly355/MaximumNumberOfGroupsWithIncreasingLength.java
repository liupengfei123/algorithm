package lpf.learn.leetcode.game.weekly355;

import java.util.Comparator;
import java.util.List;


/** [2790] 长度递增组的最大数目
 <p>给你一个下标从 <strong>0</strong> 开始、长度为 <code>n</code> 的数组 <code>usageLimits</code> 。</p>
 <p>你的任务是使用从 <code>0</code> 到 <code>n - 1</code> 的数字创建若干组，并确保每个数字 <code>i</code> 在 <strong>所有组</strong> 中使用的次数总共不超过 <code>usageLimits[i]</code> 次。此外，还必须满足以下条件：</p>
 <ul>
 <li>每个组必须由 <strong>不同</strong> 的数字组成，也就是说，单个组内不能存在重复的数字。</li>
 <li>每个组（除了第一个）的长度必须 <strong>严格大于</strong> 前一个组。</li>
 </ul>
 <p>在满足所有条件的情况下，以整数形式返回可以创建的最大组数。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <code><strong>输入：</strong>usageLimits</code> = [1,2,5]
 <strong>输出：</strong>3
 <strong>解释：</strong>在这个示例中，我们可以使用 0 至多一次，使用 1 至多 2 次，使用 2 至多 5 次。
 一种既能满足所有条件，又能创建最多组的方式是：
 组 1 包含数字 [2] 。
 组 2 包含数字 [1,2] 。
 组 3 包含数字 [0,1,2] 。
 可以证明能够创建的最大组数是 3 。
 所以，输出是 3 。 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <code><strong>输入：</strong></code><code>usageLimits</code> = [2,1,2]
 <strong>输出：</strong>2
 <strong>解释：</strong>在这个示例中，我们可以使用 0 至多 2 次，使用 1 至多 1 次，使用 2 至多 2 次。
 一种既能满足所有条件，又能创建最多组的方式是：
 组 1 包含数字 [0] 。
 组 2 包含数字 [1,2] 。
 可以证明能够创建的最大组数是 2 。
 所以，输出是 2 。
 </pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <code><strong>输入：</strong></code><code>usageLimits</code> = [1,1]
 <strong>输出：</strong>1
 <strong>解释：</strong>在这个示例中，我们可以使用 0 和 1 至多 1 次。
 一种既能满足所有条件，又能创建最多组的方式是：
 组 1 包含数字 [0] 。
 可以证明能够创建的最大组数是 1 。
 所以，输出是 1 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= usageLimits.length &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= usageLimits[i] &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class MaximumNumberOfGroupsWithIncreasingLength {
    public int maxIncreasingGroups(List<Integer> usageLimits) {
        usageLimits.sort(Comparator.reverseOrder());

        int l = 0, r = usageLimits.size();
        while (l < r) {
            int mid = (l + r + 1) >> 1;
            if (check(mid, usageLimits)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    private boolean check(int n, List<Integer> usageLimits) {
        int gap = 0;

        for (Integer limit : usageLimits) {
            gap = Math.min(limit + gap - n, 0);
            if (n > 0) n--;
        }

        return gap >= 0;
    }
}
