package lpf.learn.leetcode.learn.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class YangHuitriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);

        if (numRows >= 1) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            result.add(temp);
        }

        int lastCount = 1;
        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            result.add(temp);

            for (int j = 0; j <= lastCount; j++) {
                List<Integer> lastRow = result.get(i - 1);

                int leftValue = 0, rightValue = 0;

                if (j - 1 >= 0) {
                    leftValue = lastRow.get(j - 1);
                }
                if (j < lastRow.size()) {
                    rightValue = lastRow.get(j);
                }

                int value = leftValue + rightValue;
                temp.add(value);
            }
            lastCount = temp.size();
        }
        return result;
    }
}
