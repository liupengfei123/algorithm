package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

public class Q2008F {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    private final static int MOD = 1000_000_007;

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            System.out.println(solve(n, a));
        }
        out.close();
    }

    private static long solve(int n, int[] a) {
        long ans = 0, sum = 0;
        for (int r = 0; r < n; r++) {
            ans = (ans + sum * a[r]) % MOD;
            sum = (sum + a[r]) % MOD;
        }
        long den = (long) n * (n - 1) / 2;
        return ans * pow(den, MOD - 2) % MOD;
    }

    private static long pow(long x, int n) {
        x %= MOD;
        long res = 1;
        for (; n > 0; n /= 2) {
            if (n % 2 > 0) {
                res = res * x % MOD;
            }
            x = x * x % MOD;
        }
        return res;
    }
}
