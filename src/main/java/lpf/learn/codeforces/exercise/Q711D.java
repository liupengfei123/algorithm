package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/711/D
 */
public class Q711D {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final int MOD = 1000_000_007;


    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextInt() - 1;

        out.println(run(n, array));
        out.flush();
    }

    private static long run(int n, int[] to) {
        int[] time = new int[n];
        int clock = 1, noRangeCount = n;
        long res = 1;

        for (int i = 0; i < n; i++) {
            if (time[i] > 0) continue;

            for (int t0 = clock, j = i; j >= 0; j = to[j]) {
                if (time[j] > 0) {
                    if (time[j] >= t0) {
                        int step = clock - time[j];
                        noRangeCount -= step;
                        res = (res * (getValue(step) - 2)) % MOD;
                    }
                    break;
                }
                time[j] = clock++;
            }
        }
        res = (res * getValue(noRangeCount)) % MOD;
        return (res + MOD) % MOD;
    }

    private static long getValue(int cnt) {
        long res = 1;
        while (cnt > 60) {
            res = (res * ((1L << 60) % MOD)) % MOD;
            cnt -= 60;
        }
        return (res * ((1L << cnt) % MOD)) % MOD;
    }
}
