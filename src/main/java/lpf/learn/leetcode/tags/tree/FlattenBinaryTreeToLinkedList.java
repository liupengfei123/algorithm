package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

/** [114]二叉树展开为链表
 * 给定一个二叉树，原地将它展开为一个单链表。
 * 例如，给定二叉树
 *
 *     1
 *   / \
 *  2   5
 * / \   \
 * 3   4   6
 * 将其展开为：
 * 1
 * \
 *  2
 *   \
 *    3
 *     \
 *      4
 *       \
 *        5
 *         \
 *          6
 */
public class FlattenBinaryTreeToLinkedList {

    private TreeNode linkHead;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode left = root.left;

        flatten(root.right);
        flatten(left);

        root.right = linkHead;
        linkHead = root;
        root.left = null;
    }
}
