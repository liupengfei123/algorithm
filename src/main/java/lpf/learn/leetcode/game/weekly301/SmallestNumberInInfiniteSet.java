package lpf.learn.leetcode.game.weekly301;

import java.util.Arrays;

/** [2336] 无限集中的最小数字
 *  <p>现有一个包含所有正整数的集合 <code>[1, 2, 3, 4, 5, ...]</code> 。</p>
 * <p>实现 <code>SmallestInfiniteSet</code> 类：</p>
 * <ul>
 * 	<li><code>SmallestInfiniteSet()</code> 初始化 <strong>SmallestInfiniteSet</strong> 对象以包含 <strong>所有</strong> 正整数。</li>
 * 	<li><code>int popSmallest()</code> <strong>移除</strong> 并返回该无限集中的最小整数。</li>
 * 	<li><code>void addBack(int num)</code> 如果正整数 <code>num</code> <strong>不</strong> 存在于无限集中，则将一个 <code>num</code> <strong>添加</strong> 到该无限集中。</li>
 * </ul>
 *
 * <p><strong>示例：</strong></p>
 * <pre><strong>输入</strong>
 * ["SmallestInfiniteSet", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest"]
 * [[], [2], [], [], [], [1], [], [], []]
 * <strong>输出</strong>
 * [null, null, 1, 2, 3, null, 1, 4, 5]
 *
 * <strong>解释</strong>
 * SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
 * smallestInfiniteSet.addBack(2);    // 2 已经在集合中，所以不做任何变更。
 * smallestInfiniteSet.popSmallest(); // 返回 1 ，因为 1 是最小的整数，并将其从集合中移除。
 * smallestInfiniteSet.popSmallest(); // 返回 2 ，并将其从集合中移除。
 * smallestInfiniteSet.popSmallest(); // 返回 3 ，并将其从集合中移除。
 * smallestInfiniteSet.addBack(1);    // 将 1 添加到该集合中。
 * smallestInfiniteSet.popSmallest(); // 返回 1 ，因为 1 在上一步中被添加到集合中，
 *                                    // 且 1 是最小的整数，并将其从集合中移除。
 * smallestInfiniteSet.popSmallest(); // 返回 4 ，并将其从集合中移除。
 * smallestInfiniteSet.popSmallest(); // 返回 5 ，并将其从集合中移除。</pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>1 &lt;= num &lt;= 1000</code></li>
 * 	<li>最多调用 <code>popSmallest</code> 和 <code>addBack</code> 方法 <strong>共计</strong> <code>1000</code> 次</li>
 * </ul>
 */
public class SmallestNumberInInfiniteSet {
    private int minValue;
    private final boolean[] tree;

    public SmallestNumberInInfiniteSet() {
        this.minValue = 1;
        this.tree = new boolean[1001 * 4];
        Arrays.fill(tree, true);
    }

    public int popSmallest() {
        while (!query(minValue, minValue, 1, 1001, 1)) {
            minValue++;
        }
        update(minValue, minValue, 1, 1001, 1, false);

        return minValue;
    }

    public void addBack(int num) {
        update(num, num, 1, 1001, 1, true);

        if (minValue > num) {
            minValue = num;
        }
    }

    private boolean query(int start, int end, int l, int r, int idx) {
        if (r < start || l > end) {
            return false;
        }
        if (start <= l && r <= end) {
            return tree[idx];
        }
        int mid = (l + r) >> 1;
        return query(start, end, l, mid, 2 * idx) ||
                query(start, end, mid + 1, r, 2 * idx + 1);
    }

    private void update(int start, int end, int l, int r, int idx, boolean value) {
        if (r < start || l > end) {
            return;
        }
        if (l == r) {
            tree[idx] = value;
            return;
        }

        int mid = (l + r) >> 1;
        update(start, end, l, mid, 2 * idx, value);
        update(start, end, mid + 1, r, 2 * idx + 1, value);

        tree[idx] = value;
    }
}
