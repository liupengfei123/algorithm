package lpf.learn.acwing.exercise;

import java.io.*;
import java.util.*;

/** 846. 树的重心
 给定一颗树，树中包含 n 个结点（编号 1∼n ）和 n−1 条无向边。
 请你找到树的重心，并输出将重心删除后，剩余各个连通块中点数的最大值。
 重心定义：重心是指树中的一个结点，如果将这个点删除后，剩余各个连通块中点数的最大值最小，那么这个节点被称为树的重心。
 输入格式
 第一行包含整数 n ，表示树的结点数。
 接下来 n−1 行，每行包含两个整数 a 和 b ，表示点 a 和点 b 之间存在一条边。

 输出格式
 输出一个整数 m ，表示将重心删除后，剩余各个连通块中点数的最大值。

 数据范围
 1≤n≤105
 输入样例
 9
 1 2
 1 7
 1 4
 2 8
 2 5
 4 3
 3 9
 4 6
 输出样例：
 4
 */
public class Q848 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final int N = 100050;
    private static int idx = 0, n, result = N;
    private static final int[] h = new int[N], ne = new int[N * 2], v = new int[N * 2];
    private static final boolean[] visited = new boolean[N];

    private static void add(int a, int b) {
        v[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    public static void main(String[] args) {
        Arrays.fill(h, -1);
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            add(a, b);
            add(b, a);
        }

        dfs(1);

        out.println(result);
        out.flush();
    }

    private static int dfs(int p) {
        visited[p] = true;
        int max = 0, sum = 0;
        for (int i = h[p]; i != -1; i = ne[i]) {
            if (visited[v[i]]) continue;

            int temp = dfs(v[i]);
            max = Math.max(max, temp);
            sum += temp;
        }
        result = Math.min(result, Math.max(max, n - sum - 1));
        return sum + 1;
    }
}
