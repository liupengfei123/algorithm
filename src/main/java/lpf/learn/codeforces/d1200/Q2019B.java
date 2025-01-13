package lpf.learn.codeforces.d1200;


import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/2019/B
 */
public class Q2019B {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), q = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            solve(n, q, a);
        }
        out.close();
    }

    private static void solve(int n, int q, int[] a) {
        Map<Long, Long> map = new HashMap<>();

        for (int i = 1; i < n; i++) {
            long key = (long)(n - i) * i;
            long value = a[i] - a[i - 1] - 1;

            map.merge(key, value, Long::sum);
            map.merge(i - 1 + key, 1L, Long::sum);
        }
        map.merge(n - 1L, 1L, Long::sum);
        while (q-- > 0) {
            System.out.print(map.getOrDefault(sc.nextLong(), 0L) + " ");
        }
        System.out.println();
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
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
