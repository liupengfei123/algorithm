package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1077/C
 */
public class Q1077C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        List<Integer> list = solve(n, a);

        out.println(list.size());
        if (!list.isEmpty()) {
            for (Integer i : list) out.print(i + " ");
        }
        out.println();
        out.close();
    }

    private static List<Integer> solve(int n, int[] a) {
        List<Integer> res = new ArrayList<>();
        Map<Long, Integer> counts = new HashMap<>();

        long sum = 0;
        for (int i = 0; i < n; i++) {
            counts.merge((long) a[i], 1, Integer::sum);
            sum += a[i];
        }

        for (int i = 0; i < n; i++) {
            long temp = sum - a[i];

            if ((temp & 1) != 0) continue;

            temp = temp >> 1;
            Integer integer = counts.get(temp);
            if (integer == null) continue;

            if (integer > (a[i] == temp ? 1 : 0)) res.add(i + 1);
        }
        return res;
    }
}
