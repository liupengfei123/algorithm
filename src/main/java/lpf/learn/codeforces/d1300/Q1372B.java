package lpf.learn.codeforces.d1300;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1372/B
 */
public class Q1372B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            solve(sc.nextInt());
        }
        out.close();
    }

    private static void solve(int n) {
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                out.println((n / d) + " " + (n - n / d));
                return;
            }
        }
        out.println(1 + "  " + (n - 1));
    }
}
