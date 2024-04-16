package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q1304C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), t0 = sc.nextInt();
            int[][] a = new int[n][3];

            for (int i = 0; i < n; i++) {
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
                a[i][2] = sc.nextInt();
            }
            out.println(solve(n, t0, a) ? "YES" : "NO");
        }
        out.close();
    }


    private static boolean solve(int n, int t0, int[][] a) {
        long l = t0, h = t0;
        int lastT = 0;
        for (int i = 0; i < n; i++) {
            int diff = a[i][0] - lastT;
            lastT = a[i][0];

            l -= diff;
            h += diff;

            l = Math.max(l, a[i][1]);
            h = Math.min(h, a[i][2]);

            if (l > h) return false;
        }
        return true;
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
