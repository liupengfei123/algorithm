package lpf.learn.leetcode.game.spring2022;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/** 3. 打地鼠
 * 欢迎各位勇者来到力扣城，本次试炼主题为「打地鼠」。
 * middle_img_v2_d5d09656-0616-4a80-845e-ece461c5ba9g.png
 * 勇者面前有一个大小为 3*3 的打地鼠游戏机，地鼠将随机出现在各个位置，moles[i] = [t,x,y] 表示在第 t 秒会有地鼠出现在 (x,y) 位置上，并于第 t+1 秒该地鼠消失。
 * 勇者有一把可敲打地鼠的锤子，初始时刻（即第 0 秒）锤子位于正中间的格子 (1,1)，锤子的使用规则如下：
 * 锤子每经过 1 秒可以往上、下、左、右中的一个方向移动一格，也可以不移动
 * 锤子只可敲击所在格子的地鼠，敲击不耗时
 * 请返回勇者最多能够敲击多少只地鼠。
 * 注意：
 * 输入用例保证在相同时间相同位置最多仅有一只地鼠
 *
 * 示例 1：
 * 输入： moles = [[1,1,0],[2,0,1],[4,2,2]]
 * 输出： 2
 * 解释：
 * 第 0 秒，锤子位于 (1,1)
 * 第 1 秒，锤子移动至 (1,0) 并敲击地鼠
 * 第 2 秒，锤子移动至 (2,0)
 * 第 3 秒，锤子移动至 (2,1)
 * 第 4 秒，锤子移动至 (2,2) 并敲击地鼠
 * 因此勇者最多可敲击 2 只地鼠
 *
 * 示例 2：
 * 输入：moles = [[2,0,2],[5,2,0],[4,1,0],[1,2,1],[3,0,2]]
 * 输出：3
 * 解释：
 * 第 0 秒，锤子位于 (1,1)
 * 第 1 秒，锤子移动至 (2,1) 并敲击地鼠
 * 第 2 秒，锤子移动至 (1,1)
 * 第 3 秒，锤子移动至 (1,0)
 * 第 4 秒，锤子在 (1,0) 不移动并敲击地鼠
 * 第 5 秒，锤子移动至 (2,0) 并敲击地鼠
 * 因此勇者最多可敲击 3 只地鼠
 *
 * 示例 3：
 * 输入：moles = [[0,1,0],[0,0,1]]
 * 输出：0
 * 解释：
 * 第 0 秒，锤子初始位于 (1,1)，此时并不能敲击 (1,0)、(0,1) 位置处的地鼠
 *
 * 提示：
 * 1 <= moles.length <= 10^5
 * moles[i].length == 3
 * 0 <= moles[i][0] <= 10^9
 * 0 <= moles[i][1], moles[i][2] < 3
 */
public class TaskZbAuEH {
    private int[][] threeTimeArray = {{0, 8}, {2, 6}, {6, 2}, {8, 0}};
    private int[][] twoTimeArray = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {0, 0}, {2, 0}, {-2, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}, {0, 2}, {0, -2}};
    private int[][] oneTimeArray = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {0, 0}};

    public int getMaximumNumber(int[][] moles) {
        Arrays.sort(moles, Comparator.comparing(value -> value[0]));

        int[] dp = new int[9];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[4] = 0;

        int lastTime = 0;
        for (int[] mole : moles) {
            if (lastTime != mole[0]) {
                dp = move(dp, mole[0] - lastTime);
                lastTime = mole[0];
            }

            dp[mole[1] * 3 + mole[2]]++;
        }

        return IntStream.of(dp).max().orElse(0);
    }

    private int[] move(int[] dp, int time) {
        int[] ndp = new int[9];
        Arrays.fill(ndp, Integer.MIN_VALUE);
        if (time >= 4) {
            Arrays.fill(ndp, IntStream.of(dp).max().orElse(0));
        } else if (time == 3) {
            moveThree(ndp, dp);
        } else if (time == 2) {
            moveOneOrTwo(ndp, dp, twoTimeArray);
        } else {
            moveOneOrTwo(ndp, dp, oneTimeArray);
        }

        return ndp;
    }

    private void moveThree(int[] ndp, int[] dp) {
        Arrays.fill(ndp, IntStream.of(dp[1], dp[3], dp[4], dp[5], dp[7]).max().orElse(0));

        for (int[] anInt : threeTimeArray) {
            for (int i = 0; i < ndp.length; i++) {
                if (i != anInt[1]) {
                    ndp[i] = Math.max(ndp[i], dp[anInt[0]]);
                }
            }
        }
    }

    private void moveOneOrTwo(int[] ndp, int[] dp, int[][] array) {
        for (int index = 0; index < 9; index++) {
            for (int[] ints : array) {

                int x = index / 3 + ints[0];
                int y = index % 3 + ints[1];

                if (x < 0 || x >= 3 || y < 0 || y >= 3) {
                    continue;
                }
                int nIndex = x * 3 + y;
                ndp[nIndex] = Math.max(ndp[nIndex], dp[index]);
            }
        }
    }
}
