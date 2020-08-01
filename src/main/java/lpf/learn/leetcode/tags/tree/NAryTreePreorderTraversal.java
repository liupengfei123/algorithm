package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.NTreeNode;

import java.util.ArrayList;
import java.util.List;

/** [589]N叉树的前序遍历
 *
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * @author liupf
 * @date 2020-08-01 17:50
 */
public class NAryTreePreorderTraversal {


    public List<Integer> preorder(NTreeNode root) {
        List<Integer> result = new ArrayList<>();
        traversal(root, result);
        return result;
    }

    private void traversal(NTreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        for (NTreeNode child : node.children) {
            traversal(child, list);
        }
    }


}
