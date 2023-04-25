package lpf.learn.leetcode.tags.sort;

/** 2418 按身高排序
 <p>给你一个字符串数组 <code>names</code> ，和一个由 <strong>互不相同</strong> 的正整数组成的数组 <code>heights</code> 。两个数组的长度均为 <code>n</code> 。</p>
 <p>对于每个下标 <code>i</code>，<code>names[i]</code> 和 <code>heights[i]</code> 表示第 <code>i</code> 个人的名字和身高。</p>
 <p>请按身高 <strong>降序</strong> 顺序返回对应的名字数组 <code>names</code> 。</p>

 <p><strong>示例 1：</strong></p>
 <pre><strong>输入：</strong>names = ["Mary","John","Emma"], heights = [180,165,170]
 <strong>输出：</strong>["Mary","Emma","John"]
 <strong>解释：</strong>Mary 最高，接着是 Emma 和 John 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><strong>输入：</strong>names = ["Alice","Bob","Bob"], heights = [155,185,150]
 <strong>输出：</strong>["Bob","Alice","Bob"]
 <strong>解释：</strong>第一个 Bob 最高，然后是 Alice 和第二个 Bob 。
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>n == names.length == heights.length</code></li>
 <li><code>1 &lt;= n &lt;= 10<sup>3</sup></code></li>
 <li><code>1 &lt;= names[i].length &lt;= 20</code></li>
 <li><code>1 &lt;= heights[i] &lt;= 10<sup>5</sup></code></li>
 <li><code>names[i]</code> 由大小写英文字母组成</li>
 <li><code>heights</code> 中的所有值互不相同</li>
 </ul>
 */
public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        quick_sort(names, heights, 0, n - 1);
        return names;
    }

    private void quick_sort(String[] names, int[] heights, int l, int r) {
        if (l >= r) return;

        int x = heights[(r + l) >> 1], i = l - 1, j = r + 1;
        while (i < j) {
            while (heights[++i] > x);
            while (heights[--j] < x);

            if (i < j) swap(names, heights, i, j);
        }
        quick_sort(names, heights, l, j);
        quick_sort(names, heights, j + 1, r);
    }

    private void swap(String[] names, int[] heights, int i, int j) {
        String tempN = names[i];
        int tempH = heights[i];

        names[i] = names[j];
        heights[i] = heights[j];

        names[j] = tempN;
        heights[j] = tempH;
    }
}
