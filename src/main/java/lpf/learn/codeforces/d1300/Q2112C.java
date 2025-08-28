package lpf.learn.codeforces.d1300;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/2112/C
 */
public class Q2112C {
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


    public static long solve(int n, int[] a) {
        long res = 0;

        for (int z = 2; z < n; z++) {
            int max = Math.max(a[z], a[n - 1] - a[z]);
            int x = 0, y = z - 1;

            while (x < y) {
                if (a[x] + a[y] > max) {
                    res += y - x;
                    y--;
                } else {
                    x++;
                }
            }
        }
        return res;
    }
}
