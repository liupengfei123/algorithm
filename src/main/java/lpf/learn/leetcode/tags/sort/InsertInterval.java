package lpf.learn.leetcode.tags.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/** 57 插入区间
 <p>给你一个<strong> 无重叠的</strong><em> ，</em>按照区间起始端点排序的区间列表。</p>
 <p>在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。</p>

 <p><strong>示例 1：</strong></p>
 <pre>
 <strong>输入：</strong>intervals = [[1,3],[6,9]], newInterval = [2,5]
 <strong>输出：</strong>[[1,5],[6,9]]
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre>
 <strong>输入：</strong>intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 <strong>输出：</strong>[[1,2],[3,10],[12,16]]
 <strong>解释：</strong>这是因为新的区间 <code>[4,8]</code> 与 <code>[3,5],[6,7],[8,10]</code> 重叠。</pre>

 <p><strong>示例 3：</strong></p>
 <pre>
 <strong>输入：</strong>intervals = [], newInterval = [5,7]
 <strong>输出：</strong>[[5,7]]
 </pre>

 <p><strong>示例 4：</strong></p>
 <pre>
 <strong>输入：</strong>intervals = [[1,5]], newInterval = [2,3]
 <strong>输出：</strong>[[1,5]]
 </pre>

 <p><strong>示例 5：</strong></p>
 <pre>
 <strong>输入：</strong>intervals = [[1,5]], newInterval = [2,7]
 <strong>输出：</strong>[[1,7]]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>0 <= intervals.length <= 10<sup>4</sup></code></li>
 <li><code>intervals[i].length == 2</code></li>
 <li><code>0 <= intervals[i][0] <= intervals[i][1] <= 10<sup>5</sup></code></li>
 <li><code>intervals</code> 根据 <code>intervals[i][0]</code> 按 <strong>升序</strong> 排列</li>
 <li><code>newInterval.length == 2</code></li>
 <li><code>0 <= newInterval[0] <= newInterval[1] <= 10<sup>5</sup></code></li>
 </ul>
 */
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> temp = new ArrayList<>(Arrays.asList(intervals));
        temp.add(newInterval);

        temp.sort(Comparator.comparing(a -> a[0]));

        List<int[]> res = new ArrayList<>();

        int[] nr = null;
        for (int[] rang : temp) {
            if (nr == null) {
                nr = rang;
                continue;
            }
            if (nr[1] < rang[0]) {
                res.add(nr);
                nr = rang;
            } else {
                nr[1] = Math.max(nr[1], rang[1]);
            }
        }
        res.add(nr);

        int[][] ans = new int[res.size()][];
        for (int i = 0; i < res.size(); i++) ans[i] = res.get(i);
        return ans;
    }

}
