package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *  https://codeforces.com/problemset/problem/166/E
 */
public class Q1157E {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static int n;

    public static void main(String[] args) {
        n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        int[] c = run(a, b);

        for (int i : c) out.print(i + " ");

        out.flush();
    }


    private static int[] run(int[] a, int[] b) {
        int[] p = new int[n], c = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i;
            c[b[i]]++;
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = (find((n - a[i]) % n, p, c) + a[i]) % n;
        }
        return res;
    }

    private static int find(int x, int[] p, int[] c) {
        if (c[x] != 0) {
            c[x]--;
            return x;
        }
        if (x == p[x]) {
            p[x] = find((x + 1) % n, p, c);
        } else {
            p[x] = find(p[x], p, c);
        }
        return p[x];
    }


    private static int[] run1(int[] a, int[] b) {
        int[] res = new int[n];

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : b) map.merge(i, 1, Integer::sum);

        for (int i = 0; i < n; i++) {
            Integer key = map.ceilingKey(n - a[i]);
            if (key == null) {
                key = map.ceilingKey(0);
            }

            res[i] = (key + a[i]) % n;
            Integer nv = map.merge(key, -1, Integer::sum);
            if (nv == 0) map.remove(key);
        }
        return res;
    }
}
