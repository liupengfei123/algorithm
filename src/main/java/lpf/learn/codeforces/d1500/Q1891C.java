package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q1891C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            out.println(solve(n, a));
        }
        out.close();
    }

    private static long solve(int n, int[] a) {
        Arrays.sort(a);

        int l = 0, r = n - 1;
        long res = 0, cnt = 0;
        while (l <= r) {
            while (l <= r && cnt < a[r]) cnt += a[l++];

            if (l > r) continue;

            res += a[r] + 1;
            cnt -= a[r];
            r--;
        }
        if (cnt > 0) {
            res += (cnt + 1) / 2 + (cnt > 1 ? 1 : 0);
        }
        return res;
    }
}
