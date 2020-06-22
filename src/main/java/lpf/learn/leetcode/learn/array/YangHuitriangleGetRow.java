package lpf.learn.leetcode.learn.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 * 输入: 3
 * 输出: [1,3,3,1]
 * 进阶：
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 */
public class YangHuitriangleGetRow {


    public List<Integer> getRow(int rowIndex) {
        rowIndex = rowIndex + 1;
        List<Integer> result = new ArrayList<>(rowIndex);

        for (int k = 0; k < rowIndex; k++) {
            /*
             * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
             */
            long lotteryOdds = 1;
            for (int i = 1; i <= k; i++) {
                lotteryOdds = lotteryOdds * (rowIndex - i) / i;
            }
            result.add((int) lotteryOdds);
        }
        return result;
    }
}
