package lpf.learn.codeforces.d1600;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/607/A
 */
public class Q607A {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        out.println(solve(n, a));
        out.close();
    }

    private static int solve(int n, int[][] a) {
        Arrays.sort(a, Comparator.comparing(b -> b[0]));

        int min = n - 1;

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) treeMap.put(a[i][0], i);

        int[] dp = new int[n + 1];
        for (int i = 1; i < n; i++) {
            Integer j = treeMap.ceilingEntry(a[i][0] - a[i][1]).getValue();

            dp[i + 1] = (i - j) + dp[j];
            min = Math.min(min, dp[i + 1] + (n - i - 1));
        }
        return min;
    }
}
