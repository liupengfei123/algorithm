package lpf.learn.codeforces.d1300;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1194/B
 */
public class Q1194B {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            String[] strArray = new String[n];
            for (int i = 0; i < n; i++) strArray[i] = sc.next();

            out.println(solve(n, m, strArray));
        }
        out.close();
    }

    private static int solve(int n, int m, String[] strArray) {
        int[] row = new int[n], col = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (strArray[i].charAt(j) == '.') {
                    row[i]++;
                    col[j]++;
                }
            }
        }

        int res = n * m;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res = Math.min(res, row[i] + col[j] + (strArray[i].charAt(j) == '.' ? -1 : 0));
            }
        }
        return res;
    }
}
