package lpf.learn.leetcode.tags.twopoint;

/**
 * [904]水果成篮
 * 在一排树中，第 i 棵树产生 tree[i] 型的水果。你可以从你选择的任何树开始，然后重复执行以下步骤：
 * 把这棵树上的水果放进你的篮子里。如果你做不到，就停下来。
 * 移动到当前树右侧的下一棵树。如果右边没有树，就停下来。
 * <p>
 * 请注意，在选择一颗树后，你没有任何选择：你必须执行步骤 1，然后执行步骤 2，然后返回步骤 1，然后执行步骤 2，依此类推，直至停止。
 * 你有两个篮子，每个篮子可以携带任何数量的水果，但你希望每个篮子只携带一种类型的水果。 用这个程序你能收集的水果树的最大总量是多少？
 * <p>
 * 示例 1：
 * 输入：[1,2,1]
 * 输出：3
 * 解释：我们可以收集 [1,2,1]。
 * <p>
 * 示例 2：
 * 输入：[0,1,2,2]
 * 输出：3
 * 解释：我们可以收集 [1,2,2], 如果我们从第一棵树开始，我们将只能收集到 [0, 1]。
 * <p>
 * 示例 3：
 * 输入：[1,2,3,2,2]
 * 输出：4
 * 解释：我们可以收集 [2,3,2,2], 如果我们从第一棵树开始，我们将只能收集到 [1, 2]。
 * <p>
 * 示例 4：
 * 输入：[3,3,3,1,2,1,1,2,3,3,4]
 * 输出：5
 * 解释：我们可以收集 [1,2,1,1,2], 如果我们从第一棵树或第八棵树开始，我们将只能收集到 4 棵水果树。
 * <p>
 * 提示：
 * 1 <= tree.length <= 40000
 * 0 <= tree[i] < tree.length
 */
public class FruitIntoBaskets {

    public int totalFruit(int[] tree) {
        int res = 0, len = tree.length;
        int one = tree[0], two, begin = 0, end = 1;
        while (end < len && tree[end] == one)   //寻找two的初始值，以构成初始(one, two)
            end++;

        if (end == len) return len; //若整个数组的元素都由初始的(one, two)所构成，则直接返回数组长度
        two = tree[end++];  //构成初始的(one, two)
        for (; end < len; ++end) {
            if (one != tree[end] && two != tree[end]) { //遇到了第3种树
                res = Math.max(res, end - begin);   //更新最终返回结果
                one = tree[end - 1];    //(one, two)更新为(第3种树的左边的树, 第3种树)
                two = tree[end];
                begin = end - 1;    //更新由当前(one, two)所构成的连续子数组的左边界
                while (tree[begin - 1] == one)   //向左寻找由one构成的连续子数组
                    --begin;
            }
        }
        return Math.max(res, end - begin);
    }


    public int totalFruit2(int[] tree) {
        int[][] array = new int[2][2];

        int left = 0, right = 0;
        int result = 0;
        while (right < tree.length) {
            while (!dealFruit(array, tree[right], true)) {
                dealFruit(array, tree[left++], false);
            }
            result = Math.max(result, right - left);
            right++;
        }
        return result + 1;
    }


    private boolean dealFruit(int[][] array, int value, boolean opp) {
        boolean result = false;
        int temp = opp ? 1 : -1;

        for (int i = 0; i < 2 && !result; i++) {
            if (array[0][i] == value && array[1][i] > 0) {
                array[1][i] += temp;
                result = true;
            }
        }

        for (int i = 0; i < 2 && !result; i++) {
            if (array[1][i] == 0) {
                array[0][i] = value;
                array[1][i] = 1;
                result = true;
            }
        }
        return result;
    }

}
