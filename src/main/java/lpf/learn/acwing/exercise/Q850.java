package lpf.learn.acwing.exercise;

import java.io.*;
import java.util.*;

/** 848. 有向图的拓扑序列
 给定一个 n 个点 m 条边的有向图，点的编号是 1 到 n ，图中可能存在重边和自环。
 请输出任意一个该有向图的拓扑序列，如果拓扑序列不存在，则输出 −1 。
 若一个由图中所有点构成的序列 A 满足：对于图中的每条边 (x,y) ，x 在 A 中都出现在 y 之前，则称 A 是该图的一个拓扑序列。

 输入格式
 第一行包含两个整数 n 和 m 。
 接下来 m 行，每行包含两个整数 x 和 y ，表示存在一条从点 x 到点 y 的有向边 (x,y) 。
 输出格式
 共一行，如果存在拓扑序列，则输出任意一个合法的拓扑序列即可。
 否则输出 −1 。

 数据范围
 1≤n,m≤105
 输入样例：
 3 3
 1 2
 2 3
 1 3
 输出样例：
 1 2 3
 */
public class Q850 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final int N = 100050;
    private static int idx = 0;
    private static final int[] h = new int[N], ne = new int[N], v = new int[N], c = new int[N];

    private static void add(int a, int b) {
        v[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
        c[b]++;
    }

    public static void main(String[] args) {
        Arrays.fill(h, -1);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) add(sc.nextInt(), sc.nextInt());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (c[i] == 0) queue.offer(i);
        }

        List<Integer> list = new ArrayList<>(n);
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            list.add(poll);

            for (int i = h[poll]; i != -1; i = ne[i]) {
                if (--c[v[i]] == 0) queue.offer(v[i]);
            }
        }
        if (list.size() != n) {
            out.println("-1");
        } else {
            for (Integer v : list) out.print(v + " ");
            out.println();
        }
        out.flush();
    }


}
