package lpf.learn.codeforces.d1600;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1198/B
 */
public class Q1198B {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        solve(n, a, sc.nextInt());

        for (int i = 0; i < n; i++) out.print(a[i] + " ");
        out.close();
    }

    private static void solve(int n, int[] a, int q) {
        int[] sufMax = new int[q];
        int[] changeTime = new int[n];

        for (int t = 0; t < q; t++) {
            int type = sc.nextInt();
            if (type == 1) {
                int p = sc.nextInt() - 1, x = sc.nextInt();
                a[p] = x;
                changeTime[p] = t;
            } else {
                sufMax[t] = sc.nextInt();
            }
        }
        for (int i = q - 2; i >= 0; i--) {
            sufMax[i] = Math.max(sufMax[i], sufMax[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            a[i] = Math.max(a[i], sufMax[changeTime[i]]);
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
