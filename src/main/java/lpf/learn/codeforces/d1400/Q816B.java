package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/816/B
 */
public class Q816B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt(), q = sc.nextInt();
        int[] d = new int[200002], s = new int[200002];

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt(), r = sc.nextInt();
            d[l]++;
            d[r + 1]--;
        }

        int sd = 0;
        for (int i = 1; i < d.length; i++) {
            sd += d[i];
            s[i] += s[i - 1];

            if (sd >= k) s[i]++;
        }

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt(), r = sc.nextInt();
            out.println(s[r] - s[l - 1]);
        }
        out.close();
    }
}
