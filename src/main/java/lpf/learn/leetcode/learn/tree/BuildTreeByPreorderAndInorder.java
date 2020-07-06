package lpf.learn.leetcode.learn.tree;

import lpf.learn.leetcode.learn.entity.TreeNode;

import java.util.HashMap;

public class BuildTreeByPreorderAndInorder {
    private int[] preorder;
    private int preIndex;
    private HashMap<Integer, Integer> idx_map = new HashMap<>();


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.preIndex = 0;

        for (int i = 0; i < inorder.length; i++) {
            idx_map.put(inorder[i], i);
        }
        return treeHelp(0, inorder.length - 1);
    }

    private TreeNode treeHelp(int left, int right) {
        if (left > right) {
            return null;
        }

        int rootVal = preorder[preIndex];
        TreeNode root = new TreeNode(rootVal);
        int index = idx_map.get(rootVal);

        // 因为前序遍历的结果数组从开头到结尾，在二叉树中的顺序就是 从上往下，从左往右
        // 所以使用递归（从上往下） 先构建左子树 （从左往右）
        preIndex++;
        root.left = treeHelp(left, index - 1);
        root.right = treeHelp(index + 1, right);

        return root;
    }

}
