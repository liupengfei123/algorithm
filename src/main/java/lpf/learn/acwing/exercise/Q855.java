package lpf.learn.acwing.exercise;

import java.io.*;
import java.util.*;

/** 853. 有边数限制的最短路
 给定一个 n 个点 m 条边的有向图，图中可能存在重边和自环， 边权可能为负数。
 请你求出从 1 号点到 n 号点的最多经过 k 条边的最短距离，如果无法从 1 号点走到 n 号点，输出 impossible。
 注意：图中可能 存在负权回路 。

 输入格式
 第一行包含三个整数 n,m,k。
 接下来 m 行，每行包含三个整数 x,y,z，表示存在一条从点 x 到点 y 的有向边，边长为 z。
 点的编号为 1∼n。

 输出格式
 输出一个整数，表示从 1 号点到 n 号点的最多经过 k 条边的最短距离。
 如果不存在满足条件的路径，则输出 impossible。

 数据范围
 1≤n,k≤500,
 1≤m≤10000,
 1≤x,y≤n，
 任意边长的绝对值不超过 10000。

 输入样例：
 3 3 1
 1 2 1
 2 3 1
 1 3 3
 输出样例：
 3
 */
public class Q855 {
    private static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static int INF = 0x3f3f3f3f;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        Edge[] edges = new Edge[m];
        for (int i = 0; i < m; i++) {
            edges[i] = new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, INF);

        bellman_ford(edges, dist, k);

        if (dist[n] > INF / 2) out.println("impossible");
        else out.println(dist[n]);

        out.flush();
    }

    private static void bellman_ford(Edge[] edges, int[] dist, int k) {
        dist[1] = 0;
        int[] backup = new int[dist.length];

        for (int i = 0; i < k; i++) {
            System.arraycopy(dist, 0, backup, 0, dist.length);

            for (Edge edge : edges) {
                dist[edge.b] = Math.min(dist[edge.b], backup[edge.a] + edge.w);
            }
        }
    }

    static class Edge {
        int a, b, w;
        public Edge(int a, int b, int w) {
            this.a = a;
            this.b = b;
            this.w = w;
        }
    }
}
