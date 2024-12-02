package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/2026/B
 */
public class Q2026B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            long res = 1;
            if (n > 1) {
                if ((n & 1) == 1) {
                    res = solve(a, n);
                } else {
                    for (int i = 1; i < n; i += 2) res = Math.max(res, a[i] - a[i - 1]);
                }
            }
            out.println(res);
        }
        out.close();
    }

    private static long solve(long[] a, int n) {
        long[] suff = new long[n + 2];

        for (int i = n - 2; i >= 0; i-=2) {
            suff[i] = Math.max(suff[i + 2], a[i + 1] - a[i]);
        }
        long res = suff[1], max = 0;
        for (int i = 1; i < n; i+=2) {
            max = Math.max(max, a[i] - a[i - 1]);
            res = Math.min(res, Math.max(max, suff[i + 2]));
        }
        return res;
    }
}
