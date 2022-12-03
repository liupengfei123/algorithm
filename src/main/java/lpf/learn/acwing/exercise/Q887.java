package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/** 885. 求组合数 I
 * 给定 n 组询问，每组询问给定两个整数 a，b，请你输出 Cbamod(109+7) 的值。
 * 输入格式 :
 * 第一行包含整数 n。
 * 接下来 n 行，每行包含一组 a 和 b。
 *
 * 输出格式:
 * 共 n 行，每行输出一个询问的解。
 *
 * 数据范围:
 * 1≤n≤10000,
 * 1≤b≤a≤2000
 *
 * 输入样例：
 * 3
 * 3 1
 * 5 3
 * 2 2
 * 输出样例：
 * 3
 * 10
 * 1
 */
public class Q887 {
    private static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    private static final int MOD = 1000_000_007;

    private static final long[][] dp = run(2000);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            out.println(dp[sc.nextInt()][sc.nextInt()]);
        }
        out.flush();
    }


    private static long[][] run(int n) {
        long[][] dp = new long[n + 1][n + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
            }
        }
        return dp;
    }
}
