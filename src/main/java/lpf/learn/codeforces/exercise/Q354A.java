package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/354/A
 */
public class Q354A {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt(), ql = sc.nextInt(), qr = sc.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) q[i] = sc.nextInt();

        int[] sumR = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) sumR[i] = sumR[i + 1] + q[i] * r;

        int[] sumL = new int[n + 1];
        int res = sumR[0] + qr * (n - 1);
        for (int i = 0; i < n; i++) {
            sumL[i + 1] = sumL[i] + q[i] * l;

            int value = sumL[i + 1] + sumR[i + 1];
            value += Math.max(0, Math.abs(n - (i + 1) * 2) - 1) * (i + 1 < (n - i - 1) ? qr : ql);
            res = Math.min(res, value);
        }
        out.println(res);
        out.close();
    }
}
