package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/** 851. spfa求最短路
 给定一个 n 个点 m 条边的有向图，图中可能存在重边和自环， 边权可能为负数。
 请你求出 1 号点到 n 号点的最短距离，如果无法从 1 号点走到 n 号点，则输出 impossible。
 数据保证不存在负权回路。

 输入格式
 第一行包含整数 n 和 m。
 接下来 m 行每行包含三个整数 x,y,z，表示存在一条从点 x 到点 y 的有向边，边长为 z。

 输出格式
 输出一个整数，表示 1 号点到 n 号点的最短距离。
 如果路径不存在，则输出 impossible。

 数据范围
 1≤n,m≤105,
 图中涉及边长绝对值均不超过 10000。

 输入样例：
 3 3
 1 2 5
 2 3 -3
 1 3 4
 输出样例：
 2
 */
public class Q853 {
    private static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static int INF = 0x3f3f3f3f;

    private static int N = 100010;
    private static int idx = 0;
    private static boolean[] st = new boolean[N];
    private static int[] h = new int[N], e = new int[N], w = new int[N], ne = new int[N];


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        Arrays.fill(h, -1);
        Arrays.fill(st, false);

        for (int i = 0; i < m; i++) add(sc.nextInt(), sc.nextInt(), sc.nextInt());

        int[] dist = new int[n + 1];
        Arrays.fill(dist, INF);

        SPAF(dist);

        if (dist[n] == INF) out.println("impossible");
        else out.println(dist[n]);

        out.flush();
    }

    private static void SPAF(int[] dist) {

        dist[1] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        st[1] = true;

        while (!queue.isEmpty()) {
            Integer t = queue.poll();
            st[t] = false;

            for (int i = h[t]; i != -1; i = ne[i]) {
                int j = e[i];
                if (dist[j] > dist[t] + w[i]) {
                    dist[j] = dist[t] + w[i];

                    if (!st[j]) {
                        st[j] = true;
                        queue.add(j);
                    }
                }
            }
        }
    }

    private static void add(int a, int b, int c) {
        e[idx] = b;
        w[idx] = c;
        ne[idx] = h[a];
        h[a] = idx++;
    }
}
