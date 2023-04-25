package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/contest/1272/problem/D
 */
public class Q1272D {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) array[i] = sc.nextInt();

        out.println(run(n, array));
        out.close();
    }

    private static int run(int n, int[] array) {
        int[] dp = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            if (array[i] < array[i + 1]) dp[i] = dp[i + 1] + 1;
        }

        int res = 1;
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            if (array[i - 1] < array[i]) res = Math.max(res, dp[i - 1] + dp[i] + 1);
            if (i > 1 && array[i - 2] < array[i]) res = Math.max(res, dp[i - 2] + dp[i] + 1);

            if (array[i - 1] < array[i]) dp[i] = dp[i - 1] + 1;
            else dp[i] = 1;
        }
        return res;
    }
}
