package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.learn.entity.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/** [257]二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 输入:
 *    1
 *  /   \
 * 2     3
 * \
 *  5
 * 输出: ["1->2->5", "1->3"]
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */
public class BinaryTreePaths {




    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        linkedList.add(root);
        visited.add(root);

        while (!linkedList.isEmpty()) {
            TreeNode node = linkedList.getLast();
            if (node.left == null && node.right == null) {
                result.add(linkedList.stream().map(i -> Integer.toString(i.val)).collect(Collectors.joining("->")));
                linkedList.removeLast();
            } else if (node.left != null && !visited.contains(node.left)) {
                linkedList.add(node.left);
                visited.add(node.left);
            } else if (node.right != null && !visited.contains(node.right)) {
                linkedList.add(node.right);
                visited.add(node.right);
            } else {
                linkedList.removeLast();
            }
        }
        return result;
    }


    public List<String> binaryTreePaths2(TreeNode root) {
        List<String> result = new ArrayList<>();
        path(root, "", result);
        return result;
    }

    private void path(TreeNode node, String path, List<String> result) {
        if (node == null) {
            return;
        }
        path += node.val;
        if (node.left == null && node.right == null) {
            result.add(path);
        } else {
            path += "->";
            path(node.left, path, result);
            path(node.right, path, result);
        }
    }


}
