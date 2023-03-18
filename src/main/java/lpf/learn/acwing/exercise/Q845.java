package lpf.learn.acwing.exercise;

import java.io.*;
import java.util.*;

/** 843. n-皇后问题
 n−皇后问题是指将 n 个皇后放在 n×n 的国际象棋棋盘上，使得皇后不能相互攻击到，即任意两个皇后都不能处于同一行、同一列或同一斜线上。
 现在给定整数 n，请你输出所有的满足条件的棋子摆法。
 输入格式
 共一行，包含整数 n。
 输出格式
 每个解决方案占 n 行，每行输出一个长度为 n 的字符串，用来表示完整的棋盘状态。
 其中 . 表示某一个位置的方格状态为空，Q 表示某一个位置的方格上摆着皇后。
 每个方案输出完成后，输出一个空行。
 注意：行末不能有多余空格。
 输出方案的顺序任意，只要不重复且没有遗漏即可。

 数据范围
 1≤n≤9
 输入样例：
 4
 输出样例：
 .Q..
 ...Q
 Q...
 ..Q.

 ..Q.
 Q...
 ...Q
 .Q..
 */
public class Q845 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static char[][] g;
    private static boolean[] col, dg, ndg;
    private static int n;

    public static void main(String[] args) {
        n = sc.nextInt();
        col = new boolean[n];
        dg = new boolean[n * 2];
        ndg = new boolean[n * 2];
        g = new char[n][n];

        for (int i = 0; i < n; i++) Arrays.fill(g[i], '.');

        // dfs(new int[n], 0);
        dfs2(0);

        out.flush();
    }


    private static void dfs2(int row) {
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) out.print(g[i][j]);
                out.println();
            }
            out.println();
            return;
        }

        for (int j = 0; j < n; j++) {
            if (col[j] || dg[row + j] || ndg[row - j + n]) continue;

            col[j] = dg[row + j] = ndg[row - j + n] = true;

            g[row][j] = 'Q';
            dfs2(row + 1);

            col[j] = dg[row + j] = ndg[row - j + n] = false;
            g[row][j] = '.';
        }
    }

    private static void dfs(int[] rows, int row) {
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) out.print(rows[i] == j ? "Q" : ".");
                out.println();
            }
            out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < row; j++) {
                if (rows[j] == i || (row + i == j + rows[j]) || (row + rows[j] == j + i)) {
                    flag = false;
                    break;
                }
            }
            if (!flag) continue;


            rows[row] = i;
            dfs(rows, row + 1);
        }
    }
}
