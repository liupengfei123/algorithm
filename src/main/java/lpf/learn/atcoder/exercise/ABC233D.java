package lpf.learn.atcoder.exercise;

import java.io.*;
import java.util.*;

/**
 * https://atcoder.jp/contests/abc233/tasks/abc233_d
 */
public class ABC233D {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        out.println(solve(a, k));
        out.flush();
    }

    private static long solve(int[] a, long k) {
        Map<Long, Long> cnt = new HashMap<>();
        cnt.merge(0L, 1L, Long::sum);

        long sum = 0, res = 0;
        for (int i : a) {
            sum += i;
            res += cnt.getOrDefault(sum - k, 0L);
            cnt.merge(sum, 1L, Long::sum);
        }
        return res;
    }
}
