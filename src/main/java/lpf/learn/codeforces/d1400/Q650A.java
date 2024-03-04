package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/650/A
 */
public class Q650A {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        out.println(solve(n));
        out.close();
    }

    private static long solve(int n) {
        Map<Integer, Integer> rowCount = new HashMap<>();
        Map<Integer, Integer> colCount = new HashMap<>();
        Map<String, Integer> equalCount = new HashMap<>();

        long res = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            String pair = x + "," + y;

            res += rowCount.getOrDefault(x, 0)
                    + colCount.getOrDefault(y, 0)
                    - equalCount.getOrDefault(pair, 0);

            rowCount.merge(x, 1, Integer::sum);
            colCount.merge(y, 1, Integer::sum);
            equalCount.merge(pair, 1, Integer::sum);
        }

        return res;
    }
}
