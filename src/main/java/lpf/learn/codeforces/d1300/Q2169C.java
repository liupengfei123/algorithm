package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/2169/C
 */
public class Q2169C {
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

    private static long solve(int n, int[] arr) {
        long[] preSum = new long[n + 1];
        for (int i = 0; i < n; i++) preSum[i + 1] = preSum[i] + arr[i];

        long max = preSum[n];
        for (int l = 1, r = 1; r <= n; r++) {
            while ((l + r) * (r - l + 1L) < (preSum[r] - preSum[l - 1])) {
                l++;
            }
            long temp = (l + r) * (r - l + 1L) + (preSum[n] - preSum[r]) + (preSum[l - 1] - preSum[0]);
            max = Math.max(max, temp);
        }

        return max;
    }
}
