package lpf.learn.leetcode.tags.array;

/** [565] 数组嵌套
 * <p>索引从<code>0</code>开始长度为<code>N</code>的数组<code>A</code>，包含<code>0</code>到<code>N - 1</code>的所有整数。找到最大的集合<code>S</code>并返回其大小，其中 <code>S[i] = {A[i], A[A[i]], A[A[A[i]]], ... }</code>且遵守以下的规则。</p>
 * <p>假设选择索引为<code>i</code>的元素<code>A[i]</code>为<code>S</code>的第一个元素，<code>S</code>的下一个元素应该是<code>A[A[i]]</code>，之后是<code>A[A[A[i]]]...</code> 以此类推，不断添加直到<code>S</code>出现重复的元素。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 * <pre><strong>输入:</strong> A = [5,4,0,3,1,6,2]
 * <strong>输出:</strong> 4
 * <strong>解释:</strong>
 * A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.
 *
 * 其中一种最长的 S[K]:
 * S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
 * </pre>
 *
 * <p><strong>提示：</strong></p>
 * <ol>
 * 	<li><code>N</code>是<code>[1, 20,000]</code>之间的整数。</li>
 * 	<li><code>A</code>中不含有重复的元素。</li>
 * 	<li><code>A</code>中的元素大小在<code>[0, N-1]</code>之间。</li>
 * </ol>
 */
public class ArrayNesting {
    private int[] nums;
    private int maxDepth;
    private boolean[] visited;

    public int arrayNesting(int[] nums) {
        int length = nums.length;

        this.maxDepth = 0;
        this.visited = new boolean[length];
        this.nums = nums;


        for (int i = 0; i < length; i++) {
            dfs(i, 1);
        }

        return this.maxDepth;
    }


    private void dfs(int index, int depth) {
        if (visited[index]) {
            return;
        }
        visited[index] = true;
        this.maxDepth = Math.max(this.maxDepth, depth);

        dfs(nums[index], depth + 1);
    }
}
