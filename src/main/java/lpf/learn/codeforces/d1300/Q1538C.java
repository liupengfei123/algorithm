package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1538/C
 */
public class Q1538C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), L = sc.nextInt(), R = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            out.println(solve(n, L, R, a));
        }
        out.close();
    }

    private static long solve(int n, int L, int R, int[] a) {
        Arrays.sort(a);

        long res = 0;
        for (int i = 0; i < n; i++) {
            int r = lowerBound(a, i, R - a[i] + 1);
            int l = lowerBound(a, i, L - a[i]);

            res += r - l;
        }
        return res;
    }

    private static int lowerBound(int[] n, int right, int target) {
        int left = -1;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (n[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
