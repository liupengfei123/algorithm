package lpf.learn.leetcode.tags.graph;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** LCP 63 弹珠游戏
 欢迎各位来到「力扣嘉年华」，接下来将为各位介绍在活动中广受好评的弹珠游戏。

 `N*M` 大小的弹珠盘的初始状态信息记录于一维字符串型数组 `plate` 中，数组中的每个元素为仅由 `"O"`、`"W"`、`"E"`、`"."` 组成的字符串。其中：
 - `"O"` 表示弹珠洞（弹珠到达后会落入洞中，并停止前进）；
 - `"W"` 表示逆时针转向器（弹珠经过时方向将逆时针旋转 90 度）；
 - `"E"` 表示顺时针转向器（弹珠经过时方向将顺时针旋转 90 度）；
 - `"."` 表示空白区域（弹珠可通行）。

 游戏规则要求仅能在边缘位置的 **空白区域** 处（弹珠盘的四角除外）沿 **与边缘垂直** 的方向打入弹珠，并且打入后的每颗弹珠最多能 **前进** `num` 步。
 请返回符合上述要求且可以使弹珠最终入洞的所有打入位置。你可以 **按任意顺序** 返回答案。

 **注意：**
 - 若弹珠已到达弹珠盘边缘并且仍沿着出界方向继续前进，则将直接出界。

 **示例 1：**
 > 输入：
 > `num = 4`
 > `plate = ["..E.",".EOW","..W."]`
 > 输出：`[[2,1]]`
 > 解释：
 > 在 `[2,1]` 处打入弹珠，弹珠前进 1 步后遇到转向器，前进方向顺时针旋转 90 度，再前进 1 步进入洞中。
 > ![b054955158a99167b8d51da0e22a54da.gif](https://pic.leetcode-cn.com/1630392649-BoQncz-b054955158a99167b8d51da0e22a54da.gif)

 **示例 2：**
 > 输入：
 > `num = 5`
 > `plate = [".....","..E..",".WO..","....."]`
 > 输出：`[[0,1],[1,0],[2,4],[3,2]]`
 > 解释：
 > 在 `[0,1]` 处打入弹珠，弹珠前进 2 步，遇到转向器后前进方向逆时针旋转 90 度，再前进 1 步进入洞中。
 > 在 `[1,0]` 处打入弹珠，弹珠前进 2 步，遇到转向器后前进方向顺时针旋转 90 度，再前进 1 步进入洞中。
 > 在 `[2,4]` 处打入弹珠，弹珠前进 2 步后进入洞中。
 > 在 `[3,2]` 处打入弹珠，弹珠前进 1 步后进入洞中。
 > ![b44e9963239ae368badf3d00b7563087.gif](https://pic.leetcode-cn.com/1630392625-rckbdy-b44e9963239ae368badf3d00b7563087.gif)

 **示例 3：**
 > 输入：
 > `num = 3`
 > `plate = [".....","....O","....O","....."]`
 > 输出：`[]`
 > 解释：
 > 由于弹珠被击中后只能前进 3 步，且不能在弹珠洞和弹珠盘四角打入弹珠，故不存在能让弹珠入洞的打入位置。

 **提示：**
 - `1 <= num <= 10^6`
 - `1 <= plate.length, plate[i].length <= 1000`
 - `plate[i][j]` 仅包含 `"O"`、`"W"`、`"E"`、`"."`
 */
public class QEXvqDp {

    private final static int[][] dict = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    private String[] plate;
    private int n;
    private int m;
    private int totalPoint;

    public int[][] ballGame(int num, String[] plate) {
        this.plate = plate;
        this.n = plate.length;
        this.m = plate[0].length();
        this.totalPoint = n * m;

        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < n - 1; i++) {
            if (plate[i].charAt(0) == '.' && dfs(i, 0, 0, num, new HashSet<>()))
                list.add(new int[]{i, 0});

            if (plate[i].charAt(m - 1) == '.' && dfs(i, m - 1, 2, num, new HashSet<>()))
                list.add(new int[]{i, m - 1});
        }

        for (int j = 1; j < m - 1; j++) {
            if (plate[0].charAt(j) == '.' && dfs(0, j, 1, num, new HashSet<>()))
                list.add(new int[]{0, j});
            if (plate[n - 1].charAt(j) == '.' && dfs(n - 1, j, 3, num, new HashSet<>()))
                list.add(new int[]{n - 1, j});
        }

        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
    }

    private boolean dfs(int i, int j, int d, int num, Set<Integer> visit) {
        if (num < 0) return false;


        int valueIndex = (i * m + j) + (d * totalPoint);
        if (visit.contains(valueIndex)) {
            return false;
        }
        visit.add(valueIndex);

        char c = plate[i].charAt(j);
        if (c == 'O') return true;

        if (c == 'E') d = (d + 1) % 4;
        if (c == 'W') d = (d + 3) % 4;

        int ni = i + dict[d][0], nj = j + dict[d][1];

        if (ni < 0 || ni >= n || nj < 0 || nj >= m) return false;

        return dfs(ni, nj, d, num - 1, visit);
    }

}
