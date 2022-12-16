package lpf.learn.leetcode.game.autumn2022;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class QEXvqDp {
    private int[][] dicts = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
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
            if (plate[i].charAt(0) == '.' && dfs(i, 0, new HashSet<>(), num, 0))
                list.add(new int[]{i, 0});

            if (plate[i].charAt(m - 1) == '.' && dfs(i, m - 1, new HashSet<>(), num, 2))
                list.add(new int[]{i, m - 1});
        }
        for (int j = 1; j < m - 1; j++) {
            if (plate[0].charAt(j) == '.' && dfs(0, j, new HashSet<>(), num, 1))
                list.add(new int[]{0, j});

            if (plate[n - 1].charAt(j) == '.' && dfs(n - 1, j, new HashSet<>(), num, 3))
                list.add(new int[]{n - 1, j});
        }

        return list.toArray(new int[0][0]);
    }

    private boolean dfs(int i, int j, HashSet<Integer> visit, int count, int type) {
        if (count < 0) {
            return false;
        }
        if (i < 0 || i > n - 1 || j < 0 || j > m - 1) {
            return false;
        }
        int valueIndex = (i * m + j) + (type * totalPoint);
        if (visit.contains(valueIndex)) {
            return false;
        }
        visit.add(valueIndex);

        char c = plate[i].charAt(j);
        if (c == 'O') {
            return true;
        }
        if (c == 'W') {
            type = (type + 3) % 4;
        } else if (c == 'E') {
            type = (type + 1) % 4;
        }
        return dfs(i + dicts[type][0], j + dicts[type][1], visit, count - 1, type);
    }

}
