package lpf.learn.atcoder.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc296/tasks/abc296_d
 */
public class ABC296D {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        out.println(solve(sc.nextLong(), sc.nextLong()));
        out.flush();
    }

    private static long solve(long n, long m) {
        if (m <= n) return m;

        long res = -1;
        for (long a = 1, b = (m + a - 1) / a; a <= b; a++, b = (m + a - 1) / a) {
            if (b <= n) {
                res = Math.min(res == -1 ? Long.MAX_VALUE : res, a * b);
            }
        }
        return res;
    }
}
