package lpf.learn.leetcode.tags.design;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 732 我的日程安排表 III
 * <p>当 <code>k</code> 个日程安排有一些时间上的交叉时（例如 <code>k</code> 个日程安排都在同一时间内），就会产生 <code>k</code> 次预订。</p>
 * <p>给你一些日程安排 <code>[start, end)</code> ，请你在每个日程安排添加后，返回一个整数 <code>k</code> ，表示所有先前日程安排会产生的最大 <code>k</code> 次预订。</p>
 * <p>实现一个 <code>MyCalendarThree</code> 类来存放你的日程安排，你可以一直添加新的日程安排。</p>
 * <ul>
 * 	<li><code>MyCalendarThree()</code> 初始化对象。</li>
 * 	<li><code>int book(int start, int end)</code> 返回一个整数 <code>k</code> ，表示日历中存在的 <code>k</code> 次预订的最大值。</li>
 * </ul>
 *
 * <p><strong>示例：</strong></p>
 * <pre>
 * <strong>输入：</strong>
 * ["MyCalendarThree", "book", "book", "book", "book", "book", "book"]
 * [[], [10, 20], [50, 60], [10, 40], [5, 15], [5, 10], [25, 55]]
 * <strong>输出：</strong>
 * [null, 1, 1, 2, 3, 3, 3]
 *
 * <strong>解释：</strong>
 * MyCalendarThree myCalendarThree = new MyCalendarThree();
 * myCalendarThree.book(10, 20); // 返回 1 ，第一个日程安排可以预订并且不存在相交，所以最大 k 次预订是 1 次预订。
 * myCalendarThree.book(50, 60); // 返回 1 ，第二个日程安排可以预订并且不存在相交，所以最大 k 次预订是 1 次预订。
 * myCalendarThree.book(10, 40); // 返回 2 ，第三个日程安排 [10, 40) 与第一个日程安排相交，所以最大 k 次预订是 2 次预订。
 * myCalendarThree.book(5, 15); // 返回 3 ，剩下的日程安排的最大 k 次预订是 3 次预订。
 * myCalendarThree.book(5, 10); // 返回 3
 * myCalendarThree.book(25, 55); // 返回 3
 * </pre>
 *
 *
 * <p><strong>提示：</strong></p>
 * <ul>
 * 	<li><code>0 <= start < end <= 10<sup>9</sup></code></li>
 * 	<li>每个测试用例，调用 <code>book</code> 函数最多不超过 <code>400</code>次</li>
 * </ul>
 */
public class MyCalendarIii {
    private Map<Integer, Integer> tree;
    private Map<Integer, Integer> lazy;


    public MyCalendarIii() {
        tree = new HashMap<>();
        lazy = new HashMap<>();
    }

    public int book(int start, int end) {
        update(start, end - 1, 0, 1000_000_000, 1);
        return tree.getOrDefault(1, 0);
    }

    private void update(int start, int end, int l, int r, int idx) {
        if (r < start || l > end) {
            return;
        }

        if (start <= l && r <= end) {
            tree.merge(idx, 1, Integer::sum);
            lazy.merge(idx, 1, Integer::sum);
        } else {
            int mid = (l + r) >> 1;
            update(start, end, l, mid, 2 * idx);
            update(start, end, mid + 1, r, 2 * idx + 1);

            tree.put(idx, lazy.getOrDefault(idx, 0) +
                    Math.max(tree.getOrDefault(2 * idx, 0),
                            tree.getOrDefault(2 * idx + 1, 0)));
        }
    }


    //==========================
    private TreeMap<Integer, Integer> cnt;

    public MyCalendarIii(String ignore) {
        cnt = new TreeMap<>();
    }

    //差分数组
    public int book2(int start, int end) {
        int ans = 0;
        int maxBook = 0;
        cnt.put(start, cnt.getOrDefault(start, 0) + 1);
        cnt.put(end, cnt.getOrDefault(end, 0) - 1);
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            int freq = entry.getValue();
            maxBook += freq;
            ans = Math.max(maxBook, ans);
        }
        return ans;
    }
}
