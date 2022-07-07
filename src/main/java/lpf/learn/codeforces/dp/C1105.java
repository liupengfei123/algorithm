package lpf.learn.codeforces.dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1105/C
 */
public class C1105 {
    public static Scanner sc = new Scanner(System.in);
    public static int mod = 1000000007;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();

        System.out.println((run(n, l, r) + mod) % mod);
    }

    private static int run(int n, int l, int r) {
        int[] counts = new int[3];
        counts[0] = r / 3 - (l - 1) / 3;
        counts[1] = r / 3 + ((r % 3 != 0) ? 1 : 0) - l / 3 - ((l % 3 == 2) ? 1 : 0);
        counts[2] = r - l + 1 - counts[0] - counts[1];

        long[] dp = new long[3];
        for (int i = 0; i < 3; i++) {
            dp[i] = counts[i];
        }

        long[] ndp = new long[3];

        for (int i = 1; i < n; i++) {
            ndp[0] = (dp[0] * counts[0] + dp[1] * counts[2] + dp[2] * counts[1]) % mod;

            ndp[1] = (dp[1] * counts[0] + dp[2] * counts[2] + dp[0] * counts[1]) % mod;

            ndp[2] = (dp[2] * counts[0] + dp[0] * counts[2] + dp[1] * counts[1]) % mod;

            long[] temp = dp;
            dp = ndp;
            ndp = temp;
            Arrays.fill(ndp, 0);
        }
        return (int) dp[0];
    }
}
