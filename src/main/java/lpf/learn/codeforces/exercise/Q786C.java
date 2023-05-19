package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/contest/786/problem/C
 */
public class Q786C {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static int clock = 0;
    private static int[] time;
    private static int[] res;
    private static int[] a;

    public static void main(String[] args) {
        int n = sc.nextInt();
        a = new int[n];
        time = new int[n + 1];
        res = new int[n + 1];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        run(1, n);

        for (int i = 1; i <= n; i++) out.print(res[i] + " ");

        out.flush();
    }

    private static void run(int l, int r) {
        if (l > r) return;

        res[l] = f(l);
        res[r] = f(r);

        if (res[l] == res[r]) {
            for (int i = l; i <= r; i++) res[i] = res[l];
            return;
        }

        int mid = (l + r) >> 1;
        run(l + 1, mid);
        run(mid + 1, r - 1);
    }

    private static int f(int k) {
        int res = 0, c = 0;
        clock++;
        for (int v : a) {
            if (time[v] == clock) continue;

            if (c == 0) {
                res++;
                c = k;
                clock++;
            }
            time[v] = clock;
            c--;
        }
        return res;
    }
}
