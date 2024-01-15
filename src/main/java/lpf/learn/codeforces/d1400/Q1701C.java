package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1701/C
 */
public class Q1701C {
    private final static MyScanner sc = new MyScanner();
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            out.println(solve(sc.nextInt(), sc.nextInt()));
        }
        out.close();
    }

    private static int solve(int n, int m) {
        int[] count = new int[n];
        for (int i = 0; i < m; i++) count[sc.nextInt() - 1]++;

        int l = 1, r = m;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (check(mid, count)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private static boolean check(int mid, int[] count) {
        long d1 = 0, d2 = 0;
        for (int v : count) {
            if (v > mid) {
                d2 += (v - mid);
            } else {
                d1 += ((mid - v) / 2);
            }
        }
        return d2 <= d1;
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
