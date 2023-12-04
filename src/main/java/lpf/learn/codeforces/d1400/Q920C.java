package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

public class Q920C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        String s = sc.next();

        System.out.println(solve2(n, a, s) ? "YES" : "NO");
        out.close();
    }

    private static boolean solve2(int n, int[] a, String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < n - 1; i++) {
            if (chars[i] == '0') continue;

            int st = i;
            while (i < n - 1 && chars[i] == '1') i++;

            Arrays.sort(a, st, i + 1);
        }

        for (int i = 0; i < n; i++) {
            if (a[i] != i + 1) return false;
        }
        return true;
    }

    private static boolean solve(int n, int[] a, String s) {
        int[] nextZero = new int[n];
        int zeroIndex = Integer.MAX_VALUE >> 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') zeroIndex = i;

            nextZero[i] = zeroIndex;
        }

        for (int i = 0; i < n; i++) {
            int j = a[i] - 1;
            if (i == j) continue;

            int min = Math.min(i, j), max = Math.max(i, j);
            int zero = nextZero[min];
            if (zero >= min && zero < max) return false;
        }
        return true;
    }
}
