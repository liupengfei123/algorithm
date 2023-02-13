package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/** 851. Dijkstra求最短路 I
 给定一个 n 个点 m 条边的有向图，图中可能存在重边和自环，所有边权均为正值。
 请你求出 1 号点到 n 号点的最短距离，如果无法从 1 号点走到 n 号点，则输出 −1。
 输入格式
 第一行包含整数 n 和 m。
 接下来 m 行每行包含三个整数 x,y,z，表示存在一条从点 x 到点 y 的有向边，边长为 z。
 输出格式
 输出一个整数，表示 1 号点到 n 号点的最短距离。
 如果路径不存在，则输出 −1。
 数据范围
 1≤n≤500,
 1≤m≤105,
 图中涉及边长均不超过10000。

 输入样例：
 3 3
 1 2 2
 2 3 1
 1 3 4
 输出样例：
 3
 */
public class Q851 {
    private static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static int INF = 0x3f3f3f3f;
    private static int[][] g;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        g = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) Arrays.fill(g[i], INF);

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            g[x][y] = Math.min(g[x][y], sc.nextInt());
        }

        out.println(dijkstra(n));

        out.flush();
    }

    private static int dijkstra(int n) {
        int[] dict = new int[n + 1];
        Arrays.fill(dict, INF);
        dict[1] = 0;

        boolean[] st = new boolean[n + 1];
        for (int i = 1; i < n; i++) {
            int t = -1;
            for (int j = 1; j <= n; j++) {
                if (!st[j] && (t == -1 || dict[j] < dict[t])) t = j;
            }
            st[t] = true;

            for (int j = 1; j <= n; j++) dict[j] = Math.min(dict[j], dict[t] + g[t][j]);
        }
        return dict[n] == INF ? -1 : dict[n];
    }
}
