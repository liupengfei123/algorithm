package lpf.learn.leetcode.tags.stack;

import java.util.Stack;

/** 1130 叶值的最小代价生成树
 <p>给你一个正整数数组&nbsp;<code>arr</code>，考虑所有满足以下条件的二叉树：</p>
 <ul>
 <li>每个节点都有 <code>0</code> 个或是 <code>2</code> 个子节点。</li>
 <li>数组&nbsp;<code>arr</code>&nbsp;中的值与树的中序遍历中每个叶节点的值一一对应。</li>
 <li>每个非叶节点的值等于其左子树和右子树中叶节点的最大值的乘积。</li>
 </ul>
 <p>在所有这样的二叉树中，返回每个非叶节点的值的最小可能总和。这个和的值是一个&nbsp;32 位整数。</p>
 <p>如果一个节点有 0 个子节点，那么该节点为叶节点。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2021/08/10/tree1.jpg" style="width: 500px; height: 169px;" />
 <pre>
 <strong>输入：</strong>arr = [6,2,4]
 <strong>输出：</strong>32
 <strong>解释：</strong>有两种可能的树，第一种的非叶节点的总和为 36 ，第二种非叶节点的总和为 32 。
 </pre>

 <p><strong>示例 2：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2021/08/10/tree2.jpg" style="width: 224px; height: 145px;" />
 <pre>
 <strong>输入：</strong>arr = [4,11]
 <strong>输出：</strong>44
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li><code>2 &lt;= arr.length &lt;= 40</code></li>
 <li><code>1 &lt;= arr[i] &lt;= 15</code></li>
 <li>答案保证是一个 32 位带符号整数，即小于&nbsp;<code>2<sup>31</sup></code> 。</li>
 </ul>
 */
public class MinimumCostTreeFromLeafValues {
    public int mctFromLeafValues(int[] arr) {
        // 给定一个数组 arr，不断地合并相邻的数，合并代价为两个数的乘积，合并之后的数为两个数的最大值，直到数组只剩一个数，求最小合并代价和
        // 数值越大的叶子节点 越靠近根节点
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int x : arr) {
            while (!stack.isEmpty() && stack.peek() <= x) {
                Integer y = stack.pop();

                if (!stack.isEmpty() && stack.peek() < x) {
                    res += y * stack.peek();
                } else {
                    res += x * y;
                }
            }
            stack.push(x);
        }
        while (stack.size() > 1) res += stack.pop() * stack.peek();
        return res;
    }
}
