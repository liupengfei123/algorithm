package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1748/B
 */
public class Q1670C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private final static int MOD = 1000_000_007;

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n], b = new int[n], d = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            for (int i = 0; i < n; i++) d[i] = sc.nextInt();

            out.println(solve(n, a, b, d));
        }
        out.close();
    }

    private static long solve(int n, int[] a, int[] b, int[] d) {
        Map<Integer, Integer> ai = new HashMap<>();
        Map<Integer, Integer> bi = new HashMap<>();

        for (int i = 0; i < n; i++) {
            ai.put(a[i], i);
            bi.put(b[i], i);

            if (a[i] == b[i]) d[i] = a[i];
        }

        boolean[] visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (d[i] != 0) run(i, a, b, d, ai, bi, visit);
        }

        long res = 1;

        for (int i = 0; i < n; i++) {
            if (d[i] != 0) continue;

            d[i] = a[i];
            run(i, a, b, d, ai, bi, visit);

            res = (res * 2) % MOD;
        }
        return (res + MOD) % MOD;
    }

    private static void run(int i, int[] a, int[] b, int[] d, Map<Integer, Integer> ai, Map<Integer, Integer> bi, boolean[] visit) {
        if (visit[i]) return;

        visit[i] = true;
        int ni;
        if (d[i] == a[i]) {
            ni = ai.get(b[i]);
            d[ni] = b[i];
        } else {
            ni = bi.get(a[i]);
            d[ni] = a[i];
        }
        run(ni, a, b, d, ai, bi, visit);
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
