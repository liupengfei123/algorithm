package lpf.learn.leetcode.learn.tree;

import lpf.learn.leetcode.entity.TreeNode;

import java.util.HashMap;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 *
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 *
 * 注意:你可以假设树中没有重复的元素。
 *
 * 例如，给出
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class BuildTreeByInorderAndPostorder {
    private int[] postorder;
    private int postIndex;
    private HashMap<Integer, Integer> idx_map = new HashMap<>();


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;

        this.postIndex = postorder.length - 1;

        for (int i = 0; i < inorder.length; i++) {
            idx_map.put(inorder[i], i);
        }
        return treeHelp(0, inorder.length - 1);
    }

    private TreeNode treeHelp(int left, int right) {
        if (left > right) {
            return null;
        }

        int rootVal = postorder[postIndex];
        TreeNode root = new TreeNode(rootVal);
        int index = idx_map.get(rootVal);

        // 因为后序遍历的结果数组从结尾到开头，在二叉树中的顺序就是 从上往下，从右往左
        // 所以使用递归（从上往下） 先构建右子树 （从右往左）
        postIndex--;
        root.right = treeHelp(index + 1, right);
        root.left = treeHelp(left, index - 1);

        return root;
    }

}
