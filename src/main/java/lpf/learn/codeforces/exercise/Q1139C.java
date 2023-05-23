package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 *  https://codeforces.com/problemset/problem/1139/C
 */
public class Q1139C {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final int MOD = 1000_000_007;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n + 1];
        Arrays.setAll(p, i -> i);

        for (int i = 1; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), c = sc.nextInt();
            if (c == 0) p[find(x, p)] = find(y, p);
        }
        for (int i = 1; i <= n; i++) find(i, p);

        long res = 1;
        for (int i = 0; i < k; i++) res = (res * n) % MOD;

        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 1; i <= n; i++) cnt.merge(p[i], 1, Integer::sum);

        for (Integer value : cnt.values()) {
            long temp = 1;
            for (int i = 0; i < k; i++) temp = (temp * value) % MOD;
            res = (res - temp) % MOD;
        }

        out.println((res + MOD) % MOD);
        out.flush();
    }

    private static int find(int i, int[] p) {
        if (p[i] != i) p[i] = find(p[i], p);
        return p[i];
    }

}
