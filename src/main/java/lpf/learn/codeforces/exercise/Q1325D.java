package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1325D {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        long u = sc.nextLong();
        long v = sc.nextLong();

        if (u <= v && (u & 1) == (v & 1)) {
            long[] run = run(u, v);
            out.println(run.length);
            for (long i : run) out.print(i + " ");
        } else {
            out.println(-1);
        }
        out.close();
    }

    private static long[] run(long u, long v) {
        if (u == 0 && v == 0) return new long[0];
        if (u == v) return new long[]{u};

        long x = (v - u) / 2;
        if ((x & u) == 0) {
            return new long[]{u | x, x};
        } else {
            return new long[]{u, x, x};
        }
    }
}
