package lpf.learn.leetcode.learn.tree;

import lpf.learn.leetcode.entity.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 *
 * 示例:
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 * 输出: [1,3,2]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        traversal(root, result);
        return result;
    }

    private void traversal(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        traversal(node.left, result);
        result.add(node.val);
        traversal(node.right, result);
    }



    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }
}
