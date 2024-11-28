package lpf.learn.leetcode.tags.slidingwindow;


import java.util.Arrays;

/** 3261 统计满足 K 约束的子字符串数量 II
 <p>给你一个 <strong>二进制</strong> 字符串 <code>s</code> 和一个整数 <code>k</code>。</p>
 <p>另给你一个二维整数数组 <code>queries</code> ，其中 <code>queries[i] = [l<sub>i</sub>, r<sub>i</sub>]</code> 。</p>
 <p>如果一个 <strong>二进制字符串</strong> 满足以下任一条件，则认为该字符串满足 <strong>k 约束</strong>：</p>
 <ul>
 <li>字符串中 <code>0</code> 的数量最多为 <code>k</code>。</li>
 <li>字符串中 <code>1</code> 的数量最多为 <code>k</code>。</li>
 </ul>
 <p>返回一个整数数组 <code>answer</code> ，其中 <code>answer[i]</code> 表示 <code>s[l<sub>i</sub>..r<sub>i</sub>]</code> 中满足 <strong>k 约束</strong> 的 <span data-keyword="substring-nonempty">子字符串</span> 的数量。</p>

 <p><strong class="example">示例 1：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong><span class="example-io">s = "0001111", k = 2, queries = [[0,6]]</span></p>
 </div>
 <p><strong>输出：</strong><span class="example-io">[26]</span></p>
 <p><strong>解释：</strong></p>
 <p>对于查询 <code>[0, 6]</code>， <code>s[0..6] = "0001111"</code> 的所有子字符串中，除 <code>s[0..5] = "000111"</code> 和 <code>s[0..6] = "0001111"</code> 外，其余子字符串都满足 k 约束。</p>

 <p><strong class="example">示例 2：</strong></p>
 <div class="example-block">
 <p><strong>输入：</strong><span class="example-io">s = "010101", k = 1, queries = [[0,5],[1,4],[2,3]]</span></p>
 </div>
 <p><strong>输出：</strong><span class="example-io">[15,9,3]</span></p>
 <p><strong>解释：</strong></p>
 <p><code>s</code> 的所有子字符串中，长度大于 3 的子字符串都不满足 k 约束。</p>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
 <li><code>s[i]</code> 是 <code>'0'</code> 或 <code>'1'</code></li>
 <li><code>1 &lt;= k &lt;= s.length</code></li>
 <li><code>1 &lt;= queries.length &lt;= 10<sup>5</sup></code></li>
 <li><code>queries[i] == [l<sub>i</sub>, r<sub>i</sub>]</code></li>
 <li><code>0 &lt;= l<sub>i</sub> &lt;= r<sub>i</sub> &lt; s.length</code></li>
 <li>所有查询互不相同</li>
 </ul>
 */
public class CountSubstringsThatSatisfyKConstraintIi {

    public long[] countKConstraintSubstrings(String s, int k, int[][] queries) {
        char[] chars = s.toCharArray();
        int n = s.length(), cnt = 0;
        int[] right = new int[n];
        Arrays.fill(right, n);

        long[] preSum = new long[n + 1];
        for (int l = 0, r = 0; r < n; r++) {
            cnt += chars[r] - '0';

            while (cnt > k && (r - l + 1 - cnt) > k) {
                right[l] = r;
                cnt -= chars[l++] - '0';
            }
            preSum[r + 1] = preSum[r] + r - l + 1;
        }

        long[] res = new long[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            int j = Math.min(right[l], r + 1);
            long len = j - l;

            res[i] = preSum[r + 1] - preSum[j] + len * (len + 1) / 2;
        }
        return res;
    }


    public long[] countKConstraintSubstrings2(String s, int k, int[][] queries) {
        char[] chars = s.toCharArray();
        int n = s.length(), cnt = 0;
        int[] value = new int[n]; // 以第i个字符为右端点的符合条件的子字符集个数

        for (int l = 0, r = 0; r < n; r++) {
            cnt += chars[r] - '0';

            while (cnt > k && (r - l + 1 - cnt) > k) {
                cnt -= chars[l++] - '0';
            }
            value[r] = r - l + 1;
        }
        long[] preSum = new long[n + 1];
        for (int i = 0; i < n; i++) preSum[i + 1] = preSum[i] + value[i];

        long[] res = new long[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            int equalIndex = getEqualIndex(value, l, r);
            long len = equalIndex - l + 1;

            res[i] = preSum[r + 1] - preSum[equalIndex + 1] + len * (len + 1L) / 2;
            res[i] -= Math.max(0, len - value[equalIndex]);
        }
        return res;
    }

    private int getEqualIndex(int[] value, int l, int r) {
        int start = l;
        while (l < r) {
            int mid = (l + r) / 2;
            int compare = value[mid] - (mid - start + 1);
            if (compare > 0) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
