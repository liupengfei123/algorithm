package lpf.learn.codeforces.d1200;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1931/C
 */
public class Q1931C {
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

    private static int solve(int n, int[] a) {
        int pre = 0, suf = n - 1;

        for (; pre < n; pre++) if (a[pre] != a[0]) break;
        for (; suf >= 0; suf--) if (a[suf] != a[n - 1]) break;

        if (pre >= n) return 0;

        return a[0] == a[n - 1] ? suf - pre + 1 : Math.min(n - pre, suf + 1);
    }
}
