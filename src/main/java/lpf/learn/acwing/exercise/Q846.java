package lpf.learn.acwing.exercise;

import java.io.*;
import java.util.*;

/** 844. 走迷宫
 给定一个 n×m 的二维整数数组，用来表示一个迷宫，数组中只包含 0 或 1 ，其中 0 表示可以走的路，1 表示不可通过的墙壁。
 最初，有一个人位于左上角 (1,1)
 处，已知该人每次可以向上、下、左、右任意一个方向移动一个位置。
 请问，该人从左上角移动至右下角 (n,m) 处，至少需要移动多少次。
 数据保证 (1,1) 处和 (n,m) 处的数字为 0 ，且一定至少存在一条通路。

 输入格式
 第一行包含两个整数 n 和 m 。
 接下来 n 行，每行包含 m 个整数（0 或 1 ），表示完整的二维数组迷宫。

 输出格式
 输出一个整数，表示从左上角移动至右下角的最少移动次数。
 数据范围
 1≤n,m≤100
 输入样例：
 5 5
 0 1 0 0 0
 0 1 0 1 0
 0 0 0 0 0
 0 1 1 1 0
 0 0 0 1 0
 输出样例：
 8
 */
public class Q846 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final int[][] dire = new int[][]{{1, 0}, {-1, 0}, {0 , 1}, {0, -1}};


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] g = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) g[i][j] = sc.nextInt();
        }

        bfs(n, m, g);

        out.flush();
    }

    private static void bfs(int n, int m, int[][] g) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        g[0][0] = 1;

        int step = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            step++;
            for (int i = 0; i < size; i++) {
                Integer poll = queue.poll();

                int x = poll / m;
                int y = poll % m;

                if (x == (n - 1) && y == (m - 1)) {
                    out.println(step - 1);
                    return;
                }
                for (int[] next : dire) {
                    int nx = next[0] + x;
                    int ny = next[1] + y;

                    if (nx < 0 || nx >= n || ny < 0 || ny >= m || g[nx][ny] == 1) continue;

                    g[nx][ny] = 1;
                    queue.offer(nx * m + ny);
                }
            }
        }
    }
}
