package lpf.learn.leetcode.game.biweekly86;


/** [2398] 预算内的最多机器人数目
 <p>你有&nbsp;<code>n</code>&nbsp;个机器人，给你两个下标从 <strong>0</strong>&nbsp;开始的整数数组&nbsp;<code>chargeTimes</code> 和&nbsp;<code>runningCosts</code>&nbsp;，两者长度都为&nbsp;<code>n</code>&nbsp;。第&nbsp;<code>i</code>&nbsp;个机器人充电时间为&nbsp;<code>chargeTimes[i]</code>&nbsp;单位时间，花费&nbsp;<code>runningCosts[i]</code>&nbsp;单位时间运行。再给你一个整数&nbsp;<code>budget</code>&nbsp;。</p>
 <p>运行&nbsp;<code>k</code>&nbsp;个机器人 <strong>总开销</strong>&nbsp;是&nbsp;<code>max(chargeTimes) + k * sum(runningCosts)</code>&nbsp;，其中&nbsp;<code>max(chargeTimes)</code>&nbsp;是这&nbsp;<code>k</code>&nbsp;个机器人中最大充电时间，<code>sum(runningCosts)</code>&nbsp;是这 <code>k</code>&nbsp;个机器人的运行时间之和。</p>
 <p>请你返回在 <strong>不超过</strong>&nbsp;<code>budget</code>&nbsp;的前提下，你 <strong>最多</strong>&nbsp;可以 <strong>连续</strong>&nbsp;运行的机器人数目为多少。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <b>输入：</b>chargeTimes = [3,6,1,3,4], runningCosts = [2,1,3,4,5], budget = 25
 <b>输出：</b>3
 <b>解释：</b>
 可以在 budget 以内运行所有单个机器人或者连续运行 2 个机器人。
 选择前 3 个机器人，可以得到答案最大值 3 。总开销是 max(3,6,1) + 3 * sum(2,1,3) = 6 + 3 * 6 = 24 ，小于 25 。
 可以看出无法在 budget 以内连续运行超过 3 个机器人，所以我们返回 3 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <b>输入：</b>chargeTimes = [11,12,19], runningCosts = [10,8,7], budget = 19
 <b>输出：</b>0
 <b>解释：</b>即使运行任何一个单个机器人，还是会超出 budget，所以我们返回 0 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>chargeTimes.length == runningCosts.length == n</code></li>
 <li><code>1 &lt;= n &lt;= 5 * 10<sup>4</sup></code></li>
 <li><code>1 &lt;= chargeTimes[i], runningCosts[i] &lt;= 10<sup>5</sup></code></li>
 <li><code>1 &lt;= budget &lt;= 10<sup>15</sup></code></li>
 </ul>
 */
public class MaximumNumberOfRobotsWithinBudget {
    private int treeLength;
    private int n;
    private int[] max;
    private long[] preSum;
    private long budget;

    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        this.n = chargeTimes.length;
        this.budget = budget;
        this.treeLength = n * 4;
        this.max = new int[treeLength];
        build(1, 1, n);
        for (int i = 0; i < n; i++) {
            update(1, 1, n, i, chargeTimes[i]);
        }

        this.preSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + runningCosts[i];
        }

        int left = 0, right = n;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (check(mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private boolean check(int value) {
        for (int i = 0; i + value <= n; i++) {
            long sum = getMax(1, 1, n, i, i + value) + (preSum[i + value] - preSum[i]) * value;
            if (sum <= budget) {
                return true;
            }
        }
        return false;
    }


    void pushup(int i) {
        max[i] = Math.max(max[i << 1], max[i << 1 | 1]);
    }

    void build(int i, int l, int r) {
        if (l == r) {
            max[i] = 0;
            return;
        }
        int mid = (l + r) / 2;
        build(i << 1, l, mid);
        build(i << 1 | 1, mid + 1, r);
        pushup(i);
    }

    void update(int i, int l, int r, int x, int val) {
        if (l == r) {
            max[i] = val;
            return;
        }
        int mid = (l + r) / 2;
        if (x <= mid) update(i << 1, l, mid, x, val);
        else update(i << 1 | 1, mid + 1, r, x, val);
        pushup(i);
    }

    int getMax(int i, int l, int r, int x, int y) {
        if (x <= l && r <= y)
            return max[i];
        int maxm = 0;
        int mid = (l + r) / 2;
        if (x <= mid) maxm = Math.max(maxm, getMax(i << 1, l, mid, x, y));
        if (y > mid) maxm = Math.max(maxm, getMax(i << 1 | 1, mid + 1, r, x, y));
        return maxm;
    }
}
