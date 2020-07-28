package lpf.learn.leetcode.learn.tree;

import lpf.learn.leetcode.learn.entity.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/** [101]对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 * 进阶：
 * 你可以运用递归和迭代两种方法解决这个问题吗？
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return compareTree(root.left, root.right);
    }

    private boolean compareTree(TreeNode source, TreeNode target) {
        if (source == null || target == null) {
            return (source == null) && (target == null);
        }
        return source.val == target.val && compareTree(source.left, target.right) && compareTree(source.right, target.left);
    }




    public boolean isSymmetric2(TreeNode root) {
        if (root == null) {
            return true;
        }

        Deque<TreeNode> leftStack = new LinkedList<>();
        Deque<TreeNode> rightStack = new LinkedList<>();

        leftStack.push(root.left);
        rightStack.push(root.right);

        while (!leftStack.isEmpty() || !rightStack.isEmpty()) {
            TreeNode leftNode = leftStack.pop();
            TreeNode rightNode = rightStack.pop();

            if (leftNode == null || rightNode == null) {
                if (leftNode == null && rightNode == null) {
                    continue;
                }
                return false;
            }

            if (leftNode.val != rightNode.val) {
                return false;
            }
            leftStack.push(leftNode.left);
            rightStack.push(rightNode.right);

            leftStack.push(leftNode.right);
            rightStack.push(rightNode.left);
        }

        return true;
    }
}
