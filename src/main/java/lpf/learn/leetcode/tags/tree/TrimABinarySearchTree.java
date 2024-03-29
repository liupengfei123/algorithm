package lpf.learn.leetcode.tags.tree;


import lpf.learn.leetcode.entity.TreeNode;

/** [669] 修剪二叉搜索树
 <p>给你二叉搜索树的根节点 <code>root</code> ，同时给定最小边界<code>low</code> 和最大边界 <code>high</code>。通过修剪二叉搜索树，使得所有节点的值在<code>[low, high]</code>中。修剪树 <strong>不应该</strong>&nbsp;改变保留在树中的元素的相对结构 (即，如果没有被移除，原有的父代子代关系都应当保留)。 可以证明，存在&nbsp;<strong>唯一的答案</strong>&nbsp;。</p>
 <p>所以结果应当返回修剪好的二叉搜索树的新的根节点。注意，根节点可能会根据给定的边界发生改变。</p>

 <p><strong>示例 1：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2020/09/09/trim1.jpg" style="height: 126px; width: 450px;" />
 <pre>
 <strong>输入：</strong>root = [1,0,2], low = 1, high = 2
 <strong>输出：</strong>[1,null,2]
 </pre>

 <p><strong>示例 2：</strong></p>
 <img alt="" src="https://assets.leetcode.com/uploads/2020/09/09/trim2.jpg" style="height: 277px; width: 450px;" />
 <pre>
 <strong>输入：</strong>root = [3,0,4,null,2,null,null,1], low = 1, high = 3
 <strong>输出：</strong>[3,2,null,1]
 </pre>

 <p><strong>提示：</strong></p>
 <ul>
 <li>树中节点数在范围 <code>[1, 10<sup>4</sup>]</code> 内</li>
 <li><code>0 &lt;= Node.val &lt;= 10<sup>4</sup></code></li>
 <li>树中每个节点的值都是 <strong>唯一</strong> 的</li>
 <li>题目数据保证输入是一棵有效的二叉搜索树</li>
 <li><code>0 &lt;= low &lt;= high &lt;= 10<sup>4</sup></code></li>
 </ul>
 */
public class TrimABinarySearchTree {

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        int val = root.val;

        if (low <= val && val <= high) {
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
        }
        if (val < low) root = trimBST(root.right, low, high);
        if (val > high) root = trimBST(root.left, low, high);

        return root;
    }


}
