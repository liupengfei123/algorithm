package lpf.learn.leetcode.tags.binarysearch;


import java.util.ArrayList;
import java.util.List;

/** 1146 快照数组
 <p>实现支持下列接口的「快照数组」-&nbsp;SnapshotArray：</p>
 <ul>
 <li><code>SnapshotArray(int length)</code>&nbsp;- 初始化一个与指定长度相等的 类数组 的数据结构。<strong>初始时，每个元素都等于</strong><strong>&nbsp;0</strong>。</li>
 <li><code>void set(index, val)</code>&nbsp;- 会将指定索引&nbsp;<code>index</code>&nbsp;处的元素设置为&nbsp;<code>val</code>。</li>
 <li><code>int snap()</code>&nbsp;- 获取该数组的快照，并返回快照的编号&nbsp;<code>snap_id</code>（快照号是调用&nbsp;<code>snap()</code>&nbsp;的总次数减去&nbsp;<code>1</code>）。</li>
 <li><code>int get(index, snap_id)</code>&nbsp;- 根据指定的&nbsp;<code>snap_id</code>&nbsp;选择快照，并返回该快照指定索引 <code>index</code>&nbsp;的值。</li>
 </ul>

 <p><strong>示例：</strong></p>
 <pre><strong>输入：</strong>["SnapshotArray","set","snap","set","get"]
 [[3],[0,5],[],[0,6],[0,0]]
 <strong>输出：</strong>[null,null,0,null,5]
 <strong>解释：
 </strong>SnapshotArray snapshotArr = new SnapshotArray(3); // 初始化一个长度为 3 的快照数组
 snapshotArr.set(0,5);  // 令 array[0] = 5
 snapshotArr.snap();  // 获取快照，返回 snap_id = 0
 snapshotArr.set(0,6);
 snapshotArr.get(0,0);  // 获取 snap_id = 0 的快照中 array[0] 的值，返回 5</pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= length&nbsp;&lt;= 50000</code></li>
 <li>题目最多进行<code>50000</code> 次<code>set</code>，<code>snap</code>，和&nbsp;<code>get</code>的调用 。</li>
 <li><code>0 &lt;= index&nbsp;&lt;&nbsp;length</code></li>
 <li><code>0 &lt;=&nbsp;snap_id &lt;&nbsp;</code>我们调用&nbsp;<code>snap()</code>&nbsp;的总次数</li>
 <li><code>0 &lt;=&nbsp;val &lt;= 10^9</code></li>
 </ul>
 */
public class SnapshotArray {

    private final List<int[]>[] lists;
    private int snap = 0;

    public SnapshotArray(int length) {
        this.lists = new List[length];

        for (int i = 0; i < length; i++) {
            lists[i] = new ArrayList<>();
            lists[i].add(new int[]{snap, 0});
        }
    }

    public void set(int index, int val) {
        lists[index].add(new int[]{snap, val});
    }

    public int snap() {
        return snap++;
    }

    public int get(int index, int snap_id) {
        return solve(lists[index], snap_id);
    }

    private int solve(List<int[]> list, int snapID) {
        int l = 0, r = list.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (list.get(mid)[0] <= snapID) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return list.get(l)[1];
    }
}
