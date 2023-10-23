package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1443/C
 */
public class Q1443C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n], b = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            out.println(solve(n, a, b));
        }
        out.close();
    }

    private static long solve(int n, int[] a, int[] b) {
        Integer[] index = new Integer[n];
        Arrays.setAll(index, i -> i);
        Arrays.sort(index, Comparator.comparing(i -> a[i]));

        long[] sufSum = new long[n + 1];
        for (int i = index.length - 1; i >= 0; i--) sufSum[i] = sufSum[i + 1] + b[index[i]];

        long res = sufSum[0];
        for (int i = 0; i < n; i++) {
            res = Math.min(res, Math.max(a[index[i]], sufSum[i + 1]));
        }
        return res;
    }
}
