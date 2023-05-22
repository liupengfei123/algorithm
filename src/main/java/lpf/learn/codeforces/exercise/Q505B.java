package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/505/B
 */
public class Q505B {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static final Map<Integer, int[]> map = new HashMap<>();

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        while (m-- > 0) {
            int v = sc.nextInt(), w = sc.nextInt(), c = sc.nextInt();
            int[] array = map.computeIfAbsent(c, (k) -> {
                int[] p = new int[n + 1];
                Arrays.setAll(p, i -> i);
                return p;
            });

            array[find(v, array)] = find(w, array);
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            int v = sc.nextInt(), w = sc.nextInt(), cnt = 0;
            for (int[] p : map.values()) {
                if (find(v, p) == find(w, p)) cnt++;
            }
            out.println(cnt);
        }
        out.flush();
    }

    private static int find(int x, int[] p) {
        if (p[x] != x) p[x] = find(p[x], p);
        return p[x];
    }
}
