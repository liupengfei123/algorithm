package lpf.learn.leetcode.tags.stack;

import lpf.learn.leetcode.learn.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/** [103]二叉树的锯齿形层次遍历
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *     3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 * 返回锯齿形层次遍历如下：
 * [
 *  [3],
 *  [20,9],
 *  [15,7]
 * ]
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<Integer> stack = new Stack<>();
        boolean direction = false;// false从左往右， true 从右往左
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            direction = !direction;
            int size = queue.size();
            List<Integer> temp = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node == null) {
                    continue;
                }
                if (direction) {
                    stack.push(node.val);
                } else {
                    temp.add(node.val);
                }
                queue.add(node.left);
                queue.add(node.right);
            }
            while (!stack.isEmpty()) {
                temp.add(stack.pop());
            }
            if (temp.size() > 0) {
                result.add(temp);
            }
        }
        return result;
    }
}
