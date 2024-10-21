package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

public class Q1904C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            out.println(solve(n, k, a));
        }
        out.close();
    }

    private static long solve(int n, int k, long[] a) {
        if (k > 2) {
            return 0;
        }
        Arrays.sort(a);
        long min = a[0];

        if (k == 1) {
            for (int i = 1; i < n; i++) min = Math.min(min, a[i] - a[i - 1]);

            return min;
        }

        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < n; i++) set.add(a[i]);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long d = a[j] - a[i];

                min = Math.min(min, Math.min(d, set.ceiling(d) - d));

                Long floor = set.floor(d);
                if (floor != null) {
                    min = Math.min(min, d - floor);
                }
            }
        }
        return min;
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
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
