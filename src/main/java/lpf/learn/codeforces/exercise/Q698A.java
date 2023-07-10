package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

public class Q698A {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private final static int[] nextFlag = new int[]{0, 2, 1};
    private static int[] a;
    private static int[][] dp;

    public static void main(String[] args) {
        int n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        dp = new int[3][n];
        Arrays.fill(dp[1], -1);
        Arrays.fill(dp[2], -1);

        out.println(Math.min(dfs(0, 1), dfs(0, 2)));
        out.close();
    }

    private static int dfs(int i, int flag) {
        if (i >= a.length) return 0;

        if (dp[flag][i] != -1) return dp[flag][i];

        int res;
        if ((flag & a[i]) != 0) {
            res = dfs(i + 1, nextFlag[flag]);
        } else {
            res = 1 + Math.min(dfs(i + 1, 1), dfs(i + 1, 2));
        }
        return dp[flag][i] = res;
    }
}
