package lpf.learn.leetcode.tags.binarysearch;


import java.util.Arrays;

/** 3281 范围内整数的最大得分
 <p>给你一个整数数组 <code>start</code> 和一个整数 <code>d</code>，代表 <code>n</code> 个区间 <code>[start[i], start[i] + d]</code>。</p>
 <p>你需要选择 <code>n</code> 个整数，其中第 <code>i</code> 个整数必须属于第 <code>i</code> 个区间。所选整数的 <strong>得分</strong> 定义为所选整数两两之间的 <strong>最小 </strong>绝对差。</p>
 <p>返回所选整数的 <strong>最大可能得分 </strong>。</p>

 <p><strong class="example">示例 1：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong> <span class="example-io">start = [6,0,3], d = 2</span></p>
 </div>
 <p><strong>输出：</strong> <span class="example-io">4</span></p>
 <p><strong>解释：</strong></p>
 <p>可以选择整数 8, 0 和 4 获得最大可能得分，得分为 <code>min(|8 - 0|, |8 - 4|, |0 - 4|)</code>，等于 4。</p>

 <p><strong class="example">示例 2：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong> <span class="example-io">start = [2,6,13,13], d = 5</span></p>
 </div>
 <p><strong>输出：</strong> <span class="example-io">5</span></p>
 <p><strong>解释：</strong></p>
 <p>可以选择整数 2, 7, 13 和 18 获得最大可能得分，得分为 <code>min(|2 - 7|, |2 - 13|, |2 - 18|, |7 - 13|, |7 - 18|, |13 - 18|)</code>，等于 5。</p>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>2 &lt;= start.length &lt;= 10<sup>5</sup></code></li>
 <li><code>0 &lt;= start[i] &lt;= 10<sup>9</sup></code></li>
 <li><code>0 &lt;= d &lt;= 10<sup>9</sup></code></li>
 </ul>
 */
public class MaximizeScoreOfNumbersInRanges {

    public int maxPossibleScore(int[] start, int d) {
        Arrays.sort(start);

        int l = 0, r = start[start.length - 1] - start[0] + d;

        while (l < r) {
            int mid = l + (r - l + 1) / 2;
            if (check(start, d, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    private boolean check(int[] start, int d, long x) {
        long last = start[0];
        for (int i = 1; i < start.length; i++) {
            if (last + x > (long) start[i] + d) return false;

            last = Math.max(start[i], last + x);
        }
        return true;
    }

}
