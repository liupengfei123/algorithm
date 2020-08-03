package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.NTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/** [559]N叉树的最大深度
 * 给定一个 N 叉树，找到其最大深度。
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 * 例如，给定一个 3叉树 :
 * 我们应返回其最大深度，3。
 *
 * 说明:
 * 树的深度不会超过 1000。
 * 树的节点总不会超过 5000。
 */
public class MaximumDepthOfNAryTree {

    public int maxDepth(NTreeNode root) {
        int maxDepth = 0;
        if (root == null) {
            return maxDepth;
        }

        Queue<NTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            maxDepth++;
            for (int i = 0; i < size; i++) {
                NTreeNode node = queue.poll();
                if (node.children == null) {
                    continue;
                }
                for (NTreeNode child : node.children) {
                    if (child != null) {
                        queue.add(child);
                    }
                }
            }
        }
        return maxDepth;
    }


}
