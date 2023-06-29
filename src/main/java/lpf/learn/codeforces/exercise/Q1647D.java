package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1647/D
 */
public class Q1647D {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static int res;

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) out.println(solve(sc.nextInt(), sc.nextInt()) ? "YES" : "NO");
        out.flush();
    }

    private static boolean solve(int x, int d) {
        int k = 0;
        for (; x % d == 0; x /= d) k++;

        if (k == 1) return false;

        if (!isPrime(x)) return true;

        // k 不能等于 2，
        // k 等于3 时 ，x * x ！= d
        // d 不能是质数
        return !(k == 2 || (k == 3 && d == (long)x * x) || isPrime(d));
    }

    private static boolean isPrime(int a) {
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
