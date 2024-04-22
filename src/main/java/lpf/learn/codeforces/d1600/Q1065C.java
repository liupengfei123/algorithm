package lpf.learn.codeforces.d1600;

import java.io.*;
import java.util.*;

public class Q1065C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        out.print(solve(n, k, a));
        out.close();
    }

    private static long solve(int n, long k, Integer[] a) {
        Arrays.sort(a, Comparator.reverseOrder());

        long res = 0, sum = 0;
        for (int i = 1; i < n; i++) {
            long d = a[i - 1] - a[i];

            if (sum + d * i < k) {
                sum += d * i;
                continue;
            }
            d -= (k - sum) / i;

            res += 1 + d / (k / i);
            sum = i * (d % (k / i));
        }

        if (sum > 0) res++;

        return res;
    }
}
