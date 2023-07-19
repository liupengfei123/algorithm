package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q1814C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), s1 = sc.nextInt(), s2 = sc.nextInt();

            int[] cnt = new int[n];
            for (int i = 0; i < n; i++) cnt[i] = sc.nextInt();

            solve(n, s1, s2, cnt);
        }
        out.close();
    }

    private static void solve(int n, int s1, int s2, int[] cnt) {
        Integer[] index = new Integer[n];
        Arrays.setAll(index, i -> i);
        Arrays.sort(index, Comparator.comparing(i -> cnt[i]));

        int[] ansIndex = new int[2];
        int[][] ans = new int[2][n];

        for (int i = n - 1; i >= 0; i--) {
            int cost1 = s1 * (ansIndex[0] + 1);
            int cost2 = s2 * (ansIndex[1] + 1);

            int j = cost1 < cost2 ? 0 : 1;
            ans[j][ansIndex[j]++] = index[i] + 1;
        }

        for (int z = 0; z < 2; z++) {
            out.print(ansIndex[z] + " ");
            for (int i = 0; i < ansIndex[z]; i++) out.print(ans[z][i] + " ");
            out.println();
        }
    }
}
