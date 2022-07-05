package lpf.learn.leetcode.tags.design;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/** 729 我的日程安排表 I
 * <p>实现一个 <code>MyCalendar</code> 类来存放你的日程安排。如果要添加的日程安排不会造成 <strong>重复预订</strong> ，则可以存储这个新的日程安排。</p>
 * <p>当两个日程安排有一些时间上的交叉时（例如两个日程安排都在同一时间内），就会产生 <strong>重复预订</strong> 。</p>
 * <p>日程可以用一对整数 <code>start</code> 和 <code>end</code> 表示，这里的时间是半开区间，即 <code>[start, end)</code>, 实数&nbsp;<code>x</code> 的范围为， &nbsp;<code>start &lt;= x &lt; end</code> 。</p>
 * <p>实现 <code>MyCalendar</code> 类：</p>
 * <ul>
 * 	<li><code>MyCalendar()</code> 初始化日历对象。</li>
 * 	<li><code>boolean book(int start, int end)</code> 如果可以将日程安排成功添加到日历中而不会导致重复预订，返回 <code>true</code> 。否则，返回 <code>false</code>&nbsp;并且不要将该日程安排添加到日历中。</li>
 * </ul>
 *
 * <p><strong>示例：</strong></p>
 * <pre>
 * <strong>输入：</strong>
 * ["MyCalendar", "book", "book", "book"]
 * [[], [10, 20], [15, 25], [20, 30]]
 * <strong>输出：</strong>
 * [null, true, false, true]
 *
 * <strong>解释：</strong>
 * MyCalendar myCalendar = new MyCalendar();
 * myCalendar.book(10, 20); // return True
 * myCalendar.book(15, 25); // return False ，这个日程安排不能添加到日历中，因为时间 15 已经被另一个日程安排预订了。
 * myCalendar.book(20, 30); // return True ，这个日程安排可以添加到日历中，因为第一个日程安排预订的每个时间都小于 20 ，且不包含时间 20 。</pre>
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>0 &lt;= start &lt; end &lt;= 10<sup>9</sup></code></li>
 * 	<li>每个测试用例，调用 <code>book</code> 方法的次数最多不超过 <code>1000</code> 次。</li>
 * </ul>
 */
public class MyCalendarI {
    private Set<Integer> tree;
    private Set<Integer> lazy;

    public MyCalendarI() {
        tree = new HashSet<>();
        lazy = new HashSet<>();
    }

    public boolean book(int start, int end) {
        if (query(start, end - 1, 0, 1000_000_000, 1)) {
            return false;
        }
        update(start, end - 1, 0, 1000_000_000, 1);
        return true;
    }
    private boolean query(int start, int end, int l, int r, int idx) {
        if (r < start || l > end) {
            return false;
        }
        if (lazy.contains(idx)) {
            return true;
        }
        if (start <= l && r <= end) {
            return tree.contains(idx);
        }
        int mid = (l + r) >> 1;
        return query(start, end, l, mid, 2 * idx) ||
                query(start, end, mid + 1, r, 2 * idx + 1);
    }

    private void update(int start, int end, int l, int r, int idx) {
        if (r < start || l > end) {
            return;
        }
        if (start <= l && r <= end) {
            tree.add(idx);
            lazy.add(idx);
            return;
        }
        int mid = (l + r) >> 1;
        update(start, end, l, mid, 2 * idx);
        update(start, end, mid + 1, r, 2 * idx + 1);

        tree.add(idx);
    }





    // ========================================

    TreeMap<Integer, Integer> map;

    public MyCalendarI(int ignore) {
        map = new TreeMap<>();
    }

    public boolean book2(int start, int end) {
        Map.Entry<Integer, Integer> beforeEntry = map.floorEntry(start);
        if (beforeEntry != null && beforeEntry.getValue() > start) {
            return false;
        }
        Integer afterKey = map.ceilingKey(start);
        if (afterKey != null && afterKey < end) {
            return false;
        }

        map.put(start, end);
        return true;
    }
}
