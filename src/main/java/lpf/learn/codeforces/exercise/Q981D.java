package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

public class Q981D {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();

        out.println(solve(n, k, a));
        out.close();
    }

    private static long solve(int n, int k, long[] a) {
        long[] sum = new long[n + 1];
        for (int i = 0; i < n; i++) sum[i + 1] = sum[i] + a[i];

        long ans = 0;
        for (int i = 63 - Long.numberOfLeadingZeros(sum[n]); i >= 0; i--) {
            long target = ans | (1L << i);

            boolean[] dp = new boolean[n + 1];
            dp[0] = true;
            for (int z = 0; z < k; z++) {
                for (int r = n; r > 0; r--) {
                    dp[r] = false;
                    for (int l = 0; l <= r; l++) {
                        if (dp[l] && ((sum[r] - sum[l]) & target) == target) {
                            dp[r] = true;
                            break;
                        }
                    }
                }
                dp[0] = false;
            }
            if (dp[n]) ans = target;
        }
        return ans;
    }
}
