package lpf.learn.leetcode.game.spring2022;

/** 2. 烹饪料理
 * 欢迎各位勇者来到力扣城，城内设有烹饪锅供勇者制作料理，为自己恢复状态。
 * 勇者背包内共有编号为 0 ~ 4 的五种食材，其中 meterials[j] 表示第 j 种食材的数量。通过这些食材可以制作若干料理，cookbooks[i][j] 表示制作第 i 种料理需要第 j 种食材的数量，而 attribute[i] = [x,y] 表示第 i 道料理的美味度 x 和饱腹感 y。
 * 在饱腹感不小于 limit 的情况下，请返回勇者可获得的最大美味度。如果无法满足饱腹感要求，则返回 -1。
 * 注意：
 * 每种料理只能制作一次。
 *
 * 示例 1：
 * 输入：meterials = [3,2,4,1,2]
 * cookbooks = [[1,1,0,1,2],[2,1,4,0,0],[3,2,4,1,0]]
 * attribute = [[3,2],[2,4],[7,6]]
 * limit = 5
 * 输出：7
 * 解释：
 * 食材数量可以满足以下两种方案：
 * 方案一：制作料理 0 和料理 1，可获得饱腹感 2+4、美味度 3+2
 * 方案二：仅制作料理 2， 可饱腹感为 6、美味度为 7
 * 因此在满足饱腹感的要求下，可获得最高美味度 7
 *
 * 示例 2：
 * 输入：meterials = [10,10,10,10,10]
 * cookbooks = [[1,1,1,1,1],[3,3,3,3,3],[10,10,10,10,10]]
 * attribute = [[5,5],[6,6],[10,10]]
 * limit = 1
 * 输出：11
 * 解释：通过制作料理 0 和 1，可满足饱腹感，并获得最高美味度 11
 *
 * 提示：
 * meterials.length == 5
 * 1 <= cookbooks.length == attribute.length <= 8
 * cookbooks[i].length == 5
 * attribute[i].length == 2
 * 0 <= meterials[i], cookbooks[i][j], attribute[i][j] <= 20
 * 1 <= limit <= 100
 */
public class UEcfPD {
    int[][] cookbooks;
    int[][] attribute;
    int limit;
    int result = -1;

    public int perfectMenu(int[] materials, int[][] cookbooks, int[][] attribute, int limit) {
        this.cookbooks = cookbooks;
        this.attribute = attribute;
        this.limit = limit;

        Node initNode = new Node();
        initNode.materials = materials;

        help(initNode, 0);
        return result;
    }
    private void help(Node node, int index) {
        if (node.satiety >= limit) {
            result = Math.max(result, node.delicious);
        }

        if (index >= cookbooks.length) {
            return;
        }

        int[] cookbook = cookbooks[index];

        boolean used = sub(node.materials, cookbook);
        if (used) {
            node.satiety += attribute[index][1];
            node.delicious += attribute[index][0];

            help(node, index + 1);

            node.satiety -= attribute[index][1];
            node.delicious -= attribute[index][0];
        }
        add(node.materials, cookbook);

        help(node, index + 1);
    }


    private boolean sub(int[] m1, int[] m2) {
        boolean result = true;
        for (int i = 0; i < m1.length; i++) {
            m1[i] -= m2[i];
            if (m1[i] < 0) {
                result = false;
            }
        }
        return result;
    }
    private void add(int[] m1, int[] m2) {
        for (int i = 0; i < m1.length; i++) {
            m1[i] += m2[i];
        }
    }


    private static class Node {
        public int[] materials = new int[5];
        public int satiety;
        public int delicious;
    }

}
