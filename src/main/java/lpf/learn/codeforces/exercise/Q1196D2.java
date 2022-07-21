package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q1196D2 {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            String line = sc.next();
            out.println(run(n, k, line));
        }
        out.close();
    }

    private static int run(int n, int k, String line) {
        if (k == 1) {
            return 0;
        }
        char[] chars = new char[]{'R', 'G', 'B'};
        // 0:R,1:G,2:B
        int[][] dp = new int[n + 1][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i + 1][j] = dp[i][(j + 2) % 3] + (line.charAt(i) == chars[j] ? 0 : 1);
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 1; i + k - 1 <= n; i++) {
            result = Math.min(result, dp[i + k - 1][(k + 0) % 3] - dp[i - 1][0]);
            result = Math.min(result, dp[i + k - 1][(k + 1) % 3] - dp[i - 1][1]);
            result = Math.min(result, dp[i + k - 1][(k + 2) % 3] - dp[i - 1][2]);
        }
        return result;
    }
}
