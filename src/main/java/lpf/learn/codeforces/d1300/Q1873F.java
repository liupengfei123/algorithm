package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1873/F
 */
public class Q1873F {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n], h = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) h[i] = sc.nextInt();

            out.println(solve(n, k, a, h));
        }
        out.close();
    }

    private static int solve(int n, int k, int[] a, int[] h) {
        int  r = 0;
        int res = 0;
        while (r < n) {
            int last = h[r], l = r, sum = 0;
            boolean flag = true;
            for (; r < n && last % h[r] == 0; r++) {
                flag = false;
                sum += a[r];
                while (sum > k) sum -= a[l++];

                res = Math.max(res, r - l + 1);
                last = h[r];
            }
            // 没有经过符合条件的才需要 ++
            if (flag) r++;
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
