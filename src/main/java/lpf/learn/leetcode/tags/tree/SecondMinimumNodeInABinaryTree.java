package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

/** [671]二叉树中第二小的节点
 * 给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么该节点的值等于两个子节点中较小的一个。
 * 给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。
 *
 * 示例 1:
 * 输入:
 *    2
 *   / \
 *  2   5
 *     / \
 *    5   7
 * 输出: 5
 * 说明: 最小的值是 2 ，第二小的值是 5 。
 *
 * 示例 2:
 * 输入:
 *    2
 *   / \
 *  2   2
 * 输出: -1
 * 说明: 最小的值是 2, 但是不存在第二小的值。
 */
public class SecondMinimumNodeInABinaryTree {

    public int findSecondMinimumValue(TreeNode root) {
        int value = findSecondMinimumValueHelp(root, root.val);
        return value == root.val ? -1 : value;
    }

    private int findSecondMinimumValueHelp(TreeNode node, int rootVal) {
        if (node.left == null) {
            return node.val;
        }
        int leftV = node.left.val;
        int rightV = node.right.val;

        if (leftV != rootVal && rightV != rootVal) {
            return Math.min(leftV, rightV);
        }
        leftV = findSecondMinimumValueHelp(node.left, rootVal);
        rightV = findSecondMinimumValueHelp(node.right, rootVal);
        int minVal = Math.min(leftV, rightV);
        int maxVal = Math.max(leftV, rightV);
        return  minVal != rootVal ? minVal : maxVal;
    }
}
