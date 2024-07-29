package lpf.learn.codeforces.d1300;

import java.io.*;
import java.util.*;

/**
 * https://codeforces.com/problemset/problem/1037/C
 */
public class Q1037C {
    private final static Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    private final static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        int n = sc.nextInt();
        out.println(solve(n, sc.next().toCharArray(), sc.next().toCharArray()));
        out.close();
    }

    private static int solve(int n, char[] s, char[] t) {
        int res = 0;

        for (int i = 0; i < n; i++) {
            if (s[i] == t[i]) continue;

            res++;

            if (i + 1 < n && s[i + 1] != t[i + 1] && s[i + 1] == t[i]) i++;
        }
        return res;
    }
}
