package lpf.learn.codeforces.exercise;

import java.util.Scanner;

public class Q573B {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(run(n, array));
    }

    private static int run(int n, int[] array) {
        int[] dp = new int[n];
        System.arraycopy(array, 0, dp, 0, n);

        int lastValueL = 0, lastValueR = 0;
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            dp[i] = Math.min(dp[i], lastValueL + 1);
            lastValueL = dp[i];

            dp[j] = Math.min(dp[j], lastValueR + 1);
            lastValueR = dp[j];
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(dp[i], result);
        }
        return result;
    }
}
