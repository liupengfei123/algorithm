package lpf.learn.leetcode.tags.design;

import java.util.HashMap;
import java.util.Map;

/** [731] 我的日程安排表 II
 * <p>实现一个 <code>MyCalendar</code> 类来存放你的日程安排。如果要添加的时间内不会导致三重预订时，则可以存储这个新的日程安排。</p>
 * <p><code>MyCalendar</code> 有一个 <code>book(int start, int end)</code>方法。它意味着在 <code>start</code> 到 <code>end</code> 时间内增加一个日程安排，注意，这里的时间是半开区间，即 <code>[start, end)</code>, 实数&nbsp;<code>x</code> 的范围为， &nbsp;<code>start &lt;= x &lt; end</code>。</p>
 * <p>当三个日程安排有一些时间上的交叉时（例如三个日程安排都在同一时间内），就会产生三重预订。</p>
 * <p>每次调用 <code>MyCalendar.book</code>方法时，如果可以将日程安排成功添加到日历中而不会导致三重预订，返回 <code>true</code>。否则，返回 <code>false</code> 并且不要将该日程安排添加到日历中。</p>
 * <p>请按照以下步骤调用<code>MyCalendar</code> 类: <code>MyCalendar cal = new MyCalendar();</code> <code>MyCalendar.book(start, end)</code></p>
 *
 * <p><strong>示例：</strong></p>
 * <pre>MyCalendar();
 * MyCalendar.book(10, 20); // returns true
 * MyCalendar.book(50, 60); // returns true
 * MyCalendar.book(10, 40); // returns true
 * MyCalendar.book(5, 15); // returns false
 * MyCalendar.book(5, 10); // returns true
 * MyCalendar.book(25, 55); // returns true
 * <strong>解释：</strong>
 * 前两个日程安排可以添加至日历中。 第三个日程安排会导致双重预订，但可以添加至日历中。
 * 第四个日程安排活动（5,15）不能添加至日历中，因为它会导致三重预订。
 * 第五个日程安排（5,10）可以添加至日历中，因为它未使用已经双重预订的时间10。
 * 第六个日程安排（25,55）可以添加至日历中，因为时间 [25,40] 将和第三个日程安排双重预订；
 * 时间 [40,50] 将单独预订，时间 [50,55）将和第二个日程安排双重预订。
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li>每个测试用例，调用&nbsp;<code>MyCalendar.book</code>&nbsp;函数最多不超过&nbsp;<code>1000</code>次。</li>
 * 	<li>调用函数&nbsp;<code>MyCalendar.book(start, end)</code>时，&nbsp;<code>start</code> 和&nbsp;<code>end</code> 的取值范围为&nbsp;<code>[0, 10^9]</code>。</li>
 * </ul>
 */
public class MyCalendarIi {

    private Map<Integer, Integer> tree;
    private Map<Integer, Integer> lazy;

    public MyCalendarIi() {
        tree = new HashMap<>();
        lazy = new HashMap<>();
    }

    public boolean book(int start, int end) {
        if (query(start, end - 1, 0, 1000_000_000, 1) > 1) {
            return false;
        }
        update(start, end - 1, 0, 1000_000_000, 1);
        return true;
    }

    private int query(int start, int end, int l, int r, int idx) {
        if (start > r || end < l) {
            return 0;
        }
        if (start <= l && r <= end) {
            return tree.getOrDefault(idx, 0);
        }
        if (lazy.containsKey(idx)) {
            Integer lazyValue = lazy.get(idx);
            tree.merge(idx * 2, lazyValue, Integer::sum);
            tree.merge(idx * 2 + 1, lazyValue, Integer::sum);

            // 将标记下传给子节点
            lazy.merge(idx * 2, lazyValue, Integer::sum);
            lazy.merge(idx * 2 + 1, lazyValue, Integer::sum);

            lazy.remove(idx);
        }
        int mid = (l + r) >> 1;
        return Math.max(query(start, end, l, mid, 2 * idx),
                query(start, end, mid + 1, r, 2 * idx + 1));
    }

    private void update(int start, int end, int l, int r, int idx) {
        if (start > r || end < l) {
            return;
        }
        if (start <= l && r <= end) {
            lazy.merge(idx, 1, Integer::sum);
            tree.merge(idx, 1, Integer::sum);
            return;
        }
        int mid = (l + r) >> 1;

        update(start, end, l, mid, 2 * idx);
        update(start, end, mid + 1, r, 2 * idx + 1);

        tree.put(idx, lazy.getOrDefault(idx, 0) +
                Math.max(tree.getOrDefault(2 * idx, 0),
                        tree.getOrDefault(2 * idx + 1, 0)));
    }
}
