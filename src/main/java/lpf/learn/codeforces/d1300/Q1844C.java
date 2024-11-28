package lpf.learn.codeforces.d1300;
import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1844/C
 */
public class Q1844C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            out.println(solve(a));
        }
        out.close();
    }

    private static long solve(int[] a) {
        long[] sum = new long[2];
        long max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) sum[i % 2] += a[i];

            max = Math.max(max, a[i]);
        }
        return max < 0 ? max : Math.max(sum[0], sum[1]);
    }
}
