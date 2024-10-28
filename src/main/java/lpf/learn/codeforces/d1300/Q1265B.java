package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1265/B
 */
public class Q1265B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) p[i] = sc.nextInt();

            solve(n, p);

            out.println();
        }
        out.close();
    }


    public static void solve(int n, int[] p) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) indexMap.put(p[i], i);

        int[] res = new int[n + 1];
        int L = indexMap.get(1), R = L;

        for (int i = 1; i <= n; i++) {
            int temp = indexMap.get(i);

            L = Math.min(L, temp);
            R = Math.max(R, temp);

            if ((R - L + 1) <= i) res[i] = 1;
        }

        for (int i = 1; i <= n; i++) out.print(res[i]);
    }
}
