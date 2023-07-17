package lpf.learn.codeforces.d1400;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1195C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();

        int[][] a = new int[2][n];
        for (int i = 0; i < n; i++) a[0][i] = sc.nextInt();
        for (int i = 0; i < n; i++) a[1][i] = sc.nextInt();

        out.println(solve(n, a));
        out.close();
    }

    private static long solve(int n, int[][] a) {
        // d1:两个行都不选， d2:只选第一行，d3:只选第二行
        long d1 = 0, d2 = 0, d3 = 0;

        for (int i = 0; i < n; i++) {
            long nd1 = Math.max(d1, Math.max(d2, d3));
            long nd2 = Math.max(d1, d3) + a[0][i];
            long nd3 = Math.max(d1, d2) + a[1][i];

            d1 = nd1;
            d2 = nd2;
            d3 = nd3;
        }
        return Math.max(d1, Math.max(d2, d3));
    }
}
