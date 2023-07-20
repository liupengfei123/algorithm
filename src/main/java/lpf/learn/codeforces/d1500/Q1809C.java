package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q1809C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();

            solve(n, k);
            out.println();
        }
        out.close();
    }

    private static void solve(int n, int k) {
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (k >= i) {
                ans[i] = 2;
                k -= i;
                continue;
            }
            if (k <= 0) {
                ans[i] = -1000;
                continue;
            }
            int sum = 0;
            for (int j = i - 1; j > k; j--) sum += ans[j];
            ans[i] = - sum - 1;
            k = 0;
        }
        for (int i = 1; i <= n; i++) out.print(ans[i] + " ");
    }
}
