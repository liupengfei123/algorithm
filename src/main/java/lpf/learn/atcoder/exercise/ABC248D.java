package lpf.learn.atcoder.exercise;

import java.io.*;
import java.util.*;

/**
 * https://atcoder.jp/contests/abc248/tasks/abc248_d
 */
public class ABC248D {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        solve(n, a);
        out.flush();
    }

    private static void solve(int n, int[] a) {
        List<Integer>[] pos = new List[n + 1];
        Arrays.setAll(pos, i -> new ArrayList<>());

        for (int i = 1; i <= n; i++) pos[a[i - 1]].add(i);


        int q = sc.nextInt();
        while (q-- > 0) {
            int l = sc.nextInt(), r = sc.nextInt(), x = sc.nextInt();

            int rv = Collections.binarySearch(pos[x], r);
            if (rv < 0) rv = -rv - 2;

            int lv = Collections.binarySearch(pos[x], l);
            if (lv < 0) lv = -lv - 1;

            out.println(rv - lv + 1);
        }
    }
}
