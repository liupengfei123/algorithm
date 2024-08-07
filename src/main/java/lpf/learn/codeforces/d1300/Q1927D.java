package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1927/D
 */
public class Q1927D {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) a[i] = sc.nextInt();

            solve(n, a);
            out.println();
        }
        out.close();
    }

    private static void solve(int n, int[] a) {
        int[] next = new int[n + 1];

        int ni = 1;
        for (int i = 1; i <= n; i++) {
            while (ni <= n && a[ni] == a[i]) ni++;

            next[i] = ni;
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            int L = sc.nextInt(), R = sc.nextInt();

            if (next[L] > R) {
                out.println("-1 -1");
            } else {
                out.println(L+ " " + next[L]);
            }
        }
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
                } catch (IOException ignore) {}
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
