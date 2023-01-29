package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/** 847. 图中点的层次
 给定一个 n 个点 m 条边的有向图，图中可能存在重边和自环。
 所有边的长度都是 1 ，点的编号为 1∼n 。
 请你求出 1 号点到 n 号点的最短距离，如果从 1 号点无法走到 n 号点，输出 −1 。

 输入格式
 第一行包含两个整数 n 和 m 。
 接下来 m 行，每行包含两个整数 a 和 b ，表示存在一条从 a 走到 b 的长度为 1 的边。
 输出格式
 输出一个整数，表示 1 号点到 n 号点的最短距离。
 数据范围
 1≤n,m≤105
 输入样例：
 4 5
 1 2
 2 3
 3 4
 1 3
 1 4
 输出样例：
 1
 */
public class Q849 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final int N = 100050;
    private static int idx = 0;
    private static final int[] h = new int[N], ne = new int[N], v = new int[N], step = new int[N];

    private static void add(int a, int b) {
        v[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    public static void main(String[] args) {
        Arrays.fill(h, -1);
        Arrays.fill(step, -1);

        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) add(sc.nextInt(), sc.nextInt());

        bfs();

        out.println(step[n]);
        out.flush();
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        step[1] = 0;
        queue.offer(1);
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();

            for (int i = h[poll]; i != -1; i = ne[i]) {
                int j = v[i];
                if (step[j] != -1) continue;

                step[j] = step[poll] + 1;
                queue.offer(j);
            }
        }
    }
}
