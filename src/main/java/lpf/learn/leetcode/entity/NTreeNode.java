package lpf.learn.leetcode.entity;

import java.util.List;

/** N 叉树节点
 * @author liupf
 * @date 2020-08-01 17:52
 */
public class NTreeNode {
    public int val;
    public List<NTreeNode> children;

    public NTreeNode() {}

    public NTreeNode(int _val) {
        val = _val;
    }

    public NTreeNode(int _val, List<NTreeNode> _children) {
        val = _val;
        children = _children;
    }
}