package lpf.learn.codeforces.d1400;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1980/D
 */
public class Q1980D {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 5];
            for (int i = 3; i <= n + 2; i++) a[i] = sc.nextInt();

            out.println(solve(n, a) ? "Yes" : "No");
        }
        out.close();
    }

    private static boolean solve(int n, int[] a) {
        a[2] = 1;
        a[n + 4] = a[n + 1];

        int end = n + 1;
        for (int i = n; i > 3 && gcd(a[i], a[i + 1]) <= gcd(a[i + 1], a[i + 2]); i--) {
            end = i;
        }

        for (int i = 3; i <= n + 2 && gcd(a[i - 3], a[i - 2]) <= gcd(a[i - 2], a[i - 1]); i++) {
            int g = gcd(a[i - 1], a[i + 1]);

            if (i + 1 >= end && gcd(a[i - 2], a[i - 1]) <= g && g <= gcd(a[i + 1], a[i + 2])) {
                return true;
            }
        }
        return false;
    }

    private static int gcd(int a, int b) {
        while (a != 0) {
            int c = b % a;
            b = a;
            a = c;
        }
        return b;
    }
}
