package lpf.learn.leetcode.learn.tree;

import lpf.learn.leetcode.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/** [297]二叉树的序列化与反序列化
 * 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
 *
 * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 *
 * 示例:
 * 你可以将以下二叉树：
 *
 *     1
 *    / \
 *   2   3
 *      / \
 *     4   5
 *
 * 序列化为 "[1,2,3,null,null,4,5]"
 * 提示: 这与 LeetCode 目前使用的方式一致，详情请参阅 LeetCode 序列化二叉树的格式。你并非必须采取这种方式，你也可以采用其他的方法解决这个问题。
 * 说明: 不要使用类的成员 / 全局 / 静态变量来存储状态，你的序列化和反序列化算法应该是无状态的。
 */
public class SerializeAndDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        LinkedList<String> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp != null) {
                result.add(Integer.toString(temp.val));
                queue.add(temp.left);
                queue.add(temp.right);
            } else {
                result.add(null);
            }
        }

        while (result.getLast() == null) {
            result.removeLast();
        }

        return String.join(",", result);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || "".equals(data)) {
            return null;
        }
        String[] array = data.split(",");

        int index = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(array[index++]));
        queue.add(root);

        while (index < array.length) {
            TreeNode parent = queue.poll();

            String leftValue = array[index++];
            if (!"null".equals(leftValue)) {
                parent.left = new TreeNode(Integer.parseInt(leftValue));
                queue.add(parent.left);
            }

            if (index < array.length) {
                String rightValue = array[index++];
                if (!"null".equals(rightValue)) {
                    parent.right = new TreeNode(Integer.parseInt(rightValue));
                    queue.add(parent.right);
                }
            }
        }
        return root;
    }
}
