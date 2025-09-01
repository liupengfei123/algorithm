package lpf.learn.codeforces.d1300;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1555/B
 */
public class Q1555B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            out.println(solve());
        }
        out.close();
    }

    private static double solve() {
        int W = sc.nextInt(), H = sc.nextInt();
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        int w = sc.nextInt(), h = sc.nextInt();

        double res = Double.MAX_VALUE;
        if (w + x2 - x1 <= W) {
            int d = Math.max(x1, W - x2);
            res = Math.max(0, w - d);
        }
        if (h + y2 - y1 <= H) {
            int d = Math.max(y1, H - y2);
            res = Math.min(res, Math.max(0, h - d));
        }
        return res == Double.MAX_VALUE ? -1 : res;
    }
}
