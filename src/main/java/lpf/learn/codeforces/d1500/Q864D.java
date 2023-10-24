package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q864D {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        out.println(solve(n, a));

        for (int i = 0; i < n; i++) out.print(a[i] + " ");

        out.println();
        out.close();
    }

    private static int solve(int n, int[] a) {
        int[] cnt = new int[n + 1];
        for (int i : a) cnt[i]++;

        boolean[] skip = new boolean[n + 1];
        int res = 0, cur = 1;
        for (int i = 0; i < n; i++) {
            if (cnt[a[i]] <= 1) continue;

            while (cnt[cur] > 0) cur++;

            if (a[i] < cur && !skip[a[i]]) {
                skip[a[i]] = true;
                continue;
            }
            res++;
            cnt[a[i]]--;
            a[i] = cur++;
        }
        return res;
    }
}
