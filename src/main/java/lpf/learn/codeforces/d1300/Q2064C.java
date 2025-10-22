package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/2064/C
 */
public class Q2064C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            out.println(solve(n, a));
        }
        out.close();
    }

    private static long solve(int n, int[] a) {
        long[] suffSum = new long[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suffSum[i] = suffSum[i + 1];

            if (a[i] < 0) suffSum[i] -= a[i];
        }

        long res = suffSum[0], sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) sum += a[i];

            res = Math.max(res, sum + suffSum[i + 1]);
        }

        return res;
    }
}
