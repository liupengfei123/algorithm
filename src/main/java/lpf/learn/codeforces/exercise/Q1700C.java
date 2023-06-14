package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1700/C
 */
public class Q1700C {
    private static final Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] diff = new long[n];
            for (int i = 0, last = 0; i < n; i++) {
                int temp  = sc.nextInt();
                diff[i] = temp - last;
                last = temp;
            }

            long res = 0;
            for (int i = 1; i < n; i++) {
                if (diff[i] < 0) diff[0] += diff[i];
                res += Math.abs(diff[i]);
            }
            out.println(res + Math.abs(diff[0]));
        }
        out.close();
    }
}
