package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/2044/E
 */
public class Q2044E {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int k = sc.nextInt(), l1 = sc.nextInt(), r1 = sc.nextInt(), l2 = sc.nextInt(), r2 = sc.nextInt();

            out.println(solve(k, l1, r1, l2, r2));
        }
        out.close();
    }

    private static long solve(int k, int l1, int r1, int l2, int r2) {
        long x = 1;
        long res = 0;
        while (l1 * x <= r2) {
            long nl2 = ((l2 - 1) / x) + 1, nr2 = r2 / x;

            if (nl2 <= r1 && nr2 >= l1) {
                res += Math.min(nr2, r1) - Math.max(nl2, l1) + 1;
            }

            x *= k;
        }
        return res;
    }
}
