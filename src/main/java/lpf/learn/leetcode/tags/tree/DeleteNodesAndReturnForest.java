package lpf.learn.leetcode.tags.tree;

import lpf.learn.leetcode.entity.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteNodesAndReturnForest {
    private List<TreeNode> res;
    private Set<Integer> dels;

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        this.res = new ArrayList<>();
        this.dels = new HashSet<>();

        for (int i : to_delete) dels.add(i);

        dfs(root, true);

        return res;
    }


    private void dfs(TreeNode node, boolean isParentDel) {
        boolean isDel = dels.contains(node.val);
        if (!isDel && isParentDel) res.add(node);

        if (node.left != null) {
            dfs(node.left, isDel);
            if (dels.contains(node.left.val)) node.left = null;
        }
        if (node.right != null) {
            dfs(node.right, isDel);
            if (dels.contains(node.right.val)) node.right = null;
        }
    }

}
