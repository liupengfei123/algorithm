package lpf.learn.atcoder.exercise;

import java.io.*;
import java.util.*;

/**
 * https://atcoder.jp/contests/abc308/tasks/abc308_e
 */
public class ABC308E {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        String s = sc.next();

        out.println(solve(n, a, s));
        out.flush();
    }

    private static long solve(int n, int[] a, String s) {
        char[] chars = s.toCharArray();
        int[][] icnt = new int[n][3];
        int[][] kcnt = new int[n][3];

        int[] temp = new int[3];
        for (int i = 0; i < n; i++) {
            if (chars[i] == 'M') temp[a[i]]++;
            System.arraycopy(temp, 0, icnt[i], 0, 3);
        }
        temp = new int[3];
        for (int k = n - 1; k >= 0; k--) {
            if (chars[k] == 'X') temp[a[k]]++;
            System.arraycopy(temp, 0, kcnt[k], 0, 3);
        }

        long res = 0;
        long[] mex = new long[]{0, 1, 0, 2, 0, 1, 0, 3};

        for (int j = 0; j < n; j++) {
            if (chars[j] != 'E') continue;

            for (int t = 0; t < 9; t++) {
                int i = t / 3, k = t % 3;

                if (icnt[j][i] == 0 || kcnt[j][k] == 0) continue;

                res += mex[1 << a[j] | 1 << i | 1 << k] * icnt[j][i] * kcnt[j][k];
            }
        }
        return res;
    }
}
