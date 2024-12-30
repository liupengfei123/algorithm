package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/2033/D
 */
public class Q2033D {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            out.println(solve(n, a));
        }
        out.close();
    }


    private static int solve(int n, int[] a) {
        int res = 0;
        long sum = 0;
        Set<Long> index = new HashSet<>();
        index.add(sum);
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (index.contains(sum)) {
                res++;
                index = new HashSet<>();
            }
            index.add(sum);
        }
        return res;
    }

    private static int solve2(int n, int[] a) {
        int[] pd = new int[n + 1];
        long sum = 0;

        Map<Long, Integer> index = new HashMap<>();
        index.put(sum, 0);
        for (int i = 0; i < n; i++) {
            sum += a[i];
            Integer preI = index.get(sum);
            if (preI == null || pd[i] > pd[preI] + 1) {
                pd[i + 1] = pd[i];
            } else {
                pd[i + 1] = pd[preI] + 1;
            }
            index.put(sum, i + 1);
        }
        return pd[n];
    }
}
