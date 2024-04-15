package lpf.learn.codeforces.d1400;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/988/C
 */
public class Q988C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        solve();
        out.close();
    }

    private static void solve() {
        int k = sc.nextInt();

        Map<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                sum += a[j];
            }

            for (int j = 0; j < n; j++) {
                int tempSum = sum - a[j];
                int[] pair = map.get(tempSum);

                if (pair == null) {
                    map.put(tempSum, new int[]{i + 1, j + 1});
                } else {
                    if (pair[0] - 1 != i) {
                        out.println("YES");
                        out.println(pair[0] + "  " + pair[1]);
                        out.println((i + 1) + "  " + (j + 1));
                        return;
                    }
                }
            }
        }
        out.println("NO");
    }
}
