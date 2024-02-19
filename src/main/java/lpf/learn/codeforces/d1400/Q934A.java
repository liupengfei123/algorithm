package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/934/A
 */
public class Q934A {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        long[] a = new long[n], b = new long[m];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();

        out.println(solve(n, m, a, b));
        out.close();
    }

    private static long solve(int n, int m, long[] a, long[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        long res = Long.MAX_VALUE;
        res = Math.min(res,
                Math.max(
                        Math.max(a[1] * b[m - 1], a[n - 1] * b[0]),
                        Math.max(a[1] * b[0], a[n - 1] * b[m - 1])
                )
        );

        res = Math.min(res,
                Math.max(
                        Math.max(a[0] * b[m - 1], a[n - 2] * b[0]),
                        Math.max(a[0] * b[0], a[n - 2] * b[m - 1])
                )
        );
        return res;
    }
}
