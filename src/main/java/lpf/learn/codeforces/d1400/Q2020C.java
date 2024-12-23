package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/2020/C
 */
public class Q2020C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            out.println(solve(sc.nextLong(), sc.nextLong(), sc.nextLong()));
        }
        out.close();
    }

    private static long solve(long b, long c, long d) {
        long a = b ^ d;
        if (((a | b) - (a & c)) == d) {
            return a;
        } else {
            return -1;
        }
    }
}
