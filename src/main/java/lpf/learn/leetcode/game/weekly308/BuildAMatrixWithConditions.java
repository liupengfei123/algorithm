package lpf.learn.leetcode.game.weekly308;

import java.util.*;


/** [2392] 给定条件下构造矩阵
 <p>给你一个 <strong>正</strong>&nbsp;整数&nbsp;<code>k</code>&nbsp;，同时给你：</p>
 <ul>
 <li>一个大小为 <code>n</code>&nbsp;的二维整数数组&nbsp;<code>rowConditions</code>&nbsp;，其中&nbsp;<code>rowConditions[i] = [above<sub>i</sub>, below<sub>i</sub>]</code>&nbsp;和</li>
 <li>一个大小为 <code>m</code>&nbsp;的二维整数数组&nbsp;<code>colConditions</code>&nbsp;，其中&nbsp;<code>colConditions[i] = [left<sub>i</sub>, right<sub>i</sub>]</code>&nbsp;。</li>
 </ul>
 <p>两个数组里的整数都是&nbsp;<code>1</code>&nbsp;到&nbsp;<code>k</code>&nbsp;之间的数字。</p>
 <p>你需要构造一个&nbsp;<code>k x k</code>&nbsp;的矩阵，<code>1</code>&nbsp;到&nbsp;<code>k</code>&nbsp;每个数字需要&nbsp;<strong>恰好出现一次</strong>&nbsp;。剩余的数字都是<b>&nbsp;</b><code>0</code>&nbsp;。</p>

 <p>矩阵还需要满足以下条件：</p>
 <ul>
 <li>对于所有 <code>0</code>&nbsp;到&nbsp;<code>n - 1</code>&nbsp;之间的下标&nbsp;<code>i</code>&nbsp;，数字&nbsp;<code>above<sub>i</sub></code>&nbsp;所在的 <strong>行</strong>&nbsp;必须在数字&nbsp;<code>below<sub>i</sub></code>&nbsp;所在行的上面。</li>
 <li>对于所有 <code>0</code>&nbsp;到 <code>m - 1</code>&nbsp;之间的下标&nbsp;<code>i</code>&nbsp;，数字&nbsp;<code>left<sub>i</sub></code>&nbsp;所在的 <b>列</b>&nbsp;必须在数字&nbsp;<code>right<sub>i</sub></code>&nbsp;所在列的左边。</li>
 </ul>
 <p>返回满足上述要求的 <strong>任意</strong>&nbsp;矩阵。如果不存在答案，返回一个空的矩阵。</p>

 <p><strong>示例 1：</strong></p>
 <p><img alt="" src="https://assets.leetcode.com/uploads/2022/07/06/gridosdrawio.png" style="width: 211px; height: 211px;"></p>

 <pre><b>输入：</b>k = 3, rowConditions = [[1,2],[3,2]], colConditions = [[2,1],[3,2]]
 <b>输出：</b>[[3,0,0],[0,0,1],[0,2,0]]
 <b>解释：</b>上图为一个符合所有条件的矩阵。
 行要求如下：
 - 数字 1 在第 <strong>1</strong> 行，数字 2 在第 <strong>2</strong>&nbsp;行，1 在 2 的上面。
 - 数字 3 在第 <strong>0</strong>&nbsp;行，数字 2 在第 <strong>2</strong>&nbsp;行，3 在 2 的上面。
 列要求如下：
 - 数字 2 在第 <strong>1</strong>&nbsp;列，数字 1 在第 <strong>2</strong>&nbsp;列，2 在 1 的左边。
 - 数字 3 在第 <strong>0</strong>&nbsp;列，数字 2 在第 <strong>1</strong>&nbsp;列，3 在 2 的左边。
 注意，可能有多种正确的答案。
 </pre>

 <p><strong>示例 2：</strong></p>
 <pre><b>输入：</b>k = 3, rowConditions = [[1,2],[2,3],[3,1],[2,3]], colConditions = [[2,1]]
 <b>输出：</b>[]
 <b>解释：</b>由前两个条件可以得到 3 在 1 的下面，但第三个条件是 3 在 1 的上面。
 没有符合条件的矩阵存在，所以我们返回空矩阵。
 </pre>


 <p><strong>提示：</strong></p>
 <ul>
 <li><code>2 &lt;= k &lt;= 400</code></li>
 <li><code>1 &lt;= rowConditions.length, colConditions.length &lt;= 10<sup>4</sup></code></li>
 <li><code>rowConditions[i].length == colConditions[i].length == 2</code></li>
 <li><code>1 &lt;= above<sub>i</sub>, below<sub>i</sub>, left<sub>i</sub>, right<sub>i</sub> &lt;= k</code></li>
 <li><code>above<sub>i</sub> != below<sub>i</sub></code></li>
 <li><code>left<sub>i</sub> != right<sub>i</sub></code></li>
 </ul>
 */
public class BuildAMatrixWithConditions {

    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        List<Integer> rowGraphSort = graph(k, rowConditions);
        if (rowGraphSort == null) {
            return new int[0][];
        }

        List<Integer> colGraphSort = graph(k, colConditions);
        if (colGraphSort == null) {
            return new int[0][];
        }
        Map<Integer, Integer> valueToIndex = new HashMap<>();

        for (int i = 0; i < colGraphSort.size(); i++) {
            valueToIndex.put(colGraphSort.get(i), i);
        }

        int[][] result = new int[k][k];

        for (int i = 0; i < k; i++) {
            Integer value = rowGraphSort.get(i);
            result[i][valueToIndex.get(value)] = value;
        }
        return result;
    }

    private List<Integer> graph(int k, int[][] conditions) {
        List<Integer>[] array = new ArrayList[k + 1];
        int[] indegree = new int[k + 1];     // 记录每个顶点的入度

        for (int[] condition : conditions) {
            List<Integer> list = array[condition[0]];
            if (list == null) {
                list = new ArrayList<>();
                array[condition[0]] = list;
            }
            list.add(condition[1]);

            indegree[condition[1]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= k; ++i)
            if(indegree[i] == 0)
                queue.offer(i);

        List<Integer> result = new ArrayList<>();
        int count = 0;             // 计数，记录当前已经输出的顶点数
        while(!queue.isEmpty()) {
            int v = queue.poll();      // 从队列中取出一个顶点

            result.add(v);      // 输出该顶点
            ++count;

            List<Integer> list = array[v];
            if (list != null) {
                for (Integer integer : list) {
                    if ((--indegree[integer]) == 0)
                        queue.offer(integer);
                }
            }
        }

        if (count < k) {
            return null;
        } else {
            return result;
        }
    }

}
