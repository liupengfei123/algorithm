package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q1690E {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            out.println(solve(n, k, a));
        }
        out.close();
    }

    private static long solve(int n, int k, int[] a) {
        int[] cnt = new int[k];
        long res = 0;

        for (int v : a) {
            res += v / k;
            cnt[v % k]++;
        }
        int temp = 0;
        int i = 1, j = k - 1;
        for (; i < j; i++,j--) {
            temp += cnt[j];
            int min = Math.min(cnt[i], temp);
            res += min;
            temp -= min;
        }
        if (i == j) temp += cnt[j];
        res += temp / 2;
        return res;
    }
}
