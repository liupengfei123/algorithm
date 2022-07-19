package lpf.learn.codeforces.game.round809.div2;

import java.util.*;

public class QB {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }
            run(n, array);
        }
    }

    private static void run(int n, int[] array) {
        int[][] dp = new int[2][n + 1];

        for (int i = 0; i < n; i++) {
            int r = array[i];
            dp[i & 1][r] = Math.max(dp[i & 1][r], dp[(i + 1) & 1][r] + 1);
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(Math.max(dp[0][i], dp[1][i]) + " ");
        }
        System.out.println();
    }
}
