package lpf.learn.codeforces.exercise;


import java.io.*;
import java.util.*;

public class Q292D {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();

        int[][] grep = new int[m + 1][2];
        for (int i = 1; i <= m; i++) {
            grep[i][0] = sc.nextInt();
            grep[i][1] = sc.nextInt();
        }

        int[][] pre = new int[m + 1][n + 1];
        Arrays.setAll(pre[0], i -> i);
        for (int i = 1; i <= m; i++) {
            System.arraycopy(pre[i - 1], 0, pre[i], 0, n + 1);
            pre[i][find(grep[i][0], pre[i])] = find(grep[i][1], pre[i]);
        }

        int[][] suff = new int[m + 2][n + 1];
        Arrays.setAll(suff[m + 1], i -> i);
        for (int i = m; i > 0; i--) {
            System.arraycopy(suff[i + 1], 0, suff[i], 0, n + 1);
            suff[i][find(grep[i][0], suff[i])] = find(grep[i][1], suff[i]);
        }

        int k = sc.nextInt();
        int[] p = new int[n + 1];
        while (k-- > 0) {
            out.println(solve(n, pre[sc.nextInt() - 1], suff[sc.nextInt() + 1], p));
        }
        out.close();
    }

    private static int solve(int n, int[] pre, int[] suff, int[] p) {
        System.arraycopy(pre, 0, p, 0, n + 1);

        for (int i = 1; i <= n; i++) p[find(i, p)] = find(suff[i], p);

        int cnt = 0;
        for (int i = 1; i <= n; i++) if (i == p[i]) cnt++;
        return cnt;
    }


    private static int find(int x, int[] p) {
        if (p[x] != x) p[x] = find(p[x], p);
        return p[x];
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
