package lpf.learn.codeforces.exercise;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/520/B
 */
public class Q520B {
    public static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();

        int c = 0;
        while (n < m) {
            n *= 2;
            c++;
        }

        int res = c, diff = n - m;

        while (c >= 0) {
            int temp = 1 << c--;
            res += diff / temp;
            diff %= temp;
        }
        out.print(res);
        out.flush();
    }
}
