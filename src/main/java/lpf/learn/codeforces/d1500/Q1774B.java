package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q1774B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[m];
            for (int i = 0; i < m; i++) a[i] = sc.nextInt();

            out.println(solve(n, m, k, a) ? "YES" : "NO");
        }
        out.close();
    }

    private static boolean solve(int n, int m, int k, int[] a) {
        int v = n / k, cnt = n % k;
        for (int i = 0; i < m; i++) {
            if (a[i] > v + 1) return false;
            if (a[i] == v + 1) cnt--;
        }
        return cnt >= 0;
    }
}
