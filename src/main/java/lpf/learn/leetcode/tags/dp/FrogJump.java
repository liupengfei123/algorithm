package lpf.learn.leetcode.tags.dp;

import java.util.*;

/** [403]青蛙过河
 *
 * 一只青蛙想要过河。 假定河流被等分为若干个单元格，并且在每一个单元格内都有可能放有一块石子（也有可能没有）。 青蛙可以跳上石子，但是不可以跳入水中。
 *  给你石子的位置列表 stones（用单元格序号 升序 表示）， 请判定青蛙能否成功过河（即能否在最后一步跳至最后一块石子上）。
 *  开始时， 青蛙默认已站在第一块石子上，并可以假定它第一步只能跳跃一个单位（即只能从单元格 1 跳至单元格 2 ）。
 *  如果青蛙上一步跳跃了 k 个单位，那么它接下来的跳跃距离只能选择为 k - 1、k 或 k + 1 个单位。 另请注意，青蛙只能向前方（终点的方向）跳跃。
 *
 * 示例 1：
 * 输入：stones = [0,1,3,5,6,8,12,17]
 * 输出：true
 * 解释：青蛙可以成功过河，按照如下方案跳跃：跳 1 个单位到第 2 块石子, 然后跳 2 个单位到第 3 块石子, 接着 跳 2 个单位到第 4 块石子, 然
 * 后跳 3 个单位到第 6 块石子, 跳 4 个单位到第 7 块石子, 最后，跳 5 个单位到第 8 个石子（即最后一块石子）。
 *
 * 示例 2：
 * 输入：stones = [0,1,2,3,4,8,9,11]
 * 输出：false
 * 解释：这是因为第 5 和第 6 个石子之间的间距太大，没有可选的方案供青蛙跳跃过去。
 *
 *  提示：
 *
 *  2 <= stones.length <= 2000
 *  0 <= stones[i] <= 2^31 - 1
 *  stones[0] == 0
 * @author liupf
 * @date 2021-03-21 14:05
 */
public class FrogJump {

    public boolean canCross(int[] stones) {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        for (int stone : stones) {
            map.put(stone, new HashSet<>());
        }
        map.get(0).add(0);
        for (int stone : stones) {
            for (int k : map.get(stone)) {
                // 通过 计算 step - 1 + currentPosition 到 step + 1 + currentPosition 是否有 nextPosition 的值
                for (int step = k - 1; step <= k + 1; step++) {
                    if (step > 0 && map.containsKey(stone + step)) {
                        map.get(stone + step).add(step);
                    }
                }
            }
        }
        return map.get(stones[stones.length - 1]).size() > 0;
    }

    public boolean canCross2(int[] stones) {
        if (stones[1] != 1) {
            return false;
        }
        Set<Integer>[] dps = new Set[stones.length];
        int[] maxValue = new int[stones.length];
        int[] minValue = new int[stones.length];
        dps[1] = new HashSet<>(Collections.singletonList(1));
        maxValue[1] = 1;
        minValue[1] = 1;

        for (int i = 2; i < stones.length; i++) {
            dps[i] = new HashSet<>();
            int max = 0;
            int min = Integer.MAX_VALUE;
            for (int j = i - 1; j > 0; j--) {
                Set<Integer> dp = dps[j];
                if (dp == null || dp.size() <= 0) {
                    continue;
                }
                int diff = stones[i] - stones[j];
                int maxTemp = maxValue[j];
                int minTemp = minValue[j];

                if (diff < minTemp - 1 || diff > maxTemp + 1) {
                    continue;
                }
                // 计算之前的点到当前位置有几种到达的方法。
                for (Integer value : dp) {
                    if (value - 1 <= diff && diff <= value + 1) {
                        dps[i].add(diff);
                        max = Math.max(max, diff);
                        min = Math.min(min, diff);
                    }
                }
            }
            maxValue[i] = max;
            minValue[i] = min;
        }
        return dps[stones.length - 1].size() > 0;
    }
}
