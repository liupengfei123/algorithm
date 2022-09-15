package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Q837D {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        out.println(run(n, k));
        out.close();
    }

    private static long run(int n, int k) {
        int[][] dp = new int[k + 1][25 * (k + 1)];
        for (int i = 0; i <= k; i++) {
            Arrays.fill(dp[i], -1);
        }

        dp[0][0] = 0;
        for (int i = 0; i < n; i++) {
            int[] cnt = help(sc.nextLong());
            for (int j = k; j > 0; j--) {
                for (int l = k * 25; l >= cnt[1]; l--) {
                    if (dp[j - 1][l - cnt[1]] >= 0) {
                        dp[j][l] = Math.max(dp[j][l], dp[j - 1][l - cnt[1]] + cnt[0]);
                    }
                }
            }
        }
        int result = 0;
        for (int i = 0; i < dp[k].length; i++) {
            result = Math.max(result, Math.min(i, dp[k][i]));
        }
        return result;
    }


    private static int[] help(long temp) {
        int[] result = new int[2];
        while (temp % 2 == 0) {
            result[0]++;
            temp /= 2;
        }
        while (temp % 5 == 0) {
            result[1]++;
            temp /= 5;
        }
        return result;
    }
}
