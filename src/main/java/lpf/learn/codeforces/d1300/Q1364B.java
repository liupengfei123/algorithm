package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1364/B
 */
public class Q1364B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            List<Integer> solve = solve(n, a);
            out.println(solve.size());

            for (Integer i : solve) out.print(i + " ");
            out.println();
        }
        out.close();
    }

    private static List<Integer> solve(int n, int[] a) {
        List<Integer> res = new ArrayList<>(n);
        res.add(a[0]);

        boolean flag = a[0] > a[1];

        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1] != flag) {
                flag = a[i] > a[i + 1];
                res.add(a[i]);
            }
        }

        res.add(a[n - 1]);

        return res;
    }
}
