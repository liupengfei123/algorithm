package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1881/D
 */
public class Q1881D {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) out.println(solve(sc.nextInt()) ? "Yes" : "No");

        out.close();
    }

    private static boolean solve(int n) {
        Map<Integer, Integer> cnt = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            for (int k = 2; k * k <= value; k++) {
                while (value % k == 0) {
                    value /= k;

                    cnt.merge(k, 1, Integer::sum);
                }
            }
            if (value > 1) cnt.merge(value, 1, Integer::sum);
        }

        for (Integer value : cnt.values()) {
            if (value % n != 0) return false;
        }
        return true;
    }
}
