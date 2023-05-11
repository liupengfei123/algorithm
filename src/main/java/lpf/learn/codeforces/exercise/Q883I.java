package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

public class Q883I {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextInt();

        out.println(run(n, k, array));
        out.close();
    }

    private static long run(int n, int k, int[] array) {
        Arrays.sort(array);

        int l = 0, r = array[n - 1] - array[0];
        while (l < r) {
            int mid = l + ((r - l) >> 1);
            if (check(mid, n, k, array)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private static boolean check(int mx, int n, int k, int[] a) {
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        int j0 = 0;

        for (int i = k - 1; i < n; i++) {
            while (a[i] - a[j0] > mx) {
                j0++;
            }
            for (; j0 <= i - k + 1; j0++) {
                if (dp[j0]) {
                    dp[i + 1] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
