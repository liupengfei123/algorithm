package lpf.learn.codeforces.d1200;


import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/2126/D
 */
public class Q2126D {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();

            int[][] a = new int[n][3];
            for (int i = 0; i < n; i++) {
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
                a[i][2] = sc.nextInt();
            }
            out.println(solve(k, a));
        }
        out.close();
    }

    private static int solve(int k, int[][] a) {
        Arrays.sort(a, Comparator.comparing(z->z[2]));

        for (int[] i: a) {
            if (k < i[0] || i[1] < k) {
                continue;
            }
            k = Math.max(i[2], k);
        }
        return k;
    }
}
