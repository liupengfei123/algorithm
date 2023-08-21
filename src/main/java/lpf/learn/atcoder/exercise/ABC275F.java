package lpf.learn.atcoder.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ABC275F {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] dp = run(n, m);

        for (int i = 1; i <= m; i++) {
            int min = Math.min(dp[i][0], dp[i][1]);
            System.out.println(min == n ? -1 : min);
        }
        out.flush();
    }

    private static int[][] run(int n, int m) {
        int[][] dps = new int[m + 1][2];
        for (int[] dp : dps) Arrays.fill(dp, n);

        dps[0][1] = 0;
        for (int i = n; i > 0; i--) {
            int v = sc.nextInt();

            for (int j = m; j > 0; j--) {
                dps[j][0] = Math.min(dps[j][0], dps[j][1] + 1);

                int temp = j - v;
                dps[j][1] = temp >= 0 ? Math.min(dps[temp][0], dps[temp][1]) : n;
            }
            dps[0] = new int[]{1, n};
        }
        return dps;
    }
}

