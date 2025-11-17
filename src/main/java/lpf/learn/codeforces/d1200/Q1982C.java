package lpf.learn.codeforces.d1200;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1982/C
 */
public class Q1982C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt(), L = sc.nextInt(), R = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            out.println(solve(n, L, R, a));
        }
        out.close();
    }

    private static int solve(int n, int L, int R, int[] a) {
        long sum = 0;
        int res = 0;

        for (int l = 0, r = 0; r < n && l < n; r++) {
            sum += a[r];

            if (sum < L) continue;

            while (sum > R) sum -= a[l++];

            if (L <= sum && sum <= R) {  // L <= sum <= R
                sum = 0;
                res++;
                l = r + 1;
            }
        }

        return res;
    }
}
