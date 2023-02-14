package lpf.learn.acwing.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 99. 激光炸弹
 */
public class Q101 {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final int N = 5010;
    private static final int[][] arr = new int[N][N];
    private static final int[][] sum = new int[N][N];

    public static void main(String[] args) {
        int n = sc.nextInt();
        int r = sc.nextInt();

        out.println(run(n, r - 1));
        out.flush();
    }
    private static int run(int n, int r) {
        while (n-- > 0) {
            arr[sc.nextInt()][sc.nextInt()] += sc.nextInt();
        }
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + arr[i - 1][j - 1];
            }
        }
        if (r > 5000) {
            return sum[N - 1][N - 1];
        }
        int res = 0;
        for (int i = 1; i < N - r; i++) {
            for (int j = 1; j < N - r; j++) {
                res = Math.max(res, getRangeSum(i, j, i + r, j + r));
            }
        }
        return res;
    }
    private static int getRangeSum(int x1, int y1, int x2, int y2) {
        return sum[x2][y2] - sum[x2][y1 - 1] - sum[x1 - 1][y2] + sum[x1 - 1][y1 - 1];
    }
}
