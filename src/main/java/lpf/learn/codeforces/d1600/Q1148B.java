package lpf.learn.codeforces.d1600;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1148/B
 */
public class Q1148B {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), ta = sc.nextInt(), tb = sc.nextInt(), k = sc.nextInt();

        int[] a = new int[n], b = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();


        out.println(solve(n, m, ta, tb, k, a, b));

        out.close();
    }

    private static int solve(int n, int m, int ta, int tb, int k, int[] a, int[] b) {
        if (k >= Math.min(n, m)) return -1;

        int res = -1;

        for (int i = 0, j = 0; i <= k; i++) {
            while (j < m && b[j] < a[i] + ta) j++;

            if (j + (k - i) >= m) return -1;

            res = Math.max(res, b[j + k - i] + tb);
        }
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
