package lpf.learn.codeforces.game.round878.div2;

import java.io.*;
import java.util.*;

public class QC {
    private static final MyScanner sc = new MyScanner();
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt(), q = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            out.println(run(n, k, q, a));
        }
        out.flush();
    }

    private static long run(int n, int k, int q, int[] a) {
        long res = 0;

        int l = 0, r = 0;
        while (r < n) {
            while (l < n && a[l] > q) l++;

            r = l;

            while (r < n && a[r] <= q) r++;

            long i = r - l - k + 1;
            if (i > 0) res += i * (i + 1) / 2;
            l = r;
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
