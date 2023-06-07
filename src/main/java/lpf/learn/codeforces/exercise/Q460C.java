package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/460/C
 */
public class Q460C {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), w = sc.nextInt();
        int mx = 0;
        int[] diff = new int[n];
        for (int i = 0, nv, lv = 0; i < n; i++) {
            nv = sc.nextInt();
            diff[i] = nv - lv;
            lv = nv;
            mx = Math.max(mx, nv);
        }

        int l = 0, r = mx + m;

        while (l < r) {
            int mid = (l + r + 1) >> 1;
            int[] temp = new int[n];
            System.arraycopy(diff, 0, temp, 0, n);

            if (check(temp, n, m, w, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        out.println(r);
        out.close();
    }

    private static boolean check(int[] diff, int n, int m, int w, int min) {
        int val = 0;
        for (int i = 0; i < n; i++) {
            val += diff[i];
            if (val >= min) continue;

            m -= min - val;
            if (m < 0) return false;

            if (i + w  < n) diff[i + w] -= (min - val);
            val = min;
        }
        return true;
    }

}
