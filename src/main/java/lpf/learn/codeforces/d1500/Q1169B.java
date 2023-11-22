package lpf.learn.codeforces.d1500;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1169B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[m][2];
        for (int i = 0; i < m; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        out.println(solve(a, 1, a[0][0], 0) || solve(a, 1, a[0][1], 0) ? "YES" : "NO");
        out.close();
    }

    private static boolean solve(int[][] a, int i, int x, int y) {
        if (i >= a.length) return true;

        if (a[i][0] == x || a[i][1] == x || a[i][0] == y || a[i][1] == y) {
            return solve(a, i + 1, x, y);
        }
        return y > 0 ? false : solve(a, i + 1, x, a[i][0]) || solve(a, i + 1, x, a[i][1]);
    }
}
