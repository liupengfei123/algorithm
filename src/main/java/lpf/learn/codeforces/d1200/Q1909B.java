package lpf.learn.codeforces.d1200;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1909/B
 */
public class Q1909B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            out.println(solve(n));
        }
        out.close();
    }

    private static long solve(int n) {
        long or = 0, and = -1;

        for (int i = 0; i < n; i++) {
            long v = sc.nextLong();
            or |= v;
            and &= v;
        }
        long res = or ^ and;
        return (res & -res) << 1;
    }
}
