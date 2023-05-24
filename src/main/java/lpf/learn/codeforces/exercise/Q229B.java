package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

public class Q229B {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static int[] h;
    private static int[] ne = new int[200010];
    private static int[] e = new int[200010];
    private static int[] w = new int[200010];
    private static int idx;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        h = new int[n + 1];
        Arrays.fill(h, -1);

        while (m-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            add(a, b, c);
            add(b, a, c);
        }

        Map<Integer, Integer>[] maps = new Map[n + 1];

        for (int i = 1; i <= n; i++) {
            maps[i] = new HashMap<>();
            int[] temp = new int[sc.nextInt()];
            for (int j = 0; j < temp.length; j++) temp[j] = sc.nextInt();

            for (int j = temp.length - 1; j >= 0; j--) {
                Integer v = maps[i].get(temp[j] + 1);
                if (v == null) v = temp[j] + 1;
                maps[i].put(temp[j], v);
            }
        }

        out.println(dijkstra(n, maps));
        out.close();
    }


    private static int dijkstra(int n, Map<Integer, Integer>[] maps) {
        boolean[] st = new boolean[n + 1];
        int[] dict = new int[n + 1];
        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparing((int[] a) -> a[0]).thenComparing(b -> b[1]));   // first存储距离，second存储节点编号
        Arrays.fill(dict, 0x3f3f3f3f);
        dict[1] = maps[1].getOrDefault(0, 0);
        heap.add(new int[]{dict[1], 1});

        while (!heap.isEmpty())  {
            int[] t = heap.poll();
            int ver = t[1], distance = t[0];

            if (st[ver]) continue;
            st[ver] = true;

            for (int i = h[ver]; i != -1; i = ne[i]) {
                int j = e[i];
                int temp = distance + w[i];
                if (j != n) temp = maps[j].getOrDefault(temp, temp);

                if (dict[j] > temp) {
                    dict[j] = temp;
                    heap.add(new int[]{dict[j], j});
                }
            }
        }
        return dict[n] >= 0x3f3f3f3f ? -1 : dict[n];
    }

    private static void add(int x, int y, int c) {
        w[idx] = c;
        e[idx] = y;
        ne[idx] = h[x];
        h[x] = idx++;
    }


    private static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
