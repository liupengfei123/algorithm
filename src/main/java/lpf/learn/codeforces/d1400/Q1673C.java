package lpf.learn.codeforces.d1400;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1728/C
 */
public class Q1673C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        List<Integer> pal = new ArrayList<>();

        for (int i = 1; i < 400; i++) {
            int p = i;
            for (int x = p / 10; x > 0; x /= 10) {
                p = p * 10 + x % 10;
            }
            pal.add(p);
            if (i < 100) {
                p = i;
                for (int x = p; x > 0; x /= 10) {
                    p = p * 10 + x % 10;
                }
                pal.add(p);
            }
        }

        int[] f = new int[40001];
        f[0] = 1;
        for (Integer v : pal) {
            for (int i = v; i < f.length; i++) {
                f[i] = (f[i] + f[i - v]) % 1_000_000_007;
            }
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            out.println(f[n]);
        }
        out.close();
    }
}
