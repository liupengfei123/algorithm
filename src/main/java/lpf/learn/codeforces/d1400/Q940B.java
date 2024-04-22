package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/940/B
 */
public class Q940B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        out.println(solve(n, k, a, b));
        out.close();
    }

    private static long solve(long n, long k, long a, long b) {
        long res = 0;
        while (n > 1) {
            res += a * (n % k);
            n -= n % k;

            if (a * (n -  n / k) <= b) {
                res += a * (n - 1);
                break;
            }
            res += b;
            n = n / k;
        }
        return res;
    }
}
