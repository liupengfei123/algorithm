package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 *  https://codeforces.com/problemset/problem/1626/C
 */
public class Q1626C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] k = new int[n], h = new int[n];
            for (int i = 0; i < n; i++) k[i] = sc.nextInt();
            for (int i = 0; i < n; i++) h[i] = sc.nextInt();

            out.println(solve(n, k, h));
        }
        out.flush();
    }

    private static long solve(int n, int[] k, int[] h) {
        long res = 0;
        int l = k[n - 1], r = k[n - 1];

        for (int i = n - 1; i >= 0; i--) {
            if (k[i] < l) {
                res += (long)(r - l + 1) * (r - l + 2) / 2;
                l = r = k[i];
            }
            if (l == r || k[i] >= l) l = Math.min(l, k[i] - h[i] + 1);
        }
        res += (long)(r - l + 1) * (r - l + 2) / 2;
        return res;
    }
}
