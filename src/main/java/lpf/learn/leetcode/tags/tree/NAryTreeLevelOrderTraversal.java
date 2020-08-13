package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.NTreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/** [429]N叉树的层序遍历
 * 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
 * 例如，给定一个 3叉树 :
 * 返回其层序遍历:
 * [
 *     [1],
 *     [3,2,4],
 *     [5,6]
 * ]
 * 说明:
 * 树的深度不会超过 1000。
 * 树的节点总数不会超过 5000。
 */
public class NAryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(NTreeNode root) {
        Queue<NTreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                NTreeNode node = queue.poll();
                temp.add(node.val);

                List<NTreeNode> childrens = node.children;
                if (childrens != null) {
                    for (NTreeNode children : childrens) {
                        if (children != null) {
                            queue.add(children);
                        }
                    }
                }
            }
            result.add(temp);
        }
        return result;
    }
}
