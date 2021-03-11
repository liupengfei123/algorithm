package lpf.learn.leetcode.tags.dp;

import java.util.Arrays;

/** [309]最佳买卖股票时机含冷冻期
 * 给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。
 * 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
 * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 *
 * 示例:
 * 输入: [1,2,3,0,2]
 * 输出: 3
 * 解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]
 */
public class BestTimeToBuyAndSellStockWithCooldown {

    private int[] prices;
    private int[] dpBuy;
    private int[] dpNoBuy;
    private int[] dpSell;

    public int maxProfit(int[] prices) {
        this.prices = prices;
        this.dpBuy = new int[prices.length];
        this.dpNoBuy = new int[prices.length];
        this.dpSell = new int[prices.length];
        Arrays.fill(dpBuy, Integer.MIN_VALUE);
        Arrays.fill(dpNoBuy, Integer.MIN_VALUE);
        Arrays.fill(dpSell, Integer.MIN_VALUE);

        return Math.max(buy(0, true), buy(0, false));
    }


    private int buy(int i, boolean isBuy) {
        if (i >= prices.length) {
            return 0;
        }
        int value;
        if (isBuy) {
            if (dpBuy[i] != Integer.MIN_VALUE) {
                return dpBuy[i];
            }
            value = sell(i + 1) - prices[i];
            dpBuy[i] = value;
        } else {
            if (dpNoBuy[i] != Integer.MIN_VALUE) {
                return dpNoBuy[i];
            }
            value = Math.max(buy(i + 1, true), buy(i + 1, false));
            dpNoBuy[i] = value;
        }
        return value;
    }

    private int sell(int i) {
        if (i >= prices.length) {
            return 0;
        }
        if (dpSell[i] != Integer.MIN_VALUE) {
            return dpSell[i];
        }
        int value = Math.max(buy(i + 1, false) + prices[i], sell(i + 1));
        dpSell[i] = value;
        return value;
    }
}
