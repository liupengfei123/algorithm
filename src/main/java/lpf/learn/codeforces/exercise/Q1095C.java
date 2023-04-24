package lpf.learn.codeforces.exercise;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1095/C
 */
public class Q1095C {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] res = solve(n, k);

        if (res == null) {
            out.println("NO");
        } else {
            out.println("YES");
            for (int v : res) out.print(v + " ");
        }
        out.close();
    }

    private static int[] solve(int n, int k) {
        int count = 0;
        for (int i = 0; (1 << i) <= n; i++) {
            if ((n & (1 << i)) > 0) count++;
        }
        if (count > k || n < k) return null;

        int[] res = new int[k];
        Arrays.fill(res, 1);
        n -= k;

        for (int i = k - 1; i >= 0; i--) {
            while (res[i] <= n) {
                n -= res[i];
                res[i] += res[i];
            }
        }
        return res;
    }
}
