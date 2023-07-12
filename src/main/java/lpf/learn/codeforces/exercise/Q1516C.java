package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

public class Q1516C {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) s[i] = sc.nextInt();

        Integer solve = solve(n, s);
        if (solve == null) {
            out.println(0);
        } else {
            out.println(1);
            out.println(solve);
        }
        out.close();
    }

    private static Integer solve(int n, int[] s) {
        int sum = 0;
        for (int i = 0; i < n; i++) sum += s[i];

        if ((sum & 1) != 0) return null;

        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = sum - s[i]; j >= 0; j--) dp[j + s[i]] |= dp[j];
        }
        // 如果 子序列和无法达到 sum / 2
        if (!dp[sum >> 1]) return null;

        int res = 0, lowbit = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if ((s[i] & 1) != 0) return i + 1;

            int temp = Integer.lowestOneBit(s[i]);
            if (lowbit > temp) {
                res = i + 1;
                lowbit = temp;
            }
        }
        return res;
    }
}
