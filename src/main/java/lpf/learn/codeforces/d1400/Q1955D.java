package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1955/D
 */
public class Q1955D {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();

            int[] a = new int[n], b = new int[m];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();

            out.println(solve(n, m, k, a, b));
        }
        out.close();
    }

    private static int solve(int n, int m, int k, int[] a, int[] b) {
        Map<Integer, Integer> counts = new HashMap<>(n);
        for (int i : b) counts.merge(i, 1, Integer::sum);

        int res = 0, r = 0, c = 0;

        for (; r < m; r++) {
            if (counts.merge(a[r], -1, Integer::sum) >= 0) c++;
        }
        if (c >= k) res++;

        for (int l = 0; r < n; r++, l++) {
            if (counts.merge(a[r], -1, Integer::sum) >= 0) c++;
            if (counts.merge(a[l], 1, Integer::sum) > 0) c--;

            if (c >= k) res++;
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
