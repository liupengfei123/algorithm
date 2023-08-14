package lpf.learn.codeforces.d1400;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1728/C
 */
public class Q1728C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            out.println(solve(n));
        }
        out.close();
    }

    private static int solve(int n) {
        int[] small = new int[10];
        Map<Integer, Integer> map = new HashMap<>(n << 1);

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            if (v < 10) small[v]++;
            else map.merge(v, 1, Integer::sum);
        }
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            if (v < 10) small[v]--;
            else map.merge(v, -1, Integer::sum);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans += Math.abs(entry.getValue());

            small[getLength(entry.getKey())] += entry.getValue();
        }
        for (int i = 2; i < 10; i++) ans += Math.abs(small[i]);

        return ans;
    }

    private static int getLength(int v) {
        int l = 0;
        while (v > 0) {
            v /= 10;
            l++;
        }
        return l;
    }
}
