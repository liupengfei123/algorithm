package lpf.learn.codeforces.d1700;

import java.io.*;
import java.util.*;

public class Q1765D {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        out.println(solve(n, m, a));

        out.close();
    }

    private static long solve(int n, int m, int[] a) {
        Arrays.sort(a);

        long res = n;
        for (int i = 0; i < n; i++) res += a[i];

        for (int l = 0, r = n - 1; l < r; r--) {
            if (a[l] + a[r] <= m) {
                l++;
                if (l < r) res--;

                res--;
            }
        }
        return res ;
    }
}
