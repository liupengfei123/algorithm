package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1157/C2
 */
public class Q1157G2 {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        String res = solve(n, a);
        out.println(res.length());
        out.println(res);
        out.flush();
    }

    private static String solve(int n, int[] a) {
        StringBuilder sb = new StringBuilder();

        int l = 0, r = n - 1, lastV = 0;
        while (l <= r) {
            if (a[l] <= lastV && a[r] <= lastV) break;

            if (a[l] == a[r]) {
                int tempL = l;
                while (tempL + 1 < n && a[tempL + 1] > a[tempL]) tempL++;
                int tempR = r;
                while (tempR - 1 > 0 && a[tempR - 1] > a[tempR]) tempR--;

                if (tempL - l > r - tempR) {
                    for (int i = 0; i <= tempL - l; i++) sb.append('L');
                } else {
                    for (int i = 0; i <= r - tempR; i++) sb.append('R');
                }
                break;
            }
            if ((a[l] < a[r] && a[l] > lastV) || (a[l] > a[r] && a[r] <= lastV)) {
                sb.append('L');
                lastV = a[l++];
            } else {
                sb.append('R');
                lastV = a[r--];
            }
        }
        return sb.toString();
    }
}
