package lpf.learn.codeforces.d1200;


import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/2069/B
 */
public class Q2069B {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private final static int[][] dict = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++) a[i][j] = sc.nextInt();
            }
            out.println(solve(n, m, a));
            out.flush();
        }
        out.close();
    }

    private static int solve(int n, int m, int[][] a) {
        Set<Integer> isolated = new HashSet<>();
        Set<Integer> link = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int color = a[i][j];
                boolean isolate = true;
                for (int[] d : dict) {
                    int ni = i + d[0], nj = j + d[1];

                    if (ni < 0 || ni >= n || nj < 0 || nj >= m) continue;

                    if (color == a[ni][nj]) {
                        isolate = false;
                        break;
                    }
                }
                (isolate ? isolated : link).add(color);
            }
        }
        isolated.removeAll(link);

        int res = 2 * link.size() + isolated.size();
        res -= (link.isEmpty() ? 1 : 2);

        return res;
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
                } catch (IOException e) {}
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
