package lpf.learn.codeforces.exercise;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Q1060C {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] aPreSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            aPreSum[i + 1] = aPreSum[i] + sc.nextInt();
        }

        int[] bPreSum = new int[m + 1];
        for (int i = 0; i < m; i++) {
            bPreSum[i + 1] = bPreSum[i] + sc.nextInt();
        }
        int x = sc.nextInt();
        out.println(run(n, m, aPreSum, bPreSum, x));
        out.close();
    }

    private static long run(int n, int m, int[] aPreSum, int[] bPreSum, long x) {
        int[] min1 = help(aPreSum, n);
        int[] min2 = help(bPreSum, m);

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((long)min1[i] * (long)min2[j] <= x) {
                    result = Math.max(result, (i + 1) * (j + 1));
                }
            }
        }
        return result;
    }

    private static int[] help(int[] preSum, int n) {
        int[] min = new int[n];
        Arrays.fill(min, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                min[i] = Math.min(min[i], preSum[j + i + 1] - preSum[j]);
            }
        }
        return min;
    }
}
