package lpf.learn.codeforces.d1500;

import java.io.*;
import java.util.*;

public class Q1208B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        out.println(solve(n, a));
        out.close();
    }

    private static int solve(int n, int[] a) {
        int l = 0, r = n;

        while (l < r) {
            int mid = (r + l) >> 1;

            if (check(n, a, mid)) r = mid;
            else l = mid + 1;
        }
        return l;
    }

    private static boolean check(int n, int[] a, int li) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) count.merge(a[i], 1, Q1208B::sum);

        int i = 0;
        for (; i < li; i++) count.merge(a[i], -1, Q1208B::sum);

        if (count.size() == (n - li)) return true;

        for (; i < n; i++) {
            count.merge(a[i], -1, Q1208B::sum);
            count.merge(a[i - li], 1, Q1208B::sum);

            if (count.size() == (n - li)) return true;
        }
        return false;
    }

    private static Integer sum(int a, int b) {
        return (a += b) == 0 ? null : a;
    }
}
