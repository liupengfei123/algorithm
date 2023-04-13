package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * https://codeforces.com/problemset/problem/1154/E
 */
public class Q1154E {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    private static int[] index;
    private static int[] lp;
    private static int[] rp;

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();

        index = new int[n + 1];
        lp = new int[n + 2];
        rp = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            index[sc.nextInt()] = i;
            lp[i] = rp[i] = i;
        }

        int[] res = new int[n + 1];
        boolean step = true;

        for (int v = n; v > 0; v--) {
            int i = index[v];
            if (res[i] != 0) continue;

            temp(res, i, step);

            for (int z = 0; z < k; z++) {
                temp(res, find(lp, i), step);
                temp(res, find(rp, i), step);
            }
            step = !step;
        }

        for (int i = 1; i <= n; i++) out.print(res[i]);
        out.flush();
    }

    private static void temp(int[] res, int i, boolean step) {
        if (i != 0) {
            res[i] = step ? 1 : 2;
            lp[i] = find(lp, i - 1);
            rp[i] = find(rp, i + 1);
        }
    }

    private static int find(int[] p, int x) {
        if (p[x] != x) p[x] = find(p, p[x]);
        return p[x];
    }

    public static void main2(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] value = new int[n + 1];
        int[] index = new int[n + 1];

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            int v = sc.nextInt();
            value[i] = v;
            index[v] = i;
            set.add(i);
        }
        set.add(0);
        set.add(n + 1);

        int[] res = new int[n + 1];
        boolean step = true;

        for (int v = n; v > 0; v--) {
            int i = index[v];
            if (res[i] != 0) continue;

            res[i] = step ? 1 : 2;
            set.remove(i);
            for (int z = 0; z < k; z++) {
                int ceiling = set.ceiling(i);
                if (ceiling <= n) {
                    res[ceiling] = step ? 1 : 2;
                    set.remove(ceiling);
                }

                int floor = set.floor(i);
                if (floor > 0) {
                    res[floor] = step ? 1 : 2;
                    set.remove(floor);
                }
            }
            step = !step;
        }

        for (int i = 1; i <= n; i++) out.print(res[i]);
        out.flush();
    }
}
