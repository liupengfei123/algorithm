package lpf.learn.codeforces.d1200;


import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1420/B
 */
public class Q1420B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();


            out.println(solve(a));
        }
        out.close();
    }

    private static long solve(int[] a) {
        int[] cnt = new int[33];

        for (int v : a) cnt[32 - Integer.numberOfLeadingZeros(v)]++;

        long res = 0;
        for (int c : cnt) {
            res += (long)c * (c - 1) / 2;
        }
        return res;
    }
}
