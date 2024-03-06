package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1513/B
 */
public class Q1513B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private final static int MOD = 1000_000_007;

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
        int and = -1;
        for (int v : a) and &= v;

        long cnt = 0;
        for (int v : a) {
            if (v == and) cnt++;
        }

        long res = cnt * (cnt - 1);
        for (int i = 2; i <= n - 2; i++) res = (res * i) % MOD;
        return res;
    }
}
