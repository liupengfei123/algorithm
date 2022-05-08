package lpf.learn.leetcode.game.spring2022;

import lpf.learn.leetcode.entity.TreeNode;

import java.util.*;

/** 3. 二叉搜索树染色
 * 欢迎各位勇者来到力扣城，本次试炼主题为「二叉搜索树染色」。
 * 每位勇士面前设有一个二叉搜索树的模型，模型的根节点为 root，树上的各个节点值均不重复。初始时，所有节点均为蓝色。现在按顺序对这棵二叉树进行若干次操作， ops[i] = [type, x, y] 表示第 i 次操作为：
 * type 等于 0 时，将节点值范围在 [x, y] 的节点均染蓝
 * type 等于 1 时，将节点值范围在 [x, y] 的节点均染红
 * 请返回完成所有染色后，该二叉树中红色节点的数量。
 * 注意：
 * 题目保证对于每个操作的 x、y 值定出现在二叉搜索树节点中
 *
 * 示例 1：
 * 输入：root = [1,null,2,null,3,null,4,null,5], ops = [[1,2,4],[1,1,3],[0,3,5]]
 *
 * 输出：2
 * 解释：
 * 第 0 次操作，将值为 2、3、4 的节点染红；
 * 第 1 次操作，将值为 1、2、3 的节点染红；
 * 第 2 次操作，将值为 3、4、5 的节点染蓝；
 * 因此，最终值为 1、2 的节点为红色节点，返回数量 2
 * image.png
 *
 * 示例 2：
 * 输入：root = [4,2,7,1,null,5,null,null,null,null,6]
 * ops = [[0,2,2],[1,1,5],[0,4,5],[1,5,7]]
 * 输出：5
 * 解释：
 * 第 0 次操作，将值为 2 的节点染蓝；
 * 第 1 次操作，将值为 1、2、4、5 的节点染红；
 * 第 2 次操作，将值为 4、5 的节点染蓝；
 * 第 3 次操作，将值为 5、6、7 的节点染红；
 * 因此，最终值为 1、2、5、6、7 的节点为红色节点，返回数量 5
 * image.png
 *
 * 提示：
 * 1 <= 二叉树节点数量 <= 10^5
 * 1 <= ops.length <= 10^5
 * ops[i].length == 3
 * ops[i][0] 仅为 0 or 1
 * 0 <= ops[i][1] <= ops[i][2] <= 10^9
 * 0 <= 节点值 <= 10^9
 */
public class QO5KpG {

    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    TreeSet<Integer> set = new TreeSet<>();

    public int getNumber(TreeNode root, int[][] ops) {
        dfs(root);
        list.sort(Comparator.comparingInt(o -> o));
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
            map.put(arr[i], i);
            set.add(i);
        }
        int cnt = 0;
        for (int i = ops.length - 1; i >= 0; i--) {
            int[] op = ops[i];
            int type = op[0];
            int x = map.get(op[1]);
            int y = map.get(op[2]);
            int t = x;
            while (t <= y) {
                Integer ceiling = set.ceiling(t);
                if (ceiling == null || ceiling > y) {
                    break;
                }
                t = ceiling + 1;
                if (type == 1) {
                    cnt++;
                }
                set.remove(ceiling);
            }
        }
        return cnt;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}
