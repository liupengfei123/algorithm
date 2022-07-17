package lpf.learn.codeforces.game.round806.div4;

import java.util.Scanner;

public class QG {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }
            System.out.println(run(n, k, array));
        }
    }

    private static long run(int n, int k, int[] array) {
        long[][] dp = new long[14][2];

        for (int i = 0; i < n; i++) {
            long[][] ndp = new long[14][2];

            ndp[0][0] = Math.max(dp[0][0], dp[0][1]) + array[i] - k;

            int temp = 1;
            for (int j = 1; j < 14; j++) {
                temp = temp << 1;
                ndp[j][0] = Math.max(dp[j][0], dp[j][1]) + array[i] / temp - k;
                ndp[j][1] = Math.max(dp[j - 1][0], dp[j - 1][1]) + array[i] / temp;
            }
            dp = ndp;
        }

        long result = 0;
        for (int i = 0; i < 14; i++) {
            result = Math.max(result, Math.max(dp[i][0], dp[i][1]));
        }
        return result;
    }
}
